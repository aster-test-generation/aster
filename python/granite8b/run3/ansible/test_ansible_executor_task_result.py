import unittest
from ansible.executor.task_result import TaskResult


class TestTaskResult(unittest.TestCase):
    def test_is_changed(self):
        result = TaskResult(None, None, {'changed': True})
        self.assertTrue(result.is_changed())
        result = TaskResult(None, None, {'changed': False})
        self.assertFalse(result.is_changed())

    def test_is_skipped(self):
        result = TaskResult(None, None, {'skipped': True})
        self.assertTrue(result.is_skipped())
        result = TaskResult(None, None, {'skipped': False})
        self.assertFalse(result.is_skipped())

    def test_is_failed(self):
        result = TaskResult(None, None, {'failed': True})
        self.assertTrue(result.is_failed())
        result = TaskResult(None, None, {'failed': False})
        self.assertFalse(result.is_failed())

    def test_is_unreachable(self):
        result = TaskResult(None, None, {'unreachable': True})
        self.assertTrue(result.is_unreachable())
        result = TaskResult(None, None, {'unreachable': False})
        self.assertFalse(result.is_unreachable())

    def test_needs_debugger(self):
        result = TaskResult(None, None, {'failed': True})
        self.assertFalse(result.needs_debugger())
        result = TaskResult(None, None, {'failed': True, 'debugger': 'always'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'failed': True, 'debugger': 'on_failed'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'failed': False, 'debugger': 'on_failed'})
        self.assertFalse(result.needs_debugger())
        result = TaskResult(None, None, {'unreachable': True, 'debugger': 'on_unreachable'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'unreachable': False, 'debugger': 'on_unreachable'})
        self.assertFalse(result.needs_debugger())
        result = TaskResult(None, None, {'skipped': True, 'debugger': 'on_skipped'})
        self.assertTrue(result.needs_debugger())
        result = TaskResult(None, None, {'skipped': False, 'debugger': 'on_skipped'})
        self.assertFalse(result.needs_debugger())

if __name__ == '__main__':
    unittest.main()