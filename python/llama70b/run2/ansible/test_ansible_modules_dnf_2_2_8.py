import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test_ensure_dnf(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        dnf_module._ensure_dnf()
        self.assertTrue(hasattr(dnf_module, 'with_modules'))

    def test_lockfile(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertEqual(dnf_module.pkg_mgr_name, 'dnf')

    def test_allowerasing(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.allowerasing)

    def test_nobest(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertTrue(dnf_module.nobest)

    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

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
        module2 = AnsibleModule({'name': 'httpd', 'state': 'latest'})
        dnf_module1 = DnfModule(module1)
        dnf_module2 = DnfModule(module2)
        self.assertEqual(dnf_module1, dnf_module2)

class TestYumDnf(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertIsInstance(yum_dnf, YumDnf)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertEqual(str(yum_dnf), 'YumDnf')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        yum_dnf = YumDnf(module)
        self.assertEqual(repr(yum_dnf), 'YumDnf()')

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        module2 = AnsibleModule({'name': 'httpd', 'state': 'latest'})
        yum_dnf1 = YumDnf(module1)
        yum_dnf2 = YumDnf(module2)
        self.assertEqual(yum_dnf1, yum_dnf2)

if __name__ == '__main__':
    unittest.main()