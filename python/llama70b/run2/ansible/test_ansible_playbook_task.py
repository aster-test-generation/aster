import unittest
from ansible.playbook.task_include import Task, Base, Conditional, Taggable, CollectionSearc


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task()
        self.assertIsInstance(task, Task)

    def test_post_validate_environment(self):
        task = Task()
        templar = object()  # mock templar object
        result = task._post_validate_environment('attr', ['k=v'], templar)
        self.assertIsInstance(result, dict)

    def test_post_validate_changed_when(self):
        task = Task()
        templar = object()  # mock templar object
        result = task._post_validate_changed_when('attr', 'value', templar)
        self.assertEqual(result, 'value')

    def test_post_validate_failed_when(self):
        task = Task()
        templar = object()  # mock templar object
        result = task._post_validate_failed_when('attr', 'value', templar)
        self.assertEqual(result, 'value')

    def test_post_validate_until(self):
        task = Task()
        templar = object()  # mock templar object
        result = task._post_validate_until('attr', 'value', templar)
        self.assertEqual(result, 'value')

    def test_get_vars(self):
        task = Task()
        result = task.get_vars()
        self.assertIsInstance(result, dict)

    def test_get_include_params(self):
        task = Task()
        result = task.get_include_params()
        self.assertIsInstance(result, dict)

    def test_copy(self):
        task = Task()
        new_task = task.copy()
        self.assertIsInstance(new_task, Task)

    def test_serialize(self):
        task = Task()
        result = task.serialize()
        self.assertIsInstance(result, dict)

    def test_deserialize(self):
        task = Task()
        data = {'parent': {'type': 'Block'}}  # mock data
        task.deserialize(data)
        self.assertIsInstance(task._parent, Block)

    def test_set_loader(self):
        task = Task()
        loader = object()  # mock loader object
        task.set_loader(loader)
        self.assertEqual(task._loader, loader)

    def test_get_parent_attribute(self):
        task = Task()
        result = task._get_parent_attribute('attr')
        self.assertIsNone(result)

    def test_all_parents_static(self):
        task = Task()
        result = task.all_parents_static()
        self.assertTrue(result)

    def test_get_first_parent_include(self):
        task = Task()
        result = task.get_first_parent_include()
        self.assertIsNone(result)

    def test_private_method(self):
        task = Task()
        result = task._Task__private_method()  # call private method
        self.assertIsNone(result)

    def test_protected_method(self):
        task = Task()
        result = task._post_validate_environment('attr', ['k=v'], object())  # call protected method
        self.assertIsInstance(result, dict)

    def test_magic_method_init(self):
        task = Task()
        self.assertIsInstance(task, Task)

    def test_magic_method_str(self):
        task = Task()
        result = str(task)
        self.assertIsInstance(result, str)

    def test_magic_method_repr(self):
        task = Task()
        result = repr(task)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()