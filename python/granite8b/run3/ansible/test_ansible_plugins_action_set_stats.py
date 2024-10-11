import unittest
from ansible.plugins.action import set_stats


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule(None, None, None)
        result = action.run(None, None)
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['ansible_stats']['data'], {})
        self.assertEqual(result['ansible_stats']['per_host'], False)
        self.assertEqual(result['ansible_stats']['aggregate'], True)

    def test_run_with_data(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'data': {'foo': 'bar'}})
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['ansible_stats']['data'], {'foo': 'bar'})
        self.assertEqual(result['ansible_stats']['per_host'], False)
        self.assertEqual(result['ansible_stats']['aggregate'], True)

    def test_run_with_per_host(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'per_host': True})
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['ansible_stats']['data'], {})
        self.assertEqual(result['ansible_stats']['per_host'], True)
        self.assertEqual(result['ansible_stats']['aggregate'], True)

    def test_run_with_aggregate(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'aggregate': False})
        self.assertEqual(result['changed'], False)
        self.assertEqual(result['ansible_stats']['data'], {})
        self.assertEqual(result['ansible_stats']['per_host'], False)
        self.assertEqual(result['ansible_stats']['aggregate'], False)

    def test_run_with_invalid_data(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'data': 'foo'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'data' option needs to be a dictionary/hash")

    def test_run_with_invalid_per_host(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'per_host': 'foo'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'per_host' option needs to be a boolean")

    def test_run_with_invalid_aggregate(self):
        action = ActionModule(None, None, None)
        result = action.run(None, {'aggregate': 'foo'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "The 'aggregate' option needs to be a boolean")

if __name__ == '__main__':
    unittest.main()