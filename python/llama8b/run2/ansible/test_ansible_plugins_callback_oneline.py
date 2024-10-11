import unittest
from ansible.plugins.callback.core import CallbackModul


class TestCallbackModule(unittest.TestCase):
    def test_callback_module_init(self):
        instance = CallbackModule()
        self.assertIsInstance(instance, CallbackModule)

    def test_callback_module_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}, '_result': {'exception': 'Exception occurred'}}
        instance.v2_runner_on_failed(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_callback_module_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}, '_result': {'changed': True}}
        instance.v2_runner_on_ok(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_callback_module_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}, '_result': {'msg': 'Unreachable'}}
        instance.v2_runner_on_unreachable(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_callback_module_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}}
        instance.v2_runner_on_skipped(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_callback_module_command_generic_msg(self):
        instance = CallbackModule()
        hostname = 'localhost'
        result = {'stdout': 'stdout', 'stderr': 'stderr', 'rc': 0}
        caption = 'caption'
        self.assertEqual(instance._command_generic_msg(hostname, result, caption), f"{hostname} | {caption} | rc=0 | (stdout) stdout (stderr) stderr")

    def test_callback_module_display(self):
        instance = CallbackModule()
        instance._display.display('message')
        self.assertEqual(instance._display.display.call_count, 1)

    def test_callback_module_dump_results(self):
        instance = CallbackModule()
        result = {'changed': True}
        self.assertEqual(instance._dump_results(result, indent=0), 'changed=True')

if __name__ == '__main__':
    unittest.main()