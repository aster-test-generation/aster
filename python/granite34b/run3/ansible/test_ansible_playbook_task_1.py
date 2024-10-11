import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_get_name(self):
        task = Task()
        task.name = 'task_name'
        self.assertEqual(task.get_name(), 'task_name')

    def test_merge_kv(self):
        task = Task()
        self.assertEqual(task._merge_kv(None), '')
        self.assertEqual(task._merge_kv('string'), 'string')
        self.assertEqual(task._merge_kv({'key': 'value'}), 'key=value')

    def test_load(self):
        task = Task.load({'action': 'action_name', 'args': {'arg1': 'value1', 'arg2': 'value2'}}, block=None, role=None, task_include=None, variable_manager=None)
        self.assertEqual(task.action, 'action_name')
        self.assertEqual(task.args, {'arg1': 'value1', 'arg2': 'value2'})

    def test_preprocess_data(self):
        task = Task()
        task.preprocess_data({'action': 'action_name', 'args': {'arg1': 'value1', 'arg2': 'value2'}})
        self.assertEqual(task.name, 'action_name')
        self.assertEqual(task.args, {'arg1': 'value1', 'arg2': 'value2'})

    def test_load_loop_control(self):
        task = Task()
        loop_control = task._load_loop_control('loop_control', {'label': 'label_name'})
        self.assertEqual(loop_control.label, 'label_name')

    def test_validate_attributes(self):
        task = Task()
        task._validate_attributes({'action': 'action_name', 'args': {'arg1': 'value1', 'arg2': 'value2'}})

    def test_post_validate(self):
        task = Task()
        def test_post_validate(self):

    def test_post_validate_loop(self):
        task = Task()
        task._post_validate_loop('loop', 'value', templar=None)

if __name__ == '__main__':
    unittest.main()