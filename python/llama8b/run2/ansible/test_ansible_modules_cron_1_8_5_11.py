import unittest
from ansible.modules.cron import CronTab


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
        module = Ansiline
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_get_envnames(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        envnames = cron_tab.get_envnames()
        self.assertEqual(envnames, [])

    def test_str_method(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, "CronTab")

    def test_repr_method(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, "CronTab")

    def test_eq_method(self):
        module = AnsibleModule()
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertTrue(cron_tab1 == cron_tab2)

if __name__ == '__main__':
    unittest.main()