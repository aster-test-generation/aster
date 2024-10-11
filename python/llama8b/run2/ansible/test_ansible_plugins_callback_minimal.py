import unittest
from ansible.utils.display import Displa
from ansible import constants as C
from your_module import CallbackModule  # Replace 'your_module' with the actual module name


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
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

    def test_private_method(self):
        instance = CallbackModule()
        with self.assertRaises(NotImplementedError):
            instance.__private_method()

    def test_protected_method(self):
        instance = CallbackModule()
        with self.assertRaises(NotImplementedError):
            instance._protected_method()

    def test_str_method(self):
        instance = CallbackModule()
        self.assertEqual(str(instance), 'CallbackModule')

    def test_repr_method(self):
        instance = CallbackModule()
        self.assertEqual(repr(instance), 'CallbackModule()')

if __name__ == '__main__':
    unittest.main()