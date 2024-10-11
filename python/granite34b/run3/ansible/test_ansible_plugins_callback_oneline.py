import unittest
from ansible.plugins.callback.oneline import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_command_generic_msg(self):
        result = {
            'stdout': 'This is a test stdout',
            'stderr': 'This is a test stderr',
            'rc': 0
        }
        hostname = 'test_host'
        caption = 'test_caption'
        expected_output = f'{hostname} | {caption} | rc=0 | (stdout) {result["stdout"]} (stderr) {result["stderr"]}'
        callback = CallbackModule()
        output = callback._command_generic_msg(hostname, result, caption)
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_failed(self):
        result = {
            'exception': 'This is a test exception',
            'rc': 1
        }
        hostname = 'test_host'
        expected_output = f'{hostname} | FAILED! => {result["exception"]}'
        callback = CallbackModule()
        output = callback.v2_runner_on_ok(result)
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_ok(self):
        result = {
            'changed': True,
            'rc': 0
        }
        hostname = 'test_host'
        expected_output = f'{hostname} | SUCCESS => {result}'
        callback = CallbackModule()
        output = callback.v2_runner_on_ok(host, result)
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_unreachable(self):
        result = {
            'msg': 'This is a test unreachable message',
            'rc': 2
        }
        hostname = 'test_host'
        expected_output = f'{hostname} | UNREACHABLE!: {result["msg"]}'
        callback = CallbackModule()
        output = callback.v2_runner_on_unreachable(host, result)
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_skipped(self):
        result = {}
        hostname = 'test_host'
        expected_output = f'{hostname} | SKIPPED'
        callback = CallbackModule()
        output = callback._host
        self.assertEqual(output, expected_output)

if __name__ == '__main__':
    unittest.main()