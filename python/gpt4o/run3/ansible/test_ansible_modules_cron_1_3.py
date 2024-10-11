import unittest
from unittest.mock import MagicMock, patch, mock_open
from ansible.modules.cron import CronTab, CronTabError


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron = CronTab(self.module)

    def test_init_with_cron_file(self):
        with patch('os.path.isabs', return_value=True):
            cron = CronTab(self.module, cron_file='/etc/cron.d/test')
            self.assertEqual(cron.cron_file, '/etc/cron.d/test')
            self.assertEqual(cron.b_cron_file, b'/etc/cron.d/test')

    def test_init_without_cron_file(self):
        cron = CronTab(self.module)
        self.assertIsNone(cron.cron_file)

    def test_read_with_cron_file(self):
        with patch('builtins.open', mock_open(read_data=b'line1\nline2\n')):
            self.cron.cron_file = '/etc/cron.d/test'
            self.cron.b_cron_file = b'/etc/cron.d/test'
            self.cron.read()
            self.assertEqual(self.cron.lines, ['line1', 'line2'])

    def test_read_with_cron_file_ioerror(self):
        with patch('builtins.open', side_effect=IOError):
            self.cron.cron_file = '/etc/cron.d/test'
            self.cron.b_cron_file = b'/etc/cron.d/test'
            self.cron.read()
            self.assertEqual(self.cron.lines, [])

    def test_read_with_cron_file_exception(self):
        with patch('builtins.open', side_effect=Exception):
            self.cron.cron_file = '/etc/cron.d/test'
            self.cron.b_cron_file = b'/etc/cron.d/test'
            with self.assertRaises(CronTabError):
                self.cron.read()

    def test_read_without_cron_file(self):
        self.module.run_command.return_value = (0, 'line1\nline2\n', '')
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2'])

    def test_read_without_cron_file_error(self):
        self.module.run_command.return_value = (2, '', 'error')
        with self.assertRaises(CronTabError):
            self.cron.read()

    def test_read_without_cron_file_partial_error(self):
        self.module.run_command.return_value = (1, 'line1\nline2\n', '')
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2'])

    def test_read_without_cron_file_strip_comments(self):
        self.module.run_command.return_value = (0, '# comment\nline1\nline2\n', '')
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2'])

    def test_read_without_cron_file_strip_blank_lines(self):
        self.module.run_command.return_value = (0, '\nline1\nline2\n', '')
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2'])

    def test_read_without_cron_file_strip_invalid_lines(self):
        self.module.run_command.return_value = (0, 'invalid\nline1\nline2\n', '')
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2'])

    def test_read_without_cron_file_strip_invalid_lines_with_count(self):
        self.module.run_command.return_value = (0, 'invalid\ninvalid\ninvalid\nline1\nline2\n', '')
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2'])

    def test_read_without_cron_file_strip_invalid_lines_with_count_limit(self):
        self.module.run_command.return_value = (0, 'invalid\ninvalid\ninvalid\ninvalid\nline1\nline2\n', '')
        self.cron.read()
        self.assertEqual(self.cron.lines, ['line1', 'line2'])

if __name__ == '__main__':
    unittest.main()