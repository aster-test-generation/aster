import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_post_validate_environment(self):
        task = Task()
        env = task._post_validate_environment('env', {'key': 'value'}, {})
        self.assertEqual(env, {'key': 'value'})

    def test_post_validate_changed_when(self):
        task = Task()
        value = task._post_validate_changed_when('changed_when', 'value', None)
        self.assertEqual(value, 'value')

    def test_post_validate_failed_when(self):
        task = Task()
        value = task._post_validate_failed_when('failed_when', 'value', None)
        self.assertEqual(value, 'value')

    def test_post_validate_until(self):
        task = Task()
        value = task._post_validate_until('until', 'value', None)
        self.assertEqual(value, 'value')

    def test_get_vars(self):
        task = Task()
        all_vars = task.get_vars()
        self.assertEqual(all_vars, {})

    def test_get_include_params(self):
        task = Task()
        include_params = task.get_include_params(action=action)
        self.assertEqual(include_params, {})

    def test_copy(self):
        task = Task()
        new_task = task.copy()
        self.assertEqual(new_task._parent, None)
        self.assertEqual(new_task._role, None)
        self.assertEqual(new_task.implicit, False)
        self.assertEqual(new_task.resolved_action, None)

    def test_serialize(self):
        task = Task()
        data = task.serialize()
        self.assertEqual(data, {'name': '', 'connection': None, 'port': None})

    def test_deserialize(self):
        task = Task()
        data = {'parent': 'parent_data', 'role': 'role_data', 'implicit': True, 'resolved_action': 'resolved_action'}
        p = task.deserialize(data)
        self.assertEqual(task._parent, 'parent_data')
        self.assertEqual(task._role, 'role_data')
        self.assertEqual(task.implicit, True)
        self.assertEqual(task.resolved_action, 'resolved_action')

    def test_set_loader(self):
        task = Task()
        task.set_loader('loader')
        self.assertEqual(task._loader, 'loader')

    def test_get_parent_attribute(self):
        task = Task()
        value = task._get_parent_attribute('attribute')
        self.assertEqual(value, None)

    def test_all_parents_static(self):
        task = Task()
        result = task.all_parents_static()
        self.assertEqual(result, True)

    def test_get_first_parent_include(self):
        task = Task()
        result = task.get_first_parent_include()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()