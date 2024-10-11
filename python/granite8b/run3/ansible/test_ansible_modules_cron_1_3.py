import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_cron_tab_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.lines, [])
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.ansible, 'ansible')

    def test_cron_tab_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])
        self.assertEqual(cron_tab.n_existing, '')

    def test_cron_tab_read_user(self):
        cron_tab = CronTab(None, user='testuser')
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])
        self.assertEqual(cron_tab.n_existing, '')

if __name__ == '__main__':
    unittest.main()