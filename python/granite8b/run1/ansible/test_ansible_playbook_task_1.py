import unittest
from ansible.module_utils.common.yaml import load


class TestTask(unittest.TestCase):
    def test_get_name(self):
        task = Task()
        self.assertEqual(task.get_name(), '')
        task = Task(role=Sentinel('role'))
        self.assertEqual(task.get_name(), 'role : ')
        task = Task(name='name')
        self.assertEqual(task.get_name(), 'name')
        task = Task(name='name', role=Sentinel('role'))
        self.assertEqual(task.get_name(), 'role : name')

    def test_load(self):
        task = Task.load(data={'action': 'command', 'args': 'echo hello'})
        self.assertEqual(task.action, 'command')
        self.assertEqual(task.args, 'echo hello')

    def test_preprocess_data(self):
        task = Task()
        ds = {'action': 'command', 'args': 'echo hello'}
        task.preprocess_data(ds)
        self.assertEqual(task.action, 'command')
        self.assertEqual(task.args, 'echo hello')
        self.assertEqual(task.vars, {})
        ds = {'action': 'command', 'args': 'echo hello', 'vars': {'foo': 'bar'}}
        task.preprocess_data(ds)
        self.assertEqual(task.vars, {'foo': 'bar'})
        ds = {'action': 'command', 'args': 'echo hello', 'with_items': '[1, 2, 3]'}
        task.preprocess_data(ds)
        self.assertEqual(task.loop, [1, 2, 3])
        self.assertEqual(task.loop_control, None)
        ds = {'action': 'command', 'args': 'echo hello', 'loop_control': {'loop_var': 'item'}}
        task.preprocess_data(ds)
        self.assertEqual(task.loop_control.loop_var, 'item')

if __name__ == '__main__':
    unittest.main()