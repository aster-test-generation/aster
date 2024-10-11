import unittest
from ansible.plugins.callback.oneline import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_command_generic_msg(self):
        result = {
            'stdout': 'This is a test stdout',
            'stderr': 'This is a test stderr',
            'rc': 0
        }
        hostname = 'test_host'
        caption = 'test_caption'
        expected_msg = f'{hostname} | {caption} | rc=0 | (stdout) {result["stdout"]} (stderr) {result["stderr"]}'
        actual_msg = self.callback._command_generic_msg(hostname, result, caption)
        self.assertEqual(actual_msg, expected_msg)

    def test_v2_runner_on_failed(self):
        result = {
            'exception': 'This is a test exception',
            'rc': 1
        }
        hostname = 'test_host'
        expected_msg = f'{hostname} | FAILED! => {result["exception"]}'
        actual_msg = self.callback.v2_runner_on_failed(result._result)
        self.assertEqual(actual_msg, expected_msg)

    def test_v2_runner_on_ok(self):
        result = {
            'changed': True,
            'rc': 0
        }
        hostname = 'test_host'
        expected_msg = f'{hostname} | SUCCESS => {result}'
        actual_msg = self.callback.v2_runner_on_ok(result._result)
        self.assertEqual(actual_msg, expected_msg)

    def test_v2_runner_on_unreachable(self):
        result = {
            'msg': 'This is a test unreachable message',
            'rc': 2
        }
        hostname = 'test_host'
        expected_msg = f'{hostname} | UNREACHABLE!: {result["msg"]}'
        actual_msg = self.callback.v2_runner_on_unreachable(result._result)
        self.assertEqual(actual_msg, expected_msg)

    def test_v2_runner_on_skipped(self):
        result = {}
        hostname = 'test_host'
        expected_msg = f'{hostname} | SKIPPED'
        actual_msg = self.callback.v2_runner_on_ok(result)
        self.assertEqual(actual_msg, expected_msg)

if __name__ == '__main__':
    unittest.main()