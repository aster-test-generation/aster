import unittest
from ansible.module_utils.common.yaml import load


class TestTask(unittest.TestCase):
    def test_post_validate_environment(self):
        task = Task()
        self.assertEqual(task._post_validate_environment('environment', {}, None), {})
        self.assertEqual(task._post_validate_environment('environment', {'key': 'value'}, None), {'key': 'value'})
        self.assertEqual(task._post_validate_environment('environment', [{'key': 'value1'}, {'key': 'value2'}], None), [{'key': 'value1'}, {'key': 'value2'}])
        self.assertEqual(task._post_validate_environment('environment', {'key': '{{ var }}'}, None), '{{ var }}')

    def test_post_validate_changed_when(self):
        task = Task()
        self.assertEqual(task._post_validate_changed_when('changed_when', None, None), None)
        self.assertEqual(task._post_validate_changed_when('changed_when', 'true', None), 'true')

    def test_post_validate_failed_when(self):
        task = Task()
        self.assertEqual(task._post_validate_failed_when('failed_when', None, None), None)
        self.assertEqual(task._post_validate_failed_when('failed_when', 'false', None), 'false')

    def test_post_validate_until(self):
        task = Task()
        self.assertEqual(task._post_validate_until('until', None, None), None)
        self.assertEqual(task._post_validate_until('until', 'true', None), 'true')

    def test_get_vars(self):
        task = Task()
        self.assertEqual(task.get_vars(), {})
        task._parent = Task()
        self.assertEqual(task.get_vars(), {})
        task._parent._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.get_vars(), {'key': 'value'})

    def test_get_include_params(self):
        task = Task()
        self.assertEqual(task.get_include_params(), {})
        task._parent = Task()
        self.assertEqual(task.get_include_params(), {})
        task._parent._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.get_include_params(), {'key': 'value'})

    def test_copy(self):
        task = Task()
        self.assertEqual(task.copy(), task)
        task._parent = Task()
        self.assertEqual(task.copy(), task)
        task._parent._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.copy(), task)
        task._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.copy(), task)
        task._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.copy(exclude_parent=True), task)
        task._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.copy(exclude_tasks=True), task)

    def test_serialize(self):
        task = Task()
        self.assertEqual(task.serialize(), {})
        task._parent = Task()
        self.assertEqual(task.serialize(), {})
        task._parent._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.serialize(), {'parent': {'vars': {'key': 'value'}, 'parent_type': 'Task'}, 'implicit': False, 'resolved_action': None})

    def test_deserialize(self):
        task = Task()
        self.assertEqual(task.deserialize({}), task)
        task._parent = Task()
        self.assertEqual(task.deserialize({}), task)
        task._parent._attributes['vars'] = {'key': 'value'}
        self.assertEqual(task.deserialize({'parent': {'vars': {'key': 'value'}, 'parent_type': 'Task'}, 'implicit': False, 'resolved_action': None}), task)

    def test_set_loader(self):
        task = Task()
        self.assertEqual(task.set_loader(None), task)

if __name__ == '__main__':
    unittest.main()