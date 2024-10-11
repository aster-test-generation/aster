import unittest
from ansible.modules.cron import CronTab, CronTabError


class TestCronTab(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule()
        instance = CronTab(module)
        self.assertIsInstance(instance, CronTab)

    def test_read(self):
        module = AnsibleModule()
        instance = CronTab(module)
        instance.read()
        self.assertIsNotNone(instance.lines)

    def test__read_user_execute(self):
        module = AnsibleModule()
        instance = CronTab(module)
        result = instance._read_user_execute()
        self.assertIsNotNone(result)

    def test___str__(self):
        module = AnsibleModule()
        instance = CronTab(module)
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        module = AnsibleModule()
        instance = CronTab(module)
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        module = AnsibleModule()
        instance1 = CronTab(module)
        instance2 = CronTab(module)
        self.assertEqual(instance1, instance2)

class TestCronTabError(unittest.TestCase):
    def test___init__(self):
        error = CronTabError('Test error', 'Test exception')
        self.assertIsInstance(error, Exception)

if __name__ == '__main__':
    unittest.main()