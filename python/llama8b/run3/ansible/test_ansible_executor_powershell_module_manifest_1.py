import unittest
from ansible.executor.powershell.module_manifest import PSModuleDepFinder


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
        fqn = None
        optional = False
        finder._add_module(name, ext, fqn, optional)
        self.assertIn(name, finder.ps_modules)

    def test_parse_version_match(self):
        finder = PSModuleDepFinder()
        match = re.compile(to_bytes('(?i)^PSVersion 3.0')).match(b'PSVersion 3.0')
        finder._parse_version_match(match, 'ps_version')
        self.assertEqual(finder.ps_version, '3.0')

    def test__init__(self):
        finder = PSModuleDepFinder()
        self.assertEqual(finder.__str__(), 'PSModuleDepFinder')
        self.assertEqual(finder.__repr__(), 'PSModuleDepFinder()')

    def test__eq__(self):
        finder1 = PSModuleDepFinder()
        finder2 = PSModuleDepFinder()
        self.assertEqual(finder1, finder2)

if __name__ == '__main__':
    unittest.main()