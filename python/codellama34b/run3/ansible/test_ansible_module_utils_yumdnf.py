import unittest
from ansible.module_utils.yumdnf import *


class TestYumDnf(unittest.TestCase):
    def test_is_lockfile_pid_valid(self):
        instance = YumDnf()
        result = instance.is_lockfile_pid_valid()
        self.assertEqual(result, None)

    def test_wait_for_lock(self):
        instance = YumDnf()
        result = instance.wait_for_lock()
        self.assertEqual(result, None)

    def test_listify_comma_sep_strings_in_list(self):
        instance = YumDnf()
        result = instance.listify_comma_sep_strings_in_list(["a,b,c"])
        self.assertEqual(result, ["a", "b", "c"])

    def test_run(self):
        instance = YumDnf()
        result = instance.run()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()