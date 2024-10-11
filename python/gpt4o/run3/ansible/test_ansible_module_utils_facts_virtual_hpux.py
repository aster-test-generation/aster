import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.virtual.hpux import HPUXVirtual, HPUXVirtualCollector
from ansible.module_utils.basic import AnsibleModule


class TestHPUXVirtual(unittest.TestCase):
    def setUp(self):
        self.instance = HPUXVirtual(module=MagicMock(spec=AnsibleModule))
        self.instance.module = MagicMock()

    @patch('os.path.exists')
    def test_get_virtual_facts_vecheck(self, mock_exists):
        mock_exists.side_effect = lambda x: x == '/usr/sbin/vecheck'
        self.instance.module.run_command.return_value = (0, 'output', 'error')
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'guest')
        self.assertEqual(result['virtualization_role'], 'HP vPar')

    @patch('os.path.exists')
    def test_get_virtual_facts_hpvminfo_vpar(self, mock_exists):
        mock_exists.side_effect = lambda x: x == '/opt/hpvm/bin/hpvminfo'
        self.instance.module.run_command.return_value = (0, 'Running HPVM vPar', 'error')
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'guest')
        self.assertEqual(result['virtualization_role'], 'HPVM vPar')

    @patch('os.path.exists')
    def test_get_virtual_facts_hpvminfo_ivm(self, mock_exists):
        mock_exists.side_effect = lambda x: x == '/opt/hpvm/bin/hpvminfo'
        self.instance.module.run_command.return_value = (0, 'Running HPVM guest', 'error')
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'guest')
        self.assertEqual(result['virtualization_role'], 'HPVM IVM')

    @patch('os.path.exists')
    def test_get_virtual_facts_hpvminfo_host(self, mock_exists):
        mock_exists.side_effect = lambda x: x == '/opt/hpvm/bin/hpvminfo'
        self.instance.module.run_command.return_value = (0, 'Running HPVM host', 'error')
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'host')
        self.assertEqual(result['virtualization_role'], 'HPVM')

    @patch('os.path.exists')
    def test_get_virtual_facts_parstatus(self, mock_exists):
        mock_exists.side_effect = lambda x: x == '/usr/sbin/parstatus'
        self.instance.module.run_command.return_value = (0, 'output', 'error')
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_type'], 'guest')
        self.assertEqual(result['virtualization_role'], 'HP nPar')

    @patch('os.path.exists')
    def test_get_virtual_facts_no_virtualization(self, mock_exists):
        mock_exists.return_value = False
        result = self.instance.get_virtual_facts()
        self.assertEqual(result['virtualization_tech_guest'], set())
        self.assertEqual(result['virtualization_tech_host'], set())

class TestHPUXVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = HPUXVirtualCollector(mod=MagicMock(spec=AnsibleModule))
        self.assertEqual(collector._fact_class, HPUXVirtual)

    def test_platform(self):
        collector = HPUXVirtualCollector(mod=MagicMock(spec=AnsibleModule))
        self.assertEqual(collector._platform, 'HP-UX')

if __name__ == '__main__':
    unittest.main()