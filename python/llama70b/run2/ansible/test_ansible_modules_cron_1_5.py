import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test_init(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsInstance(instance, CronTab)

    def test_write(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.write()

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()

    def test_render(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.render()
        self.assertIsInstance(result, str)

    def test_write_execute(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance._write_execute('path')
        self.assertIsInstance(result, str)

    def test_str_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        from ansible.module_utils.basic import AnsibleModule
        instance1 = CronTab(module)
        instance2 = CronTab(module)
        result = instance1 == instance2
        self.assertIsInstance(result, bool)

if __name__ == '__main__':
    unittest.main()