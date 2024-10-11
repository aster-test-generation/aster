import unittest
from ExampleCode import ExampleCode


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance, DnfModule)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_with_modules(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.with_modules, bool)

    def test_lockfile(self):
        instance = DnfModule(None)
        self.assertEqual(instance.lockfile, '/var/cache/dnf/*_lock.pid')

    def test_pkg_mgr_name(self):
        instance = DnfModule(None)
        self.assertEqual(instance.pkg_mgr_name, 'dnf')

    def test_allowerasing(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.allowerasing, bool)

    def test_nobest(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance.nobest, bool)

    def test_whatprovides(self):
        instance = DnfModule(None)
        self.assertIsInstance(instance._whatprovides(None), str)

if __name__ == '__main__':
    unittest.main()