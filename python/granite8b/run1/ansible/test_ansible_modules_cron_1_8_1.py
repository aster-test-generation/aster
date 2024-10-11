import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, 'ansible')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.cron_file, None)
        self.assertEqual(cron_tab.b_cron_file, None)

    def test_update_job(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# This is a test', '0 5,2 * * ls -alh > /dev/null']
        cron_tab.n_existing = 2
        cron_tab.update_job('check dirs', 'ls -alh > /dev/null')
        self.assertEqual(len(cron_tab.lines), 3)
        self.assertEqual(cron_tab.lines[0], '# This is a test')
        self.assertEqual(cron_tab.lines[1], '0 5,2 * * ls -alh > /dev/null')
        self.assertEqual(cron_tab.lines[2], '0 5,2 * * check dirs')

if __name__ == '__main__':
    unittest.main()