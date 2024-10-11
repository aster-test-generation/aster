import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = None
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

    def test_do_add_job(self):
        lines = []
        comment = '# This is a test comment'
        job = '0 5,2 * * ls -alh > /dev/null'
        cron_tab = CronTab(None)
        cron_tab.do_add_job(lines, comment, job)
        self.assertEqual(lines, ['# This is a test comment', '0 5,2 * * ls -alh > /dev/null'])

if __name__ == '__main__':
    unittest.main()