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
        result = {'stdout': 'foo', 'rc': 0}
        hostname = 'localhost'
        caption = 'test'
        expected = "%s | %s | rc=%s | (stdout) %s" % (hostname, caption, result['rc'], result['stdout'].replace('\n', '\\n').replace('\r', '\\r'))
        self.assertEqual(instance._command_generic_msg(hostname, result, caption), expected)

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'exception': 'Error message'}, '_host': {'get_name': lambda: 'localhost'}, '_task': {'action': 'test'}}
        instance.v2_runner_on_failed(result)
        # assert display method was called with correct arguments

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': True}, '_host': {'get_name': lambda: 'localhost'}, '_task': {'action': 'test'}}
        instance.v2_runner_on_ok(result)
        # assert display method was called with correct arguments

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_result': {'msg': 'Unreachable'}, '_host': {'get_name': lambda: 'localhost'}}
        instance.v2_runner_on_unreachable(result)
        # assert display method was called with correct arguments

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'_host': {'get_name': lambda: 'localhost'}}
        instance.v2_runner_on_skipped(result)
        # assert display method was called with correct arguments

    def test__dump_results(self):
        instance = CallbackModule()
        result = {'foo': 'bar'}
        expected = "{'foo': 'bar'}"
        self.assertEqual(instance._dump_results(result, indent=0), expected)

    def test_str_method(self):
        instance = CallbackModule()
        self.assertEqual(str(instance), "oneline")

    def test_repr_method(self):
        instance = CallbackModule()
        self.assertEqual(repr(instance), "CallbackModule()")

class TestDOCUMENTATION(unittest.TestCase):
    def test_DOCUMENTATION(self):
        self.assertIsInstance(DOCUMENTATION, str)

if __name__ == '__main__':
    unittest.main()