import unittest
from ansible.module_utils.yumdnf import YumDnf


class TestYumDnf(unittest.TestCase):
    def test_listify_comma_sep_strings_in_list(self):
        yum = YumDnf(None)
        some_list = ['foo,bar', 'baz']
        expected_list = ['foo', 'bar', 'baz']
        result = yum.listify_comma_sep_strings_in_list(some_list)
        self.assertEqual(result, expected_list)

    def test_is_lockfile_pid_valid(self):
        yum = YumDnf(None)
        yum.lockfile = '/var/run/yum.pid'
        with tempfile.NamedTemporaryFile() as f:
            f.write(b'1234\n')
            f.flush()
            yum.lockfile = f.name
            self.assertTrue(yum.is_lockfile_pid_valid())

    def test_wait_for_lock(self):
        yum = YumDnf(None)
        yum.lockfile = '/var/run/yum.pid'
        with tempfile.NamedTemporaryFile() as f:
            f.write(b'1234\n')
            f.flush()
            yum.lockfile = f.name
            yum.lock_timeout = 1
            yum.wait_for_lock()

if __name__ == '__main__':
    unittest.main()