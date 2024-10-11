import unittest
from ansible.modules.replace import *


class TestReplaceModule(unittest.TestCase):
    def test_replace_method(self):
        instance = ReplaceClass()
        result = instance.replace("hello world", "hello", "goodbye")
        self.assertEqual(result, "goodbye world")

    def test_replace_method_with_file(self):
        instance = ReplaceClass()
        instance.path = "test_file.txt"
        instance.regexp = "hello"
        instance.replace = "goodbye"
        instance.backup = False
        instance.unsafe_writes = False
        instance.backup_ext = ".bak"
        instance.run()
        with open("test_file.txt", "r") as f:
            content = f.read()
        self.assertEqual(content, "goodbye world")

    def test_replace_method_with_backup(self):
        instance = ReplaceClass()
        instance.path = "test_file.txt"
        instance.regexp = "hello"
        instance.replace = "goodbye"
        instance.backup = True
        instance.unsafe_writes = False
        instance.backup_ext = ".bak"
        instance.run()
        with open("test_file.txt", "r") as f:
            content = f.read()
        self.assertEqual(content, "goodbye world")
        with open("test_file.txt.bak", "r") as f:
            backup_content = f.read()
        self.assertEqual(backup_content, "hello world")

    def test_replace_method_with_unsafe_writes(self):
        instance = ReplaceClass()
        instance.path = "test_file.txt"
        instance.regexp = "hello"
        instance.replace = "goodbye"
        instance.backup = False
        instance.unsafe_writes = True
        instance.backup_ext = ".bak"
        instance.run()
        with open("test_file.txt", "r") as f:
            content = f.read()
        self.assertEqual(content, "goodbye world")

if __name__ == '__main__':
    unittest.main()