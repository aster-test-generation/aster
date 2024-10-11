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

    def test__cron_cmd(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.cron_cmd)

    def test__ansible(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.ansible)

    def test__n_existing(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.n_existing)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(str(instance))

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(repr(instance))

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance1 = CronTab(module)
        instance2 = CronTab(module)
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()