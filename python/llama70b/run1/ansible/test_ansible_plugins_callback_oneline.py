import unittest
from ansible.plugins.callback.default import CallbackModule, DOCUMENTATIO


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        instance = CallbackModule()
        self.assertIsInstance(instance, CallbackModule)

    def test_CALLBACK_VERSION(self):
        self.assertEqual(CallbackModule.CALLBACK_VERSION, 2.0)

    def test_CALLBACK_TYPE(self):
        self.assertEqual(CallbackModule.CALLBACK_TYPE, 'stdout')

    def test_CALLBACK_NAME(self):
        self.assertEqual(CallbackModule.CALLBACK_NAME, 'oneline')

    def test_command_generic_msg(self):
        instance = CallbackModule()
        result = {'stdout': 'hello', 'rc': 0}
        hostname = 'localhost'
        caption = 'TEST'
        expected = "localhost | TEST | rc=0 | (stdout) hello"
        self.assertEqual(instance._command_generic_msg(hostname, result, caption), expected)

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'exception': 'Error message'}}
        instance.v2_runner_on_failed(result)
        # Assert that the display method was called with the correct message

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True}}
        instance.v2_runner_on_ok(result)
        # Assert that the display method was called with the correct message

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_result': {'msg': 'Unreachable message'}}
        instance.v2_runner_on_unreachable(result)
        # Assert that the display method was called with the correct message

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {}
        instance.v2_runner_on_skipped(result)
        # Assert that the display method was called with the correct message

    def test__dump_results(self):
        instance = CallbackModule()
        result = {'key': 'value'}
        expected = "{'key': 'value'}"
        self.assertEqual(instance._dump_results(result, indent=0), expected)

    def test_str_method(self):
        instance = CallbackModule()
        self.assertEqual(str(instance), "oneline")

    def test_repr_method(self):
        instance = CallbackModule()
        self.assertEqual(repr(instance), "CallbackModule()")

    def test_eq_method(self):
        instance1 = CallbackModule()
        instance2 = CallbackModule()
        self.assertEqual(instance1, instance2)

class TestDOCUMENTATION(unittest.TestCase):
    def test_DOCUMENTATION(self):
        self.assertIsInstance(DOCUMENTATION, str)

if __name__ == '__main__':
    unittest.main()