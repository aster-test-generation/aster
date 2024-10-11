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

    def test_do_remove_job(self):
        from ansible.module_utils.basic import AnsibleModule
        instance = CronTab(module)
        lines = []
        comment = 'test comment'
        job = 'test job'
        result = instance.do_remove_job(lines, comment, job)
        self.assertIsNone(result)

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
        module2 = AnsibleModule({'name': 'test2'})
        instance1 = CronTab(module1)
        instance2 = CronTab(module2)
        self.assertNotEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()