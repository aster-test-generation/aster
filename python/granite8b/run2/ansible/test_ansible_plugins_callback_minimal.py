import unittest
from ansible.plugins.callback.yaml import CallbackModule


class TestMinimalCallback(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {'rc': 1, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg'}
        callback.v2_runner_on_failed(result)
        self.assertEqual(callback._display.display_buffer, ['localhost | FAILED! => {"rc": 1, "stdout": "stdout", "stderr": "stderr", "msg": "msg"}'])

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg', 'changed': True}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display_buffer, ['localhost | CHANGED => {"rc": 0, "stdout": "stdout", "stderr": "stderr", "msg": "msg", "changed": true}'])

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg', 'changed': False}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display_buffer, ['localhost | SKIPPED'])

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg', 'changed': False}
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._display.display_buffer, ['localhost | UNREACHABLE! => {"rc": 0, "stdout": "stdout", "stderr": "stderr", "msg": "msg"}'])

    def test_v2_on_file_diff(self):
        callback = CallbackModule()
        result = {'rc': 0, 'stdout': 'stdout', 'stderr': 'stderr', 'msg': 'msg', 'changed': True, 'diff': {'before': 'before', 'after': 'after', 'diff': 'diff'}}
        callback.v2_on_file_diff(result)
        self.assertEqual(callback._display.display_buffer, ['--- /tmp/before\n+++ /tmp/after\n@@ -1,2 +1,2 @@\n-before\n+after\n'])

if __name__ == '__main__':
    unittest.main()