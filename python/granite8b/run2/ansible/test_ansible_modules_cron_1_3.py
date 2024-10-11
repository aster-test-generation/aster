import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_read_user_execute(self):
        cron_tab = CronTab(None)
        cron_tab.user = 'test_user'
        result = cron_tab._read_user_execute()
        expected = 'crontab -u test_user -l'
        self.assertEqual(result, expected)

    def test_read_root_execute(self):
        cron_tab = CronTab(None)
        cron_tab.root = True
        result = cron_tab._read_user_execute()
        expected = 'crontab -l'
        self.assertEqual(result, expected)

    def test_write_user_execute(self):
        cron_tab = CronTab(None)
        cron_tab.user = 'test_user'
        cron_tab.lines = ['line1', 'line2']
        result = cron_tab._write_user_execute()
        expected = 'crontab -u test_user -'
        self.assertEqual(result, expected)

    def test_write_root_execute(self):
        cron_tab = CronTab(None)
        cron_tab.root = True
        cron_tab.lines = ['line1', 'line2']
        result = cron_tab._write_user_execute()
        expected = 'crontab -'
        self.assertEqual(result, expected)

    def test_write_to_file(self):
        cron_tab = CronTab(None)
        cron_tab.lines = ['line1', 'line2']
        cron_tab._write_to_file()
        expected = 'line1\nline2\n'
        with open('/etc/cron.d/ansible_test', 'r') as f:
            result = f.read()
        self.assertEqual(result, expected)

    def test_write_to_user_file(self):
        cron_tab = CronTab(None)
        cron_tab.user = 'test_user'
        cron_tab.lines = ['line1', 'line2']
        cron_tab._write_to_file()
        expected = 'line1\nline2\n'
        with open('/etc/cron.d/ansible_test', 'r') as f:
            result = f.read()
        self.assertEqual(result, expected)

if __name__ == '__main__':
    unittest.main()