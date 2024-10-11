from ansible.modules.cron import to_bytes
import os
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
        self.assertEqual(self.crontab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.crontab.cron_file, None)

    def test_init_with_cron_file(self):
        crontab = CronTab(self.module, cron_file='/etc/cron.d/test')
        self.assertEqual(crontab.cron_file, '/etc/cron.d/test')
        self.assertEqual(crontab.b_cron_file, to_bytes('/etc/cron.d/test', errors='surrogate_or_strict'))

    def test_update_job(self):
        self.crontab.lines = ['#Ansible: test', '0 5 * * * /bin/true']
        addlinesfunction = MagicMock()
        result = self.crontab._update_job('test', '0 5 * * * /bin/true', addlinesfunction)
        self.assertFalse(result)
        addlinesfunction.assert_called_once()

    def test_update_job_no_existing(self):
        self.crontab.lines = []
        addlinesfunction = MagicMock()
        result = self.crontab._update_job('test', '0 5 * * * /bin/true', addlinesfunction)
        self.assertTrue(result)
        addlinesfunction.assert_not_called()

    def test_update_job_with_comment(self):
        self.crontab.lines = ['#Ansible: test', '0 5 * * * /bin/true']
        addlinesfunction = MagicMock()
        result = self.crontab._update_job('test', '0 5 * * * /bin/true', addlinesfunction)
        self.assertFalse(result)
        addlinesfunction.assert_called_once()

    def test_update_job_with_multiple_lines(self):
        self.crontab.lines = ['#Ansible: test', '0 5 * * * /bin/true', '#Ansible: another', '0 6 * * * /bin/false']
        addlinesfunction = MagicMock()
        result = self.crontab._update_job('test', '0 5 * * * /bin/true', addlinesfunction)
        self.assertFalse(result)
        addlinesfunction.assert_called_once()

if __name__ == '__main__':
    unittest.main()