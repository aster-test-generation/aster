import unittest
from ansible.module_utils.common.yaml import load


class TestTask(unittest.TestCase):
    def test_get_name(self):
        task = Task()
        self.assertEqual(task.get_name(), '')
        task = Task(role=Sentinel('role'))
        self.assertEqual(task.get_name(), 'role : ')
        task = Task(name='test')
        self.assertEqual(task.get_name(), 'test')
        task = Task(name='test', role=Sentinel('role'))
        self.assertEqual(task.get_name(), 'role : test')

    def test_load(self):
        task = Task.load(data={'action': 'test'})
        self.assertEqual(task.action, 'test')
        task = Task.load(data={'action': 'test', 'args': {'foo': 'bar'}})
        self.assertEqual(task.action, 'test')
        self.assertEqual(task.args['foo'], 'bar')

    def test_preprocess_data(self):
        task = Task()
        ds = {'action': 'test', 'args': {'foo': 'bar'}}
        task.preprocess_data(ds)
        self.assertEqual(task.action, 'test')
        self.assertEqual(task.args['foo'], 'bar')

    def test_load_loop_control(self):
        task = Task()
        ds = {'loop_control': {'loop_var': 'item'}}
        loop_control = task._load_loop_control('loop_control', ds)
        self.assertEqual(loop_control.loop_var, 'item')

    def test_post_validate(self):
        task = Task()
        task.post_validate(templar=None)

if __name__ == '__main__':
    unittest.main()