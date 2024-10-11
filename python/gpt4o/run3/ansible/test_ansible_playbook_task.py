import unittest
from unittest.mock import MagicMock, patch
from ansible.playbook.task import Task
from ansible.playbook.block import Block
from ansible.playbook.role import Role
from ansible.playbook.task_include import TaskInclude
from ansible.playbook.handler_task_include import HandlerTaskInclude
from ansible.utils.sentinel import Sentinel


class TestTask(unittest.TestCase):

    def setUp(self):
        self.block = Block()
        self.role = Role()
        self.task_include = TaskInclude()
        self.task = Task(block=self.block, role=self.role, task_include=self.task_include)

    def test_init(self):
        self.assertIsInstance(self.task, Task)
        self.assertEqual(self.task._role, self.role)
        self.assertEqual(self.task._parent, self.task_include)
        self.assertFalse(self.task.implicit)
        self.assertIsNone(self.task.resolved_action)

    def test_post_validate_environment(self):
        templar = MagicMock()
        templar.template = MagicMock(side_effect=lambda x, convert_bare: x)
        result = self.task._post_validate_environment('attr', {'key': 'value'}, templar)
        self.assertEqual(result, {'key': 'value'})

    def test_post_validate_changed_when(self):
        result = self.task._post_validate_changed_when('attr', 'value', None)
        self.assertEqual(result, 'value')

    def test_post_validate_failed_when(self):
        result = self.task._post_validate_failed_when('attr', 'value', None)
        self.assertEqual(result, 'value')

    def test_post_validate_until(self):
        result = self.task._post_validate_until('attr', 'value', None)
        self.assertEqual(result, 'value')

    def test_get_vars(self):
        self.task.vars = {'var1': 'value1', 'tags': 'tag1', 'when': 'condition'}
        result = self.task.get_action_vars()
        self.assertEqual(result, {'var1': 'value1'})

    def test_get_include_params(self):
        self.task.vars = {'var1': 'value1'}
        self.task.action = 'include'
        result = self.task.get_action_params()
        self.assertEqual(result, {'var1': 'value1'})

    def test_copy(self):
        new_task = self.task.copy()
        self.assertIsInstance(new_task, Task)
        self.assertIsNotNone(new_task._parent)
        self.assertEqual(new_task._role, self.role)
        self.assertFalse(new_task.implicit)
        self.assertIsNone(new_task.resolved_action)

    def test_serialize(self):
        self.task._squashed = False
        self.task._finalized = False
        data = self.task.serialize()
        self.assertIn('parent', data)
        self.assertIn('role', data)
        self.assertIn('implicit', data)
        self.assertIn('resolved_action', data)

    def test_deserialize(self):
        data = {
            'parent': {'some': 'data'},
            'parent_type': 'Block',
            'role': {'role_data': 'data'},
            'implicit': True,
            'resolved_action': 'action'
        }
        self.task.deserialize(data)
        self.assertIsInstance(self.task._parent, Block)
        self.assertIsInstance(self.task._role, Role)
        self.assertTrue(self.task.implicit)
        self.assertEqual(self.task.resolved_action, 'action')

    def test_set_loader(self):
        loader = MagicMock()
        self.task.set_loader(loader)
        self.assertEqual(self.task._loader, loader)

    def test_get_parent_attribute(self):
        self.task._valid_attrs = {'attr': MagicMock(extend=False, prepend=False)}
        self.task._attributes = {'attr': 'value'}
        result = self.task._get_parent_attribute('attr')
        self.assertEqual(result, 'value')

    def test_all_parents_static(self):
        self.task._parent = MagicMock()
        self.task._parent.all_parents_static = MagicMock(return_value=True)
        result = self.task.all_parents_static()
        self.assertTrue(result)

    def test_get_first_parent_include(self):
        self.task._parent = MagicMock()
        self.task._parent.get_first_parent_include = MagicMock(return_value=self.task_include)
        result = self.task.get_first_parent_include()
        self.assertEqual(result, self.task_include)

if __name__ == '__main__':
    unittest.main()