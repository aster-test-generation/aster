import unittest
from ansible.playbook.task import Task


class TestTask(unittest.TestCase):
    def test_init(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        self.assertEqual(instance._role, role)
        self.assertEqual(instance._parent, task_include)
        self.assertEqual(instance.implicit, False)
        self.assertEqual(instance.resolved_action, None)

    def test_get_vars(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        result = instance.get_vars()
        self.assertEqual(result, {})

    def test_get_include_params(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        result = instance.get_include_params()
        self.assertEqual(result, {})

    def test_copy(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        result = instance.copy()
        self.assertEqual(result._parent, task_include)
        self.assertEqual(result._role, role)
        self.assertEqual(result.implicit, False)
        self.assertEqual(result.resolved_action, None)

    def test_serialize(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        result = instance.serialize()
        self.assertEqual(result['parent'], task_include.serialize())
        self.assertEqual(result['parent_type'], 'TaskInclude')
        self.assertEqual(result['role'], role.serialize())
        self.assertEqual(result['implicit'], False)
        self.assertEqual(result['resolved_action'], None)

    def test_deserialize(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        data = {'parent': task_include.serialize(), 'parent_type': 'TaskInclude', 'role': role.serialize(), 'implicit': False, 'resolved_action': None}
        instance.deserialize(data)
        self.assertEqual(instance._parent, task_include)
        self.assertEqual(instance._role, role)
        self.assertEqual(instance.implicit, False)
        self.assertEqual(instance.resolved_action, None)

    def test_set_loader(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        instance.set_loader(None)

    def test_get_parent_attribute(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        result = instance._get_parent_attribute('vars')
        self.assertEqual(result, {})

    def test_all_parents_static(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        result = instance.all_parents_static()
        self.assertEqual(result, True)

    def test_get_first_parent_include(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        instance = Task(block, role, task_include)
        result = instance.get_first_parent_include()
        self.assertEqual(result, task_include)

if __name__ == '__main__':
    unittest.main()