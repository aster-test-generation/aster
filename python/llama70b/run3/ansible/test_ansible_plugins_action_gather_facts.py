import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test__get_module_args(self):
        instance = ActionModule()
        fact_module = 'setup'
        task_vars = {}
        result = instance._get_module_args(fact_module, task_vars)
        self.assertIsInstance(result, dict)

    def test__combine_task_result(self):
        instance = ActionModule()
        result = {'ansible_facts': {}}
        task_result = {'ansible_facts': {'foo': 'bar'}}
        combined_result = instance._combine_task_result(result, task_result)
        self.assertEqual(combined_result, {'ansible_facts': {'foo': 'bar'}})

    def test_run(self):
        instance = ActionModule()
        tmp = None
        task_vars = {}
        result = instance.run(tmp, task_vars)
        self.assertIsInstance(result, dict)

    def test__supports_check_mode(self):
        instance = ActionModule()
        self.assertTrue(instance._supports_check_mode)

    def test___str__(self):
        instance = ActionModule()
        result = str(instance)
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = ActionModule()
        result = repr(instance)
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()