import unittest
from ansible.modules.replace import *



class TestReplace(unittest.TestCase):
    def test_replace(self):
        instance = Replace()
        result = instance.replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs(self):
        instance = Replace()
        result = instance.replace_backrefs(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs_no_match(self):
        instance = Replace()
        result = instance.replace_backrefs_no_match(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs_no_change(self):
        instance = Replace()
        result = instance.replace_backrefs_no_change(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs_no_change_no_match(self):
        instance = Replace()
        result = instance.replace_backrefs_no_change_no_match(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs_no_change_no_match_no_replace(self):
        instance = Replace()
        result = instance.replace_backrefs_no_change_no_match_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs_no_change_no_replace(self):
        instance = Replace()
        result = instance.replace_backrefs_no_change_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs_no_match_no_replace(self):
        instance = Replace()
        result = instance.replace_backrefs_no_match_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_backrefs_no_replace(self):
        instance = Replace()
        result = instance.replace_backrefs_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_no_match(self):
        instance = Replace()
        result = instance.replace_no_match(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_no_change(self):
        instance = Replace()
        result = instance.replace_no_change(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_no_change_no_match(self):
        instance = Replace()
        result = instance.replace_no_change_no_match(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_no_change_no_match_no_replace(self):
        instance = Replace()
        result = instance.replace_no_change_no_match_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_no_change_no_replace(self):
        instance = Replace()
        result = instance.replace_no_change_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_no_match_no_replace(self):
        instance = Replace()
        result = instance.replace_no_match_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_replace_no_replace(self):
        instance = Replace()
        result = instance.replace_no_replace(path, regexp, replace)
        self.assertEqual(result, )

    def test_main(self):
        instance = Replace()
        result = instance.main(path, regexp, replace)
        self.assertEqual(result, )

    def test_run_command(self):
        instance = Replace()
        result = instance.run_command(path, regexp, replace)
        self.assertEqual(result, )

if __name__ == '__main__':
    unittest.main()