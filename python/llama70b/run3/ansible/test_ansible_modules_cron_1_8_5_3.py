import unittest
from ansible.modules.cron import CronTab


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        self.assertIsNotNone(instance.module)
        self.assertIsNone(instance.user)
        self.assertIsNone(instance.cron_file)

    def test_read(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test_do_add_env(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        lines = []
        decl = 'TEST_VAR=test_value'
        instance.do_add_env(lines, decl)
        self.assertEqual(lines, [decl])

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

    def test__get_cron_cmd(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance._CronTab__get_cron_cmd()
        self.assertIsNotNone(result)

    def test__get_cron_file(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        result = instance._CronTab__get_cron_file()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()