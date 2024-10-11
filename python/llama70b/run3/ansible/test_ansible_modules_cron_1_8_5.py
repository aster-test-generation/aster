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

    def test_render(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.lines = ["cron1", "cron2"]
        result = instance.render()
        self.assertEqual(result, "cron1\ncron2\n")

    def test___str__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance1 = CronTab(module)
        instance2 = CronTab(module)
        self.assertNotEqual(instance1, instance2)

    def test_private_method__ansible(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance._CronTab__ansible
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()