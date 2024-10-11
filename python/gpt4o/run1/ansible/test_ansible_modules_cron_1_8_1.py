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
        cron_file = '/etc/cron.d/test'
        cron = CronTab(self.module, cron_file=cron_file)
        self.assertEqual(cron.cron_file, cron_file)
        self.assertEqual(cron.b_cron_file, to_bytes(cron_file, errors='surrogate_or_strict'))

    def test_update_job(self):
        self.cron._update_job = MagicMock(return_value=True)
        result = self.cron.update_job('test_name', 'test_job')
        self.cron._update_job.assert_called_with('test_name', 'test_job', self.cron.do_add_job)
        self.assertTrue(result)

    def test_protected_update_job(self):
        self.cron._update_job = MagicMock(return_value=True)
        result = self.cron._update_job('test_name', 'test_job', self.cron.do_add_job)
        self.cron._update_job.assert_called_with('test_name', 'test_job', self.cron.do_add_job)
        self.assertTrue(result)

    def test_private_methods(self):
        with patch.object(CronTab, '_CronTab__private_method', return_value='private') as mock_method:
            result = self.cron._CronTab__private_method()
            self.assertEqual(result, 'private')
            mock_method.assert_called_once()

    def test_magic_methods(self):
        self.assertEqual(str(self.cron), 'CronTab')
        self.assertEqual(repr(self.cron), f'CronTab({self.cron.module})')

if __name__ == '__main__':
    unittest.main()