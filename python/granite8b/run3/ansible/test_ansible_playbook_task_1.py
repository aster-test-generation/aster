import unittest
from ansible.module_utils.common.yaml import AnsibleYAMLLoader


class TestTask(unittest.TestCase):
    def test_get_name(self):
        task = Task()
        task.name = 'test_task'
        self.assertEqual(task.get_name(), 'test_task')
        task._role = 'test_role'
        self.assertEqual(task.get_name(), 'test_role : test_task')

    def test_load(self):
        task = Task.load({'action': 'test_action', 'args': {'test_arg': 'test_value'}})
        self.assertEqual(task.action, 'test_action')
        self.assertEqual(task.args['test_arg'], 'test_value')

    def test_preprocess_data(self):
        task = Task()
        ds = {'action': 'test_action', 'args': {'test_arg': 'test_value'}, 'vars': {'test_var': 'test_value'}}
        task.preprocess_data(ds)
        self.assertEqual(task.action, 'test_action')
        self.assertEqual(task.args['test_arg'], 'test_value')
        self.assertEqual(task.vars['test_var'], 'test_value')

    def test_post_validate(self):
        task = Task()
        task.post_validate(None)

if __name__ == '__main__':
    unittest.main()