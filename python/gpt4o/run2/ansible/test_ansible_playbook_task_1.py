from ansible.playbook.task import LoopControl
import unittest
from ansible.playbook.task import Task
from ansible.errors import AnsibleError, AnsibleParserError, AnsibleAssertionError
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping
from ansible.utils.collection_loader import AnsibleCollectionConfig


class TestTask(unittest.TestCase):
    def setUp(self):
        self.task = Task()

    def test_init(self):
        task = Task(block='block', role='role', task_include='task_include')
        self.assertEqual(task._role, 'role')
        self.assertEqual(task._parent, 'task_include')
        self.assertFalse(task.implicit)
        self.assertIsNone(task.resolved_action)

    def test_get_name_with_role_and_name(self):
        self.task._role = type('Role', (object,), {'get_name': lambda self, include_role_fqcn: 'role_name'})()
        self.task.name = 'task_name'
        result = self.task.get_name()
        self.assertEqual(result, 'role_name : task_name')

    def test_get_name_with_name_only(self):
        self.task.name = 'task_name'
        result = self.task.get_name()
        self.assertEqual(result, 'task_name')

    def test_get_name_with_role_only(self):
        self.task._role = type('Role', (object,), {'get_name': lambda self, include_role_fqcn: 'role_name'})()
        self.task.action = 'task_action'
        result = self.task.get_name()
        self.assertEqual(result, 'role_name : task_action')

    def test_get_name_with_action_only(self):
        self.task.action = 'task_action'
        result = self.task.get_name()
        self.assertEqual(result, 'task_action')

    def test_merge_kv_with_none(self):
        result = self.task._merge_kv(None)
        self.assertEqual(result, '')

    def test_merge_kv_with_string(self):
        result = self.task._merge_kv('string')
        self.assertEqual(result, 'string')

    def test_merge_kv_with_dict(self):
        result = self.task._merge_kv({'key1': 'value1', 'key2': 'value2'})
        self.assertEqual(result, 'key1=value1 key2=value2')

    def test_load(self):
        data = {}
        result = Task.load(data, variable_manager=variable_manager, loader=loader)
        self.assertIsInstance(result, Task)

    def test_repr_with_meta_action(self):
        self.task.get_name = lambda: 'meta'
        self.task.args = {'_raw_params': 'params'}
        result = self.task.__repr__()
        self.assertEqual(result, 'TASK: meta (params)')

    def test_repr_with_normal_action(self):
        self.task.get_name = lambda: 'normal'
        result = self.task.__repr__()
        self.assertEqual(result, 'TASK: normal')

    def test_preprocess_with_loop(self):
        ds = {}
        new_ds = {}
        with self.assertRaises(AnsibleError):
            self.task._preprocess_with_loop(ds, new_ds, 'with_items', None)

    def test_preprocess_data_with_invalid_ds(self):
        with self.assertRaises(AnsibleAssertionError):
            self.task.preprocess_data([])

    def test_preprocess_data_with_valid_ds(self):
        ds = {'action': 'test_action'}
        result = self.task.preprocess_data(ds)
        self.assertIsInstance(result, AnsibleMapping)

    def test_load_loop_control_with_invalid_ds(self):
        with self.assertRaises(AnsibleParserError):
            self.task._load_loop_control('attr', [])

    def test_load_loop_control_with_valid_ds(self):
        ds = {}
        result = self.task._load_loop_control('attr', ds)
        self.assertIsInstance(result, LoopControl)

    def test_validate_attributes(self):
        ds = {}
        with self.assertRaises(AnsibleParserError):
            self.task._validate_attributes(ds)

    def test_post_validate(self):
        templar = None
        self.task._parent = type('Parent', (object,), {'post_validate': lambda self, templar: None})()
        self.task.post_validate(templar())
        self.assertIsNone(self.task._parent.post_validate(templar))

    def test_post_validate_loop(self):
        result = self.task._post_validate_loop('attr', 'value', 'templar')
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()