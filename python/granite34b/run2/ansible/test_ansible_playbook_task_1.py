import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_get_name(self):
        task = Task()
        task.name = 'task_name'
        self.assertEqual(task.get_name(), 'task_name')

    def test_preprocess_data(self):
        task_data = {
            'action': 'action_name',
            'args': {'arg1': 'value1', 'arg2': 'value2'},
            'delegate_to': 'delegate_host',
            'vars': {'var1': 'value3', 'var2': 'value4'}
        }
        task = Task()
        task.preprocess_data(task_data)
        self.assertEqual(task.action.name, 'action_name')
        self.assertEqual(task.args, {'arg1': 'value1', 'arg2': 'value2'})
        self.assertEqual(task.delegate_to, 'delegate_host')
        self.assertEqual(task.vars, {'var1': 'value3', 'var2': 'value4'})

    def test_post_validate(self):
        task = Task()
        task.post_validate(context)

    def test_load_loop_control(self):
        loop_control_data = {
            'label': 'loop_label',
            'pause': 10,
            'index_var': 'index_var'
        }
        task = Task()
        task._load_loop_control(loop_control_data)
        self.assertEqual(task.loop_control.label, 'loop_label')
        self.assertEqual(task.loop_control.pause, 10)
        self.assertEqual(task.loop_control.index_var, 'index_var')

if __name__ == '__main__':
    unittest.main()