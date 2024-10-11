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

    def test__update_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.lines = ["FOO=bar", "BAZ=qux"]
        instance._update_env("FOO", "new_value", lambda newlines, decl: newlines.append(f"{decl}"))
        self.assertEqual(instance.lines, ["FOO=new_value", "BAZ=qux"])

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsInstance(instance.__str__(), str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsInstance(instance.__repr__(), str)

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance1 = CronTab(module)
        instance2 = CronTab(module)
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()