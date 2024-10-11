import unittest
from ansible.playbook.task_include import Task, Conditional, Taggable, CollectionSearch, Bas


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task()
        self.assertIsInstance(task, Task)
        self.assertIsNone(task._role)
        self.assertIsNone(task._parent)
        self.assertFalse(task.implicit)
        self.assertIsNone(task.resolved_action)

    def test_get_name(self):
        task = Task()
        task.name = 'test_task'
        self.assertEqual(task.get_name(), 'test_task')

    def test_merge_kv(self):
        task = Task()
        ds = {'a': 1, 'b': 2, '_c': 3}
        result = task._merge_kv(ds)
        self.assertEqual(result, 'a=1 b=2')

    def test_load(self):
        task = Task()
        data = {'name': 'test_task', 'action': 'shell', 'args': {'cmd': 'echo hello'}}
        loaded_task = Task.load(data)
        self.assertIsInstance(loaded_task, Task)
        self.assertEqual(loaded_task.name, 'test_task')
        self.assertEqual(loaded_task.action, 'shell')
        self.assertEqual(loaded_task.args, {'cmd': 'echo hello'})

    def test_repr(self):
        task = Task()
        task.name = 'test_task'
        self.assertEqual(task.__repr__(), 'TASK: test_task')

    def test_preprocess_with_loop(self):
        task = Task()
        ds = {'with_items': ['a', 'b', 'c']}
        new_ds = {}
        task._preprocess_with_loop(ds, new_ds, 'with_items', ['a', 'b', 'c'])
        self.assertEqual(new_ds, {'loop_with': 'items', 'loop': ['a', 'b', 'c']})

    def test_preprocess_data(self):
        task = Task()
        ds = {'action': 'shell', 'args': {'cmd': 'echo hello'}}
        new_ds = task.preprocess_data(ds)
        self.assertEqual(new_ds, {'action': 'shell', 'args': {'cmd': 'echo hello'}})

    def test_load_loop_control(self):
        task = Task()
        ds = {'loop_control': {'var': 'item'}}
        loop_control = task._load_loop_control('loop_control', ds)
        self.assertIsInstance(loop_control, LoopControl)

    def test_validate_attributes(self):
        task = Task()
        ds = {'action': 'shell', 'args': {'cmd': 'echo hello'}}
        task._validate_attributes(ds)

    def test_post_validate(self):
        task = Task()
        templar = object()
        task.post_validate(templar)

    def test_post_validate_loop(self):
        task = Task()
        attr = 'loop_control'
        value = {'var': 'item'}
        templar = object()
        result = task._post_validate_loop(attr, value, templar)
        self.assertEqual(result, value)

    def test_private_methods(self):
        task = Task()
        self.assertRaises(AnsibleError, task._Task__private_method, 'test')

    def test_protected_methods(self):
        task = Task()
        self.assertRaises(AnsibleError, task._merge_kv, None)

    def test_magic_methods(self):
        task = Task()
        self.assertEqual(task.__str__(), 'TASK: ')
        self.assertEqual(task.__repr__(), 'TASK: ')

if __name__ == '__main__':
    unittest.main()