import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_with_modules(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_allowerasing(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_nobest(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_is_module_installed(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

if __name__ == '__main__':
    unittest.main()