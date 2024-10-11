import unittest
from unittest.mock import MagicMock
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.cron = CronTab(self.module)

    def test_is_empty(self):
        self.cron.lines = []
        self.assertTrue(self.cron.is_empty())

        self.cron.lines = ['', '  ', '\t']
        self.assertTrue(self.cron.is_empty())

        self.cron.lines = ['# comment']
        self.assertTrue(self.cron.is_empty())

        self.cron.lines = ['* * * * * command']
        self.assertFalse(self.cron.is_empty())

if __name__ == '__main__':
    unittest.main()