import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)
        self.assertIsNone(cron_tab.user)
        self.assertTrue(cron_tab.root)
        self.assertIsNone(cron_tab.lines)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_do_remove_env(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        lines = ['line1', 'line2']
        decl = 'decl'
        result = cron_tab._do_remove_env(lines, decl)
        self.assertIsNone(result)

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, 'CronTab')

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, 'CronTab(module=<ansible.module_utils.basic.AnsibleModule object at 0x...>)')

    def test_eq(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertTrue(cron_tab1 == cron_tab2)

    def test_ne(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = object()
        self.assertFalse(cron_tab1 != cron_tab2)

if __name__ == '__main__':
    unittest.main()