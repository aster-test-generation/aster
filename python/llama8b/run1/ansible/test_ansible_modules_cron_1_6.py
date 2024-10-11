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

    def test_do_comment(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = cron_tab.do_comment('test')
        self.assertEqual(result, '%s%s' % (cron_tab.ansible, 'test'))

    def test__init__(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module, user='test', cron_file='test')
        self.assertEqual(cron_tab.user, 'test')
        self.assertEqual(cron_tab.cron_file, 'test')

    def test__str__(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, 'CronTab')

    def test__repr__(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, 'CronTab(module=AnsibleModule())')

if __name__ == '__main__':
    unittest.main()