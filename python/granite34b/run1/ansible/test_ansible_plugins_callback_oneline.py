import unittest
from ansible.plugins.callback.oneline import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_command_generic_msg(self):
        callback = CallbackModule()
        result = {
            'stdout': 'This is a test',
            'stderr': 'This is an error',
            'rc': 0
        }
        hostname = 'testhost'
        caption = 'Test Caption'
        expected_output = 'testhost | Test Caption | rc=0 | (stdout) This is a test (stderr) This is an error'
        actual_output = callback._command_generic_msg(hostname, result, caption)
        self.assertEqual(actual_output, expected_output)

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {
            'exception': 'This is an exception',
            'rc': 1
        }
        expected_output = 'An exception occurred during task execution. To see the full traceback, use -vvv. The error was: This is an exception'
        actual_output = callback.v2_runner_on_ok(result)
        self.assertEqual(actual_output, expected_output)

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {
            'changed': True,
            'rc': 0
        }
        expected_output = 'SUCCESS'
        actual_output = callback.v2_runner_on_ok(host, result)
        self.assertEqual(actual_output, expected_output)

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {
            'msg': 'This is an unreachable message'
        }
        expected_output = 'UNREACHABLE!: This is an unreachable message'
        actual_output = callback.v2_runner_on_unreachable(host, result)
        self.assertEqual(actual_output, expected_output)

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {}
        expected_output = 'SKIPPED'
        actual_output = callback.v2_runner_on_ok(result)
        self.assertEqual(actual_output, expected_output)

if __name__ == '__main__':
    unittest.main()