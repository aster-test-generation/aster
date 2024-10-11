import unittest
from ansible.executor.powershell.module_manifest import PSModuleDepFinder


class TestPSModuleDepFinder(unittest.TestCase):
    def test_init(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance, PSModuleDepFinder)

    def test_scan_module(self):
        instance = PSModuleDepFinder()
        module_data = b"using Ansible.ModuleUtils;\n"
        instance.scan_module(module_data)
        self.assertIn("Ansible.ModuleUtils", instance.ps_modules)

    def test_scan_exec_script(self):
        instance = PSModuleDepFinder()
        instance.scan_exec_script("example_script")
        self.assertIn("example_script", instance.exec_scripts)

    def test_add_module(self):
        instance = PSModuleDepFinder()
        instance._add_module("Ansible.ModuleUtils", ".psm1", None, False)
        self.assertIn("Ansible.ModuleUtils", instance.ps_modules)

    def test_parse_version_match(self):
        instance = PSModuleDepFinder()
        match = re.match(instance._re_ps_version, b"PSVersion 3.0")
        instance._parse_version_match(match, "ps_version")
        self.assertEqual(instance.ps_version, "3.0")

    def test_private__re_cs_module(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance._PSModuleDepFinder__re_cs_module, list)

    def test_private__re_cs_in_ps_module(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance._PSModuleDepFinder__re_cs_in_ps_module, list)

    def test_private__re_ps_module(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance._PSModuleDepFinder__re_ps_module, list)

    def test_private__re_wrapper(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance._PSModuleDepFinder__re_wrapper, re.Pattern)

    def test_private__re_ps_version(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance._PSModuleDepFinder__re_ps_version, re.Pattern)

    def test_private__re_os_version(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance._PSModuleDepFinder__re_os_version, re.Pattern)

    def test_private__re_become(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance._PSModuleDepFinder__re_become, re.Pattern)

    def test_magic_str(self):
        instance = PSModuleDepFinder()
        self.assertEqual(str(instance), "PSModuleDepFinder")

    def test_magic_repr(self):
        instance = PSModuleDepFinder()
        self.assertEqual(repr(instance), "PSModuleDepFinder()")

if __name__ == '__main__':
    unittest.main()