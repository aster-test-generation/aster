import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron_tab = CronTab(self.module, user='testuser', cron_file='/etc/cron.d/testfile')

    def test_init(self):
        self.assertEqual(self.cron_tab.module, self.module)
        self.assertEqual(self.cron_tab.user, 'testuser')
        self.assertTrue(self.cron_tab.root)
        self.assertIsNone(self.cron_tab.lines)
        self.assertEqual(self.cron_tab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron_tab.cron_file, '/etc/cron.d/testfile')
        self.assertEqual(self.cron_tab.b_cron_file, b'/etc/cron.d/testfile')

    def test_read_user_execute_sunos(self):
        with patch('platform.system', return_value='SunOS'):
            result = self.cron_tab._read_user_execute()
            self.assertEqual(result, "su 'testuser' -c '/usr/bin/crontab -l'")

    def test_read_user_execute_aix(self):
        with patch('platform.system', return_value='AIX'):
            result = self.cron_tab._read_user_execute()
            self.assertEqual(result, "/usr/bin/crontab -l 'testuser'")

    def test_read_user_execute_hpux(self):
        with patch('platform.system', return_value='HP-UX'):
            result = self.cron_tab._read_user_execute()
            self.assertEqual(result, '/usr/bin/crontab -l \'testuser\'')

    def test_read_user_execute_different_user(self):
        with patch('pwd.getpwuid', return_value=('differentuser',)):
            result = self.cron_tab._read_user_execute()
            self.assertEqual(result, "/usr/bin/crontab -u 'testuser' -l")

    def test_read_user_execute_same_user(self):
        with patch('pwd.getpwuid', return_value=('testuser',)):
            result = self.cron_tab._read_user_execute()
            self.assertEqual(result, "/usr/bin/crontab  -l")

if __name__ == '__main__':
    unittest.main()