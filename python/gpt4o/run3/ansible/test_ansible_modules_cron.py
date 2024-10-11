import unittest
from ansible.modules.cron import main, CronTab
from ansible.module_utils.basic import AnsibleModule
import os
import tempfile
import platform


class TestCronModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                name=dict(type='str', required=True),
                user=dict(type='str'),
                job=dict(type='str', aliases=['value']),
                cron_file=dict(type='path'),
                state=dict(type='str', default='present', choices=['present', 'absent']),
                backup=dict(type='bool', default=False),
                minute=dict(type='str', default='*'),
                hour=dict(type='str', default='*'),
                day=dict(type='str', default='*', aliases=['dom']),
                month=dict(type='str', default='*'),
                weekday=dict(type='str', default='*', aliases=['dow']),
                special_time=dict(type='str', choices=['reboot', 'yearly', 'annually', 'monthly', 'weekly', 'daily', 'hourly']),
                disabled=dict(type='bool', default=False),
                env=dict(type='bool', default=False),
                insertafter=dict(type='str'),
                insertbefore=dict(type='str')
            ),
            supports_check_mode=True,
            mutually_exclusive=[['insertafter', 'insertbefore']]
        )

    def test_main(self):
        # This is a high-level test to ensure the main function runs without error
        try:
            main()
        except SystemExit as e:
            self.assertEqual(e.code, 0)

    def test_crontab_initialization(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        self.assertIsInstance(crontab, CronTab)

    def test_crontab_find_env(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        result = crontab.find_env('testenv')
        self.assertEqual(result, [])

    def test_crontab_add_env(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_env('TEST_ENV="testvalue"', None, None)
        self.assertIn('TEST_ENV="testvalue"', crontab.render())

    def test_crontab_update_env(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_env('TEST_ENV="testvalue"', None, None)
        crontab.update_env('TEST_ENV', 'TEST_ENV="newvalue"')
        self.assertIn('TEST_ENV="newvalue"', crontab.render())

    def test_crontab_remove_env(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_env('TEST_ENV="testvalue"', None, None)
        crontab.remove_env('TEST_ENV')
        self.assertNotIn('TEST_ENV="testvalue"', crontab.render())

    def test_crontab_get_cron_job(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        job = crontab.get_cron_job('*', '*', '*', '*', '*', 'echo "test"', None, False)
        self.assertEqual(job, '* * * * * echo "test"')

    def test_crontab_find_job(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        result = crontab.find_job('testjob')
        self.assertEqual(result, [])

    def test_crontab_add_job(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_job('testjob', '* * * * * echo "test"')
        self.assertIn('* * * * * echo "test"', crontab.render())

    def test_crontab_update_job(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_job('testjob', '* * * * * echo "test"')
        crontab.update_job('testjob', '* * * * * echo "newtest"')
        self.assertIn('* * * * * echo "newtest"', crontab.render())

    def test_crontab_remove_job(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_job('testjob', '* * * * * echo "test"')
        crontab.remove_job('testjob')
        self.assertNotIn('* * * * * echo "test"', crontab.render())

    def test_crontab_is_empty(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        self.assertTrue(crontab.is_empty())

    def test_crontab_write(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_job('testjob', '* * * * * echo "test"')
        with tempfile.NamedTemporaryFile(delete=False) as tmpfile:
            crontab.write(tmpfile.name)
            with open(tmpfile.name, 'r') as f:
                content = f.read()
            self.assertIn('* * * * * echo "test"', content)
        os.remove(tmpfile.name)

    def test_crontab_render(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_job('testjob', '* * * * * echo "test"')
        rendered = crontab.render()
        self.assertIn('* * * * * echo "test"', rendered)

    def test_crontab_get_jobnames(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_job('testjob', '* * * * * echo "test"')
        jobnames = crontab.get_jobnames()
        self.assertIn('testjob', jobnames)

    def test_crontab_get_envnames(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_env('TEST_ENV="testvalue"', None, None)
        envnames = crontab.get_envnames()
        self.assertIn('TEST_ENV', envnames)

    def test_crontab_remove_job_file(self):
        crontab = CronTab(self.module, 'testuser', '/tmp/testcron')
        crontab.add_job('testjob', '* * * * * echo "test"')
        crontab.write()
        self.assertTrue(crontab.remove_job_file())
        self.assertFalse(os.path.exists(crontab.cron_file))

if __name__ == '__main__':
    unittest.main()