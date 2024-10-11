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
        self.assertIsNone(self.cron_tab.user)
        self.assertTrue(self.cron_tab.root)
        self.assertIsNone(self.cron_tab.lines)
        self.assertEqual(self.cron_tab.cron_cmd, '/usr/bin/crontab')
        self.assertIsNone(self.cron_tab.cron_file)

    def test_init_with_user(self):
        cron_tab = CronTab(self.module, user='testuser')
        self.assertEqual(cron_tab.user, 'testuser')

    def test_init_with_cron_file(self):
        with patch('os.path.isabs', return_value=True):
            cron_tab = CronTab(self.module, cron_file='/etc/cron.d/testfile')
            self.assertEqual(cron_tab.cron_file, '/etc/cron.d/testfile')

    def test_find_env(self):
        self.cron_tab.lines = ['PATH=/usr/bin', 'HOME=/home/user']
        result = self.cron_tab.find_env('PATH')
        self.assertEqual(result, [0, 'PATH=/usr/bin'])

    def test_find_env_not_found(self):
        self.cron_tab.lines = ['PATH=/usr/bin', 'HOME=/home/user']
        result = self.cron_tab.find_env('SHELL')
        self.assertEqual(result, [])

    def test_read(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data='PATH=/usr/bin\nHOME=/home/user\n')):
            self.cron_tab.read()
            self.assertEqual(self.cron_tab.lines, ['PATH=/usr/bin', 'HOME=/home/user'])

    def test_read_no_file(self):
        self.cron_tab.cron_file = None
        self.cron_tab.read()
        self.assertIsNone(self.cron_tab.lines)

if __name__ == '__main__':
    unittest.main()