import unittest
from unittest.mock import MagicMock
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = MagicMock()
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, user)
        self.assertEqual(cron_tab.root, False)
        self.assertEqual(cron_tab.lines, [])
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, '/path/to/crontab')
        self.assertEqual(cron_tab.cron_file, '/etc/cron.d/test_file')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/cron.d/test_file')

    def test_read(self):
        module = MagicMock()
        user = 'test_user'
        cron_file = 'test_file'
        cron_tab = CronTab(module, user, cron_file)
        cron_tab.lines = []
        cron_tab.n_existing = 'existing_content'
        cron_tab.read()
        self.assertEqual(cron_tab.lines, ['existing_content'])

if __name__ == '__main__':
    unittest.main()