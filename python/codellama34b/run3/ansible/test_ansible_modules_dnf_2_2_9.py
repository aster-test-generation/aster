import unittest
from ansible.module_utils.dnf import *


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_configure_base(self):
        instance = DnfModule(None)
        instance._configure_base(None, None, None, None)
        self.assertIsNotNone(instance)

if __name__ == '__main__':
    unittest.main()