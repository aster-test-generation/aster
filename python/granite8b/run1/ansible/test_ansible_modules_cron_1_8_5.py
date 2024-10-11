import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_get_cron_job(self):
        cron_tab = CronTab(None)
        job = cron_tab.get_cron_job(minute='*', hour='*', day='*', month='*', weekday='*', job='echo "Hello, World!"', special=None, disabled=False)
        self.assertEqual(job, '* * * * echo "Hello, World!"')
        job = cron_tab.get_cron_job(minute='0', hour='5,2', day='*', month='*', weekday='*', job='ls -alh > /dev/null', special=None, disabled=False)
        self.assertEqual(job, '0 5,2 * * ls -alh > /dev/null')
        job = cron_tab.get_cron_job(minute='0', hour='5,2', day='*', month='*', weekday='*', job='ls -alh > /dev/null', special='@reboot', disabled=False)
        self.assertEqual(job, '@reboot 0 5,2 * * ls -alh > /dev/null')
        job = cron_tab.get_cron_job(minute='0', hour='5,2', day='*', month='*', weekday='*', job='ls -alh > /dev/null', special='@reboot', disabled=True)
        self.assertEqual(job, '#@reboot 0 5,2 * * ls -alh > /dev/null')

if __name__ == '__main__':
    unittest.main()