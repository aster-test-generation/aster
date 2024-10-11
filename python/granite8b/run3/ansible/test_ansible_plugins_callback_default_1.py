import unittest
from ansible.plugins.callback import CallbackModule


class TestDefaultCallback(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = Mock()
        result._result = {'foo': 'bar'}
        result._task = Mock()
        result._task.action = 'foo'
        result._host = Mock()
        result._host.get_name.return_value = 'localhost'
        callback.v2_runner_on_failed(result)
        self.assertEqual(result._task._uuid, callback._last_task_banner)
        self.assertEqual(result._task.get_name().strip(), callback._last_task_name)
        self.assertEqual(result._host.get_name(), callback.host_label(result))
        self.assertEqual(result._task.action, callback._task_type_cache[result._task._uuid])
        self.assertEqual(result._result, callback._clean_results(result._result, result._task.action))
        self.assertEqual(result._result, callback._handle_exception(result._result, use_stderr=callback.display_failed_stderr))
        self.assertEqual(result._result, callback._handle_warnings(result._result))
        self.assertEqual(result._result, callback._dump_results(result._result))
        self.assertEqual('fatal: [localhost]: FAILED! => {"foo": "bar"}', callback._display.display.call_args[0][0])
        self.assertEqual(C.COLOR_ERROR, callback._display.display.call_args[1]['color'])
        self.assertEqual(callback.display_failed_stderr, callback._display.display.call_args[1]['stderr'])

if __name__ == '__main__':
    unittest.main()