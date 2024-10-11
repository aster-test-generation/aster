import unittest
from unittest.mock import Mock, patch
from ansible.module_utils.facts.system.lsb import LSBFactCollector

class TestLSBFactCollector(unittest.TestCase):
    def setUp(self):
        self.collector = LSBFactCollector()

    @patch('ansible.module_utils.facts.system.lsb.os.path.exists')
    @patch('ansible.module_utils.facts.system.lsb.get_file_lines')
    def test_lsb_release_file(self, mock_get_file_lines, mock_path_exists):
        mock_path_exists.return_value = True
        mock_get_file_lines.return_value = [
            'DISTRIB_ID=Ubuntu',
            'DISTRIB_RELEASE=20.04',
            'DISTRIB_DESCRIPTION="Ubuntu 20.04 LTS"',
            'DISTRIB_CODENAME=focal'
        ]
        result = self.collector._lsb_release_file('/etc/lsb-release')
        self.assertEqual(result, {
            'id': 'Ubuntu',
            'release': '20.04',
            'description': 'Ubuntu 20.04 LTS',
            'codename': 'focal'
        })

    @patch('ansible.module_utils.facts.system.lsb.os.path.exists')
    def test_lsb_release_file_no_file(self, mock_path_exists):
        mock_path_exists.return_value = False
        result = self.collector._lsb_release_file('/etc/lsb-release')
        self.assertEqual(result, {})

    def test_lsb_release_bin(self):
        module = Mock()
        module.run_command.return_value = (0, "LSB Version:\tcore-9.20170808ubuntu1\nDistributor ID:\tUbuntu\nDescription:\tUbuntu 20.04.1 LTS\nRelease:\t20.04\nCodename:\tfocal", "")
        result = self.collector._lsb_release_bin('/usr/bin/lsb_release', module)
        self.assertEqual(result, {
            'release': '20.04',
            'id': 'Ubuntu',
            'description': 'Ubuntu 20.04.1 LTS',
            'codename': 'focal'
        })

    def test_lsb_release_bin_command_fail(self):
        module = Mock()
        module.run_command.return_value = (1, "", "error")
        result = self.collector._lsb_release_bin('/usr/bin/lsb_release', module)
        self.assertEqual(result, {})

    @patch('ansible.module_utils.facts.system.lsb.LSBFactCollector._lsb_release_bin')
    @patch('ansible.module_utils.facts.system.lsb.LSBFactCollector._lsb_release_file')
    def test_collect(self, mock_lsb_release_file, mock_lsb_release_bin):
        module = Mock()
        module.get_bin_path.return_value = '/usr/bin/lsb_release'
        mock_lsb_release_bin.return_value = {
            'release': '20.04',
            'id': 'Ubuntu',
            'description': 'Ubuntu 20.04.1 LTS',
            'codename': 'focal'
        }
        mock_lsb_release_file.return_value = {}
        result = self.collector.collect(module=module)
        self.assertEqual(result, {
            'lsb': {
                'release': '20.04',
                'id': 'Ubuntu',
                'description': 'Ubuntu 20.04.1 LTS',
                'codename': 'focal',
                'major_release': '20'
            }
        })

    @patch('ansible.module_utils.facts.system.lsb.LSBFactCollector._lsb_release_bin')
    @patch('ansible.module_utils.facts.system.lsb.LSBFactCollector._lsb_release_file')
    def test_collect_no_lsb_path(self, mock_lsb_release_file, mock_lsb_release_bin):
        module = Mock()
        module.get_bin_path.return_value = None
        mock_lsb_release_file.return_value = {
            'release': '20.04',
            'id': 'Ubuntu',
            'description': 'Ubuntu 20.04.1 LTS',
            'codename': 'focal'
        }
        result = self.collector.collect(module=module)
        self.assertEqual(result, {
            'lsb': {
                'release': '20.04',
                'id': 'Ubuntu',
                'description': 'Ubuntu 20.04.1 LTS',
                'codename': 'focal',
                'major_release': '20'
            }
        })

    def test_collect_no_module(self):
        result = self.collector.collect()
        self.assertEqual(result, {})

if __name__ == '__main__':
    unittest.main()