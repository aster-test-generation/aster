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

    def test_configure_base(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf_module.base
        conf_file = '/path/to/conf/file'
        disable_gpg_check = True
        installroot = '/'
        dnf_module._configure_base(base, conf_file, disable_gpg_check, installroot)
        self.assertEqual(base.conf.config_file_path, conf_file)

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule()')

    def test_eq(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module1 = DnfModule(module1)
        module2 = AnsibleModule()
        dnf_module2 = DnfModule(module2)
        self.assertEqual(dnf_module1, dnf_module2)

    def test__configure_base_private_methods(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf_module.base
        conf_file = '/path/to/conf/file'
        disable_gpg_check = True
        installroot = '/'
        dnf_module._DnfModule__configure_base_private_methods(base, conf_file, disable_gpg_check, installroot)
        self.assertEqual(base.conf.config_file_path, conf_file)

    def test__configure_base_protected_methods(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        base = dnf_module.base
        conf_file = '/path/to/conf/file'
        disable_gpg_check = True
        installroot = '/'
        dnf_module._configure_base_protected_methods(base, conf_file, disable_gpg_check, installroot)
        self.assertEqual(base.conf.config_file_path, conf_file)

if __name__ == '__main__':
    unittest.main()