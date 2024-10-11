import os
import tempfile
import unittest
from ansible.module_utils._text import to_native
from ansible.module_utils.yumdnf import YumDnf


class TestYumDnf(unittest.TestCase):
    def test_is_lockfile_pid_valid(self):
        with tempfile.NamedTemporaryFile() as lockfile:
            lockfile.write(b"1234\n")
            lockfile.flush()
            y = YumDnf(None, None)
            y.lockfile = lockfile.name
            self.assertTrue(y.is_lockfile_pid_valid())

    def test_listify_comma_sep_strings_in_list(self):
        y = YumDnf(None, None)
        self.assertEqual(y.listify_comma_sep_strings_in_list(["foo,bar"]), ["foo", "bar"])
        self.assertEqual(y.listify_comma_sep_strings_in_list(["foo, bar"]), ["foo", "bar"])
        self.assertEqual(y.listify_comma_sep_strings_in_list(["foo,bar", "baz"]), ["foo", "bar", "baz"])
        self.assertEqual(y.listify_comma_sep_strings_in_list(["foo,bar", "baz", ""]), ["foo", "bar", "baz"])
        self.assertEqual(y.listify_comma_sep_strings_in_list([""]), [])
        self.assertEqual(y.listify_comma_sep_strings_in_list([]), [])

if __name__ == '__main__':
    unittest.main()