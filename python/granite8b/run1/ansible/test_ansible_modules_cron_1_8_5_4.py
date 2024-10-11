import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_remove_env(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# my_env="my_value"', 'my_command']
        cron_tab.remove_env('my_env')
        self.assertEqual(cron_tab.lines, ['my_command'])

if __name__ == '__main__':
    unittest.main()