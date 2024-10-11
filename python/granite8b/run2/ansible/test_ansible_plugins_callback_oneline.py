import unittest
from ansible.plugins.callback import CallbackModule


class TestOnelineCallback(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {
            'exception': 'Some exception occurred',
            '_task': {
                'action': 'some_module'
            },
            '_host': {
                'get_name': lambda: 'localhost'
            },
            '_result': {
                'rc': 1
            }
        }
        callback.v2_runner_on_failed(result)
        self.assertEqual(callback._display.display_called_with[0][0], 'localhost | FAILED! => {"changed": false, "failed": true, "msg": "An exception occurred during task execution. To see the full traceback, use -vvv. The error was: Some exception occurred"}')

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {
            '_task': {
                'action': 'some_module'
            },
            '_host': {
                'get_name': lambda: 'localhost'
            },
            '_result': {
                'changed': True,
                'rc': 0
            }
        }
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display_called_with[0][0], 'localhost | CHANGED => {"changed": true, "failed": false, "msg": "All items completed"}')

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {
            '_task': {
                'action': 'some_module'
            },
            '_host': {
                'get_name': lambda: 'localhost'
            },
            '_result': {
                'msg': 'unreachable'
            }
        }
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._display.display_called_with[0][0], 'localhost | UNREACHABLE!: unreachable')

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {
            '_task': {
                'action': 'some_module'
            },
            '_host': {
                'get_name': lambda: 'localhost'
            },
            '_result': {
                'msg': 'skipped'
            }
        }
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display_called_with[0][0], 'localhost | SKIPPED')

if __name__ == '__main__':
    unittest.main()