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
        self.assertTrue(hasattr(dnf_module, 'dnf'))

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

    def test_packagename_dict(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        packagename = 'httpd-2.4.6-1.el7.x86_64'
        result = dnf_module._packagename_dict(packagename)
        self.assertIsInstance(result, dict)
        self.assertEqual(result['name'], 'httpd')
        self.assertEqual(result['epoch'], '0')
        self.assertEqual(result['release'], '1.el7')
        self.assertEqual(result['version'], '2.4.6')

    def test_split_package_arch(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        packagename = 'httpd-2.4.6-1.el7.x86_64'
        nevr, arch = dnf_module._split_package_arch(packagename)
        self.assertEqual(nevr, 'httpd-2.4.6-1.el7')
        self.assertEqual(arch, 'x86_64')

    def test__str__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(str(dnf_module), str)

    def test__repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(repr(dnf_module), str)

if __name__ == '__main__':
    unittest.main()