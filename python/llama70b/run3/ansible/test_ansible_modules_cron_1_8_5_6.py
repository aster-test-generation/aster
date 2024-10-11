import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNone(instance.cron_file)

    def test___init__with_user(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module, user='test_user')
        self.assertIsNotNone(instance.module)
        self.assertEqual(instance.user, 'test_user')
        self.assertIsNone(instance.cron_file)

    def test___init__with_cron_file(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module, cron_file='test_cron_file')
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertEqual(instance.cron_file, 'test_cron_file')

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_remove_job_file(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module, cron_file='test_cron_file')
        instance.cron_file = 'test_cron_file'
        os.makedirs(os.path.dirname(instance.cron_file), exist_ok=True)
        with open(instance.cron_file, 'w') as f:
            f.write('test content')
        self.assertTrue(instance.remove_job_file())
        self.assertFalse(os.path.exists(instance.cron_file))

    def test_remove_job_file_failure(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module, cron_file='test_cron_file')
        instance.cron_file = 'test_cron_file'
        self.assertFalse(instance.remove_job_file())

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertEqual(str(instance), 'CronTab instance')

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertEqual(repr(instance), 'CronTab(module=AnsibleModule(), user=None, cron_file=None)')

if __name__ == '__main__':
    unittest.main()