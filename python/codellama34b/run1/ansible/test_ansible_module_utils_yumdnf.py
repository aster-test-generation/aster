import unittest
from ansible.module_utils.yumdnf import *


class TestYumDnf(unittest.TestCase):
    def test_is_lockfile_pid_valid(self):
        instance = YumDnf(is_lockfile_pid_valid=lambda x: True, run=lambda x: True)
        result = instance.is_lockfile_pid_valid()
        self.assertEqual(result, None)

    def test_wait_for_lock(self):
        instance = YumDnf(is_lockfile_pid_valid=True, run=True)
        result = instance.wait_for_lock()
        self.assertEqual(result, None)

    def test_listify_comma_sep_strings_in_list(self):
        instance = YumDnf(None, None, None, None)
        result = instance.listify_comma_sep_strings_in_list(["a,b,c"])
        self.assertEqual(result, ["a", "b", "c"])

    def test_run(self):
        instance = YumDnf(None, None)
        result = instance.run()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()