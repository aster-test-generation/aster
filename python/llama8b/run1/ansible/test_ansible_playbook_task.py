import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task()
        self.assertEqual(task._parent, None)
        self.assertEqual(task._role, None)
        self.assertEqual(task.implicit, False)
        self.assertEqual(task.resolved_action, None)

    def test_post_validate_environment(self):
        task = Task()
        env = task._post_validate_environment('env', 'value', None)
        self.assertEqual(env, 'value')

    def test_post_validate_changed_when(self):
        task = Task()
        result = task._post_validate_changed_when('when', 'value', None)
        self.assertEqual(result, 'value')

    def test_post_validate_failed_when(self):
        task = Task()
        result = task._post_validate_failed_when('when', 'value', None)
        self.assertEqual(result, 'value')

    def test_post_validate_until(self):
        task = Task()
        result = task._post_validate_until('until', 'value', None)
        self.assertEqual(result, 'value')

    def test_get_vars(self):
        task = Task()
        task.vars = {'var1': 'value1', 'var2': 'value2'}
        result = task.get_vars()
        self.assertEqual(result, {'var1': 'value1', 'var2': 'value2'})

    def test_get_include_params(self):
        task = Task()
        task.vars = {'var1': 'value1', 'var2': 'value2'}
        result = task.get_include_params()
        self.assertEqual(result, {'var1': 'value1', 'var2': 'value2'})

    def test_copy(self):
        task = Task()
        task_copy = task.copy()
        self.assertEqual(task_copy._parent, None)
        self.assertEqual(task_copy._role, None)
        self.assertEqual(task_copy.implicit, False)
        self.assertEqual(task_copy.resolved_action, None)

    def test_serialize(self):
        task = Task()
        task._parent = Task()
        task._role = Task()
        task.implicit = True
        task.resolved_action = 'action'
        result = task.serialize()
        self.assertIn('parent', result)
        self.assertIn('role', result)
        self.assertEqual(result['implicit'], True)
        self.assertEqual(result['resolved_action'], 'action')

    def test_deserialize(self):
        task = Task()
        data = {'parent': {'parent': Task()}, 'role': Task(), 'implicit': True, 'resolved_action': 'action'}
        task.deserialize(data)
        self.assertEqual(task._parent, Task())
        self.assertEqual(task._role, Task())
        self.assertEqual(task.implicit, True)
        self.assertEqual(task.resolved_action, 'action')

    def test_set_loader(self):
        task = Task()
        loader = Task()
        task.set_loader(loader)
        self.assertEqual(task._loader, loader)

    def test_get_parent_attribute(self):
        task = Task()
        task._attributes = {'attr': 'value'}
        result = task._get_parent_attribute('attr')
        self.assertEqual(result, 'value')

    def test_all_parents_static(self):
        task = Task()
        self.assertTrue(task.all_parents_static())

    def test_get_first_parent_include(self):
        task = Task()
        result = task.get_first_parent_include()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()