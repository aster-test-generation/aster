import unittest
from ansible.modules.replace import Replace


class TestReplace(unittest.TestCase):
    def test_replace_method(self):
        replace = Replace()
        result = replace.replace_method("test string", "test", "replace")
        self.assertEqual(result, "replace string")

    def test_private_method(self):
        replace = Replace()
        result = replace._private_method("test string")
        self.assertEqual(result, "private method result")

    def test_protected_method(self):
        replace = Replace()
        result = replace.__protected_method("test string")
        self.assertEqual(result, "protected method result")

    def test_magic_method(self):
        replace = Replace()
        result = replace.__str__()
        self.assertEqual(result, "magic method result")

if __name__ == '__main__':
    unittest.main()