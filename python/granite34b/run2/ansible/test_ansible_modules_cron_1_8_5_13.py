import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = None
        self.cron = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron.module, self.module)
        self.assertEqual(self.cron.user, None)
        self.assertEqual(self.cron.root, True)
        self.assertEqual(self.cron.lines, None)
        self.assertEqual(self.cron.ansible, '')
        self.assertEqual(self.cron.n_existing, '')
        self.assertEqual(self.cron.cron_cmd, '/path/to/crontab')
        self.assertEqual(self.cron.cron_file, '/etc/cron.d/my_cron_file')
        self.assertEqual(self.cron.b_cron_file, b'/etc/cron.d/my_cron_file')

    def test_read(self):
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2', 'line3'])

    def test_write(self):
        self.cron.write()
        self.assertEqual(self.cron.lines, ['line1', 'line2', 'line3'])

    def test_update_env(self):
        self.cron.lines = ['line1', 'line2', 'line3']
        self.cron._update_env('name', 'decl', lambda newlines, decl: newlines.append(decl))
        self.assertEqual(self.cron.lines, ['line1', 'line2', 'line3', 'decl'])

if __name__ == '__main__':
    unittest.main()