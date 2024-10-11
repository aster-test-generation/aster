import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        instance = CallbackModule()
        instance.set_options()
        self.assertEqual(instance.tree, TREE_DIR)

    def test_write_tree_file(self):
        instance = CallbackModule()
        instance.write_tree_file("hostname", "buf")
        self.assertEqual(instance.tree, TREE_DIR)

    def test_result_to_tree(self):
        instance = CallbackModule()
        instance.result_to_tree("result")
        self.assertEqual(instance.tree, TREE_DIR)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        instance.v2_runner_on_ok("result")
        self.assertEqual(instance.tree, TREE_DIR)

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        instance.v2_runner_on_failed("result")
        self.assertEqual(instance.tree, TREE_DIR)

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        instance.v2_runner_on_unreachable("result")
        self.assertEqual(instance.tree, TREE_DIR)

if __name__ == '__main__':
    unittest.main()