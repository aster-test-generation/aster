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

    def test_write_execute(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        path = '/path/to/file'
        result = cron_tab._write_execute(path)
        self.assertEqual(result, 'crontab /path/to/file')

    def test_write_execute_with_user(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module, user='user')
        path = '/path/to/file'
        result = cron_tab._write_execute(path)
        self.assertEqual(result, 'chown user /path/to/file ; su \'user\' -c \'crontab /path/to/file\'')

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
        self.assertTrue(cron_tab1 == cron_tab2)

if __name__ == '__main__':
    unittest.main()