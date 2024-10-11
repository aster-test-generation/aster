import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_is_empty(self):
        cron_tab = CronTab(None)
        cron_tab.lines = []
        self.assertTrue(cron_tab.is_empty())
        cron_tab.lines = ['# Some comment', '']
        self.assertFalse(cron_tab.is_empty())

if __name__ == '__main__':
    unittest.main()