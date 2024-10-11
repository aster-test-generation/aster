import unittest
from ansible.plugins.callback import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        cb = CallbackModule()
        cb.set_options(task_keys=None, var_options=None, direct=None)
        self.assertEqual(cb.tree, "~/.ansible/tree")

    def test_write_tree_file(self):
        cb = CallbackModule()
        cb.set_options(task_keys=None, var_options=None, direct=None)
        cb.write_tree_file("hostname", "buf")

    def test_result_to_tree(self):
        cb = CallbackModule()
        cb.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        result._host.get_name.return_value = "hostname"
        cb.result_to_tree(result)

    def test_v2_runner_on_ok(self):
        cb = CallbackModule()
        cb.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        cb.v2_runner_on_ok(result)

    def test_v2_runner_on_failed(self):
        cb = CallbackModule()
        cb.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        cb.v2_runner_on_failed(result)

    def test_v2_runner_on_unreachable(self):
        cb = CallbackModule()
        cb.set_options(task_keys=None, var_options=None, direct=None)
        result = Mock()
        cb.v2_runner_on_unreachable(result)

if __name__ == '__main__':
    unittest.main()