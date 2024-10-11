import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(None)
        self.assertEqual(cron_tab.root, True)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, 'ANsible')
        self.assertEqual(cron_tab.n_existing, 0)
        self.assertEqual(cron_tab.cron_cmd, 'crontab')
        self.assertEqual(cron_tab.cron_file, '/etc/crontab')
        self.assertEqual(cron_tab.b_cron_file, b'/etc/crontab')

    def test_read(self):
        cron_tab = CronTab(None)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.write_to_file()
        self.assertEqual(cron_tab.lines, [])

    def test_setenv(self):
        cron_tab = CronTab(None)
        cron_tab.setenv('TEST', '1')
        self.assertEqual(cron_tab.lines, ['TEST=1'])

    def test_remove_env(self):
        cron_tab = CronTab(None)
        cron_tab.remove_env('TEST')
        self.assertEqual(cron_tab.lines, [])

    def test_set_special_time(self):
        cron_tab = CronTab(None)
        cron_tab.set_special_time('@reboot', 'echo "hello world"')
        self.assertEqual(cron_tab.lines, ['@reboot echo "hello world"'])

    def test_remove_special_time(self):
        cron_tab = CronTab(None)
        cron_tab.remove_special_time('@reboot')
        self.assertEqual(cron_tab.lines, [])

    def test_set_cron_job(self):
        cron_tab = CronTab(None)
        cron_tab.set_cron_job(minute='1', hour='2', job='echo "hello world"')
        self.assertEqual(cron_tab.lines, ['1 2 * * echo "hello world"'])

    def test_remove_cron_job(self):
        cron_tab = CronTab(None)
        cron_tab.remove_cron_job(minute='1', hour='2', job='echo "hello world"')
        self.assertEqual(cron_tab.lines, [])

    def test_set_cron_job_with_comment(self):
        cron_tab = CronTab(None)
        cron_tab.set_cron_job(minute='1', hour='2', job='echo "hello world"', comment='Test job')
        self.assertEqual(cron_tab.lines, ['# Test job', '1 2 * * echo "hello world"'])

    def test_remove_cron_job_with_comment(self):
        cron_tab = CronTab(None)
        cron_tab.remove_cron_job(minute='1', hour='2', job='echo "hello world"', comment='Test job')
        self.assertEqual(cron_tab.lines, [])

if __name__ == '__main__':
    unittest.main()