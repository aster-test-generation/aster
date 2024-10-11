import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab, CronTabError


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron = CronTab(self.module)

    def test_init(self):
        self.assertEqual(self.cron.module, self.module)
        self.assertEqual(self.cron.user, None)
        self.assertEqual(self.cron.root, os.getuid() == 0)
        self.assertEqual(self.cron.lines, None)
        self.assertEqual(self.cron.ansible, '')
        self.assertEqual(self.cron.n_existing, '')
        self.assertEqual(self.cron.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron.cron_file, None)

    def test_init_with_cron_file(self):
        cron = CronTab(self.module, cron_file='/etc/cron.d/test')
        self.assertEqual(cron.cron_file, '/etc/cron.d/test')
        self.assertEqual(cron.b_cron_file, to_bytes('/etc/cron.d/test', errors='surrogate_or_strict'))

    def test_remove_job_file_success(self):
        self.cron.cron_file = '/tmp/test_cron'
        with patch('os.unlink', return_value=True) as mock_unlink:
            result = self.cron.remove_job_file()
            mock_unlink.assert_called_once_with('/tmp/test_cron')
            self.assertTrue(result)

    def test_remove_job_file_oserror(self):
        self.cron.cron_file = '/tmp/test_cron'
        with patch('os.unlink', side_effect=OSError) as mock_unlink:
            result = self.cron.remove_job_file()
            mock_unlink.assert_called_once_with('/tmp/test_cron')
            self.assertFalse(result)

    def test_remove_job_file_exception(self):
        self.cron.cron_file = '/tmp/test_cron'
        with patch('os.unlink', side_effect=Exception) as mock_unlink:
            with self.assertRaises(CronTabError):
                self.cron.remove_job_file()
            mock_unlink.assert_called_once_with('/tmp/test_cron')

if __name__ == '__main__':
    unittest.main()