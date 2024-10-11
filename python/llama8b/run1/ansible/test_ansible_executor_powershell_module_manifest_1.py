import unittest
from ansible.executor.powershell.module_manifest import PSModuleDepFinder


class TestPSModuleDepFinder(unittest.TestCase):
    def test_init(self):
        instance = PSModuleDepFinder()
        self.assertEqual(instance.ps_modules, {})
        self.assertEqual(instance.exec_scripts, {})
        self.assertEqual(instance.cs_utils_wrapper, {})
        self.assertEqual(instance.cs_utils_module, {})
        self.assertEqual(instance.ps_version, None)
        self.assertEqual(instance.os_version, None)
        self.assertFalse(instance.become)

    def test_scan_module(self):
        instance = PSModuleDepFinder()
        module_data = b'using Ansible.module_utils.core\nusing Ansible.module_utils.file'
        instance.scan_module(module_data)
        self.assertIn('Ansible.module_utils.core', instance.cs_utils_module)
        self.assertIn('Ansible.module_utils.file', instance.cs_utils_module)

    def test_scan_exec_script(self):
        instance = PSModuleDepFinder()
        name = 'test_script'
        data = pkgutil.get_data('ansible.executor.powershell', to_native(name + '.ps1'))
        instance.scan_exec_script(name)
        self.assertIn(name, instance.exec_scripts)

    def test_add_module(self):
        instance = PSModuleDepFinder()
        name = 'Ansible.module_utils.core'
        ext = '.psm1'
        fqn = 'Ansible.module_utils.core'
        optional = False
        instance._add_module(name, ext, fqn, optional)
        self.assertIn(name, instance.ps_modules)

    def test_parse_version_match(self):
        instance = PSModuleDepFinder()
        match = re.compile(to_bytes('(?i)^PowerShell 7.2.0;')).match(b'PowerShell 7.2.0;')
        instance._parse_version_match(match, 'ps_version')
        self.assertEqual(instance.ps_version, '7.2.0')

    def test_str_method(self):
        instance = PSModuleDepFinder()
        result = str(instance)
        self.assertEqual(result, 'PSModuleDepFinder')

    def test_repr_method(self):
        instance = PSModuleDepFinder()
        result = repr(instance)
        self.assertEqual(result, 'PSModuleDepFinder()')

    def test_eq_method(self):
        instance1 = PSModuleDepFinder()
        instance2 = PSModuleDepFinder()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()