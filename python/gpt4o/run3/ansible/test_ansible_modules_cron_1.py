import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron = CronTab(self.module, user='testuser', cron_file='/etc/cron.d/testcron')

    def test_init(self):
        self.assertEqual(self.cron.user, 'testuser')
        self.assertTrue(self.cron.root)
        self.assertIsNone(self.cron.lines)
        self.assertEqual(self.cron.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron.cron_file, '/etc/cron.d/testcron')
        self.assertEqual(self.cron.b_cron_file, b'/etc/cron.d/testcron')

    def test_write_execute_with_user(self):
        with patch('platform.system', return_value='Linux'):
            with patch('pwd.getpwuid', return_value=['otheruser']):
                result = self.cron._write_execute('/path/to/file')
                self.assertEqual(result, '/usr/bin/crontab -u testuser /path/to/file')

    def test_write_execute_without_user(self):
        self.cron.user = None
        result = self.cron._write_execute('/path/to/file')
        self.assertEqual(result, '/usr/bin/crontab  /path/to/file')

    def test_write_execute_with_special_platform(self):
        with patch('platform.system', return_value='SunOS'):
            result = self.cron._write_execute('/path/to/file')
            self.assertEqual(result, "chown testuser /path/to/file ; su 'testuser' -c '/usr/bin/crontab /path/to/file'")

if __name__ == '__main__':
    unittest.main()