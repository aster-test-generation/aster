import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


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

    def test_remove_job(self):
        self.cron._update_job = MagicMock(return_value=True)
        result = self.cron.remove_job('test_job')
        self.cron._update_job.assert_called_with('test_job', '', self.cron.do_remove_job)
        self.assertTrue(result)

    def test_update_job(self):
        self.cron._update_job = MagicMock(return_value=True)
        result = self.cron._update_job('test_job', 'new_job', self.cron.do_remove_job)
        self.cron._update_job.assert_called_with('test_job', 'new_job', self.cron.do_remove_job)
        self.assertTrue(result)

    def test_read(self):
        with patch('builtins.open', unittest.mock.mock_open(read_data='test_data')) as mock_file:
            self.cron.read()
            mock_file.assert_called_with(self.cron.cron_file, 'r')
            self.assertEqual(self.cron.lines, 'test_data')

    def test_str_method(self):
        result = self.cron.__str__()
        self.assertEqual(result, f"CronTab(user={self.cron.user}, cron_file={self.cron.cron_file})")

    def test_repr_method(self):
        result = self.cron.__repr__()
        self.assertEqual(result, f"<CronTab user={self.cron.user} cron_file={self.cron.cron_file}>")

if __name__ == '__main__':
    unittest.main()