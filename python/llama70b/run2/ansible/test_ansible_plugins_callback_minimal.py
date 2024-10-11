from ansible.plugins.callback import CallbackBas
import unittest
from ansible.plugins.callback.minimal import CallbackModule, DOCUMENTATION


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        instance = CallbackModule()
        self.assertIsInstance(instance, CallbackBase)

    def test_CALLBACK_VERSION(self):
        self.assertEqual(CallbackModule.CALLBACK_VERSION, 2.0)

    def test_CALLBACK_TYPE(self):
        self.assertEqual(CallbackModule.CALLBACK_TYPE, 'stdout')

    def test_CALLBACK_NAME(self):
        self.assertEqual(CallbackModule.CALLBACK_NAME, 'minimal')

    def test_command_generic_msg(self):
        instance = CallbackModule()
        result = instance._command_generic_msg('host', {'rc': 0, 'stdout': 'out', 'stderr': 'err'}, 'caption')
        self.assertEqual(result, "host | caption | rc=0 >>\nouterr\n")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'rc': 1, 'stdout': 'out', 'stderr': 'err'}, '_host': {'get_name': lambda: 'host'}, '_task': {'action': 'action'}}
        instance.v2_runner_on_failed(result)
        # assert display was called with correct args

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'out'}, '_host': {'get_name': lambda: 'host'}, '_task': {'action': 'action'}}
        instance.v2_runner_on_ok(result)
        # assert display was called with correct args

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host'}}
        instance.v2_runner_on_skipped(result)
        # assert display was called with correct args

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_result': {'stdout': 'out'}, '_host': {'get_name': lambda: 'host'}}
        instance.v2_runner_on_unreachable(result)
        # assert display was called with correct args

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        result = {'_result': {'diff': 'diff'}}
        instance.v2_on_file_diff(result)
        # assert display was called with correct args

    def test__handle_exception(self):
        instance = CallbackModule()
        result = {'_result': {'exception': 'exception'}}
        instance._handle_exception(result)
        # assert exception was handled correctly

    def test__handle_warnings(self):
        instance = CallbackModule()
        result = {'_result': {'warnings': 'warnings'}}
        instance._handle_warnings(result)
        # assert warnings were handled correctly

    def test__clean_results(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'out'}}
        task_action = 'action'
        instance._clean_results(result, task_action)
        # assert results were cleaned correctly

    def test__dump_results(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'out'}}
        indent = 4
        dumped = instance._dump_results(result, indent)
        self.assertEqual(dumped, "    changed: True\n    stdout: out\n")

    def test__get_diff(self):
        instance = CallbackModule()
        diff = 'diff'
        got_diff = instance._get_diff(diff)
        self.assertEqual(got_diff, diff)

    def test_str(self):
        instance = CallbackModule()
        self.assertEqual(str(instance), "minimal")

    def test_repr(self):
        instance = CallbackModule()
        self.assertEqual(repr(instance), "CallbackModule()")

if __name__ == '__main__':
    unittest.main()