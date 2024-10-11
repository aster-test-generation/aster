import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_post_validate_environment(self):
        task = Task()
        attr = "environment"
        value = "test"
        templar = "test"
        result = task._post_validate_environment(attr, value, templar)
        self.assertEqual(result, "test")

    def test_post_validate_changed_when(self):
        task = Task()
        attr = "changed_when"
        value = "test"
        templar = "test"
        result = task._post_validate_changed_when(attr, value, templar)
        self.assertEqual(result, "test")

    def test_post_validate_failed_when(self):
        task = Task()
        attr = "failed_when"
        value = "test"
        templar = "test"
        result = task._post_validate_failed_when(attr, value, templar)
        self.assertEqual(result, "test")

    def test_post_validate_until(self):
        task = Task()
        attr = "until"
        value = "test"
        templar = "test"
        result = task._post_validate_until(attr, value, templar)
        self.assertEqual(result, "test")

    def test_get_vars(self):
        task = Task()
        result = task.get_vars()
        self.assertEqual(result, {})

    def test_get_include_params(self):
        task = Task()
        result = task.get_include_params()
        self.assertEqual(result, {})

    def test_copy(self):
        task = Task()
        result = task.copy()
        self.assertEqual(result, Task())

    def test_serialize(self):
        task = Task()
        result = task.serialize()
        self.assertEqual(result, {})

    def test_deserialize(self):
        task = Task()
        data = {}
        result = task.deserialize(data)
        self.assertEqual(result, None)

    def test_set_loader(self):
        task = Task()
        loader = "test"
        result = task.set_loader(loader)
        self.assertEqual(result, None)

    def test_get_parent_attribute(self):
        task = Task()
        attr = "test"
        extend = False
        prepend = False
        result = task._get_parent_attribute(attr, extend, prepend)
        self.assertEqual(result, Sentinel)

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