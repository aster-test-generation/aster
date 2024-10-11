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
        instance._task.args = {'key': 'test_group'}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test-group')
        self.assertEqual(result['parent_groups'], ['all'])

    def test_run_with_parents(self):
        instance = ActionModule()
        task_vars = {}
        instance._task.args = {'key': 'test_group', 'parents': ['parent1', 'parent2']}
        result = instance.run(tmp=None, task_vars=task_vars)
        self.assertFalse(result['failed'])
        self.assertEqual(result['add_group'], 'test-group')
        self.assertEqual(result['parent_groups'], ['parent1', 'parent2'])

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
        self.assertEqual(instance1, instance2)

    def test_TRANSFERS_FILES(self):
        self.assertFalse(ActionModule.TRANSFERS_FILES)

    def test_VALID_ARGS(self):
        self.assertEqual(ActionModule._VALID_ARGS, frozenset(('key', 'parents')))

    def test_private_method__task(self):
        instance = ActionModule()
        instance._task = 'test_task'
        self.assertEqual(instance._ActionModule__task, 'test_task')

if __name__ == '__main__':
    unittest.main()