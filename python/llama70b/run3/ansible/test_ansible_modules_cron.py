import unittest
from ansible.modules.cron import main, CronTab, AnsibleModule


class TestCronTab(unittest.TestCase):
    def test_init(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        self.assertIsInstance(cron_tab, CronTab)

    def test_add_env(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        cron_tab.add_env('name="value"', 'insertafter', 'insertbefore')
        self.assertTrue(cron_tab.env_added)

    def test_update_env(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        cron_tab.update_env('name', 'new_value')
        self.assertTrue(cron_tab.env_updated)

    def test_remove_env(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        cron_tab.remove_env('name')
        self.assertTrue(cron_tab.env_removed)

    def test_add_job(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        cron_tab.add_job('name', 'job')
        self.assertTrue(cron_tab.job_added)

    def test_update_job(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        cron_tab.update_job('name', 'new_job')
        self.assertTrue(cron_tab.job_updated)

    def test_remove_job(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        cron_tab.remove_job('name')
        self.assertTrue(cron_tab.job_removed)

    def test_write(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        cron_tab.write()
        self.assertTrue(cron_tab.written)

    def test_render(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        result = cron_tab.render()
        self.assertIsInstance(result, str)

    def test_get_jobnames(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        result = cron_tab.get_jobnames()
        self.assertIsInstance(result, list)

    def test_get_envnames(self):
        cron_tab = CronTab(AnsibleModule, 'user', 'cron_file')
        result = cron_tab.get_envnames()
        self.assertIsInstance(result, list)

class TestAnsibleModule(unittest.TestCase):
    def test_init(self):
        module = AnsibleModule(argument_spec=dict())
        self.assertIsInstance(module, AnsibleModule)

    def test_exit_json(self):
        module = AnsibleModule(argument_spec=dict())
        module.exit_json(changed=True, cron_file='cron_file', state='present', diff=dict())
        self.assertTrue(module.exited)

class TestMain(unittest.TestCase):
    def test_main(self):
        result = main()
        self.assertIsInstance(result, dict)

if __name__ == '__main__':
    unittest.main()