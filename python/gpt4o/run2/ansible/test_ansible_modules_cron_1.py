import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron = CronTab(self.module, user='testuser', cron_file='/etc/cron.d/testcron')

    def test_init(self):
        self.assertEqual(self.cron.module, self.module)
        self.assertEqual(self.cron.user, 'testuser')
        self.assertTrue(self.cron.root)
        self.assertIsNone(self.cron.lines)
        self.assertEqual(self.cron.ansible, '')
        self.assertEqual(self.cron.n_existing, '')
        self.assertEqual(self.cron.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron.cron_file, '/etc/cron.d/testcron')
        self.assertEqual(self.cron.b_cron_file, b'/etc/cron.d/testcron')

    def test_write_execute_with_user(self):
        self.cron.user = 'testuser'
        with patch('platform.system', return_value='Linux'):
            with patch('pwd.getpwuid', return_value=['otheruser']):
                result = self.cron._write_execute('/path/to/cronfile')
                self.assertEqual(result, '/usr/bin/crontab -u testuser /path/to/cronfile')

    def test_write_execute_without_user(self):
        self.cron.user = None
        result = self.cron._write_execute('/path/to/cronfile')
        self.assertEqual(result, '/usr/bin/crontab  /path/to/cronfile')

    def test_write_execute_sunos(self):
        self.cron.user = 'testuser'
        with patch('platform.system', return_value='SunOS'):
            result = self.cron._write_execute('/path/to/cronfile')
            self.assertEqual(result, "chown testuser /path/to/cronfile ; su 'testuser' -c '/usr/bin/crontab /path/to/cronfile'")

    def test_write_execute_hpux(self):
        self.cron.user = 'testuser'
        with patch('platform.system', return_value='HP-UX'):
            result = self.cron._write_execute('/path/to/cronfile')
            self.assertEqual(result, "chown testuser /path/to/cronfile ; su 'testuser' -c '/usr/bin/crontab /path/to/cronfile'")

    def test_write_execute_aix(self):
        self.cron.user = 'testuser'
        with patch('platform.system', return_value='AIX'):
            result = self.cron._write_execute('/path/to/cronfile')
            self.assertEqual(result, "chown testuser /path/to/cronfile ; su 'testuser' -c '/usr/bin/crontab /path/to/cronfile'")

if __name__ == '__main__':
    unittest.main()