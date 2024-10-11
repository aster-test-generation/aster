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
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_update_env(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        name = 'test_name'
        decl = 'test_decl'
        result = cron_tab.update_env(name, decl)
        self.assertEqual(result, cron_tab._update_env(name, decl, cron_tab.do_add_env))

    def test_do_add_env(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        name = 'test_name'
        decl = 'test_decl'
        result = cron_tab.do_add_env(name, decl)
        self.assertEqual(result, f'export {name}="{decl}"')

    def test__str__(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, 'CronTab')

    def test__repr__(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, 'CronTab(module=AnsibleModule())')

    def test__eq__(self):
        module = AnsibleModule()
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertEqual(cron_tab1, cron_tab2)

if __name__ == '__main__':
    unittest.main()