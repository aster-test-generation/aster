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

    def test_remove_env(self):
        self.cron._update_env = MagicMock(return_value=True)
        result = self.cron.remove_env('TEST_ENV')
        self.cron._update_env.assert_called_with('TEST_ENV', '', self.cron.do_remove_env)
        self.assertTrue(result)

    def test_protected_update_env(self):
        self.cron.do_remove_env = MagicMock()
        result = self.cron._update_env('TEST_ENV', '', self.cron.do_remove_env)
        self.cron.do_remove_env.assert_called()
        self.assertIsNone(result)

    def test_private_read(self):
        with patch('ansible.modules.cron.CronTab.read', return_value=None) as mock_read:
            self.cron._CronTab__read()
            mock_read.assert_called()

if __name__ == '__main__':
    unittest.main()