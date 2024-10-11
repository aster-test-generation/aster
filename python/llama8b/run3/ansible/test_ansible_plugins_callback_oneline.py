import unittest
from ansible.plugins.callback.oneline import OnelineCallbac


class TestCallbackModule(unittest.TestCase):
    def test_callback_module_init(self):
        instance = CallbackModule()
        self.assertEqual(instance.CALLBACK_VERSION, 2.0)
        self.assertEqual(instance.CALLBACK_TYPE, 'stdout')
        self.assertEqual(instance.CALLBACK_NAME, 'oneline')

    def test_command_generic_msg(self):
        instance = CallbackModule()
        hostname = 'example.com'
        result = {'stdout': 'stdout', 'rc': 0}
        caption = 'caption'
        result = instance._command_generic_msg(hostname, result, caption)
        self.assertEqual(result, f"{hostname} | {caption} | rc=0 | (stdout) stdout")

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'exception': 'exception', 'rc': 1}
        instance.v2_runner_on_failed(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'changed': True, 'rc': 0}
        instance.v2_runner_on_ok(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'msg': 'msg', 'rc': 1}
        instance.v2_runner_on_unreachable(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'rc': 0}
        instance.v2_runner_on_skipped(result)
        self.assertEqual(instance._display.display.call_count, 1)

    def test_private_method(self):
        instance = CallbackModule()
        with self.assertRaises(AttributeError):
            instance.__private_method()

    def test_protected_method(self):
        instance = CallbackModule()
        with self.assertRaises(AttributeError):
            instance._CallbackModule__protected_method()

    def test_str_method(self):
        instance = CallbackModule()
        self.assertEqual(str(instance), 'oneline')

    def test_repr_method(self):
        instance = CallbackModule()
        self.assertEqual(repr(instance), 'oneline')

if __name__ == '__main__':
    unittest.main()