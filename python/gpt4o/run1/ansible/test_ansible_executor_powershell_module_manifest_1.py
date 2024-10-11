import errno
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
        with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value='/path/to/module.psm1'):
            with patch('ansible.executor.powershell.module_manifest._slurp', return_value=b"module data"):
                self.instance._add_module('Ansible.SomeModule', '.psm1', 'fqn', False)
                self.assertIn('Ansible.SomeModule', self.instance.ps_modules)

    def test_parse_version_match(self):
        match = MagicMock()
        match.group.side_effect = ['1.0', None]
        self.instance._parse_version_match(match, 'ps_version')
        self.assertEqual(self.instance.ps_version, '1.0.0')

    def test_scan_exec_script_not_found(self):
        with patch('pkgutil.get_data', return_value=None):
            with self.assertRaises(AnsibleError):
                self.instance.scan_exec_script('non_existent_script')

    def test_add_module_optional(self):
        with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value=None):
            self.instance._add_module('Ansible.OptionalModule', '.psm1', 'fqn', True)
            self.assertNotIn('Ansible.OptionalModule', self.instance.ps_modules)

    def test_add_module_import_error(self):
        with patch('ansible.plugins.loader.ps_module_utils_loader.find_plugin', return_value=None):
            with self.assertRaises(AnsibleError):
                self.instance._add_module('Ansible.RequiredModule', '.psm1', 'fqn', False)

    def test_add_module_import_module(self):
        with patch('ansible.executor.powershell.module_manifest.import_module', return_value=MagicMock(__path__=['/path/to/module'])):
            with patch('pkgutil.get_data', return_value=b"module data"):
                self.instance._add_module('.SubModule', '.cs', 'fqn', False)
                self.assertIn('fqn.SubModule', self.instance.cs_utils_module)

    def test_add_module_import_module_error(self):
        with patch('ansible.executor.powershell.module_manifest.import_module', side_effect=ImportError):
            with self.assertRaises(AnsibleError):
                self.instance._add_module('.SubModule', '.cs', 'fqn', False)

    def test_add_module_os_error(self):
        with patch('ansible.executor.powershell.module_manifest.import_module', side_effect=OSError(errno.ENOENT, 'No such file or directory')):
            self.instance._add_module('.SubModule', '.cs', 'fqn', True)
            self.assertNotIn('fqn.SubModule', self.instance.cs_utils_module)

if __name__ == '__main__':
    unittest.main()