import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)

    def test_is_empty(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertTrue(cron_tab.is_empty())

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, "CronTab")

    def test_repr_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, "CronTab(module=AnsibleModule())")

    def test_eq_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertTrue(cron_tab1 == cron_tab2)

    def test_ne_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = object()
        self.assertFalse(cron_tab1 != cron_tab2)

if __name__ == '__main__':
    unittest.main()