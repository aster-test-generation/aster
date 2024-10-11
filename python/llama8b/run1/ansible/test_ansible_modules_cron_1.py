import unittest
from unittest.mock import patch
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes, to_native
from ansible.module_utils.six.moves import shlex_quote
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_init(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        self.assertEqual(cron_tab.module, mock_module)
        self.assertEqual(cron_tab.user, 'test_user')
        self.assertEqual(cron_tab.cron_file, 'test_file')

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_read(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_add_job(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        cron_tab.lines = []
        cron_tab.add_job('test_job', 'ls -alh > /dev/null')
        self.assertEqual(cron_tab.lines, [b'# test_job', b'ls -alh > /dev/null'])

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_do_comment(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        self.assertEqual(cron_tab.do_comment('test_comment'), b'# test_comment')

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_get_bin_path(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        self.assertEqual(cron_tab.module.get_bin_path('crontab', required=True), 'crontab')

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_to_bytes(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        self.assertEqual(cron_tab.to_bytes('test_string', errors='surrogate_or_strict'), b'test_string')

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_to_native(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        self.assertEqual(cron_tab.to_native('test_string'), 'test_string')

    @patch('ansible.module_utils.basic.AnsibleModule')
    def test_shlex_quote(self, mock_module):
        cron_tab = CronTab(mock_module, user='test_user', cron_file='test_file')
        self.assertEqual(cron_tab.shlex_quote('test_string'), "'test_string'")

    def test_str(self):
        cron_tab = CronTab(None, user='test_user', cron_file='test_file')
        self.assertEqual(str(cron_tab), 'CronTab')

    def test_repr(self):
        cron_tab = CronTab(None, user='test_user', cron_file='test_file')
        self.assertEqual(repr(cron_tab), 'CronTab(None, user=\'test_user\', cron_file=\'test_file\')')

if __name__ == '__main__':
    unittest.main()