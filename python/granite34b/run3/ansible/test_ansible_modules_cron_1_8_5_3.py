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
        self.assertEqual(cron_tab.root, False)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_file')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/test_file')

    def test_do_add_env(self):
        lines = []
        decl = 'test_decl'
        cron_tab = CronTab(None, None, None)
        cron_tab.do_add_env(lines, decl)
        self.assertEqual(lines, [decl])

if __name__ == '__main__':
    unittest.main()