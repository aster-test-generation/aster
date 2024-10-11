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
        self.templar = MagicMock()
        self.templar.template = MagicMock(side_effect=lambda x, convert_bare: x)
        self.task = Task(block=self.block, role=self.role, task_include=self.task_include)

    def test_init(self):
        task = Task(block=self.block, role=self.role, task_include=self.task_include)
        self.assertEqual(task._role, self.role)
        self.assertEqual(task._parent, self.task_include)
        self.assertFalse(task.implicit)
        self.assertIsNone(task.resolved_action)

    def test_post_validate_environment(self):
        result = self.task._post_validate_environment('attr', {'key': 'value'}, self.templar)
        self.assertEqual(result, {'key': 'value'})

    def test_post_validate_changed_when(self):
        result = self.task._post_validate_changed_when('attr', 'value', self.templar)
        self.assertEqual(result, 'value')

    def test_post_validate_failed_when(self):
        result = self.task._post_validate_failed_when('attr', 'value', self.templar)
        self.assertEqual(result, 'value')

    def test_post_validate_until(self):
        result = self.task._post_validate_until('attr', 'value', self.templar)
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
        self.assertIsNotNone(new_task._parent)
        self.assertEqual(new_task._role, self.role)
        self.assertFalse(new_task.implicit)
        self.assertIsNone(new_task.resolved_action)

    def test_serialize(self):
        self.task._squashed = False
        self.task._finalized = False
        result = self.task.serialize()
        self.assertIn('parent', result)
        self.assertIn('role', result)
        self.assertIn('implicit', result)
        self.assertIn('resolved_action', result)

    def test_deserialize(self):
        data = {
            'parent': {'key': 'value'},
            'parent_type': 'Block',
            'role': {'key': 'value'},
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
        self.task._valid_attrs = {'attr': MagicMock(extend=True, prepend=False)}
        self.task._attributes = {'attr': 'value'}
        self.task._parent = MagicMock(statically_loaded=True, _get_parent_attribute=MagicMock(return_value='parent_value'))
        result = self.task._get_parent_attribute('attr')
        self.assertEqual(result, ['value', 'parent_value'])

    def test_all_parents_static(self):
        self.task._parent = MagicMock(all_parents_static=MagicMock(return_value=True))
        result = self.task.all_parents_static()
        self.assertTrue(result)

    def test_get_first_parent_include(self):
        self.task._parent = TaskInclude()
        result = self.task.get_first_parent_include()
        self.assertIsInstance(result, TaskInclude)

if __name__ == '__main__':
    unittest.main()