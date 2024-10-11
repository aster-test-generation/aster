import unittest
from ansible.playbook.task import Task



class TestTask(unittest.TestCase):
    def test_get_name(self):
        task = Task()
        result = task.get_name()
        self.assertEqual(result, '')

    def test_load(self):
        data = None
        block = None
        role = None
        task_include = None
        variable_manager = None
        loader = None
        result = Task.load(data, block, role, task_include, variable_manager, loader)
        self.assertEqual(result, None)

    def test_repr(self):
        task = Task()
        result = task.__repr__()
        self.assertEqual(result, 'TASK: None')

    def test_preprocess_data(self):
        ds = None
        result = Task.preprocess_data(ds)
        self.assertEqual(result, None)

    def test_post_validate(self):
        task = Task()
        templar = None
        result = task.post_validate(templar)
        self.assertEqual(result, None)

    def test_load_loop_control(self):
        task = Task()
        attr = None
        ds = None
        result = task._load_loop_control(attr, ds)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()