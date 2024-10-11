import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_with_modules(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance.with_modules)

    def test_allowerasing(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance.allowerasing)

    def test_nobest(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance.nobest)

    def test_compare_evr(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance._compare_evr(None, None, None, None, None, None))

if __name__ == '__main__':
    unittest.main()