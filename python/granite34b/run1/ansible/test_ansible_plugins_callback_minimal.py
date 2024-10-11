import unittest
from ansible.plugins.callback.minimal import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_command_generic_msg(self):
        result = {
            'rc': 0,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected_output = "host | caption | rc=0 >>\nThis is the outputThis is the errorThis is the message\n"
        callback = CallbackModule()
        output = callback._command_generic_msg('host', result, 'caption')
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_failed(self):
        result = {
            'rc': 1,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected_output = "host | FAILED! => {\n    'rc': 1,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        callback = CallbackModule()
        output = callback.v2_runner_on_failed('host', result._result)
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_ok(self):
        result = {
            'changed': True,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected_output = "host | SUCCESS => {\n    'changed': True,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        callback = CallbackModule()
        output = callback.v2_runner_on_ok(result, 'host')
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_skipped(self):
        expected_output = "host | SKIPPED\n"
        callback = CallbackModule()
        output = callback.v2_runner_on_skipped(host)
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_unreachable(self):
        result = {
            'changed': True,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected_output = "host | UNREACHABLE! => {\n    'changed': True,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        callback = CallbackModule()
        output = callback.v2_runner_on_unreachable(host, result)
        self.assertEqual(output, expected_output)

    def test_v2_on_file_diff(self):
        result = {
            'diff': {
                'before': 'This is the before',
                'after': 'This is the after',
                'diff': 'This is the diff'
            }
        }
        expected_output = "This is the diff\n"
        callback = CallbackModule()
        output = callback.v2_on_file_diff(result, 'host')
        self.assertEqual(output, expected_output)

if __name__ == '__main__':
    unittest.main()