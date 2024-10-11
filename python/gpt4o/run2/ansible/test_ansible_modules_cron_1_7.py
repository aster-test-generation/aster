import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.crontab = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.crontab.module, self.module)
        self.assertEqual(self.crontab.user, None)
        self.assertEqual(self.crontab.root, os.getuid() == 0)
        self.assertEqual(self.crontab.lines, None)
        self.assertEqual(self.crontab.ansible, '')
        self.assertEqual(self.crontab.n_existing, '')
        self.assertEqual(self.crontab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.crontab.cron_file, None)

    def test_add_job(self):
        self.crontab.lines = []
        self.crontab.do_comment = MagicMock(return_value='# comment')
        self.crontab.add_job('test_job', 'echo "Hello World"')
        self.assertIn('# comment', self.crontab.lines)
        self.assertIn('echo "Hello World"', self.crontab.lines)

    def test_read(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data='line1\nline2\n')):
            self.crontab.read()
            self.assertEqual(self.crontab.lines, ['line1', 'line2'])

    def test_do_comment(self):
        result = self.crontab.do_comment('test_comment')
        self.assertEqual(result, '#Ansible: test_comment')

    def test_str_method(self):
        result = self.crontab.__str__()
        self.assertEqual(result, 'CronTab(user=None, cron_file=None)')

    def test_repr_method(self):
        result = self.crontab.__repr__()
        self.assertEqual(result, 'CronTab(user=None, cron_file=None)')

if __name__ == '__main__':
    unittest.main()