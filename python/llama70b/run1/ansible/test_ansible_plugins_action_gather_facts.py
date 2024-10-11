import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = gather_facts.ActionModule()
        self.assertIsInstance(instance, gather_facts.ActionBase)

    def test_get_module_args(self):
        instance = gather_facts.ActionModule()
        fact_module = 'setup'
        task_vars = {}
        result = instance._get_module_args(fact_module, task_vars)
        self.assertIsInstance(result, dict)

    def test_combine_task_result(self):
        instance = gather_facts.ActionModule()
        result = {'ansible_facts': {}}
        task_result = {'ansible_facts': {'foo': 'bar'}}
        merged_result = instance._combine_task_result(result, task_result)
        self.assertEqual(merged_result, {'ansible_facts': {'foo': 'bar'}})

    def test_run(self):
        instance = gather_facts.ActionModule()
        tmp = None
        task_vars = {}
        result = instance.run(tmp, task_vars)
        self.assertIsInstance(result, dict)

    def test_private_method(self):
        instance = gather_facts.ActionModule()
        result = instance._ActionModule__execute_module('setup', {}, task_vars={})
        self.assertIsInstance(result, dict)

    def test_protected_method(self):
        instance = gather_facts.ActionModule()
        result = instance._get_module_args('setup', {})
        self.assertIsInstance(result, dict)

    def test_str_method(self):
        instance = gather_facts.ActionModule()
        result = str(instance)
        self.assertEqual(result, 'ActionModule')

    def test_repr_method(self):
        instance = gather_facts.ActionModule()
        result = repr(instance)
        self.assertEqual(result, 'ActionModule()')

if __name__ == '__main__':
    unittest.main()