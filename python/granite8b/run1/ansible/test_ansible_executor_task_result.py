import unittest
from ansible.executor.task_result import TaskResult


class TestTaskResult(unittest.TestCase):
    def test_is_changed(self):
        result = TaskResult(None, None, {'changed': True})
        self.assertTrue(result.is_changed())

    def test_is_skipped(self):
        result = TaskResult(None, None, {'skipped': True})
        self.assertTrue(result.is_skipped())

    def test_is_failed(self):
        result = TaskResult(None, None, {'failed': True})
        self.assertTrue(result.is_failed())

    def test_is_unreachable(self):
        result = TaskResult(None, None, {'unreachable': True})
        self.assertTrue(result.is_unreachable())

    def test_needs_debugger(self):
        result = TaskResult(None, None, {})
        self.assertFalse(result.needs_debugger())
        result = TaskResult(None, None, {'failed': True}, {'debugger': 'always'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'unreachable': True}, {'debugger': 'on_unreachable'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'failed': True}, {'debugger': 'on_failed'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'skipped': True}, {'debugger': 'on_skipped'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'failed': True}, {'debugger': 'never'})
        self.assertFalse(result.needs_debugger())
        result = TaskResult(None, None, {'unreachable': True}, {'debugger': 'never'})
        self.assertFalse(result.needs_debugger())
        result = TaskResult(None, None, {'failed': True}, {'debugger': 'on_failed'})
        self.assertFalse(result.needs_debugger())
        result = TaskResult(None, None, {'skipped': True}, {'debugger': 'on_skipped'})
        self.assertFalse(result.needs_debugger())

if __name__ == '__main__':
    unittest.main()