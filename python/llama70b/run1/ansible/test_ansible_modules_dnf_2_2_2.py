import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        from ansible.module_utils.basic import AnsibleModule

    def test_init(self):
        self.assertIsInstance(self.module, DnfModule)
        self.assertIsInstance(self.module, YumDnf)

    def test__ensure_dnf(self):
        self.module._ensure_dnf()
        # assert that dnf is imported and available

    def test_lockfile(self):
        self.assertEqual(self.module.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        self.assertEqual(self.module.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        self.assertIsInstance(self.module.with_modules, bool)

    def test_allowerasing(self):
        self.assertIsInstance(self.module.allowerasing, bool)

    def test_nobest(self):
        self.assertIsInstance(self.module.nobest, bool)

    def test__sanitize_dnf_error_msg_install(self):
        error = 'some error message'
        spec = 'some package'
        result = self.module._sanitize_dnf_error_msg_install(spec, error)
        self.assertEqual(result, 'No package some package available.')

    def test___init__(self):
        # test the __init__ method
        module = AnsibleModule
        dnf_module = DnfModule(module)
        self.assertIsInstance(dnf_module, DnfModule)

    def test___str__(self):
        # test the __str__ method
        result = str(self.module)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        # test the __repr__ method
        result = repr(self.module)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        # test the __eq__ method
        other = DnfModule(AnsibleModule)
        self.assertFalse(self.module == other)

if __name__ == '__main__':
    unittest.main()