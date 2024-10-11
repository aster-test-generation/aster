import unittest
from ansible.module_utils.yumdnf import *


class TestYumDnf(unittest.TestCase):
    def test_is_lockfile_pid_valid(self):
        instance = YumDnf(None, None, None, None, None)
        result = instance.is_lockfile_pid_valid()
        self.assertEqual(result, None)

    def test_wait_for_lock(self):
        instance = YumDnf(None, None)
        instance.wait_for_lock()
        self.assertEqual(instance.lockfile, '/var/run/yum.pid')

    def test_listify_comma_sep_strings_in_list(self):
        instance = YumDnf(is_lockfile_pid_valid=lambda x: True, run=lambda x: True)
        some_list = ['a,b,c', 'd,e,f']
        result = instance.listify_comma_sep_strings_in_list(some_list)
        self.assertEqual(result, ['a', 'b', 'c', 'd', 'e', 'f'])

    def test_run(self):
        instance = YumDnf(is_lockfile_pid_valid=lambda: True, run=lambda: True)
        result = instance.run()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()