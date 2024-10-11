import unittest
from ansible.plugins.action import set_stats


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule(None, None, None)
        result = action.run()
        self.assertEqual(result['changed'], False)

    def test_data_option(self):
        action = ActionModule(None, None, None)
        action._task.args = {'data': {'foo': 'bar'}}
        result = action.run()
        self.assertEqual(result['ansible_stats']['data']['foo'], 'bar')

    def test_per_host_option(self):
        action = ActionModule(None, None, None)
        action._task.args = {'per_host': True}
        result = action.run()
        self.assertEqual(result['ansible_stats']['per_host'], True)

    def test_aggregate_option(self):
        action = ActionModule(None, None, None)
        action._task.args = {'aggregate': False}
        result = action.run()
        self.assertEqual(result['ansible_stats']['aggregate'], False)

    def test_invalid_data_option(self):
        action = ActionModule(None, None, None)
        action._task.args = {'data': 'foo'}
        result = action.run()
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'data' option needs to be a dictionary/hash")

    def test_invalid_variable_name(self):
        action = ActionModule(None, None, None)
        action._task.args = {'data': {'foo bar': 'baz'}}
        result = action.run()
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The variable name 'foo bar' is not valid. Variables must start with a letter or underscore character, and contain only letters, numbers and underscores.")

if __name__ == '__main__':
    unittest.main()