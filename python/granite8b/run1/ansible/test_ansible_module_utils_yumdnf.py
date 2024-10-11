import unittest
from ansible.module_utils.yumdnf import YumDnf


class TestYumDnf(unittest.TestCase):
    def test_is_lockfile_pid_valid(self):
        instance = YumDnf(None)
        instance.lockfile = '/var/run/yum.pid'
        self.assertFalse(instance.is_lockfile_pid_valid())

    def test_listify_comma_sep_strings_in_list(self):
        instance = YumDnf(None)
        some_list = ['foo,bar', 'baz']
        expected_list = ['foo', 'bar', 'baz']
        result = instance.listify_comma_sep_strings_in_list(some_list)
        self.assertEqual(result, expected_list)

    def test_wait_for_lock(self):
        instance = YumDnf(None)
        instance.lockfile = '/var/run/yum.pid'
        instance.lock_timeout = 1
        with tempfile.NamedTemporaryFile() as f:
            f.write(b'1234')
            instance.lockfile = f.name
            instance.wait_for_lock()

if __name__ == '__main__':
    unittest.main()