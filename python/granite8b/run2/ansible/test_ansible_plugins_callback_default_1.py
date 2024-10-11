import unittest
from ansible.plugins.callback import CallbackModule


class TestDefaultCallback(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = Mock()
        result._result = {'foo': 'bar'}
        result._task = Mock()
        result._task.action = 'some action'
        result._host = Mock()
        result._host.get_name.return_value = 'localhost'
        callback.v2_runner_on_failed(result)
        self.assertEqual(result._task._uuid, callback._last_task_banner)
        self.assertEqual(result._task.get_name().strip(), callback._last_task_name)
        self.assertEqual(callback._task_type_cache[result._task._uuid], 'TASK')
        self.assertEqual(callback._play, result._play)
        self.assertEqual(callback._display.banner_message, 'TASK [some action] => {"foo": "bar"}')
        self.assertEqual(callback._display.display_message, 'fatal: [localhost]: FAILED! => {"foo": "bar"}')
        self.assertEqual(callback._display.color, C.COLOR_ERROR)
        self.assertEqual(callback._display.stderr, callback.display_failed_stderr)

if __name__ == '__main__':
    unittest.main()