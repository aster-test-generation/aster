import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNotNone(instance.cron_cmd)

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_update_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.update_env('TEST_VAR', 'test_value')
        self.assertTrue(result)

    def test__update_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance._CronTab__update_env('TEST_VAR', 'test_value', True)
        self.assertTrue(result)

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = str(instance)
        self.assertIsNotNone(result)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = repr(instance)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()