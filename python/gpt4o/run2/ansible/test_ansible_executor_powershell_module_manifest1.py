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
        self.instance._re_ps_version = []
        self.instance._re_os_version = []
        self.instance._re_become = []
        self.instance._re_wrapper = []

        self.instance.scan_module(module_data)
        self.assertIn('Ansible.SomeModule', self.instance.ps_modules)

    def test_scan_exec_script(self):
        with patch('pkgutil.get_data', return_value=b"using Ansible.SomeModule;") as mock_get_data:
            self.instance.scan_exec_script('test_script')
            self.assertIn('test_script', self.instance.exec_scripts)

    def test_add_module(self):
        with patch('pkgutil.get_data', return_value=b"module data") as mock_get_data:
            with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value='path/to/plugin') as mock_find_plugin:
                self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)
                self.assertIn('Ansible.SomeModule', self.instance.ps_modules)

    def test_parse_version_match(self):
        match = MagicMock()
        match.group.return_value = '1.0'
        self.instance._parse_version_match(match, 'ps_version')
        self.assertEqual(self.instance.ps_version, '1.0.0')

    def test_scan_exec_script_not_found(self):
        with patch('pkgutil.get_data', return_value=None):
            with self.assertRaises(AnsibleError):
                self.instance.scan_exec_script('non_existent_script')

    def test_add_module_optional(self):
        with patch('pkgutil.get_data', return_value=None):
            with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value=None):
                self.instance._add_module('Ansible.OptionalModule', '.psm1', 'fqn', True)
                self.assertNotIn('Ansible.OptionalModule', self.instance.ps_modules)

    def test_add_module_import_error(self):
        with patch('pkgutil.get_data', side_effect=ImportError):
            with self.assertRaises(AnsibleError):
                self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)

    def test_add_module_os_error(self):
        with patch('pkgutil.get_data', side_effect=OSError(errno.ENOENT, 'No such file or directory')):
            with self.assertRaises(AnsibleError):
                self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)

    def test_add_module_os_error_optional(self):
        with patch('pkgutil.get_data', side_effect=OSError(errno.ENOENT, 'No such file or directory')):
            self.instance._add_module('Ansible.OptionalModule', '.psm1', 'fqn', True)
            self.assertNotIn('Ansible.OptionalModule', self.instance.ps_modules)

    def test_scan_module_with_version(self):
        module_data = b"#requires -version 5.1"
        self.instance._re_ps_version = [re.compile(b'(?i)^#requires\\s-version\\s(\\d+\\.\\d+)$')]
        self.instance.scan_module(module_data)
        self.assertEqual(self.instance.ps_version, '5.1.0')

    def test_scan_module_with_os_version(self):
        module_data = b"#requires -osversion 10.0"
        self.instance._re_os_version = [re.compile(b'(?i)^#requires\\s-osversion\\s(\\d+\\.\\d+)$')]
        self.instance.scan_module(module_data)
        self.assertEqual(self.instance.os_version, '10.0.0')

    def test_scan_module_with_become(self):
        module_data = b"#requires -become"
        self.instance._re_become = [re.compile(b'(?i)^#requires\\s-become$')]
        self.instance.scan_module(module_data)
        self.assertTrue(self.instance.become)

    def test_scan_module_with_wrapper(self):
        module_data = b"#requires -wrapper"
        self.instance._re_wrapper = [re.compile(b'(?i)^#requires\\s-wrapper$')]
        with patch.object(self.instance, 'scan_exec_script') as mock_scan_exec_script:
            self.instance.scan_module(module_data, wrapper=True)
            mock_scan_exec_script.assert_called()

if __name__ == '__main__':
    unittest.main()