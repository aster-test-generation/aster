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
        # This test will just call the main function to ensure it runs without error
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

    def test_get_cron_job(self):
        result = self.crontab.get_cron_job('*', '*', '*', '*', '*', 'echo "Hello"', None, False)
        self.assertEqual(result, '* * * * * echo "Hello"')

    def test_find_job(self):
        result = self.crontab.find_job('testjob')
        self.assertEqual(result, [])

    def test_add_job(self):
        self.crontab.add_job('testjob', '* * * * * echo "Hello"')
        result = self.crontab.find_job('testjob')
        self.assertEqual(len(result), 1)

    def test_update_job(self):
        self.crontab.add_job('testjob', '* * * * * echo "Hello"')
        self.crontab.update_job('testjob', '* * * * * echo "Updated"')
        result = self.crontab.find_job('testjob')
        self.assertIn('Updated', result[1])

    def test_remove_job(self):
        self.crontab.add_job('testjob', '* * * * * echo "Hello"')
        self.crontab.remove_job('testjob')
        result = self.crontab.find_job('testjob')
        self.assertEqual(result, [])

    def test_add_env(self):
        self.crontab.add_env('TEST_ENV', 'value', None, None)
        result = self.crontab.find_env('TEST_ENV')
        self.assertEqual(len(result), 2)

    def test_update_env(self):
        self.crontab.add_env('TEST_ENV', 'value', None, None)
        self.crontab.update_env('TEST_ENV', 'TEST_ENV="new_value"')
        result = self.crontab.find_env('TEST_ENV')
        self.assertIn('new_value', result[1])

    def test_remove_env(self):
        self.crontab.add_env('TEST_ENV', 'value', None, None)
        self.crontab.remove_env('TEST_ENV')
        result = self.crontab.find_env('TEST_ENV')
        self.assertEqual(result, [])

    def test_is_empty(self):
        result = self.crontab.is_empty()
        self.assertTrue(result)

    def test_write(self):
        self.crontab.add_job('testjob', '* * * * * echo "Hello"')
        self.crontab.write()
        with open('/tmp/crontab', 'r') as f:
            content = f.read()
        self.assertIn('testjob', content)

    def test_render(self):
        self.crontab.add_job('testjob', '* * * * * echo "Hello"')
        result = self.crontab.render()
        self.assertIn('testjob', result)

    def test_get_jobnames(self):
        self.crontab.add_job('testjob', '* * * * * echo "Hello"')
        result = self.crontab.get_jobnames()
        self.assertIn('testjob', result)

    def test_get_envnames(self):
        self.crontab.add_env('TEST_ENV', 'value', None, None)
        result = self.crontab.get_envnames()
        self.assertIn('TEST_ENV', result)

if __name__ == '__main__':
    unittest.main()