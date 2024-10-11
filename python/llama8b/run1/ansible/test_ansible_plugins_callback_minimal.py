import unittest
from ansible.utils.unsafe_proxy import AnsibleUnsafeText
from ansible import constants as C
from ansible.plugins.callback.minimal import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_callback_module_init(self):
        instance = CallbackModule()
        self.assertEqual(instance.CALLBACK_VERSION, 2.0)
        self.assertEqual(instance.CALLBACK_TYPE, 'stdout')
        self.assertEqual(instance.CALLBACK_NAME, 'minimal')

    def test_command_generic_msg(self):
        instance = CallbackModule()
        host = 'localhost'
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}
        caption = 'caption'
        buf = instance._command_generic_msg(host, result, caption)
        self.assertEqual(buf, f"{host} | {caption} | rc=0 >>\nstdout\nstderr\nmsg\n")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'rc': 1, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}}
        instance.v2_runner_on_failed(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}}
        instance.v2_runner_on_ok(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'_result': {'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}}
        instance.v2_runner_on_skipped(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_result': {'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}}
        instance.v2_runner_on_unreachable(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        result = {'_result': {'diff': 'diff'}}
        instance.v2_on_file_diff(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_display(self):
        instance = CallbackModule()
        instance._display.display('message')
        self.assertEqual(instance._display.display.call_count, 1)

    def test_clean_results(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}}
        instance._clean_results(result, 'action')
        self.assertEqual(instance._clean_results.call_count, 1)

    def test_handle_exception(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}}
        instance._handle_exception(result)
        self.assertEqual(instance._handle_exception.call_count, 1)

    def test_handle_warnings(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}}
        instance._handle_warnings(result)
        self.assertEqual(instance._handle_warnings.call_count, 1)

    def test_get_diff(self):
        instance = CallbackModule()
        diff = 'diff'
        result = instance._get_diff(diff)
        self.assertEqual(result, diff)

if __name__ == '__main__':
    unittest.main()