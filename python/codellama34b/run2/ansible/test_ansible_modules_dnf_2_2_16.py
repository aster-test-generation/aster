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

    def test_whatprovides(self):
        instance = DnfModule(None)
        result = instance._whatprovides(None)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()