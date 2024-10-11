import os
import unittest
from ansible.plugins.callback import CallbackModul


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        self.assertEqual(callback.tree, "~/.ansible/tree")

    def test_write_tree_file(self):
        callback = CallbackModule()
        callback.tree = "/path/to/tree"
        callback.write_tree_file("host1", b"some data")
        self.assertTrue(os.path.exists("/path/to/tree/host1"))

    def test_result_to_tree(self):
        callback = CallbackModule()
        result = {"_host": {"get_name": lambda: "host1"}, "_result": "some result"}
        callback.result_to_tree(result)
        self.assertTrue(os.path.exists(callback.tree + "/host1"))

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {"_host": {"get_name": lambda: "host1"}, "_result": "some result"}
        callback.v2_runner_on_ok(result)
        self.assertTrue(os.path.exists(callback.tree + "/host1"))

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {"_host": {"get_name": lambda: "host1"}, "_result": "some result"}
        callback.v2_runner_on_failed(result)
        self.assertTrue(os.path.exists(callback.tree + "/host1"))

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {"_host": {"get_name": lambda: "host1"}, "_result": "some result"}
        callback.v2_runner_on_unreachable(result)
        self.assertTrue(os.path.exists(callback.tree + "/host1"))

    def test_str_method(self):
        callback = CallbackModule()
        self.assertEqual(str(callback), "CallbackModule")

    def test_repr_method(self):
        callback = CallbackModule()
        self.assertEqual(repr(callback), "CallbackModule()")

    def test_eq_method(self):
        callback1 = CallbackModule()
        callback2 = CallbackModule()
        self.assertEqual(callback1, callback2)

if __name__ == '__main__':
    unittest.main()