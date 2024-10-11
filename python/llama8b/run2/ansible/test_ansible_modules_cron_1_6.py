import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(cron_tab.module, module)
        self.assertEqual(cron_tab.user, None)
        self.assertEqual(cron_tab.root, os.getuid() == 0)
        self.assertEqual(cron_tab.lines, None)
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_do_comment(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = cron_tab.do_comment('test')
        self.assertEqual(result, '%s%s' % (cron_tab.ansible, 'test'))

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, None)

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, 'CronTab')

    def test_repr_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, 'CronTab(module=<ansible.module_utils.basic.AnsibleModule object at 0x...>)')

    def test_eq_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertEqual(cron_tab1, cron_tab2)

    def test_ne_method(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = object()
        self.assertNotEqual(cron_tab1, cron_tab2)

if __name__ == '__main__':
    unittest.main()