import unittest
from ansible.modules.replace import Replace


class TestReplace(unittest.TestCase):
    def test_replace_method(self):
        replace = Replace()
        result = replace.replace_method("hello world", "hello", "goodbye")
        self.assertEqual(result, "goodbye world")

    def test_private_method(self):
        replace = Replace()
        result = replace._private_method("hello world")
        self.assertEqual(result, "hello world")

    def test_protected_method(self):
        replace = Replace()
        result = replace._protected_method("hello world")
        self.assertEqual(result, "hello world")

    def test_magic_method(self):
        replace = Replace()
        result = replace.__str__()
        self.assertEqual(result, "Replace")

if __name__ == '__main__':
    unittest.main()