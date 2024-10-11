import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab
import os


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron.module, self.module)
        self.assertEqual(self.cron.user, None)
        self.assertEqual(self.cron.root, os.getuid() == 0)
        self.assertEqual(self.cron.lines, None)
        self.assertEqual(self.cron.ansible, '')
        self.assertEqual(self.cron.n_existing, '')
        self.assertEqual(self.cron.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron.cron_file, None)

    def test_init_with_cron_file(self):
        cron = CronTab(self.module, cron_file='/etc/cron.d/test')
        self.assertEqual(cron.cron_file, '/etc/cron.d/test')
        self.assertEqual(cron.b_cron_file, b'/etc/cron.d/test')

    def test_do_comment(self):
        result = self.cron.do_comment('test')
        self.assertEqual(result, 'test')

    @patch('os.path.isabs')
    @patch('os.path.join')
    def test_init_with_relative_cron_file(self, mock_join, mock_isabs):
        mock_isabs.return_value = False
        mock_join.side_effect = lambda *args: '/'.join(args)
        cron = CronTab(self.module, cron_file='test')
        self.assertEqual(cron.cron_file, '/etc/cron.d/test')
        self.assertEqual(cron.b_cron_file, b'/etc/cron.d/test')

    @patch('os.path.isabs')
    @patch('os.path.join')
    def test_init_with_absolute_cron_file(self, mock_join, mock_isabs):
        mock_isabs.return_value = True
        cron = CronTab(self.module, cron_file='/absolute/path/test')
        self.assertEqual(cron.cron_file, '/absolute/path/test')
        self.assertEqual(cron.b_cron_file, b'/absolute/path/test')

if __name__ == '__main__':
    unittest.main()