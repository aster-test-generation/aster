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
        self.assertEqual(self.crontab.ansible, '')
        self.assertEqual(self.crontab.n_existing, '')
        self.assertEqual(self.crontab.cron_cmd, '/usr/bin/crontab')
        self.assertEqual(self.crontab.cron_file, None)

    def test_find_job_no_job(self):
        self.crontab.lines = ['#Ansible: test', '0 5 * * * /usr/bin/ls']
        result = self.crontab.find_job('test')
        self.assertEqual(result, ['test', '0 5 * * * /usr/bin/ls'])

    def test_find_job_with_job(self):
        self.crontab.lines = ['#Ansible: test', '0 5 * * * /usr/bin/ls']
        result = self.crontab.find_job('test', '0 5 * * * /usr/bin/ls')
        self.assertEqual(result, ['test', '0 5 * * * /usr/bin/ls', True])

    def test_find_job_no_match(self):
        self.crontab.lines = ['#Ansible: test', '0 5 * * * /usr/bin/ls']
        result = self.crontab.find_job('not_test')
        self.assertEqual(result, [])

    def test_find_job_insert_comment(self):
        self.crontab.lines = ['0 5 * * * /usr/bin/ls']
        self.crontab.do_comment = MagicMock(return_value='#Ansible: test')
        result = self.crontab.find_job('test', '0 5 * * * /usr/bin/ls')
        self.assertEqual(result, ['#Ansible: test', '0 5 * * * /usr/bin/ls', True])

    def test_find_job_update_comment(self):
        self.crontab.lines = ['0 5 * * * /usr/bin/ls']
        self.crontab.do_comment = MagicMock(return_value='#Ansible: test')
        self.crontab.lines.insert(0, '#Ansible: ')
        result = self.crontab.find_job('test', '0 5 * * * /usr/bin/ls')
        self.assertEqual(result, ['#Ansible: test', '0 5 * * * /usr/bin/ls', True])

    def test_private_methods(self):
        self.crontab._CronTab__private_method = MagicMock(return_value='private')
        result = self.crontab._CronTab__private_method()
        self.assertEqual(result, 'private')

    def test_protected_methods(self):
        self.crontab._protected_method = MagicMock(return_value='protected')
        result = self.crontab._protected_method()
        self.assertEqual(result, 'protected')

if __name__ == '__main__':
    unittest.main()