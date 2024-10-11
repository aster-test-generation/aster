import unittest
from unittest.mock import MagicMock, patch, mock_open
from ansible.modules.cron import CronTab
from ansible.errors import AnsibleError


class CronTabError(AnsibleError):
    pass

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

    @patch('builtins.open', new_callable=mock_open, read_data=b'line1\nline2\n')
    def test_read_with_cron_file(self, mock_file):
        self.crontab.cron_file = '/etc/cron.d/test'
        self.crontab.b_cron_file = b'/etc/cron.d/test'
        self.crontab.read()
        self.assertEqual(self.crontab.lines, [b'line1', b'line2'])
        self.assertEqual(self.crontab.n_existing, 'line1\nline2\n')

    @patch('builtins.open', new_callable=mock_open)
    def test_read_with_cron_file_ioerror(self, mock_file):
        mock_file.side_effect = IOError
        self.crontab.cron_file = '/etc/cron.d/test'
        self.crontab.b_cron_file = b'/etc/cron.d/test'
        self.crontab.read()
        self.assertEqual(self.crontab.lines, [])

    @patch('builtins.open', new_callable=mock_open)
    def test_read_with_cron_file_exception(self, mock_file):
        mock_file.side_effect = Exception
        self.crontab.cron_file = '/etc/cron.d/test'
        self.crontab.b_cron_file = b'/etc/cron.d/test'
        with self.assertRaises(CronTabError):
            self.crontab.read()

    @patch.object(CronTab, '_read_user_execute', return_value='crontab -l')
    def test_read_without_cron_file(self, mock_read_user_execute):
        self.module.run_command.return_value = (0, 'line1\nline2\n', '')
        self.crontab.read()
        self.assertEqual(self.crontab.lines, ['line1', 'line2'])
        self.assertEqual(self.crontab.n_existing, 'line1\nline2\n')

    @patch.object(CronTab, '_read_user_execute', return_value='crontab -l')
    def test_read_without_cron_file_error(self, mock_read_user_execute):
        self.module.run_command.return_value = (2, '', 'error')
        with self.assertRaises(CronTabError):
            self.crontab.read()

    def test__read_user_execute(self):
        self.crontab.user = 'testuser'
        result = self.crontab._read_user_execute()
        self.assertEqual(result, 'crontab -u testuser -l')

    def test__read_user_execute_no_user(self):
        self.crontab.user = None
        result = self.crontab._read_user_execute()
        self.assertEqual(result, 'crontab -l')

if __name__ == '__main__':
    unittest.main()