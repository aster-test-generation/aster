import unittest
from ansible.plugins.callback.yaml import CallbackModule


class TestMinimalCallback(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {'rc': 1, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}
        callback.v2_runner_on_failed(result)
        self.assertEqual(callback._display.display_calls[0][0], 'localhost | FAILED! => {"rc": 1, "stdout": "stdout", "stderr": "stderr", "msg": "msg"}')

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg', 'changed': True}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display_calls[0][0], 'localhost | CHANGED => {"rc": 0, "stdout": "stdout", "stderr": "stderr", "msg": "msg", "changed": true}')

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg', 'changed': False}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display_calls[0][0], 'localhost | SKIPPED')

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg', 'changed': False}
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._display.display_calls[0][0], 'localhost | UNREACHABLE! => {"rc": 0, "stdout": "stdout", "stderr": "stderr", "msg": "msg"}')

if __name__ == '__main__':
    unittest.main()