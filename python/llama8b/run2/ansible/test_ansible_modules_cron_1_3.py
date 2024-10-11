import unittest
from ansible.modules.cron import CronTab
from ansible.module_utils.basic import AnsibleModule
from ansible.module_utils.common.text.converters import to_bytes, to_native
from ansible.module_utils.six.moves import shlex_quote
import os
import platform
import pwd
import re
import sys
import tempfile


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)
        self.assertIsNone(cron_tab.user)
        self.assertTrue(cron_tab.root)
        self.assertIsNone(cron_tab.lines)
        self.assertIsNone(cron_tab.ansible)
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_read_user_execute(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = cron_tab._read_user_execute()
        self.assertIsInstance(result, tuple)

    def test_split_lines(self):
        cron_tab = CronTab(AnsibleModule())
        lines = ['line1', 'line2', 'line3']
        result = cron_tab._split_lines(lines)
        self.assertEqual(result, ['line1', 'line2', 'line3'])

    def test_split_lines_empty(self):
        cron_tab = CronTab(AnsibleModule())
        lines = []
        result = cron_tab._split_lines(lines)
        self.assertEqual(result, [])

    def test_split_lines_single_line(self):
        cron_tab = CronTab(AnsibleModule())
        lines = ['line1\r\n']
        result = cron_tab._split_lines(lines)
        self.assertEqual(result, ['line1'])

    def test_split_lines_multiple_lines(self):
        cron_tab = CronTab(AnsibleModule())
        lines = ['line1\r\n', 'line2\r\n', 'line3\r\n']
        result = cron_tab._split_lines(lines)
        self.assertEqual(result, ['line1', 'line2', 'line3'])

    def test_split_lines_multiple_lines_with_trailing_newline(self):
        cron_tab = CronTab(AnsibleModule())
        lines = ['line1\r\n', 'line2\r\n', 'line3\r\n\r\n']
        result = cron_tab._split_lines(lines)
        self.assertEqual(result, ['line1', 'line2', 'line3'])

    def test_split_lines_multiple_lines_with_trailing_carriage_return(self):
        cron_tab = CronTab(AnsibleModule())
        lines = ['line1\r\n', 'line2\r\n', 'line3\r']
        result = cron_tab._split_lines(lines)
        self.assertEqual(result, ['line1', 'line2', 'line3'])

    def test_split_lines_multiple_lines_with_trailing_carriage_return_and_newline(self):
        cron_tab = CronTab(AnsibleModule())
        lines = ['line1\r\n', 'line2\r\n', 'line3\r\n']
        result = cron_tab._split_lines(lines)
        self.assertEqual(result, ['line1', 'line2', 'line3'])

if __name__ == '__main__':
    unittest.main()