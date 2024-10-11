import unittest
from unittest.mock import MagicMock, patch
from ansible.module_utils.facts.virtual.sunos import SunOSVirtual, SunOSVirtualCollector

class TestSunOSVirtual(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.instance = SunOSVirtual(self.module)

    @patch('os.path.isdir')
    @patch('os.path.exists')
    def test_get_virtual_facts(self, mock_exists, mock_isdir):
        # Mocking the module methods
        self.module.get_bin_path.side_effect = lambda x: x
        self.module.run_command.side_effect = [
            (0, "global\n", ""),  # zonename
            (0, "VMware\n", ""),  # modinfo
            (0, "DOMAINROLE|impl=LDoms|feature1=true|feature2=false\n", ""),  # virtinfo
            (0, "VMware\n", "")  # smbios
        ]
        mock_isdir.return_value = True
        mock_exists.return_value = True

        result = self.instance.get_virtual_facts()
        self.assertIn('container', result)
        self.assertIn('virtualization_type', result)
        self.assertIn('virtualization_role', result)
        self.assertIn('virtualization_tech_guest', result)
        self.assertIn('virtualization_tech_host', result)

    @patch('os.path.isdir')
    @patch('os.path.exists')
    def test_get_virtual_facts_no_zonename(self, mock_exists, mock_isdir):
        # Mocking the module methods
        self.module.get_bin_path.side_effect = lambda x: None
        mock_isdir.return_value = False
        mock_exists.return_value = False

        result = self.instance.get_virtual_facts()
        self.assertIsNone(result)

class TestSunOSVirtualCollector(unittest.TestCase):
    def test_fact_class(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._fact_class, SunOSVirtual)

    def test_platform(self):
        collector = SunOSVirtualCollector()
        self.assertEqual(collector._platform, 'SunOS')

if __name__ == '__main__':
    unittest.main()