from ansible.modules.cron import to_bytes
import os
import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron_tab = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron_tab.module, self.module)
        self.assertEqual(self.cron_tab.user, None)
        self.assertEqual(self.cron_tab.root, os.getuid() == 0)
        self.assertEqual(self.cron_tab.lines, None)
        self.assertEqual(self.cron_tab.ansible, '')
        self.assertEqual(self.cron_tab.n_existing, '')
        self.assertEqual(self.cron_tab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron_tab.cron_file, None)

    def test_init_with_cron_file(self):
        cron_file = '/etc/cron.d/test_cron'
        cron_tab = CronTab(self.module, cron_file=cron_file)
        self.assertEqual(cron_tab.cron_file, cron_file)
        self.assertEqual(cron_tab.b_cron_file, to_bytes(cron_file, errors='surrogate_or_strict'))

    def test_init_with_relative_cron_file(self):
        cron_file = 'test_cron'
        cron_tab = CronTab(self.module, cron_file=cron_file)
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_cron')
        self.assertEqual(cron_tab.b_cron_file, os.path.join(b'/etc/cron.d', to_bytes(cron_file, errors='surrogate_or_strict')))

    def test_do_add_job(self):
        lines = []
        comment = '# Test job'
        job = 'echo "Hello World"'
        self.cron_tab.do_add_job(lines, comment, job)
        self.assertEqual(lines, [comment, job])

    @patch('os.getuid', return_value=0)
    def test_root_user(self, mock_getuid):
        cron_tab = CronTab(self.module)
        self.assertTrue(cron_tab.root)

    @patch('os.getuid', return_value=1000)
    def test_non_root_user(self, mock_getuid):
        cron_tab = CronTab(self.module)
        self.assertFalse(cron_tab.root)

class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron_file = '/etc/cron.d/test_cron'
        self.user = 'test_user'
        self.crontab = CronTab(self.module, user=self.user, cron_file=self.cron_file)

    def test_init_with_cron_file(self):
        self.assertEqual(self.crontab.cron_file, self.cron_file)
        self.assertEqual(self.crontab.b_cron_file, b'/etc/cron.d/test_cron')

    def test_init_without_cron_file(self):
        crontab = CronTab(self.module, user=self.user)
        self.assertIsNone(crontab.cron_file)

    def test_do_add_job(self):
        lines = []
        comment = '# Test job'
        job = 'echo "Hello World"'
        self.crontab.do_add_job(lines, comment, job)
        self.assertIn(comment, lines)
        self.assertIn(job, lines)

    def test_private_read(self):
        with patch('ansible.modules.cron.open', unittest.mock.mock_open(read_data='test data'), create=True):
            self.crontab._CronTab__read()
            self.assertEqual(self.crontab.lines, ['test data'])

    def test_protected_read(self):
        with patch('ansible.modules.cron.open', unittest.mock.mock_open(read_data='test data'), create=True):
            self.crontab._read()
            self.assertEqual(self.crontab.lines, ['test data'])

    def test_str_method(self):
        result = self.crontab.__str__()
        self.assertEqual(result, f"CronTab(user={self.user}, cron_file={self.cron_file})")

    def test_repr_method(self):
        result = self.crontab.__repr__()
        self.assertEqual(result, f"CronTab(user={self.user}, cron_file={self.cron_file})")

if __name__ == '__main__':
    unittest.main()