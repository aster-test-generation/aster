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
        expected = "host | caption | rc=0 >>\nThis is the output\nThis is the error\nThis is the message\n"
        actual = CallbackModule._command_generic_msg('host', result, caption='caption')
        self.assertEqual(actual, expected)

    def test_v2_runner_on_failed(self):
        result = {
            'rc': 1,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | FAILED! => {\n    'rc': 1,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        actual = CallbackModule.v2_runner_on_failed('host', result)
        self.assertEqual(actual, expected)

    def test_v2_runner_on_ok(self):
        result = {
            'changed': True,
            'rc': 0,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | SUCCESS => {\n    'changed': True,\n    'rc': 0,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        actual = CallbackModule.v2_runner_on_ok('host', result)
        self.assertEqual(actual, expected)

    def test_v2_runner_on_skipped(self):
        result = {
            'changed': False,
            'rc': 0,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | SKIPPED\n"
        actual = CallbackModule.v2_runner_on_skipped('host', result._display)
        self.assertEqual(actual, expected)

    def test_v2_runner_on_unreachable(self):
        result = {
            'changed': False,
            'rc': 0,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | UNREACHABLE! => {\n    'changed': False,\n    'rc': 0,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        actual = CallbackModule.v2_runner_on_unreachable('host', result._display)
        self.assertEqual(actual, expected)

    def test_v2_on_file_diff(self):
        result = {
            'diff': {
                'before': 'This is the before',
                'after': 'This is the after',
                'diff': 'This is the diff'
            }
        }
        expected = "This is the diff\n"
        actual = CallbackModule._result('host', result)
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()