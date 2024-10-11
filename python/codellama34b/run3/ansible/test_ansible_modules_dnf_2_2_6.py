import unittest
from ansible.module_utils.dnf import DnfModule


class TestDnfModule(unittest.TestCase):
    def test_init(self):
        instance = DnfModule(None)
        self.assertIsNotNone(instance)

    def test_packagename_dict(self):
        instance = DnfModule(None)
        result = instance._packagename_dict("test")
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()