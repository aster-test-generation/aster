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
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_add_env(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        decl = 'VAR=VALUE'
        insert_after = 'insert_after'
        insert_before = 'insert_before'
        cron_tab.add_env(decl, insert_after, insert_before)
        self.assertIn(decl, cron_tab.lines)

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_find_env(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        decl = 'VAR=VALUE'
        cron_tab.lines = [decl]
        result = cron_tab.find_env('VAR')
        self.assertEqual(result, [0])

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, 'CronTab')

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, 'CronTab(module=AnsibleModule())')

    def test_eq(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertEqual(cron_tab1, cron_tab2)

if __name__ == '__main__':
    unittest.main()