import unittest
from ansible.modules.cron import CronTab
from ansible.module_utils.basic import AnsibleModule


class TestCronTab(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)
        self.assertIsNone(cron_tab.user)
        self.assertTrue(cron_tab.root)
        self.assertIsNone(cron_tab.lines)
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
        addenvfunction = lambda newlines, decl: newlines.append(decl)
        newlines = cron_tab._update_env(name, decl, addenvfunction)
        self.assertIn(decl, newlines)

    def test_str(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(str(cron_tab), 'CronTab')

    def test_repr(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(repr(cron_tab), 'CronTab(module=<ansible.module_utils.basic.AnsibleModule object at 0x...>)')

    def test_eq(self):
        module = AnsibleModule()
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertEqual(cron_tab1, cron_tab2)

    def test_ne(self):
        module = AnsibleModule()
        cron_tab1 = CronTab(module)
        cron_tab2 = object()
        self.assertNotEqual(cron_tab1, cron_tab2)

if __name__ == '__main__':
    unittest.main()