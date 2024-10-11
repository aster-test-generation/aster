import unittest
from ansible.playbook.task import Task
from ansible.playbook.block import Block
from ansible.playbook.role import Role
from ansible.playbook.task_include import TaskInclude
from ansible.playbook.handler_task_include import HandlerTaskInclude
from ansible.utils.sentinel import Sentinel
from ansible import constants as C
from unittest.mock import MagicMock


class TestTask(unittest.TestCase):
    def setUp(self):
        self.block = Block()
        self.role = Role()
        self.task_include = TaskInclude()
        self.instance = Task(block=self.block, role=self.role, task_include=self.task_include)

    def test_init(self):
        self.assertIsInstance(self.instance, Task)
        self.assertEqual(self.instance._role, self.role)
        self.assertEqual(self.instance._parent, self.task_include)
        self.assertFalse(self.instance.implicit)
        self.assertIsNone(self.instance.resolved_action)

    def test_post_validate_environment(self):
        templar = MagicMock()
        templar.template = MagicMock(return_value="templated_value")
        result = self.instance._post_validate_environment("attr", {"key": "value"}, templar)
        self.assertEqual(result, {"key": "templated_value"})

    def test_post_validate_changed_when(self):
        result = self.instance._post_validate_changed_when("attr", "value", None)
        self.assertEqual(result, "value")

    def test_post_validate_failed_when(self):
        result = self.instance._post_validate_failed_when("attr", "value", None)
        self.assertEqual(result, "value")

    def test_post_validate_until(self):
        result = self.instance._post_validate_until("attr", "value", None)
        self.assertEqual(result, "value")

    def test_get_vars(self):
        self.instance.vars = {"var1": "value1", "tags": "tag_value", "when": "when_value"}
        result = self.instance.get_action_vars()
        self.assertNotIn("tags", result)
        self.assertNotIn("when", result)
        self.assertIn("var1", result)

    def test_get_include_params(self):
        self.instance.vars = {"var1": "value1"}
        self.instance.action = C._ACTION_ALL_INCLUDES[0]
        result = self.instance.get_include_params
        self.assertIn("var1", result)

    def test_copy(self):
        new_instance = self.instance.copy()
        self.assertIsInstance(new_instance, Task)
        self.assertIsNotNone(new_instance._parent)
        self.assertEqual(new_instance._role, self.role)
        self.assertEqual(new_instance.implicit, self.instance.implicit)
        self.assertEqual(new_instance.resolved_action, self.instance.resolved_action)

    def test_serialize(self):
        self.instance._squashed = False
        self.instance._finalized = False
        result = self.instance.serialize()
        self.assertIn("parent", result)
        self.assertIn("role", result)
        self.assertIn("implicit", result)
        self.assertIn("resolved_action", result)

    def test_deserialize(self):
        data = {
            "parent": {"some": "data"},
            "parent_type": "Block",
            "role": {"role_data": "data"},
            "implicit": True,
            "resolved_action": "some_action"
        }
        self.instance.deserialize(data)
        self.assertIsInstance(self.instance._parent, Block)
        self.assertIsInstance(self.instance._role, Role)
        self.assertTrue(self.instance.implicit)
        self.assertEqual(self.instance.resolved_action, "some_action")

    def test_set_loader(self):
        loader = MagicMock()
        self.instance.set_loader(loader)
        self.assertEqual(self.instance._loader, loader)

    def test_get_parent_attribute(self):
        self.instance._valid_attrs = {"attr": MagicMock(extend=True, prepend=False)}
        self.instance._attributes = {"attr": "value"}
        self.instance._parent = MagicMock(_attributes={"attr": "parent_value"})
        result = self.instance._get_parent_attribute("attr")
        self.assertEqual(result, ['value', mock._get_parent_attribute()])

    def test_all_parents_static(self):
        self.instance._parent = MagicMock(all_parents_static=MagicMock(return_value=True))
        result = self.instance.all_parents_static()
        self.assertTrue(result)

    def test_get_first_parent_include(self):
        self.instance._parent = TaskInclude()
        result = self.instance.get_first_parent_include()
        self.assertIsInstance(result, TaskInclude)

if __name__ == '__main__':
    unittest.main()