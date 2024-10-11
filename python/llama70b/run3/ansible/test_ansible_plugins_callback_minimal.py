import unittest
from ansible.plugins.callback import CallbackModule, CallbackBas


class TestCallbackModule(unittest.TestCase):
    def test___init__(self):
        instance = CallbackModule()
        self.assertIsInstance(instance, CallbackBase)

    def test_CALLBACK_VERSION(self):
        self.assertEqual(CallbackModule.CALLBACK_VERSION, 2.0)

    def test_CALLBACK_TYPE(self):
        self.assertEqual(CallbackModule.CALLBACK_TYPE, 'stdout')

    def test_CALLBACK_NAME(self):
        self.assertEqual(CallbackModule.CALLBACK_NAME, 'minimal')

    def test__command_generic_msg(self):
        instance = CallbackModule()
        result = instance._command_generic_msg('host', {'rc': 0, 'stdout': 'output'}, 'caption')
        self.assertEqual(result, "host | caption | rc=0 >>\noutput\n")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'rc': 1, 'stdout': 'output', 'stderr': 'error'}}
        instance.v2_runner_on_failed(result)
        # assert display method was called with correct arguments

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'output'}}
        instance.v2_runner_on_ok(result)
        # assert display method was called with correct arguments

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host'}}
        instance.v2_runner_on_skipped(result)
        # assert display method was called with correct arguments

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_result': {'stdout': 'output'}, '_host': {'get_name': lambda: 'host'}}
        instance.v2_runner_on_unreachable(result)
        # assert display method was called with correct arguments

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        result = {'_result': {'diff': 'diff output'}}
        instance.v2_on_file_diff(result)
        # assert display method was called with correct arguments

    def test__handle_exception(self):
        instance = CallbackModule()
        result = {'_result': {'exception': 'exception message'}}
        instance._handle_exception(result)
        # assert exception was handled correctly

    def test__handle_warnings(self):
        instance = CallbackModule()
        result = {'_result': {'warnings': ['warning 1', 'warning 2']}}
        instance._handle_warnings(result)
        # assert warnings were handled correctly

    def test__clean_results(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'output'}}
        instance._clean_results(result, 'action')
        # assert results were cleaned correctly

    def test__dump_results(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'output'}}
        dumped = instance._dump_results(result, indent=4)
        self.assertEqual(dumped, "    changed: True\n    stdout: output")

    def test__get_diff(self):
        instance = CallbackModule()
        diff = instance._get_diff('diff output')
        self.assertEqual(diff, "diff output")

if __name__ == '__main__':
    unittest.main()