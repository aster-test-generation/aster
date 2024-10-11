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

    def test_do_add_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        lines = []
        decl = 'TEST_ENV=123'
        instance.do_add_env(lines, decl)
        self.assertIn(decl, lines)

    def test__repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        repr_str = instance.__repr__()
        self.assertIsInstance(repr_str, str)

    def test__str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        str_str = instance.__str__()
        self.assertIsInstance(str_str, str)

    def test__eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        module2 = AnsibleModule({'name': 'test2'})
        instance1 = CronTab(module1)
        instance2 = CronTab(module2)
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()