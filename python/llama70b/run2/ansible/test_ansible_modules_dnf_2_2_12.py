import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test__ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'base'))

    def test_list_items_installed(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module.list_items('installed')
        self.assertIsInstance(result, list)

    def test_list_items_upgrades(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module.list_items('upgrades')
        self.assertIsInstance(result, list)

    def test_list_items_available(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module.list_items('available')
        self.assertIsInstance(result, list)

    def test_list_items_repos(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = dnf_module.list_items('repos')
        self.assertIsInstance(result, list)

    def test__package_dict(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        package = dnf_module.base.sack.query().installed()[0]
        result = dnf_module._package_dict(package)
        self.assertIsInstance(result, dict)

    def test_with_modules(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(hasattr(dnf_module, 'with_modules'))

    def test_allowerasing(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

    def test__str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = str(dnf_module)
        self.assertIsInstance(result, str)

    def test__repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        result = repr(dnf_module)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()