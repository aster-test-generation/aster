import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.callback.minimal import CallbackModule
from ansible import constants as C


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()
        self.callback._display = MagicMock()

    def test_command_generic_msg(self):
        host = 'localhost'
        result = {'rc': 0, 'stdout': 'output', 'stderr': 'error', 'msg': 'message'}
        caption = 'TEST'
        expected_output = "localhost | TEST | rc=0 >>\noutputerrormessage\n"
        output = self.callback._command_generic_msg(host, result, caption)
        self.assertEqual(output, expected_output)

    def test_v2_runner_on_failed(self):
        result = MagicMock()
        result._result = {'rc': 1, 'stdout': 'output', 'stderr': 'error', 'msg': 'message'}
        result._task.action = 'command'
        result._host.get_name.return_value = 'localhost'
        with patch.object(self.callback, '_handle_exception') as mock_handle_exception, \
             patch.object(self.callback, '_handle_warnings') as mock_handle_warnings, \
             patch.object(self.callback, '_dump_results', return_value='dumped_results'):
            self.callback.v2_runner_on_failed(result)
            mock_handle_exception.assert_called_once_with(result._result)
            mock_handle_warnings.assert_called_once_with(result._result)
            self.callback._display.display.assert_called_once_with('localhost | FAILED | rc=1 >>\noutputerrormessage\n', color='red')
                "localhost | FAILED! => dumped_results", color=C.COLOR_ERROR
            )

    def test_v2_runner_on_ok(self):
        result = MagicMock()
        result._result = {'changed': True, 'rc': 0, 'stdout': 'output', 'stderr': 'error', 'msg': 'message'}
        result._task.action = 'command'
        result._host.get_name.return_value = 'localhost'
        with patch.object(self.callback, '_clean_results') as mock_clean_results, \
             patch.object(self.callback, '_handle_warnings') as mock_handle_warnings, \
             patch.object(self.callback, '_dump_results', return_value='dumped_results'):
            self.callback.v2_runner_on_ok(result)
            mock_clean_results.assert_called_once_with(result._result, result._task.action)
            mock_handle_warnings.assert_called_once_with(result._result)
            self.callback._display.display.assert_called_once_with('localhost | CHANGED | rc=0 >>\noutputerrormessage\n', color='yellow')
                "localhost | CHANGED => dumped_results", color=C.COLOR_CHANGED
            )

    def test_v2_runner_on_skipped(self):
        result = MagicMock()
        result._host.get_name.return_value = 'localhost'
        self.callback.v2_runner_on_skipped(result)
        self.callback._display.display.assert_called_once_with(
            "localhost | SKIPPED", color=C.COLOR_SKIP
        )

    def test_v2_runner_on_unreachable(self):
        result = MagicMock()
        result._result = {'rc': 1, 'stdout': 'output', 'stderr': 'error', 'msg': 'message'}
        result._host.get_name.return_value = 'localhost'
        with patch.object(self.callback, '_dump_results', return_value='dumped_results'):
            self.callback.v2_runner_on_unreachable(result)
            self.callback._display.display.assert_called_once_with(
                "localhost | UNREACHABLE! => dumped_results", color=C.COLOR_UNREACHABLE
            )

    def test_v2_on_file_diff(self):
        result = MagicMock()
        result._result = {'diff': 'file_diff'}
        with patch.object(self.callback, '_get_diff', return_value='diff_output'):
            self.callback.v2_on_file_diff(result)
            self.callback._display.display.assert_called_once_with('diff_output')

if __name__ == '__main__':
    unittest.main()