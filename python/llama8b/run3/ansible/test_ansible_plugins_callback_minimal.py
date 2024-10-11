import unittest
from ansible.utils.display import Displa
from ansible import constants as C
from ansible.plugins.callback.minimal import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        instance = CallbackModule()
        self.assertEqual(instance.CALLBACK_VERSION, 2.0)
        self.assertEqual(instance.CALLBACK_TYPE, 'stdout')
        self.assertEqual(instance.CALLBACK_NAME, 'minimal')

    def test_command_generic_msg(self):
        instance = CallbackModule()
        host = 'localhost'
        result = {'rc': 0, 'stdout': 'output', 'stderr': 'error'}
        caption = 'caption'
        buf = instance._command_generic_msg(host, result, caption)
        self.assertEqual(buf, f"{host} | {caption} | rc=0 >>\noutput\nerror\n")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'rc': 1, 'stdout': 'output', 'stderr': 'error'}}
        instance.v2_runner_on_failed(result)
        self.assertEqual(instance._display.display.call_args[0][0], f"localhost | FAILED! => {{'rc': 1, 'stdout': 'output', 'stderr': 'error'}}")

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'output'}}
        instance.v2_runner_on_ok(result)
        self.assertEqual(instance._display.display.call_args[0][0], f"localhost | CHANGED => {{'changed': True, 'stdout': 'output'}}")

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'_host': 'localhost'}
        instance.v2_runner_on_skipped(result)
        self.assertEqual(instance._display.display.call_args[0][0], f"localhost | SKIPPED")

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_result': {'stdout': 'output'}}
        instance.v2_runner_on_unreachable(result)
        self.assertEqual(instance._display.display.call_args[0][0], f"localhost | UNREACHABLE! => {{'stdout': 'output'}}")

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        result = {'_result': {'diff': 'diff'}}
        instance.v2_on_file_diff(result)
        self.assertEqual(instance._display.display.call_args[0][0], instance._get_diff('diff'))

    def test_display(self):
        instance = CallbackModule()
        instance._display.display('message')
        self.assertEqual(instance._display.display.call_args[0][0], 'message')

    def test_get_diff(self):
        instance = CallbackModule()
        diff = 'diff'
        result = instance._get_diff(diff)
        self.assertEqual(result, diff)

    def test_clean_results(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'output'}}
        instance._clean_results(result, 'action')
        self.assertEqual(result, {'changed': True, 'stdout': 'output'})

    def test_handle_exception(self):
        instance = CallbackModule()
        result = {'_result': {'exception': 'exception'}}
        instance._handle_exception(result._result)
        self.assertEqual(instance._display.display.call_args[0][0], f"localhost | FAILED! => {{'exception': 'exception'}}")

    def test_handle_warnings(self):
        instance = CallbackModule()
        result = {'_result': {'warnings': ['warning']}}
        instance._handle_warnings(result._result)
        self.assertEqual(instance._display.display.call_args[0][0], f"localhost | WARNING! => {{'warnings': ['warning']}}")

if __name__ == '__main__':
    unittest.main()