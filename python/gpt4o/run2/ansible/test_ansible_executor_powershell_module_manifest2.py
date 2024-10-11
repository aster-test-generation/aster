import unittest
from unittest.mock import patch, MagicMock
from ansible.executor.powershell.module_manifest import PSModuleDepFinder
from ansible.errors import AnsibleError

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
        module_data = b"using Ansible.SomeModule;\n"
        self.instance.scan_module(module_data)
        self.assertIn('Ansible.SomeModule', self.instance.ps_modules)

    def test_scan_exec_script(self):
        with patch('pkgutil.get_data', return_value=b"using Ansible.SomeModule;\n"):
            self.instance.scan_exec_script('test_script')
            self.assertIn('test_script', self.instance.exec_scripts)

    def test_add_module(self):
        with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value='/path/to/module.psm1'):
            with patch('ansible.executor.powershell.module_manifest._slurp', return_value=b"module data"):
                self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)
                self.assertIn('Ansible.SomeModule', self.instance.ps_modules)

    def test_add_module_optional(self):
        with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value=None):
            self.instance._add_module('Ansible.OptionalModule', '.psm1', 'fqn', True)
            self.assertNotIn('Ansible.OptionalModule', self.instance.ps_modules)

    def test_add_module_error(self):
        with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value=None):
            with self.assertRaises(AnsibleError):
                self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)

    def test_parse_version_match(self):
        match = MagicMock()
        match.group.side_effect = ['1.0', None]
        self.instance._parse_version_match(match, 'ps_version')
        self.assertEqual(self.instance.ps_version, '1.0.0')

    def test_parse_version_match_existing(self):
        self.instance.ps_version = '1.0.0'
        match = MagicMock()
        match.group.side_effect = ['2.0', None]
        self.instance._parse_version_match(match, 'ps_version')
        self.assertEqual(self.instance.ps_version, '2.0.0')

    def test_parse_version_match_no_update(self):
        self.instance.ps_version = '2.0.0'
        match = MagicMock()
        match.group.side_effect = ['1.0', None]
        self.instance._parse_version_match(match, 'ps_version')
        self.assertEqual(self.instance.ps_version, '2.0.0')

    def test_scan_module_with_wrapper(self):
        module_data = b"using Ansible.SomeModule;\n"
        self.instance.scan_module(module_data, wrapper=True)
        self.assertIn('Ansible.SomeModule', self.instance.cs_utils_wrapper)

    def test_scan_module_with_powershell_false(self):
        module_data = b"using Ansible.SomeModule;\n"
        self.instance.scan_module(module_data, powershell=False)
        self.assertIn('Ansible.SomeModule', self.instance.cs_utils_module)

    def test_scan_module_with_ps_version(self):
        module_data = b"#requires -version 5.1\n"
        self.instance.scan_module(module_data)
        self.assertEqual(self.instance.ps_version, '5.1.0')

    def test_scan_module_with_os_version(self):
        module_data = b"#requires -osversion 10.0\n"
        self.instance.scan_module(module_data)
        self.assertEqual(self.instance.os_version, '10.0.0')

    def test_scan_module_with_become(self):
        module_data = b"#requires -runasadministrator\n"
        self.instance.scan_module(module_data)
        self.assertTrue(self.instance.become)

    def test_scan_module_with_wrapper_match(self):
        module_data = b"#requires -runasadministrator\n"
        with patch.object(self.instance, 'scan_exec_script') as mock_scan_exec_script:
            self.instance.scan_module(module_data, wrapper=True)
            mock_scan_exec_script.assert_called()

if __name__ == '__main__':
    unittest.main()