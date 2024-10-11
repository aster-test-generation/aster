import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_do_remove_job(self):
        cron_tab = CronTab(None)
        lines = ['# some comment', '0 5,2 * * ls -alh > /dev/null']
        comment = 'check dirs'
        job = 'ls -alh > /dev/null'
        result = cron_tab.do_remove_job(lines, comment, job)
        self.assertEqual(result, ['# some comment'])

if __name__ == '__main__':
    unittest.main()