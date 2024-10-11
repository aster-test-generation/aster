import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.cron_file, None)
        self.assertEqual(cron_tab.b_cron_file, None)

    def test_update_env(self):
        cron_tab = CronTab(None)
        cron_tab.env = {}
        cron_tab.update_env('TEST', 'TEST_VALUE')
        self.assertEqual(cron_tab.env, {'TEST': 'TEST_VALUE'})

if __name__ == '__main__':
    unittest.main()