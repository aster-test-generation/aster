import unittest
from ansible.playbook.task import Task
from ansible.module_utils._text import to_native
from ansible.module_utils.six import iteritems
from ansible.parsing.mod_args import ModuleArgsParser
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping
from ansible.playbook.attribute import FieldAttribute
from ansible.playbook.base import Base
from ansible.playbook.block import Block
from ansible.playbook.collectionsearch import CollectionSearch
from ansible.playbook.conditional import Conditional
from ansible.playbook.loop_control import LoopControl
from ansible.playbook.role import Role
from ansible.playbook.taggable import Taggable
from ansible.utils.collection_loader import AnsibleCollectionConfig
from ansible.utils.display import Display
from ansible.utils.sentinel import Sentinel


class TestTask(unittest.TestCase):
    def test_init(self):
        task = Task(block=None, role=None, task_include=None)
        self.assertEqual(task._role, None)
        self.assertEqual(task._parent, None)
        self.assertFalse(task.implicit)
        self.assertEqual(task.resolved_action, None)

    def test_get_name(self):
        task = Task(block=None, role=None, task_include=None)
        self.assertEqual(task.get_name(), '')
        task._role = Role()
        self.assertEqual(task.get_name(), '')
        task.name = 'test_name'
        self.assertEqual(task.get_name(), 'test_name')
        task._role = Role()
        self.assertEqual(task.get_name(), 'test_name : test_name')
        task._role = Role()
        task.action = 'test_action'
        self.assertEqual(task.get_name(), 'test_action')

    def test_merge_kv(self):
        task = Task(block=None, role=None, task_include=None)
        self.assertEqual(task._merge_kv(None), '')
        self.assertEqual(task._merge_kv('test'), 'test')
        self.assertEqual(task._merge_kv({'test': 'value'}), 'test=value ')

    def test_load(self):
        task = Task(block=None, role=None, task_include=None)
        data = {'test': 'value'}
        self.assertEqual(task.load(data, block=None, role=None, task_include=None, variable_manager=None, loader=None), task)

    def test_repr(self):
        task = Task(block=None, role=None, task_include=None)
        self.assertEqual(task.__repr__(), 'TASK: ')

    def test_preprocess_with_loop(self):
        task = Task(block=None, role=None, task_include=None)
        ds = {'test': 'value'}
        new_ds = AnsibleMapping()
        k = 'with_test'
        v = 'test_value'
        task._preprocess_with_loop(ds, new_ds, k, v)
        self.assertEqual(new_ds.get('loop_with'), 'test')
        self.assertEqual(new_ds.get('loop'), 'test_value')

    def test_preprocess_data(self):
        task = Task(block=None, role=None, task_include=None)
        ds = {'test': 'value'}
        new_ds = AnsibleMapping()
        task.preprocess_data(ds)
        self.assertEqual(new_ds.get('action'), None)
        self.assertEqual(new_ds.get('args'), None)
        self.assertEqual(new_ds.get('delegate_to'), None)

    def test_load_loop_control(self):
        task = Task(block=None, role=None, task_include=None)
        ds = {'test': 'value'}
        self.assertEqual(task._load_loop_control('test', ds), LoopControl())

    def test_validate_attributes(self):
        task = Task(block=None, role=None, task_include=None)
        ds = {'test': 'value'}
        task._validate_attributes(ds)

    def test_post_validate(self):
        task = Task(block=None, role=None, task_include=None)
        templar = None
        task.post_validate(templar)

    def test_post_validate_loop(self):
        task = Task(block=None, role=None, task_include=None)
        attr = 'test'
        value = 'test_value'
        templar = None
        self.assertEqual(task._post_validate_loop(attr, value, templar), value)

if __name__ == '__main__':
    unittest.main()