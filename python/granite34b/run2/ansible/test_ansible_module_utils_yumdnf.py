import unittest
from ansible.module_utils.yumdnf import YumDnf


class TestYumDnf(unittest.TestCase):
    def setUp(self):
        from unittest.mock import MagicMock
        self.yumdnf = YumDnf(self.module)

    def test_is_lockfile_pid_valid(self):
        self.yumdnf.is_lockfile_pid_valid()
        self.module.run_command.assert_called_once_with('kill -0 %s' % self.yumdnf.lockfile)

    def test_wait_for_lock(self):
        self.yumdnf._is_lockfile_present = MagicMock(return_value=True)
        self.yumdnf.is_lockfile_pid_valid = MagicMock(return_value=True)
        self.yumdnf.wait_for_lock()
        self.yumdnf._is_lockfile_present.assert_called_once()
        self.yumdnf.is_lockfile_pid_valid.assert_called_once()

    def test_listify_comma_sep_strings_in_list(self):
        self.yumdnf.listify_comma_sep_strings_in_list(['a,b', 'c'])
        self.module.fail_json.assert_not_called()

    def test_run(self):
        self.yumdnf.run()
        self.yumdnf.wait_for_lock.assert_called_once()

if __name__ == '__main__':
    unittest.main()