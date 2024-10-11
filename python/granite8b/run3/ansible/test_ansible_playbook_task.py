import unittest
from ansible.module_utils.common.yaml import load


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task()
        self.assertIsNone(task._role)
        self.assertIsNone(task._parent)
        self.assertFalse(task.implicit)
        self.assertIsNone(task.resolved_action)

    def test_post_validate_environment(self):
        task = Task()
        self.assertEqual(task._post_validate_environment('environment', None, None), {})
        self.assertEqual(task._post_validate_environment('environment', [], None), {})
        self.assertEqual(task._post_validate_environment('environment', {}, None), {})
        self.assertEqual(task._post_validate_environment('environment', 'foo', None), 'foo')

    def test_get_vars(self):
        task = Task()
        self.assertEqual(task.get_vars(), {})

    def test_get_include_params(self):
        task = Task()
        self.assertEqual(task.get_include_params(), {})

    def test_copy(self):
        task = Task()
        copy = task.copy()
        self.assertIsNone(copy._parent)
        self.assertIsNone(copy._role)
        self.assertFalse(copy.implicit)
        self.assertIsNone(copy.resolved_action)

    def test_serialize(self):
        task = Task()
        self.assertEqual(task.serialize(), {})

    def test_deserialize(self):
        task = Task()
        data = {}
        task.deserialize(data)
        self.assertIsNone(task._parent)
        self.assertIsNone(task._role)
        self.assertFalse(task.implicit)
        self.assertIsNone(task.resolved_action)

    def test_set_loader(self):
        task = Task()
        task.set_loader(None)

    def test_get_parent_attribute(self):
        task = Task()
        self.assertIsNone(task._get_parent_attribute('foo'))

    def test_all_parents_static(self):
        task = Task()
        self.assertTrue(task.all_parents_static())

    def test_get_first_parent_include(self):
        task = Task()
        self.assertIsNone(task.get_first_parent_include())

if __name__ == '__main__':
    unittest.main()