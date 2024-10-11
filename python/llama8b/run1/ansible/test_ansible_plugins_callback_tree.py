import unittest
from ansible.plugins.callback.core import CallbackModul


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        self.assertEqual(callback.tree, callback.get_option('directory'))

    def test_write_tree_file(self):
        callback = CallbackModule()
        callback.tree = '/path/to/tree'
        buf = b'Hello, world!'
        callback.write_tree_file('host1', buf)
        self.assertTrue(os.path.exists('/path/to/tree/host1'))
        with open('/path/to/tree/host1', 'rb') as fd:
            self.assertEqual(fd.read(), buf)

    def test_result_to_tree(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host1'}, '_result': {'key': 'value'}}
        callback.result_to_tree(result)
        self.assertTrue(os.path.exists(callback.tree + '/host1'))
        with open(callback.tree + '/host1', 'rb') as fd:
            self.assertEqual(fd.read(), callback._dump_results(result._result).encode())

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host1'}, '_result': {'key': 'value'}}
        callback.v2_runner_on_ok(result)
        self.assertTrue(os.path.exists(callback.tree + '/host1'))
        with open(callback.tree + '/host1', 'rb') as fd:
            self.assertEqual(fd.read(), callback._dump_results(result._result).encode())

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host1'}, '_result': {'key': 'value'}}
        callback.v2_runner_on_failed(result)
        self.assertTrue(os.path.exists(callback.tree + '/host1'))
        with open(callback.tree + '/host1', 'rb') as fd:
            self.assertEqual(fd.read(), callback._dump_results(result._result).encode())

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host1'}, '_result': {'key': 'value'}}
        callback.v2_runner_on_unreachable(result)
        self.assertTrue(os.path.exists(callback.tree + '/host1'))
        with open(callback.tree + '/host1', 'rb') as fd:
            self.assertEqual(fd.read(), callback._dump_results(result._result).encode())

    def test_get_option(self):
        callback = CallbackModule()
        self.assertEqual(callback.get_option('directory'), callback.tree)

    def test_dump_results(self):
        callback = CallbackModule()
        result = {'key': 'value'}
        self.assertEqual(callback._dump_results(result), str(result))

    def test_display_warning(self):
        callback = CallbackModule()
        callback._display.warning('Warning message')
        self.assertTrue(True)

if __name__ == '__main__':
    unittest.main()