import unittest
from ansible.modules.cron import main, CronTab
from ansible.module_utils.basic import AnsibleModule


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
        # This test will just ensure that the main function runs without errors
        try:
            main()
        except SystemExit as e:
            self.assertEqual(e.code, 0)

class TestCronTab(unittest.TestCase):
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
        self.crontab = CronTab(self.module, 'testuser', '/tmp/crontab')

    def test_add_job(self):
        self.crontab.add_job('testjob', '* * * * * /bin/true')
        self.assertIn('testjob', self.crontab.get_jobnames())

    def test_remove_job(self):
        self.crontab.add_job('testjob', '* * * * * /bin/true')
        self.crontab.remove_job('testjob')
        self.assertNotIn('testjob', self.crontab.get_jobnames())

    def test_update_job(self):
        self.crontab.add_job('testjob', '* * * * * /bin/true')
        self.crontab.update_job('testjob', '0 0 * * * /bin/true')
        jobs = self.crontab.find_job('testjob')
        self.assertEqual(jobs[1], '0 0 * * * /bin/true')

    def test_add_env(self):
        self.crontab.add_env('TEST_ENV', 'value')
        self.assertIn('TEST_ENV', self.crontab.get_envnames())

    def test_remove_env(self):
        self.crontab.add_env('TEST_ENV', 'value')
        self.crontab.remove_env('TEST_ENV')
        self.assertNotIn('TEST_ENV', self.crontab.get_envnames())

    def test_update_env(self):
        self.crontab.add_env('TEST_ENV', 'value')
        self.crontab.update_env('TEST_ENV', 'new_value')
        envs = self.crontab.find_env('TEST_ENV')
        self.assertEqual(envs[1], 'TEST_ENV="new_value"')

    def test_is_empty(self):
        self.assertTrue(self.crontab.is_empty())

    def test_write(self):
        self.crontab.add_job('testjob', '* * * * * /bin/true')
        self.crontab.write()
        with open('/tmp/crontab', 'r') as f:
            content = f.read()
        self.assertIn('testjob', content)

    def test_render(self):
        self.crontab.add_job('testjob', '* * * * * /bin/true')
        rendered = self.crontab.render()
        self.assertIn('testjob', rendered)

if __name__ == '__main__':
    unittest.main()