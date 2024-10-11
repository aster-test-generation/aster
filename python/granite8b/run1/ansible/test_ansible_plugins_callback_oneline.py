import unittest
from ansible.plugins.callback import CallbackModule


class TestOnelineCallback(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {
            'exception': 'Some exception occurred',
            '_task': {'action': 'some_action'},
            '_host': {'get_name': lambda: 'some_host'}
        }
        callback.v2_runner_on_failed(result)
        self.assertEqual(callback._display.display.call_count, 2)
        self.assertEqual(callback._display.display.call_args_list[0][0][0], 'some_host | FAILED! => {"exception": "Some exception occurred"}')
        self.assertEqual(callback._display.display.call_args_list[1][0][0], 'An exception occurred during task execution. To see the full traceback, use -vvv.')

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {
            '_result': {'changed': True},
            '_task': {'action': 'some_action'},
            '_host': {'get_name': lambda: 'some_host'}
        }
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args_list[0][0][0], 'some_host | CHANGED => {"changed": true}')

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {
            '_result': {'msg': 'some_message'},
            '_task': {'action': 'some_action'},
            '_host': {'get_name': lambda: 'some_host'}
        }
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args_list[0][0][0], 'some_host | UNREACHABLE!: some_message')

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {
            '_task': {'action': 'some_action'},
            '_host': {'get_name': lambda: 'some_host'}
        }
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args_list[0][0][0], 'some_host | SKIPPED')

if __name__ == '__main__':
    unittest.main()