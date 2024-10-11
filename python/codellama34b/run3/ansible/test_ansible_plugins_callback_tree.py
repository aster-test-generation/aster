import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        instance = CallbackModule()
        instance.set_options()
        self.assertEqual(instance.tree, TREE_DIR)

    def test_write_tree_file(self):
        instance = CallbackModule()
        instance.tree = "test_tree"
        instance.write_tree_file("test_host", "test_buf")
        self.assertEqual(instance.tree, "test_tree")

    def test_result_to_tree(self):
        instance = CallbackModule()
        instance.tree = "test_tree"
        instance.result_to_tree("test_result")
        self.assertEqual(instance.tree, "test_tree")

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        instance.tree = "test_tree"
        instance.v2_runner_on_ok("test_result")
        self.assertEqual(instance.tree, "test_tree")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        instance.tree = "test_tree"
        instance.v2_runner_on_failed("test_result")
        self.assertEqual(instance.tree, "test_tree")

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        instance.tree = "test_tree"
        instance.v2_runner_on_unreachable("test_result")
        self.assertEqual(instance.tree, "test_tree")

if __name__ == '__main__':
    unittest.main()