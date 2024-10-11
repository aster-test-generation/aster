import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_find_env(self):
        cron_tab = CronTab(None)
        cron_tab.lines = [
            'PATH=/usr/local/bin:/usr/bin:/bin',
            'export FOO=bar',
            'export BAR=baz'
        ]
        self.assertEqual(cron_tab.find_env('FOO'), [1, 'export FOO=bar'])
        self.assertEqual(cron_tab.find_env('BAR'), [2, 'export BAR=baz'])
        self.assertEqual(cron_tab.find_env('BAZ'), [])

if __name__ == '__main__':
    unittest.main()