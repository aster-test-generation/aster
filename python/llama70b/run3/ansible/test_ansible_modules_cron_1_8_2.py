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
        instance = CronTab(module, user='testuser')
        self.assertIsNotNone(instance.module)
        self.assertEqual(instance.user, 'testuser')
        self.assertIsNone(instance.cron_file)

    def test___init__with_cron_file(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module, cron_file='testcron')
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertEqual(instance.cron_file, 'testcron')

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_do_add_job(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        lines = []
        comment = 'test comment'
        job = 'test job'
        instance.do_add_job(lines, comment, job)
        self.assertEqual(lines, [comment, job])

    def test__get_cron_cmd(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance._get_cron_cmd())

    def test__get_cron_file(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNone(instance._get_cron_file())

    def test__str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertEqual(str(instance), 'CronTab instance')

    def test__repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertEqual(repr(instance), 'CronTab(module=<AnsibleModule object>, user=None, cron_file=None)')

if __name__ == '__main__':
    unittest.main()