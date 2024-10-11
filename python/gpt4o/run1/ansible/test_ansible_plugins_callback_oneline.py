import unittest
from unittest.mock import MagicMock
from ansible.plugins.callback.oneline import CallbackModule
from ansible import constants as C


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()
        self.callback._display = MagicMock()

    def test_command_generic_msg_with_stderr(self):
        result = {
            'stdout': 'output',
            'stderr': 'error',
            'rc': 1
        }
        hostname = 'localhost'
        caption = 'COMMAND'
        expected = "localhost | COMMAND | rc=1 | (stdout) output (stderr) error"
        actual = self.callback._command_generic_msg(hostname, result, caption)
        self.assertEqual(actual, expected)

    def test_command_generic_msg_without_stderr(self):
        result = {
            'stdout': 'output',
            'rc': 0
        }
        hostname = 'localhost'
        caption = 'COMMAND'
        expected = "localhost | COMMAND | rc=0 | (stdout) output"
        actual = self.callback._command_generic_msg(hostname, result, caption)
        self.assertEqual(actual, expected)

    def test_v2_runner_on_failed_with_exception(self):
        result = MagicMock()
        result._result = {
            'exception': 'Traceback (most recent call last):\nError occurred'
        }
        result._host.get_name.return_value = 'localhost'
        result._task.action = 'some_action'
        self.callback._display.verbosity = 2
        self.callback.v2_runner_on_failed(result)
        self.callback._display.display.assert_called_with('localhost | FAILED! => {}', color='red')
            "An exception occurred during task execution. To see the full traceback, use -vvv. The error was: Error occurred",
            color=C.COLOR_ERROR
        )

    def test_v2_runner_on_failed_without_exception(self):
        result = MagicMock()
        result._result = {}
        result._host.get_name.return_value = 'localhost'
        result._task.action = 'some_action'
        self.callback.v2_runner_on_failed(result.return_value)
        self.callback._display.display.assert_called_with(
            "localhost | FAILED! => {}",
            color=C.COLOR_ERROR
        )

    def test_v2_runner_on_ok_changed(self):
        result = MagicMock()
        result._result = {'changed': True}
        result._host.get_name.return_value = 'localhost'
        result._task.action = 'some_action'
        self.callback.v2_runner_on_ok(result.return_value)
        self.callback._display.display.assert_called_with(
            "localhost | CHANGED => {}",
            color=C.COLOR_CHANGED
        )

    def test_v2_runner_on_ok_success(self):
        result = MagicMock()
        result._result = {'changed': False}
        result._host.get_name.return_value = 'localhost'
        result._task.action = 'some_action'
        self.callback.v2_runner_on_ok(result.return_value)
        self.callback._display.display.assert_called_with(
            "localhost | SUCCESS => {}",
            color=C.COLOR_OK
        )

    def test_v2_runner_on_unreachable(self):
        result = MagicMock()
        result._result = {'msg': 'Host unreachable'}
        result._host.get_name.return_value = 'localhost'
        self.callback.v2_runner_on_unreachable(result)
        self.callback._display.display.assert_called_with(
            "localhost | UNREACHABLE!: Host unreachable",
            color=C.COLOR_UNREACHABLE
        )

    def test_v2_runner_on_skipped(self):
        result = MagicMock()
        result._host.get_name.return_value = 'localhost'
        self.callback.v2_runner_on_skipped(result)
        self.callback._display.display.assert_called_with(
            "localhost | SKIPPED",
            color=C.COLOR_SKIP
        )

if __name__ == '__main__':
    unittest.main()