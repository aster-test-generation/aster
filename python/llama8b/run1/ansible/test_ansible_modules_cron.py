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

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertEqual(cron_tab.lines, [])

    def test_update_job(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        name = 'test_job'
        job = 'ls -alh > /dev/null'
        result = cron_tab.update_job(name, job)
        self.assertEqual(result, None)

    def test_do_add_job(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        name = 'test_job'
        job = 'ls -alh > /dev/null'
        result = cron_tab._do_add_job(name, job)
        self.assertEqual(result, None)

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

    def test__eq__(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertEqual(cron_tab1, cron_tab2)

if __name__ == '__main__':
    unittest.main()