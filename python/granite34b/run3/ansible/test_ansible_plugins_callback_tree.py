import unittest
from ansible.plugins.callback.tree import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_set_options(self):
        self.callback.set_options(var_options={'directory': '/tmp/tree'}, loader=None)
        self.assertEqual(self.callback.tree, '/tmp/tree')

    def test_write_tree_file(self):
        self.callback.tree = '/tmp/tree'
        self.callback.write_tree_file('host1', '{"key": "value"}')
        with open('/tmp/tree/host1', 'r') as f:
            self.assertEqual(f.read(), '{"key": "value"}')

    def test_result_to_tree(self):
        result = {'_host': 'host1', '_result': {'key': 'value'}}
        self.callback.tree = '/tmp/tree'
        self.callback.result_to_tree(result._host)
        with open('/tmp/tree/host1', 'r') as f:
            self.assertEqual(f.read(), '{"key": "value"}')

    def test_v2_runner_on_ok(self):
        result = {'_host': 'host1', '_result': {'key': 'value'}}
        self.callback.tree = '/tmp/tree'
        self.callback.v2_runner_on_ok(result._result)
        with open('/tmp/tree/host1', 'r') as f:
            self.assertEqual(f.read(), '{"key": "value"}')

    def test_v2_runner_on_failed(self):
        result = {'_host': 'host1', '_result': {'key': 'value'}}
        self.callback.tree = '/tmp/tree'
        self.callback.v2_runner_on_ok(result)
        with open('/tmp/tree/host1', 'r') as f:
            self.assertEqual(f.read(), '{"key": "value"}')

    def test_v2_runner_on_unreachable(self):
        result = {'_host': 'host1', '_result': {'key': 'value'}}
        self.callback.tree = '/tmp/tree'
        self.callback.v2_runner_on_unreachable(result._host, result)
        with open('/tmp/tree/host1', 'r') as f:
            self.assertEqual(f.read(), '{"key": "value"}')

if __name__ == '__main__':
    unittest.main()