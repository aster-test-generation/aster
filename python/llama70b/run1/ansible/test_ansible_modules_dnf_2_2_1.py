import unittest
from ansible.modules.dnf import DnfModule, YumDnf


class TestDnfModule(unittest.TestCase):
    def setUp(self):
        self.module = DnfModule({'name': 'httpd', 'state': 'present'})

    def test___init__(self):
        self.assertIsInstance(self.module, DnfModule)
        self.assertIsInstance(self.module, YumDnf)

    def test__ensure_dnf(self):
        self.module._ensure_dnf()
        # assert that dnf is imported and available

    def test_is_lockfile_pid_valid(self):
        self.assertTrue(self.module.is_lockfile_pid_valid())

    def test_pkg_mgr_name(self):
        self.assertEqual(self.module.pkg_mgr_name, 'dnf')

    def test_with_modules(self):
        self.assertIsInstance(self.module.with_modules, bool)

    def test_allowerasing(self):
        self.assertEqual(self.module.allowerasing, False)

    def test_nobest(self):
        self.assertEqual(self.module.nobest, False)

    def test___str__(self):
        self.assertEqual(str(self.module), 'DnfModule')

    def test___repr__(self):
        self.assertEqual(repr(self.module), 'DnfModule(name=httpd, state=present)')

    def test___eq__(self):
        other = DnfModule({'name': 'httpd', 'state': 'present'})
        self.assertEqual(self.module, other)

    def test_private_method(self):
        self.module._DnfModule__private_method()  # assert that this method exists

    def test_protected_method(self):
        self.module._ensure_dnf()  # assert that this method exists

if __name__ == '__main__':
    unittest.main()