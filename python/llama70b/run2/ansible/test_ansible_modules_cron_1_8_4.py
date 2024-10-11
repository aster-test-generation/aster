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

    def test_do_remove_job(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.do_remove_job([], 'testcomment', 'testjob')
        self.assertIsNone(result)

    def test__repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test__str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.__str__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()