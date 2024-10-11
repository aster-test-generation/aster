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

    def test_do_remove_job(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        lines = ['line1', 'line2']
        comment = 'comment'
        job = 'job'
        result = cron_tab.do_remove_job(lines, comment, job)
        self.assertIsNone(result)

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, 'CronTab')

    def test_repr_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, 'CronTab(module=AnsibleModule())')

    def test_eq_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertTrue(cron_tab1 == cron_tab2)

if __name__ == '__main__':
    unittest.main()