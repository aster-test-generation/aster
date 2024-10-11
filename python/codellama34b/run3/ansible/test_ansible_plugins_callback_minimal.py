import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_command_generic_msg(self):
        instance = CallbackModule()
        result = instance._command_generic_msg("host", "result", "caption")
        self.assertEqual(result, "host | caption | rc=-1\nresult\n")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = instance.v2_runner_on_failed("result", "ignore_errors")
        self.assertEqual(result, None)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = instance.v2_runner_on_ok("result")
        self.assertEqual(result, None)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = instance.v2_runner_on_skipped("result")
        self.assertEqual(result, None)

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = instance.v2_runner_on_unreachable("result")
        self.assertEqual(result, None)

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        result = instance.v2_on_file_diff("result")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()