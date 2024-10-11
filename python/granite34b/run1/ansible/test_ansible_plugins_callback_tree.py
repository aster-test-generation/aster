import unittest
from ansible.plugins.callback.tree import CallbackModule


class TestTreeCallback(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()
        self.callback.tree = "/tmp/ansible_tree"

    def test_set_options(self):
        self.callback.set_options(var_options={"directory": "/tmp/ansible_tree"}, loader=None)
        self.assertEqual(self.callback.tree, "/tmp/ansible_tree")

    def test_write_tree_file(self):
        self.callback.write_tree_file("localhost", "test data")
        with open("/tmp/ansible_tree/localhost", "r") as f:
            self.assertEqual(f.read(), "test data")

    def test_result_to_tree(self):
        result = {"_host": "localhost", "_result": "test result"}
        self.callback.result_to_tree(result)
        with open("/tmp/ansible_tree/localhost", "r") as f:
            self.assertEqual(f.read(), "test result")

    def test_v2_runner_on_ok(self):
        result = {"_host": "localhost", "_result": "test result"}
        self.callback.v2_runner_on_ok(result._result)
        with open("/tmp/ansible_tree/localhost", "r") as f:
            self.assertEqual(f.read(), "test result")

    def test_v2_runner_on_failed(self):
        result = {"_host": "localhost", "_result": "test result"}
        self.callback.v2_runner_on_ok(result)
        with open("/tmp/ansible_tree/localhost", "r") as f:
            self.assertEqual(f.read(), "test result")

if __name__ == '__main__':
    unittest.main()