import unittest
from ansible.plugins.callback.minimal import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_command_generic_msg(self):
        result = {
            'rc': 0,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | caption | rc=0 >>\nThis is the output\nThis is the error\nThis is the message\n"
        actual = self.callback._command_generic_msg('host', result, 'caption')
        self.assertEqual(actual, expected.rstrip())

    def test_v2_runner_on_failed(self):
        result = {
            'rc': 1,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | FAILED! => {\n    'rc': 1,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        actual = self.callback.v2_runner_on_ok('host', result)
        self.assertEqual(actual, expected)

    def test_v2_runner_on_ok(self):
        result = {
            'changed': True,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | SUCCESS => {\n    'changed': True,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        actual = self.callback.v2_runner_on_ok(result, 'host')
        self.assertEqual(actual, expected)

    def test_v2_runner_on_skipped(self):
        expected = "host | SKIPPED\n"
        actual = self.callback.v2_runner_on_ok('host')
        self.assertEqual(actual, expected)

    def test_v2_runner_on_unreachable(self):
        result = {
            'rc': 1,
            'stdout': 'This is the output',
            'stderr': 'This is the error',
            'msg': 'This is the message'
        }
        expected = "host | UNREACHABLE! => {\n    'rc': 1,\n    'stdout': 'This is the output',\n    'stderr': 'This is the error',\n    'msg': 'This is the message'\n}\n"
        actual = self.callback.v2_runner_on_unreachable(host, result)
        self.assertEqual(actual, expected)

    def test_v2_on_file_diff(self):
        result = {
            'diff': 'This is the diff'
        }
        expected = "This is the diff\n"
        actual = self.callback.v2_on_file_diff(result, 'host')
        self.assertEqual(actual, expected)

if __name__ == '__main__':
    unittest.main()