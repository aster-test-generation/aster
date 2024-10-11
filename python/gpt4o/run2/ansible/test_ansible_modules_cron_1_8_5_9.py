import unittest
from unittest.mock import MagicMock, patch
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock()
        self.module.get_bin_path.return_value = '/usr/bin/crontab'
        self.cron = CronTab(self.module, user='testuser', cron_file='/etc/cron.d/testcron')

    def test_init(self):
        self.assertEqual(self.cron.user, 'testuser')
        self.assertTrue(self.cron.root)
        self.assertIsNone(self.cron.lines)
        self.assertEqual(self.cron.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.cron.cron_file, '/etc/cron.d/testcron')
        self.assertEqual(self.cron.b_cron_file, b'/etc/cron.d/testcron')

    def test_get_cron_job_disabled(self):
        result = self.cron.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', None, True)
        self.assertEqual(result, '#0 5 * * * testuser ls -alh > /dev/null')

    def test_get_cron_job_special(self):
        result = self.cron.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', 'reboot', False)
        self.assertEqual(result, '@reboot testuser ls -alh > /dev/null')

    def test_get_cron_job_regular(self):
        result = self.cron.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', None, False)
        self.assertEqual(result, '0 5 * * * testuser ls -alh > /dev/null')

    def test_get_cron_job_no_user(self):
        self.cron.user = None
        result = self.cron.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', None, False)
        self.assertEqual(result, '0 5 * * * ls -alh > /dev/null')

    def test_get_cron_job_special_no_user(self):
        self.cron.user = None
        result = self.cron.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', 'reboot', False)
        self.assertEqual(result, '@reboot ls -alh > /dev/null')

    def test_get_cron_job_disabled_no_user(self):
        self.cron.user = None
        result = self.cron.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', None, True)
        self.assertEqual(result, '#0 5 * * * ls -alh > /dev/null')

if __name__ == '__main__':
    unittest.main()