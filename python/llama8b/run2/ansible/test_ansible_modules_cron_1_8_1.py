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
        self.assertEqual(cron_tab.ansible, '')
        self.assertEqual(cron_tab.n_existing, '')
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_update_job(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.update_job('test_job', 'ls -alh > /dev/null')
        self.assertTrue(cron_tab._update_job.called)

    def test_do_add_job(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        cron_tab.do_add_job('test_job', 'ls -alh > /dev/null')
        self.assertTrue(cron_tab._do_add_job.called)

    def test__str__(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(str(cron_tab), 'CronTab')

    def test__repr__(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        self.assertEqual(repr(cron_tab), 'CronTab(module=AnsibleModule())')

    def test__eq__(self):
        module = AnsibleModule()
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertTrue(cron_tab1 == cron_tab2)

if __name__ == '__main__':
    unittest.main()