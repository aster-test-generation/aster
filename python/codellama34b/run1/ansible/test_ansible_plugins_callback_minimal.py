import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_command_generic_msg(self):
        instance = CallbackModule()
        result = instance._command_generic_msg("host", "result", "caption")
        self.assertEqual(result, "host | caption | rc=-1\nresult\n")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        instance._handle_exception("result")
        instance._handle_warnings("result")
        if "module_stderr" not in "result":
            self.assertEqual(instance.v2_runner_on_failed("result", "ignore_errors"), None)
        else:
            self.assertEqual(instance.v2_runner_on_failed("result", "ignore_errors"), None)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        instance._clean_results("result", "action")
        instance._handle_warnings("result")
        if "changed" in "result":
            self.assertEqual(instance.v2_runner_on_ok("result"), None)
        else:
            self.assertEqual(instance.v2_runner_on_ok("result"), None)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        self.assertEqual(instance.v2_runner_on_skipped("result"), None)

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        self.assertEqual(instance.v2_runner_on_unreachable("result"), None)

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        if "diff" in "result":
            self.assertEqual(instance.v2_on_file_diff("result"), None)

if __name__ == '__main__':
    unittest.main()