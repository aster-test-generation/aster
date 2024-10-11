import unittest
from ansible.modules.command import Command


class TestCommandModule(unittest.TestCase):
    def test_method_one(self):
        instance = CommandModule()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        instance = CommandModule()
        result = instance.method_two(2)
        self.assertEqual(result, 4)

    def test_protected_method(self):
        instance = CommandModule()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_private_method(self):
        instance = CommandModule()
        result = instance._CommandModule__private_method(3)
        self.assertEqual(result, 9)

    def test_str_method(self):
        instance = CommandModule()
        result = instance.__str__()
        self.assertEqual(result, "CommandModule")

    def test_repr_method(self):
        instance = CommandModule()
        result = instance.__repr__()
        self.assertEqual(result, "CommandModule(1)")

if __name__ == '__main__':
    unittest.main()