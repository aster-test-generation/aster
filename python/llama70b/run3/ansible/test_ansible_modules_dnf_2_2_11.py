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
        self.assertTrue(hasattr(dnf_module, 'with_modules'))

    def test_base(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf_module._base(conf_file=None, disable_gpg_check=False, disablerepo=[], enablerepo=[], installroot='/')
        self.assertIsInstance(base, dnf.Base)

    def test_configure_base(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf.Base()
        dnf_module._configure_base(base, conf_file=None, disable_gpg_check=False, installroot='/')
        self.assertTrue(hasattr(base, 'conf'))

    def test_specify_repositories(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf.Base()
        dnf_module._specify_repositories(base, disablerepo=[], enablerepo=[])
        self.assertTrue(hasattr(base, 'repos'))

    def test_update_cache(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf.Base()
        dnf_module.update_cache = True
        dnf_module._base(conf_file=None, disable_gpg_check=False, disablerepo=[], enablerepo=[], installroot='/')
        self.assertTrue(hasattr(base, 'sack'))

    def test_add_security_filters(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf.Base()
        dnf_module.bugfix = True
        dnf_module.security = True
        dnf_module._base(conf_file=None, disable_gpg_check=False, disablerepo=[], enablerepo=[], installroot='/')
        self.assertTrue(hasattr(base, '_update_security_filters'))

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(str(dnf_module), str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(repr(dnf_module), str)

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module1 = DnfModule(module1)
        module2 = AnsibleModule(argument_spec=dict())
        dnf_module2 = DnfModule(module2)
        self.assertFalse(dnf_module1 == dnf_module2)

if __name__ == '__main__':
    unittest.main()