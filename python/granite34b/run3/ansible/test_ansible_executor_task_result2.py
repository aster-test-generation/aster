import unittest
from ansible.executor.task_result import TaskResult

class TestTaskResult(unittest.TestCase):
    def test_task_name(self):
        task_result = TaskResult(None, None, {})
        self.assertEqual(task_result.task_name, None)

    def test_is_changed(self):
        task_result = TaskResult(None, None, {'changed': True})
        self.assertTrue(task_result.is_changed())

    def test_is_skipped(self):
        task_result = TaskResult(None, None, {'skipped': True})
        self.assertTrue(task_result.is_skipped())

    def test_is_failed(self):
        task_result = TaskResult(None, None, {'failed': True})
        self.assertTrue(task_result.is_failed())

    def test_is_unreachable(self):
        task_result = TaskResult(None, None, {'unreachable': True})
        self.assertTrue(task_result.is_unreachable())

    def test_needs_debugger(self):
        task_result = TaskResult(None, None, {'failed': True})
        self.assertTrue(task_result.needs_debugger())

    def test_clean_copy(self):
        task_result = TaskResult(None, None, {'changed': True})
        clean_task_result = task_result.clean_copy()
        self.assertEqual(clean_task_result._result, {'changed': True})

if __name__ == '__main__':
    unittest.main()