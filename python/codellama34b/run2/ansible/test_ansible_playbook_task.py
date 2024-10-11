import unittest
from ansible.playbook.task import Task



class TestTask(unittest.TestCase):
    def test_init(self):
        block = Block()
        role = Role()
        task_include = TaskInclude()
        task = Task(block, role, task_include)
        self.assertEqual(task._role, role)
        self.assertEqual(task._parent, task_include)
        self.assertEqual(task.implicit, False)
        self.assertEqual(task.resolved_action, None)

    def test_get_vars(self):
        block = Block()
        block.vars = {'var1': 'value1'}
        role = Role()
        role.vars = {'var2': 'value2'}
        task_include = TaskInclude()
        task_include.vars = {'var3': 'value3'}
        task = Task(block, role, task_include)
        self.assertEqual(task.get_vars(), {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'})

    def test_get_include_params(self):
        block = Block()
        block.vars = {'var1': 'value1'}
        role = Role()
        role.vars = {'var2': 'value2'}
        task_include = TaskInclude()
        task_include.vars = {'var3': 'value3'}
        task = Task(block, role, task_include)
        self.assertEqual(task.get_include_params(), {'var1': 'value1', 'var2': 'value2', 'var3': 'value3'})

    def test_copy(self):
        block = Block()
        block.vars = {'var1': 'value1'}
        role = Role()
        role.vars = {'var2': 'value2'}
        task_include = TaskInclude()
        task_include.vars = {'var3': 'value3'}
        task = Task(block, role, task_include)
        new_task = task.copy()
        self.assertEqual(new_task._parent, task_include)
        self.assertEqual(new_task._role, role)
        self.assertEqual(new_task.implicit, False)
        self.assertEqual(new_task.resolved_action, None)

    def test_serialize(self):
        block = Block()
        block.vars = {'var1': 'value1'}
        role = Role()
        role.vars = {'var2': 'value2'}
        task_include = TaskInclude()
        task_include.vars = {'var3': 'value3'}
        task = Task(block, role, task_include)
        task.implicit = True
        task.resolved_action = 'action'
        data = task.serialize()
        self.assertEqual(data['parent'], {'vars': {'var1': 'value1'}})
        self.assertEqual(data['role'], {'vars': {'var2': 'value2'}})
        self.assertEqual(data['implicit'], True)
        self.assertEqual(data['resolved_action'], 'action')

    def test_deserialize(self):
        block = Block()
        block.vars = {'var1': 'value1'}
        role = Role()
        role.vars = {'var2': 'value2'}
        task_include = TaskInclude()
        task_include.vars = {'var3': 'value3'}
        task = Task(block, role, task_include)
        task.implicit = True
        task.resolved_action = 'action'
        data = task.serialize()
        new_task = Task()
        new_task.deserialize(data)
        self.assertEqual(new_task._parent, task_include)
        self.assertEqual(new_task._role, role)
        self.assertEqual(new_task.implicit, True)
        self.assertEqual(new_task.resolved_action, 'action')

if __name__ == '__main__':
    unittest.main()