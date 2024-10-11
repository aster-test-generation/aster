import unittest
from ansible.executor.task_result import TaskResult

class TestTaskResult(unittest.TestCase):
    def test_task_result_init(self):
        task_result = TaskResult('host', 'task', 'return_data', 'task_fields')
        self.assertEqual(task_result.task_name, 'task')
        self.assertEqual(task_result.is_changed(), False)
        self.assertEqual(task_result.is_skipped(), False)
        self.assertEqual(task_result.is_failed(), False)
        self.assertEqual(task_result.is_unreachable(), False)
        self.assertEqual(task_result.needs_debugger(), False)

    def test_task_result_clean_copy(self):
        task_result = TaskResult('host', 'task', 'return_data', 'task_fields')
        clean_task_result = task_result.clean_copy()
        self.assertEqual(clean_task_result.task_name, 'task')
        self.assertEqual(clean_task_result.is_changed(), False)
        self.assertEqual(clean_task_result.is_skipped(), False)
        self.assertEqual(clean_task_result.is_failed(), False)
        self.assertEqual(clean_task_result.is_unreachable(), False)
        self.assertEqual(clean_task_result.needs_debugger(), False)

if __name__ == '__main__':
    unittest.main()