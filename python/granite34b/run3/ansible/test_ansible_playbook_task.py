import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_post_validate_environment(self):
        task = Task()
        result = task._post_validate_environment('env', {'key': 'value'}, None)
        self.assertEqual(result, {'key': 'value'})

    def test_post_validate_changed_when(self):
        task = Task()
        result = task._post_validate_changed_when('changed_when', 'value', templar)
        self.assertEqual(result, 'value')

    def test_post_validate_failed_when(self):
        task = Task()
        result = task._post_validate_failed_when('failed_when', 'value', templar)
        self.assertEqual(result, 'value')

    def test_post_validate_until(self):
        task = Task()
        result = task._post_validate_until('until', 'value', None)
        self.assertEqual(result, 'value')

    def test_get_vars(self):
        task = Task()
        result = task.get_vars()
        self.assertEqual(result, {})

    def test_get_include_params(self):
        task = Task()
        result = task.action.get_include_params()
        self.assertEqual(result, {})

    def test_copy(self):
        task = Task()
        result = task.copy()
        self.assertEqual(result, {'changed': False})

    def test_serialize(self):
        task = Task()
        result = task.serialize()
        self.assertEqual(result, {'name': '', 'connection': None, 'port': None})

    def test_deserialize(self):
        task = Task()
        result = task.deserialize({})
        self.assertEqual(result, None)

    def test_set_loader(self):
        task = Task()
        task.set_loader(self)

    def test_get_parent_attribute(self):
        task = Task()
        result = task._get_parent_attribute('attribute')
        self.assertEqual(result, {})

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