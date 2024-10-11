import os
import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


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

    def test_update_env(self):
        self.cron.lines = ['FOO=bar', 'BAZ=qux']
        def addenvfunction(newlines, decl):
            newlines.append(decl)
        self.cron._update_env('FOO', 'FOO=newbar', addenvfunction)
        self.assertEqual(self.cron.lines, ['FOO=newbar', 'BAZ=qux'])

    def test_update_env_no_match(self):
        self.cron.lines = ['FOO=bar', 'BAZ=qux']
        def addenvfunction(newlines, decl):
            newlines.append(decl)
        self.cron._update_env('NOT_EXIST', 'NOT_EXIST=newvalue', addenvfunction)
        self.assertEqual(self.cron.lines, ['FOO=bar', 'BAZ=qux'])

    @patch('os.getuid', return_value=0)
    def test_root_user(self, mock_getuid):
        cron = CronTab(self.module)
        self.assertTrue(cron.root)

    @patch('os.getuid', return_value=1000)
    def test_non_root_user(self, mock_getuid):
        cron = CronTab(self.module)
        self.assertFalse(cron.root)

if __name__ == '__main__':
    unittest.main()