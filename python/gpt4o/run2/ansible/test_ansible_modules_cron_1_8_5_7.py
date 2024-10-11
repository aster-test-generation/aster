import os
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

    def test_find_job_no_match(self):
        self.cron.lines = ['#Ansible: test', '0 5 * * * /bin/true']
        result = self.cron.find_job('nonexistent')
        self.assertEqual(result, [])

    def test_find_job_with_match(self):
        self.cron.lines = ['#Ansible: test', '0 5 * * * /bin/true']
        result = self.cron.find_job('test')
        self.assertEqual(result, ['test', '0 5 * * * /bin/true'])

    def test_find_job_with_job_param(self):
        self.cron.lines = ['#Ansible: test', '0 5 * * * /bin/true']
        result = self.cron.find_job('test', '0 5 * * * /bin/true')
        self.assertEqual(result, ['test', '0 5 * * * /bin/true'])

    def test_find_job_insert_comment(self):
        self.cron.lines = ['0 5 * * * /bin/true']
        result = self.cron.find_job('test', '0 5 * * * /bin/true')
        self.assertEqual(result, ['#Ansible: test', '0 5 * * * /bin/true', True])

    def test_find_job_update_comment(self):
        self.cron.lines = ['0 5 * * * /bin/true']
        self.cron.do_comment = MagicMock(return_value='#Ansible: test')
        result = self.cron.find_job('test', '0 5 * * * /bin/true')
        self.assertEqual(result, ['#Ansible: test', '0 5 * * * /bin/true', True])

    def test_do_comment(self):
        result = self.cron.do_comment('test')
        self.assertEqual(result, '#Ansible: test')

    def test_do_comment_none(self):
        result = self.cron.do_comment(None)
        self.assertEqual(result, '#Ansible: ')

if __name__ == '__main__':
    unittest.main()