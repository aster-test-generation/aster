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

    def test_parse_spec_group_file(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        pkg_specs, grp_specs, module_specs, filenames = dnf_module._parse_spec_group_file()
        self.assertIsInstance(pkg_specs, list)
        self.assertIsInstance(grp_specs, list)
        self.assertIsInstance(module_specs, list)
        self.assertIsInstance(filenames, list)

    def test__whatprovides(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        pkg_spec = dnf_module._whatprovides('/usr/bin/httpd')
        self.assertIsInstance(pkg_spec, str)

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
        module2 = AnsibleModule({'name': 'httpd', 'state': 'latest'})
        dnf_module1 = DnfModule(module1)
        dnf_module2 = DnfModule(module2)
        self.assertTrue(dnf_module1 == dnf_module2)

if __name__ == '__main__':
    unittest.main()