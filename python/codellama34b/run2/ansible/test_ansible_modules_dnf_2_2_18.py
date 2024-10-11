import unittest
from ansible.module_utils.dnf import *


class TestDnfModule(unittest.TestCase):
    def test_ensure_dnf(self):
        instance = DnfModule(None)
        instance._ensure_dnf()

    def test_update_only(self):
        instance = DnfModule(None)
        pkgs = []
        result = instance._update_only(pkgs)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()