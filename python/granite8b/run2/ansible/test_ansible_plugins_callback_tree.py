import unittest
from ansible.plugins.callback import tree


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        self.assertEqual(callback.tree, "~/.ansible/tree")

    def test_write_tree_file(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        callback.write_tree_file("hostname", "buf")

    def test_result_to_tree(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        result._host.get_name.return_value = "hostname"
        result._result = "result"
        callback.result_to_tree(result)

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        result._host.get_name.return_value = "hostname"
        result._result = "result"
        callback.v2_runner_on_ok(result)

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        result._host.get_name.return_value = "hostname"
        result._result = "result"
        callback.v2_runner_on_failed(result)

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        result._host.get_name.return_value = "hostname"
        result._result = "result"
        callback.v2_runner_on_unreachable(result)

if __name__ == '__main__':
    unittest.main()