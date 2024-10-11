import re
import unittest
from ansible.executor.powershell.module_manifest import PSModuleDepFinder
from ansible.errors import AnsibleError
from unittest.mock import patch, MagicMock


class TestPSModuleDepFinder(unittest.TestCase):
    def setUp(self):
        self.instance = PSModuleDepFinder()

    def test_init(self):
        self.assertIsInstance(self.instance.ps_modules, dict)
        self.assertIsInstance(self.instance.exec_scripts, dict)
        self.assertIsInstance(self.instance.cs_utils_wrapper, dict)
        self.assertIsInstance(self.instance.cs_utils_module, dict)
        self.assertIsNone(self.instance.ps_version)
        self.assertIsNone(self.instance.os_version)
        self.assertFalse(self.instance.become)

    def test_scan_module(self):
        module_data = b"using Ansible.SomeModule;"
        self.instance._re_ps_module = [re.compile(b'(?i)^using\\s(Ansible\\..+);\\s*$')]
        self.instance._re_cs_in_ps_module = []
        self.instance._re_ps_version = re.compile(b'')
        self.instance._re_os_version = re.compile(b'')
        self.instance._re_become = re.compile(b'')
        self.instance._re_wrapper = re.compile(b'')
        self.instance.scan_module(module_data)
        self.assertIn('Ansible.SomeModule', self.instance.ps_modules)

    def test_scan_exec_script(self):
        with patch('pkgutil.get_data', return_value=b"using Ansible.SomeModule;") as mock_get_data:
            self.instance.scan_exec_script('test_script')
            self.assertIn('test_script', self.instance.exec_scripts)
            self.assertIn('Ansible.SomeModule', self.instance.ps_modules)
            mock_get_data.assert_called_once_with('ansible.executor.powershell', 'test_script.ps1')

    def test_scan_exec_script_not_found(self):
        with patch('pkgutil.get_data', return_value=None):
            with self.assertRaises(AnsibleError):
                self.instance.scan_exec_script('non_existent_script')

    def test_add_module(self):
        with patch('pkgutil.get_data', return_value=b"using Ansible.SomeModule;"):
            self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)
            self.assertIn('Ansible.SomeModule', self.instance.ps_modules)

    def test_add_module_optional(self):
        with patch('pkgutil.get_data', return_value=None):
            self.instance._add_module('Ansible.OptionalModule', '.psm1', 'fqn', True)
            self.assertNotIn('Ansible.OptionalModule', self.instance.ps_modules)

    def test_add_module_import_error(self):
        with patch('pkgutil.get_data', side_effect=ImportError):
            with self.assertRaises(AnsibleError):
                self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)

    def test_parse_version_match(self):
        match = MagicMock()
        match.group.return_value = '1.0'
        self.instance._parse_version_match(match, 'ps_version')
        self.assertEqual(self.instance.ps_version, '1.0.0')

    def test_parse_version_match_existing(self):
        self.instance.ps_version = '1.0.0'
        match = MagicMock()
        match.group.return_value = '2.0'
        self.instance._parse_version_match(match, 'ps_version')
        self.assertEqual(self.instance.ps_version, '2.0.0')

if __name__ == '__main__':
    unittest.main()