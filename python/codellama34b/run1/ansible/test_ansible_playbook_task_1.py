import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_get_name(self):
        task = Task()
        self.assertEqual(task.get_name(), None)

    def test_load(self):
        data = None
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        task = Task.load(data, block, role, task_include, variable_manager, loader)
        self.assertEqual(task, None)

    def test_repr(self):
        task = Task()
        self.assertEqual(task.__repr__(), 'TASK: None')

    def test_preprocess_data(self):
        ds = None
        task = Task()
        self.assertEqual(task.preprocess_data(ds), None)

    def test_post_validate(self):
        task = Task()
        templar = None
        self.assertEqual(task.post_validate(templar), None)

    def test_load_loop_control(self):
        attr = None
        ds = None
        task = Task()
        self.assertEqual(task._load_loop_control(attr, ds), None)

    def test_post_validate_loop(self):
        attr = None
        value = None
        templar = None
        task = Task()
        self.assertEqual(task._post_validate_loop(attr, value, templar), None)

if __name__ == '__main__':
    unittest.main()