import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_add_env(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# comment', 'PATH=/usr/local/bin:$PATH']
        cron_tab.add_env('TEST=1')
        self.assertEqual(cron_tab.lines, ['# comment', 'PATH=/usr/local/bin:$PATH', 'TEST=1'])

    def test_add_env_with_insertafter(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# comment', 'PATH=/usr/local/bin:$PATH']
        cron_tab.add_env('TEST=1', insertafter='PATH')
        self.assertEqual(cron_tab.lines, ['# comment', 'PATH=/usr/local/bin:$PATH', 'TEST=1'])

    def test_add_env_with_insertbefore(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# comment', 'PATH=/usr/local/bin:$PATH']
        cron_tab.add_env('TEST=1', insertbefore='PATH')
        self.assertEqual(cron_tab.lines, ['# comment', 'TEST=1', 'PATH=/usr/local/bin:$PATH'])

    def test_find_env(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# comment', 'PATH=/usr/local/bin:$PATH', 'TEST=1']
        result = cron_tab.find_env('TEST')
        self.assertEqual(result, [2])

    def test_find_env_not_found(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['# comment', 'PATH=/usr/local/bin:$PATH', 'TEST=1']
        result = cron_tab.find_env('NOTFOUND')
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()