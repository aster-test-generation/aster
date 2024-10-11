from ansible.playbook.task import LoopControl
import unittest
from ansible.playbook.task import Task
from ansible.errors import AnsibleError, AnsibleParserError, AnsibleAssertionError
from ansible.playbook.role import Role
from ansible.playbook.block import Block
from ansible.parsing.yaml.objects import AnsibleBaseYAMLObject, AnsibleMapping
from ansible.utils.collection_loader import AnsibleCollectionConfig
from ansible.parsing.mod_args import ModuleArgsParser


class TestTask(unittest.TestCase):
    def setUp(self):
        self.block = Block()
        self.role = Role()
        self.task_include = None
        self.task = Task(block=self.block, role=self.role, task_include=self.task_include)

    def test_init(self):
        self.assertIsInstance(self.task, Task)
        self.assertEqual(self.task._role, self.role)
        self.assertEqual(self.task._parent, self.block)
        self.assertFalse(self.task.implicit)
        self.assertIsNone(self.task.resolved_action)

    def test_get_name_with_role_and_name(self):
        self.task.name = "test_name"
        self.role.get_name = lambda include_role_fqcn: "test_role"
        result = self.task.get_name()
        self.assertEqual(result, "test_role : test_name")

    def test_get_name_with_name_only(self):
        self.task.name = "test_name"
        self.task._role = None
        result = self.task.get_name()
        self.assertEqual(result, "test_name")

    def test_get_name_with_role_only(self):
        self.task.name = None
        self.task.action = "test_action"
        self.role.get_name = lambda include_role_fqcn: "test_role"
        result = self.task.get_name()
        self.assertEqual(result, "test_role : test_action")

    def test_get_name_with_action_only(self):
        self.task.name = None
        self.task._role = None
        self.task.action = "test_action"
        result = self.task.get_name()
        self.assertEqual(result, "test_action")

    def test_merge_kv_with_none(self):
        result = self.task._merge_kv(None)
        self.assertEqual(result, '')

    def test_merge_kv_with_string(self):
        result = self.task._merge_kv("test_string")
        self.assertEqual(result, "test_string")

    def test_merge_kv_with_dict(self):
        result = self.task._merge_kv({"key1": "value1", "key2": "value2"})
        self.assertEqual(result, "key1=value1 key2=value2")

    def test_load(self):
        data = {"name": "test_task"}
        result = Task.load(data, variable_manager=variable_manager, loader=loader)
        self.assertIsInstance(result, Task)

    def test_repr(self):
        self.task.get_name = lambda: "test_task"
        result = self.task.__repr__()
        self.assertEqual(result, "TASK: test_task")

    def test_preprocess_with_loop(self):
        ds = {}
        new_ds = {}
        k = "with_items"
        v = ["item1", "item2"]
        self.task._preprocess_with_loop(ds, new_ds, k, v)
        self.assertEqual(new_ds['loop_with'], "items")
        self.assertEqual(new_ds['loop'], v)

    def test_preprocess_data_with_invalid_ds(self):
        with self.assertRaises(AnsibleAssertionError):
            self.task.preprocess_data([])

    def test_preprocess_data_with_valid_ds(self):
        ds = {"name": "test_task"}
        result = self.task.preprocess_data(ds, module_name='ansible.builtin.command')
        self.assertIsInstance(result, AnsibleMapping)

    def test_load_loop_control_with_invalid_ds(self):
        with self.assertRaises(AnsibleParserError):
            self.task._load_loop_control("loop_control", [])

    def test_load_loop_control_with_valid_ds(self):
        ds = {"loop_control": {}}
        result = self.task._load_loop_control("loop", ds)
        self.assertIsInstance(result, LoopControl)

    def test_validate_attributes(self):
        ds = {"name": "test_task"}
        self.task._validate_attributes(ds)

    def test_post_validate(self):
        templar = None
        self.task.post_validate(templar())

    def test_post_validate_with_parent(self):
        self.task._parent = self.task
        templar = None
        self.task.post_validate(templar, recursion_depth=0)

    def test_post_validate_loop(self):
        attr = "loop"
        value = "test_value"
        templar = None
        result = self.task._post_validate_loop(attr, value, templar)
        self.assertEqual(result, value)

if __name__ == '__main__':
    unittest.main()