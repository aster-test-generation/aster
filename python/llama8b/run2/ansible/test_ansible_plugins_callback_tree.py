import os
import unittest
from ansible.module_utils.basic import AnsibleModul


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        self.assertEqual(callback.tree, callback.get_option('directory'))

    def test_write_tree_file(self):
        callback = CallbackModule()
        callback.tree = '/path/to/tree'
        buf = b'Hello, world!'
        callback.write_tree_file('example.com', buf)
        self.assertTrue(os.path.exists('/path/to/tree/example.com'))

    def test_result_to_tree(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'example.com'}, '_result': {'status': 'ok'}}
        callback.result_to_tree(result)
        self.assertTrue(os.path.exists('/path/to/tree/example.com'))

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'example.com'}, '_result': {'status': 'ok'}}
        callback.v2_runner_on_ok(result)
        self.assertTrue(os.path.exists('/path/to/tree/example.com'))

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'example.com'}, '_result': {'status': 'failed'}}
        callback.v2_runner_on_failed(result)
        self.assertTrue(os.path.exists('/path/to/tree/example.com'))

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'example.com'}, '_result': {'status': 'unreachable'}}
        callback.v2_runner_on_unreachable(result)
        self.assertTrue(os.path.exists('/path/to/tree/example.com'))

    def test_str_method(self):
        callback = CallbackModule()
        self.assertEqual(str(callback), 'CallbackModule')

    def test_repr_method(self):
        callback = CallbackModule()
        self.assertEqual(repr(callback), 'CallbackModule()')

    def test_eq_method(self):
        callback1 = CallbackModule()
        callback2 = CallbackModule()
        self.assertEqual(callback1, callback2)

    def test_init_method(self):
        callback = CallbackModule()
        self.assertEqual(callback.CALLBACK_VERSION, 2.0)
        self.assertEqual(callback.CALLBACK_TYPE, 'aggregate')
        self.assertEqual(callback.CALLBACK_NAME, 'tree')
        self.assertEqual(callback.CALLBACK_NEEDS_ENABLED, True)

if __name__ == '__main__':
    unittest.main()