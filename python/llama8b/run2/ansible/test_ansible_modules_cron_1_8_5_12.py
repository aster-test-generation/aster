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

    def test_update_job(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        name = "test_job"
        job = "ls -alh > /dev/null"
        addlinesfunction = lambda newlines, comment, job: newlines.append(f"{comment}{job}")
        result = cron_tab._update_job(name, job, addlinesfunction)
        self.assertTrue(result)

    def test_do_comment(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        name = "test_job"
        result = cron_tab.do_comment(name)
        self.assertEqual(result, f"# {name}")

    def test_str(self):
        from ansible.module_utils.basic import AnsibleModule
        cron_tab = CronTab(module)
        result = str(cron_tab)
        self.assertEqual(result, "CronTab")

    def test_repr(self):
        from ansible.module_utils.basic import AnsibleModul
        cron_tab = CronTab(module)
        result = repr(cron_tab)
        self.assertEqual(result, "CronTab(module=AnsibleModule())")

if __name__ == '__main__':
    unittest.main()