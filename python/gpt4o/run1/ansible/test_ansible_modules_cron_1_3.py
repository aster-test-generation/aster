import unittest
from unittest.mock import MagicMock, patch, mock_open
from ansible.modules.cron import CronTab, CronTabError


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.module.run_command.return_value = (0, '', '')
        self.crontab = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.crontab.module, self.module)
        self.assertIsNone(self.crontab.user)
        self.assertTrue(self.crontab.root)
        self.assertIsNone(self.crontab.lines)
        self.assertEqual(self.crontab.cron_cmd, '/usr/bin/crontab')

    def test_init_with_user(self):
        crontab = CronTab(self.module, user='testuser')
        self.assertEqual(crontab.user, 'testuser')

    def test_init_with_cron_file(self):
        with patch('os.path.isabs', return_value=True):
            crontab = CronTab(self.module, cron_file='/etc/cron.d/test')
            self.assertEqual(crontab.cron_file, '/etc/cron.d/test')

    def test_read_with_cron_file(self):
        with patch('builtins.open', mock_open(read_data=b'line1\nline2\n')):
            self.crontab.cron_file = '/etc/cron.d/test'
            self.crontab.b_cron_file = b'/etc/cron.d/test'
            self.crontab.read()
            self.assertEqual(self.crontab.lines, ['line1', 'line2'])

    def test_read_with_cron_file_ioerror(self):
        with patch('builtins.open', side_effect=IOError):
            self.crontab.cron_file = '/etc/cron.d/test'
            self.crontab.b_cron_file = b'/etc/cron.d/test'
            self.crontab.read()
            self.assertEqual(self.crontab.lines, [])

    def test_read_with_cron_file_exception(self):
        with patch('builtins.open', side_effect=Exception):
            self.crontab.cron_file = '/etc/cron.d/test'
            self.crontab.b_cron_file = b'/etc/cron.d/test'
            with self.assertRaises(CronTabError):
                self.crontab.read()

    def test_read_without_cron_file(self):
        self.crontab.cron_file = None
        self.crontab.module.run_command.return_value = (0, 'line1\nline2\n', '')
        self.crontab.read()
        self.assertEqual(self.crontab.lines, ['line1', 'line2'])

    def test_read_without_cron_file_error(self):
        self.crontab.cron_file = None
        self.crontab.module.run_command.return_value = (2, '', 'error')
        with self.assertRaises(CronTabError):
            self.crontab.read()

    def test_read_without_cron_file_rc1(self):
        self.crontab.cron_file = None
        self.crontab.module.run_command.return_value = (1, 'line1\nline2\n', '')
        self.crontab.read()
        self.assertEqual(self.crontab.lines, ['line1', 'line2'])

    def test_read_user_execute(self):
        self.crontab.user = 'testuser'
        result = self.crontab._read_user_execute()
        self.assertEqual(result, 'crontab -l -u testuser')

    def test_read_user_execute_no_user(self):
        self.crontab.user = None
        result = self.crontab._read_user_execute()
        self.assertEqual(result, 'crontab -l')

if __name__ == '__main__':
    unittest.main()