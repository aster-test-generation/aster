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
        self.assertIsNone(cron_tab.cron_file)
        self.assertIsNone(cron_tab.b_cron_file)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.lines = ['line1', 'line2']
        cron_tab.read()
        self.assertEqual(cron_tab.lines, ['line1', 'line2'])

    def test__read_user_execute(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        user = 'user'
        result = cron_tab._read_user_execute(user)
        self.assertEqual(result, 'su user -c \'crontab -l\'')

    def test__read_user_execute_with_platform_sunOS(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        user = 'user'
        platform.system = lambda: 'SunOS'
        result = cron_tab._read_user_execute(user)
        self.assertEqual(result, "su %s -c '%s -l'" % (shlex_quote(user), shlex_quote(cron_tab.cron_cmd)))

    def test__read_user_execute_with_platform_aix(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        user = 'user'
        platform.system = lambda: 'AIX'
        result = cron_tab._read_user_execute(user)
        self.assertEqual(result, '%s -l %s' % (shlex_quote(cron_tab.cron_cmd), shlex_quote(user)))

    def test__read_user_execute_with_platform_hpux(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        user = 'user'
        platform.system = lambda: 'HP-UX'
        result = cron_tab._read_user_execute(user)
        self.assertEqual(result, '%s %s %s' % (cron_tab.cron_cmd, '-l', shlex_quote(user)))

    def test__read_user_execute_with_user(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        user = 'user'
        result = cron_tab._read_user_execute(user)
        self.assertEqual(result, '%s -u %s -l' % (shlex_quote(cron_tab.cron_cmd), shlex_quote(user)))

    def test__read_user_execute_without_user(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = cron_tab._read_user_execute('')
        self.assertEqual(result, 'crontab -l')

if __name__ == '__main__':
    unittest.main()