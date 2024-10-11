import unittest
from ansible.module_utils._text import to_bytes

class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

    def test_run_no_key(self):
        instance = ActionModule()
        task_vars = {}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], "the 'key' param is required when using group_by")

    def test_run_with_key(self):
        instance = ActionModule()
        task_vars = {}
        instance._task.args = {'key': 'test_key', 'parents': ['parent1', 'parent2']}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test_key'.replace(' ', '-'))
        self.assertEqual(result['parent_groups'], ['parent1'.replace(' ', '-'), 'parent2'.replace(' ', '-')])

    def test_run_with_single_parent(self):
        instance = ActionModule()
        task_vars = {}
        instance._task.args = {'key': 'test_key', 'parents': 'parent1'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test_key'.replace(' ', '-'))
        self.assertEqual(result['parent_groups'], ['parent1'.replace(' ', '-')])

    def test_TRANSFERS_FILES(self):
        instance = ActionModule()
        self.assertFalse(instance.TRANSFERS_FILES)

    def test_VALID_ARGS(self):
        instance = ActionModule()
        self.assertEqual(instance._VALID_ARGS, frozenset(('key', 'parents')))

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertEqual(result, "ActionModule")

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, "ActionModule()")

    def test_eq_method(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()