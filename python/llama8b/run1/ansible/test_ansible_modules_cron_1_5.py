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

    def test_write(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.write(backup_file='backup_file')
        self.assertTrue(os.path.exists('backup_file'))
        os.remove('backup_file')

    def test_render(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertRaises(NotImplementedError, cron_tab.render)

    def test__write_execute(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertRaises(NotImplementedError, cron_tab._write_execute, 'path')

    def test_set_default_selinux_context(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertRaises(NotImplementedError, cron_tab.module.set_default_selinux_context, 'path', False)

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertRaises(NotImplementedError, cron_tab.__str__)

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertRaises(NotImplementedError, cron_tab.__repr__)

    def test_eq(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertTrue(cron_tab1 == cron_tab2)

if __name__ == '__main__':
    unittest.main()