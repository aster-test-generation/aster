import unittest
from ansible.modules.replace import *


class TestReplaceModule(unittest.TestCase):
    def test_private_method(self):
        instance = ReplaceClass()
        result = instance._ReplaceModule__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        instance = ReplaceClass()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_magic_method(self):
        instance = ReplaceClass()
        result = instance.__str__()
        self.assertEqual(result, "ReplaceModule")

if __name__ == '__main__':
    unittest.main()