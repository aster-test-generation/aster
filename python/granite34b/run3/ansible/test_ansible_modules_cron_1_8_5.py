import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from unittest.mock import MagicMock
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, '/path/to/crontab')
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_file')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/test_file')

    def test_do_remove_env(self):
        lines = ['# test line', 'PATH=/usr/bin', ' export PATH', ' export FOO=bar', '']
        decl = 'PATH'
        cron_tab = CronTab(None, None, None)
        result = cron_tab.do_remove_env(lines, decl)
        expected = ['# test line', ' export FOO=bar', '']
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()