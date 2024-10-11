import unittest
from ansible.module_utils.yumdnf import YumDnf


class TestYumDnf(unittest.TestCase):
    def test_is_lockfile_pid_valid(self):
        yumdnf = YumDnf(None, None)
        self.assertTrue(yumdnf.is_lockfile_pid_valid())

    def test_wait_for_lock(self):
        yumdnf = YumDnf(None, None)
        yumdnf.wait_for_lock()

    def test_listify_comma_sep_strings_in_list(self):
        yumdnf = YumDnf(None, None)
        some_list = ["a,b", "c,d", "e"]
        expected_list = ["a", "b", "c", "d", "e"]
        self.assertEqual(yumdnf.listify_comma_sep_strings_in_list(some_list), expected_list)

if __name__ == '__main__':
    unittest.main()