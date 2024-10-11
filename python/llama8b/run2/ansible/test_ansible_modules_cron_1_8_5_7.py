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
        self.assertIsNone(cron_tab.n_existing)
        self.assertEqual(cron_tab.cron_cmd, module.get_bin_path('crontab', required=True))

    def test_read(self):
        module = Ansiline
        cron_tab = CronTab(module)
        cron_tab.read()
        self.assertIsNotNone(cron_tab.lines)

    def test_find_job(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = cron_tab.find_job('test_job')
        self.assertEqual(result, [])

    def test_find_job_with_job(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        job = '0 5,2 * * ls -alh > /dev/null'
        result = cron_tab.find_job('test_job', job)
        self.assertEqual(result, [])

    def test_do_comment(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        comment = cron_tab.do_comment('test_comment')
        self.assertEqual(comment, '# test_comment')

    def test_str(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, 'CronTab')

    def test_repr(self):
        module = AnsibleModule()
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, 'CronTab(module=AnsibleModule())')

    def test_eq(self):
        module = AnsibleModule()
        cron_tab1 = CronTab(module)
        cron_tab2 = CronTab(module)
        self.assertEqual(cron_tab1, cron_tab2)

if __name__ == '__main__':
    unittest.main()