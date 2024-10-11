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

    def test_get_cron_job(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        job = cron_tab.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', False, False)
        self.assertEqual(job, '0 5 * * * ls -alh > /dev/null')

    def test_get_cron_job_disabled(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        job = cron_tab.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', False, True)
        self.assertEqual(job, '# 0 5 * * * ls -alh > /dev/null')

    def test_get_cron_job_special(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        job = cron_tab.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', True, False)
        self.assertEqual(job, '@reboot ls -alh > /dev/null')

    def test_get_cron_job_cron_file(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module, cron_file='my_cron_file')
        job = cron_tab.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', False, False)
        self.assertEqual(job, '0 5 * * * ls -alh > /dev/null')

    def test_get_cron_job_cron_file_special(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module, cron_file='my_cron_file')
        job = cron_tab.get_cron_job('0', '5', '*', '*', '*', 'ls -alh > /dev/null', True, False)
        self.assertEqual(job, '@reboot ls -alh > /dev/null')

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(str(cron_tab), 'CronTab')

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        self.assertEqual(repr(cron_tab), 'CronTab(module=<ansible.module_utils.basic.AnsibleModule object at 0x...>)')

if __name__ == '__main__':
    unittest.main()