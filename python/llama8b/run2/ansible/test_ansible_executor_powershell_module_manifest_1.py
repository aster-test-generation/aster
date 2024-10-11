import unittest
from ansible.module_utils.powershell import PSModuleDepFinde
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
        module_data = b'using Ansible.module_utils.core\nusing Ansible.module_utils.utils'
        instance.scan_module(module_data)
        self.assertIn('Ansible.module_utils.core', instance.cs_utils_module)
        self.assertIn('Ansible.module_utils.utils', instance.cs_utils_module)

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
        match = re.compile(to_bytes('(?i)^PSVersion\s*=\s*(\d+(?:\.\d+)*).*')).match(b'PSVersion = 3.0')
        instance._parse_version_match(match, 'ps_version')
        self.assertEqual(instance.ps_version, '3.0')

    def test__add_module_wrapper(self):
        instance = PSModuleDepFinder()
        name = 'test_wrapper'
        ext = '.cs'
        fqn = 'test_wrapper'
        optional = False
        instance._add_module(name, ext, fqn, optional, wrapper=True)
        self.assertIn(name, instance.cs_utils_wrapper)

    def test__add_module_cs_module(self):
        instance = PSModuleDepFinder()
        name = 'test_cs_module'
        ext = '.cs'
        fqn = 'test_cs_module'
        optional = False
        instance._add_module(name, ext, fqn, optional)
        self.assertIn(name, instance.cs_utils_module)

    def test__parse_version_match_os_version(self):
        instance = PSModuleDepFinder()
        match = re.compile(to_bytes('(?i)^OSVersion\s*=\s*(\d+(?:\.\d+)*).*')).match(b'OSVersion = 10.0')
        instance._parse_version_match(match, 'os_version')
        self.assertEqual(instance.os_version, '10.0')

    def test__parse_version_match_become(self):
        instance = PSModuleDepFinder()
        match = re.compile(to_bytes('(?i)^Become\s*=\s*(true|false).*')).match(b'Become = true')
        instance._parse_version_match(match, 'become')
        self.assertTrue(instance.become)

    def test__init__magic_methods(self):
        instance = PSModuleDepFinder()
        self.assertEqual(str(instance), 'PSModuleDepFinder')
        self.assertEqual(repr(instance), 'PSModuleDepFinder()')

class TestPSModuleDepFinder(unittest.TestCase):
    def test_init(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.ps_modules, {})
        self.assertEqual(finder.exec_scripts, {})
        self.assertEqual(finder.cs_utils_wrapper, {})
        self.assertEqual(finder.cs_utils_module, {})
        self.assertIsNone(finder.ps_version)
        self.assertIsNone(finder.os_version)
        self.assertFalse(finder.become)

    def test_scan_module(self):
        finder = PSModuleDepFinder()
        module_data = b'using Ansible.module_utils.core\nusing Ansible.module_utils.file'
        finder.scan_module(module_data)
        self.assertIn('Ansible.module_utils.core', finder.ps_modules)
        self.assertIn('Ansible.module_utils.file', finder.ps_modules)

    def test_scan_exec_script(self):
        finder = PSModuleDepFinder()
        name = 'test_script'
        data = pkgutil.get_data('ansible.executor.powershell', to_native(name + '.ps1'))
        finder.scan_exec_script(name)
        self.assertIn(name, finder.exec_scripts)

    def test_add_module(self):
        finder = PSModuleDepFinder()
        name = 'Ansible.module_utils.core'
        ext = '.psm1'
        fqn = 'Ansible.module_utils.core'
        finder._add_module(name, ext, fqn)
        self.assertIn(name, finder.ps_modules)

    def test_add_module_wrapper(self):
        finder = PSModuleDepFinder()
        name = 'Ansible.module_utils.core'
        ext = '.cs'
        fqn = 'Ansible.module_utils.core'
        finder._add_module(name, ext, fqn, wrapper=True)
        self.assertIn(name, finder.cs_utils_wrapper)

    def test_parse_version_match(self):
        finder = PSModuleDepFinder()
        match = re.compile(to_bytes('(?i)^PSVersion\s*=\s*\'(\\d+(?:\\.\\d+)*)\'')).match(b'PSVersion = \'1.2.3\'')
        finder._parse_version_match(match, 'ps_version')
        self.assertEqual(finder.ps_version, '1.2.3')

    def test_eq(self):
        finder1 = PSModuleDepFinder()
        finder2 = PSModuleDepFinder()
        self.assertEqual(finder1, finder2)

    def test_str(self):
        finder = PSModuleDepFinder()
        self.assertEqual(str(finder), 'PSModuleDepFinder')

    def test_repr(self):
        finder = PSModuleDepFinder()
        self.assertEqual(repr(finder), 'PSModuleDepFinder()')

if __name__ == '__main__':
    unittest.main()