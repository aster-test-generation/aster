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

    def test_get_jobnames(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.lines = ['test1', 'test2', 'ansible_test3']
        result = instance.get_jobnames()
        self.assertEqual(result, ['test1', 'test2', 'test3'])

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = repr(instance)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()