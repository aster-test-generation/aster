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
            self.assertEqual(instance._command_generic_msg("result", "result", "FAILED"), "result | FAILED! => result\n")
        else:
            self.assertEqual(instance._dump_results("result", indent=4), "result")

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        instance._clean_results("result", "action")
        instance._handle_warnings("result")
        if "changed" in "result":
            self.assertEqual(instance._command_generic_msg("result", "result", "CHANGED"), "result | CHANGED => result\n")
        else:
            self.assertEqual(instance._command_generic_msg("result", "result", "SUCCESS"), "result | SUCCESS => result\n")

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        self.assertEqual(instance._command_generic_msg("result", "result", "SKIPPED"), "result | SKIPPED\n")

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        self.assertEqual(instance._command_generic_msg("result", "result", "UNREACHABLE!"), "result | UNREACHABLE! => result\n")

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        if "diff" in "result" and "result":
            self.assertEqual(instance._get_diff("result"), "result")


if __name__ == '__main__':
    unittest.main()