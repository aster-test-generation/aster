import unittest
from ansible.modules.replace import replace


class TestReplaceModule(unittest.TestCase):
    def test_replace_method(self):
        instance = replace()
        result = instance.replace("hello world", "hello", "goodbye")
        self.assertEqual(result, "goodbye world")

    def test_replace_private_method(self):
        instance = replace()
        result = instance._replace_private_method("hello world", "hello", "goodbye")
        self.assertEqual(result, "goodbye world")

    def test_replace_protected_method(self):
        instance = replace()
        result = instance._replace_protected_method("hello world", "hello", "goodbye")
        self.assertEqual(result, "goodbye world")

    def test_replace_magic_method(self):
        instance = replace()
        result = instance.__replace_magic_method("hello world", "hello", "goodbye")
        self.assertEqual(result, "goodbye world")

if __name__ == '__main__':
    unittest.main()