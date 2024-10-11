import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_do_comment(self):
        cron_tab = CronTab(None)
        comment = cron_tab.do_comment('test_job')
        self.assertEqual(comment, '%s test_job' % cron_tab.ansible)

if __name__ == '__main__':
    unittest.main()