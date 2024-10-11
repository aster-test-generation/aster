import os
import unittest
from ansible.plugins.callback import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test___init__(self):
        instance = CallbackModule()
        self.assertIsInstance(instance, CallbackModule)

    def test_set_options(self):
        instance = CallbackModule()
        instance.set_options(task_keys=None, var_options=None, direct=None)
        self.assertIsNotNone(instance.tree)

    def test_write_tree_file(self):
        instance = CallbackModule()
        instance.tree = '/tmp/test_tree'
        hostname = 'test_host'
        buf = b'test_data'
        instance.write_tree_file(hostname, buf)
        path = os.path.join(instance.tree, hostname)
        self.assertTrue(os.path.exists(path))
        with open(path, 'rb') as fd:
            self.assertEqual(fd.read(), buf)

    def test_result_to_tree(self):
        instance = CallbackModule()
        instance.tree = '/tmp/test_tree'
        result = {'_host': {'get_name': lambda: 'test_host'}, '_result': {'test_key': 'test_value'}}
        instance.result_to_tree(result)
        path = os.path.join(instance.tree, 'test_host')
        self.assertTrue(os.path.exists(path))
        with open(path, 'rb') as fd:
            self.assertEqual(fd.read(), b'{"test_key": "test_value"}')

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        instance.tree = '/tmp/test_tree'
        result = {'_host': {'get_name': lambda: 'test_host'}, '_result': {'test_key': 'test_value'}}
        instance.v2_runner_on_ok(result)
        path = os.path.join(instance.tree, 'test_host')
        self.assertTrue(os.path.exists(path))
        with open(path, 'rb') as fd:
            self.assertEqual(fd.read(), b'{"test_key": "test_value"}')

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        instance.tree = '/tmp/test_tree'
        result = {'_host': {'get_name': lambda: 'test_host'}, '_result': {'test_key': 'test_value'}}
        instance.v2_runner_on_failed(result)
        path = os.path.join(instance.tree, 'test_host')
        self.assertTrue(os.path.exists(path))
        with open(path, 'rb') as fd:
            self.assertEqual(fd.read(), b'{"test_key": "test_value"}')

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        instance.tree = '/tmp/test_tree'
        result = {'_host': {'get_name': lambda: 'test_host'}, '_result': {'test_key': 'test_value'}}
        instance.v2_runner_on_unreachable(result)
        path = os.path.join(instance.tree, 'test_host')
        self.assertTrue(os.path.exists(path))
        with open(path, 'rb') as fd:
            self.assertEqual(fd.read(), b'{"test_key": "test_value"}')

    def test__display(self):
        instance = CallbackModule()
        instance._display = lambda x: x
        self.assertEqual(instance._display('test_message'), 'test_message')

    def test_get_option(self):
        instance = CallbackModule()
        instance.get_option = lambda x: x
        self.assertEqual(instance.get_option('directory'), 'directory')

    def test___str__(self):
        instance = CallbackModule()
        self.assertEqual(str(instance), 'tree')

    def test___repr__(self):
        instance = CallbackModule()
        self.assertEqual(repr(instance), 'tree()')

if __name__ == '__main__':
    unittest.main()