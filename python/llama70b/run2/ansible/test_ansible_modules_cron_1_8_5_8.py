import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsInstance(instance, CronTab)

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_find_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.lines = ["FOO=bar", "BAZ=qux"]
        result = instance.find_env("FOO")
        self.assertEqual(result, [0, "FOO=bar"])

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

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance1 = CronTab(module)
        instance2 = CronTab(module)
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()