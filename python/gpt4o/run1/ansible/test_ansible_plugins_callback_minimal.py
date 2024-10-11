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
        result._task.action = 'test_action'
        result._host.get_name.return_value = 'localhost'
        with patch('ansible.plugins.callback.minimal.C.MODULE_NO_JSON', []):
            self.callback.v2_runner_on_failed(result.return_value)
            self.callback._display.display.assert_called_once_with(
                "localhost | FAILED! => {\n    \"rc\": 1,\n    \"stdout\": \"output\",\n    \"stderr\": \"error\",\n    \"msg\": \"message\"\n}",
                color=C.COLOR_ERROR
            )

    def test_v2_runner_on_ok(self):
        result = MagicMock()
        result._result = {'changed': True, 'stdout': 'output', 'stderr': 'error', 'msg': 'message'}
        result._task.action = 'test_action'
        result._host.get_name.return_value = 'localhost'
        with patch('ansible.plugins.callback.minimal.C.MODULE_NO_JSON', []):
            self.callback.v2_runner_on_ok(result.return_value)
            self.callback._display.display.assert_called_once_with(
                "localhost | CHANGED => {\n    \"changed\": true,\n    \"stdout\": \"output\",\n    \"stderr\": \"error\",\n    \"msg\": \"message\"\n}",
                color=C.COLOR_CHANGED
            )

    def test_v2_runner_on_skipped(self):
        result = MagicMock()
        result._host.get_name.return_value = 'localhost'
        self.callback.v2_runner_on_skipped(result)
        self.callback._display.display.assert_called_once_with("localhost | SKIPPED", color=C.COLOR_SKIP)

    def test_v2_runner_on_unreachable(self):
        result = MagicMock()
        result._result = {'msg': 'unreachable'}
        result._host.get_name.return_value = 'localhost'
        self.callback.v2_runner_on_unreachable(result.return_value)
        self.callback._display.display.assert_called_once_with(
            "localhost | UNREACHABLE! => {\n    \"msg\": \"unreachable\"\n}",
            color=C.COLOR_UNREACHABLE
        )

    def test_v2_on_file_diff(self):
        result = MagicMock()
        result._result = {'diff': 'file_diff'}
        self.callback.v2_on_file_diff(result)
        self.callback._display.display.assert_called_once_with('')

if __name__ == '__main__':
    unittest.main()