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

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_is_empty(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.lines = ['']
        self.assertTrue(cron_tab.is_empty())

        cron_tab.lines = ['   ']
        self.assertTrue(cron_tab.is_empty())

        cron_tab.lines = ['   # comment']
        self.assertTrue(cron_tab.is_empty())

        cron_tab.lines = ['* * * * * ls -alh > /dev/null']
        self.assertFalse(cron_tab.is_empty())

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(str(cron_tab), 'CronTab')

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(repr(cron_tab), 'CronTab')

    def test_eq(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertTrue(cron_tab1 == cron_tab2)

        cron_tab3 = object()
        self.assertFalse(cron_tab1 == cron_tab3)

if __name__ == '__main__':
    unittest.main()