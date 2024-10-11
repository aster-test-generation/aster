import unittest
from ansible.plugins.callback.core import CallbackModul


class TestCallbackModule(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}, '_result': {'exception': 'Exception occurred'}}
        callback.v2_runner_on_failed(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}, '_result': {'changed': True}}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}, '_result': {'msg': 'Unreachable'}}
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_command_generic_msg(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}, '_result': {'stdout': 'stdout', 'stderr': 'stderr'}}
        msg = callback._command_generic_msg('localhost', result, 'caption')
        self.assertEqual(msg, 'localhost | caption | rc=-1 | (stdout) stdout (stderr) stderr')

    def test_display(self):
        callback = CallbackModule()
        callback._display.display('message')
        self.assertEqual(callback._display.display.call_count, 1)

    def test_dump_results(self):
        callback = CallbackModule()
        result = {'changed': True}
        output = callback._dump_results(result, indent=0)
        self.assertEqual(output, 'changed=True')

    def test_init(self):
        callback = CallbackModule()
        self.assertEqual(callback.CALLBACK_VERSION, 2.0)
        self.assertEqual(callback.CALLBACK_TYPE, 'stdout')
        self.assertEqual(callback.CALLBACK_NAME, 'oneline')

    def test_str(self):
        callback = CallbackModule()
        self.assertEqual(str(callback), 'oneline')

    def test_repr(self):
        callback = CallbackModule()
        self.assertEqual(repr(callback), 'oneline(oneline)')

    def test_eq(self):
        callback1 = CallbackModule()
        callback2 = CallbackModule()
        self.assertEqual(callback1, callback2)

if __name__ == '__main__':
    unittest.main()