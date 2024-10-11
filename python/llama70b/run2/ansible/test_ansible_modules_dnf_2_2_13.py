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
        self.assertIsInstance(dnf_module.with_modules, bool)

    def test_allowerasing(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

    def test__is_installed(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertFalse(dnf_module._is_installed('httpd'))

    def test__split_package_arch(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        name, arch = dnf_module._split_package_arch('httpd.x86_64')
        self.assertEqual(name, 'httpd')
        self.assertEqual(arch, 'x86_64')

    def test__packagename_dict(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        package_details = dnf_module._packagename_dict('httpd-2.4.6-1.el7.x86_64')
        self.assertEqual(package_details, {'name': 'httpd', 'version': '2.4.6', 'release': '1.el7', 'arch': 'x86_64', 'epoch': '0'})

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