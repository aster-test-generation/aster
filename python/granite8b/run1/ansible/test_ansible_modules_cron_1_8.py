import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_get_jobnames(self):
        cron_tab = CronTab(None)
        cron_tab.lines = [
            '#ansible: job1',
            '#ansible: job2',
            'job3'
        ]
        jobnames = cron_tab.get_jobnames()
        self.assertEqual(jobnames, ['job1', 'job2'])

    def test_get_jobnames_empty(self):
        cron_tab = CronTab(None)
        cron_tab.lines = [
            'job1',
            'job2',
            'job3'
        ]
        jobnames = cron_tab.get_jobnames()
        self.assertEqual(jobnames, [])

    def test_get_jobnames_no_ansible(self):
        cron_tab = CronTab(None)
        cron_tab.lines = [
            'job1',
            'job2',
            'job3'
        ]
        jobnames = cron_tab.get_jobnames()
        self.assertEqual(jobnames, [])

if __name__ == '__main__':
    unittest.main()