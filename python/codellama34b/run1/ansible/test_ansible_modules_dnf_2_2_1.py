import unittest
from dnf import *


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_is_lockfile_pid_valid(self):
        instance = DnfModule(None)
        result = instance.is_lockfile_pid_valid()
        self.assertTrue(result)

if __name__ == '__main__':
    unittest.main()