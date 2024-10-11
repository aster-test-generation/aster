import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.system.distribution import DistributionFactCollector


class TestDistribution(unittest.TestCase):
    def setUp(self):
        self.module = Mock()
        self.distribution = Distribution(self.module)

    def test_init(self):
        self.assertEqual(self.distribution.module, self.module)

    @patch('platform.system', return_value='Linux')
    @patch('platform.release', return_value='4.15.0-66-generic')
    @patch('platform.version', return_value='#75-Ubuntu SMP Tue Oct 1 05:24:09 UTC 2019')
    def test_get_distribution_facts_linux(self, mock_version, mock_release, mock_system):
        with patch.object(DistributionFiles, 'process_dist_files', return_value={'distribution': 'Ubuntu'}):
            facts = self.distribution.get_distribution_facts()
            self.assertEqual(facts['distribution'], 'Linux')
            self.assertEqual(facts['distribution_release'], '4.15.0-66-generic')
            self.assertEqual(facts['distribution_version'], '#75-Ubuntu SMP Tue Oct 1 05:24:09 UTC 2019')
            self.assertEqual(facts['os_family'], 'Ubuntu')

    @patch('platform.system', return_value='AIX')
    @patch('platform.release', return_value='7.1')
    @patch('platform.version', return_value='7100-05-02-1832')
    def test_get_distribution_facts_aix(self, mock_version, mock_release, mock_system):
        with patch.object(self.distribution, 'get_distribution_AIX', return_value={'distribution_major_version': '7'}):
            facts = self.distribution.get_distribution_facts()
            self.assertEqual(facts['distribution'], 'AIX')
            self.assertEqual(facts['distribution_release'], '7.1')
            self.assertEqual(facts['distribution_version'], '7100-05-02-1832')
            self.assertEqual(facts['distribution_major_version'], '7')

    def test_get_distribution_AIX(self):
        self.module.run_command.return_value = (0, '7.1.0.0', '')
        facts = self.distribution.get_distribution_AIX()
        self.assertEqual(facts['distribution_major_version'], '7')
        self.assertEqual(facts['distribution_version'], '7.1')
        self.assertEqual(facts['distribution_release'], '1')

    def test_get_distribution_HPUX(self):
        self.module.run_command.return_value = (0, 'HPUX B.11.31 U 9000/800 2017', '')
        facts = self.distribution.get_distribution_HPUX()
        self.assertEqual(facts['distribution_version'], 'B.11.31')
        self.assertEqual(facts['distribution_release'], '31')

    def test_get_distribution_Darwin(self):
        self.module.run_command.return_value = (0, '10.15.7', '')
        facts = self.distribution.get_distribution_Darwin()
        self.assertEqual(facts['distribution'], 'MacOSX')
        self.assertEqual(facts['distribution_major_version'], '10')
        self.assertEqual(facts['distribution_version'], '10.15.7')

    def test_get_distribution_FreeBSD(self):
        with patch('platform.release', return_value='12.1-RELEASE'):
            with patch('platform.version', return_value='FreeBSD 12.1-RELEASE r354233 GENERIC  amd64'):
                facts = self.distribution.get_distribution_FreeBSD()
                self.assertEqual(facts['distribution_release'], '12.1-RELEASE')
                self.assertEqual(facts['distribution_major_version'], '12')
                self.assertEqual(facts['distribution_version'], '12.1')

    def test_get_distribution_OpenBSD(self):
        self.module.run_command.return_value = (0, 'OpenBSD 6.6 GENERIC#123', '')
        with patch('platform.release', return_value='6.6'):
            facts = self.distribution.get_distribution_OpenBSD()
            self.assertEqual(facts['distribution_version'], '6.6')
            self.assertEqual(facts['distribution_release'], 'GENERIC#123')

    def test_get_distribution_DragonFly(self):
        self.module.run_command.return_value = (0, 'v5.8.2-RELEASE', '')
        with patch('platform.release', return_value='5.8.2-RELEASE'):
            facts = self.distribution.get_distribution_DragonFly()
            self.assertEqual(facts['distribution_release'], '5.8.2-RELEASE')
            self.assertEqual(facts['distribution_major_version'], '5')
            self.assertEqual(facts['distribution_version'], '5.8.2')

    def test_get_distribution_NetBSD(self):
        self.module.run_command.return_value = (0, 'NetBSD 9.0 (GENERIC)', '')
        with patch('platform.release', return_value='9.0'):
            facts = self.distribution.get_distribution_NetBSD()
            self.assertEqual(facts['distribution_release'], '9.0')
            self.assertEqual(facts['distribution_major_version'], '9')
            self.assertEqual(facts['distribution_version'], '9.0')

    def test_get_distribution_SMGL(self):
        facts = self.distribution.get_distribution_SMGL()
        self.assertEqual(facts['distribution'], 'Source Mage GNU/Linux')

    @patch('ansible.module_utils.facts.utils.get_file_content', return_value='Oracle Solaris 11.4')
    def test_get_distribution_SunOS(self, mock_get_file_content):
        self.module.run_command.side_effect = [
            (0, '5.11', ''),  # uname -r
            (0, 'Generic_150400-29', '')  # uname -v
        ]
        facts = self.distribution.get_distribution_SunOS()
        self.assertEqual(facts['distribution'], 'Solaris')
        self.assertEqual(facts['distribution_version'], '11.4')
        self.assertEqual(facts['distribution_release'], 'Oracle Solaris 11.4')
        self.assertEqual(facts['distribution_major_version'], '11')

if __name__ == '__main__':
    unittest.main()