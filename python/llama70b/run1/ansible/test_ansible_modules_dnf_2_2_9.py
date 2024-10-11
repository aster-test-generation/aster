import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, YumDnf)

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
        self.assertFalse(base.conf.gpgcheck)

    def test_lockfile(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

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

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(str(dnf_module), 'DnfModule')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(repr(dnf_module), 'DnfModule()')

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module1 = DnfModule(module1)
        module2 = AnsibleModule(argument_spec=dict())
        dnf_module2 = DnfModule(module2)
        self.assertEqual(dnf_module1, dnf_module2)

if __name__ == '__main__':
    unittest.main()