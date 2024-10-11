import unittest
from ansible.executor.powershell.module_manifest import PSModuleDepFinder


class TestPSModuleDepFinder(unittest.TestCase):
    def test_init(self):
        instance = PSModuleDepFinder()
        self.assertIsInstance(instance, PSModuleDepFinder)

    def test_scan_module(self):
        instance = PSModuleDepFinder()
        module_data = b"using Ansible.ModuleUtils; using ansible_collections.my_collection.my_module.plugins.module_utils.my_module;"
        instance.scan_module(module_data)
        self.assertIn("Ansible.ModuleUtils", instance.ps_modules)

    def test_scan_exec_script(self):
        instance = PSModuleDepFinder()
        instance.scan_exec_script("my_script")
        self.assertIn("my_script", instance.exec_scripts)

    def test_add_module(self):
        instance = PSModuleDepFinder()
        instance._add_module("Ansible.ModuleUtils", ".psm1", "my_fqn", False)
        self.assertIn("Ansible.ModuleUtils", instance.ps_modules)

    def test_parse_version_match(self):
        instance = PSModuleDepFinder()
        match = re.match(instance._re_ps_version, b"PSVersion 3.0")
        instance._parse_version_match(match, "ps_version")
        self.assertEqual(instance.ps_version, "3.0")

    def test_private_method__re_cs_module(self):
        instance = PSModuleDepFinder()
        result = instance._PSModuleDepFinder__re_cs_module[0].match(b"using Ansible.ModuleUtils;")
        self.assertIsNotNone(result)

    def test_private_method__re_ps_module(self):
        instance = PSModuleDepFinder()
        result = instance._PSModuleDepFinder__re_ps_module[0].match(b"using Ansible.ModuleUtils;")
        self.assertIsNotNone(result)

    def test_private_method__re_wrapper(self):
        instance = PSModuleDepFinder()
        result = instance._PSModuleDepFinder__re_wrapper.match(b"wrapper Ansible.ModuleUtils;")
        self.assertIsNotNone(result)

    def test_private_method__re_become(self):
        instance = PSModuleDepFinder()
        result = instance._PSModuleDepFinder__re_become.match(b"become Ansible.ModuleUtils;")
        self.assertIsNotNone(result)

    def test_private_method__strip_comments(self):
        instance = PSModuleDepFinder()
        data = b"# comment\nusing Ansible.ModuleUtils;"
        result = instance._strip_comments(data)
        self.assertEqual(result, b"using Ansible.ModuleUtils;")

    def test_private_method__slurp(self):
        instance = PSModuleDepFinder()
        mu_path = "path/to/module/utils"
        result = instance._slurp(mu_path)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()