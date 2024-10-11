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
        result = instance.update_env('name', 'decl')
        self.assertIsNotNone(result)

    def test__update_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance._CronTab__update_env('name', 'decl', True)
        self.assertIsNotNone(result)

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

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance1 = CronTab(module)
        instance2 = CronTab(module)
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()