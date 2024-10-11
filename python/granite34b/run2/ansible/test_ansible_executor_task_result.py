import unittest
from ansible.executor.task_result import TaskResult


class TestTaskResult(unittest.TestCase):
    def test_task_name(self):
        task_result = TaskResult(None, None, {}, {'name': 'test_task'})
        self.assertEqual(task_result.task_name, 'test_task')

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
        self.assertTrue(task_result.needs_debugger(globally_enabled=True))

    def test_clean_copy(self):
        task_result = TaskResult(None, None, {'changed': True, 'skipped': True, 'failed': True, 'unreachable': True})
        clean_task_result = task_result.clean_copy()
        self.assertEqual(clean_task_result._result, {'changed': True, 'skipped': True, 'failed': True, 'unreachable': True})

class TestTaskResult(unittest.TestCase):
    def setUp(self):
        self.host = 'localhost'
        self.task = 'my_task'
        self.return_data = {'key': 'value'}
        self.task_fields = {'name': 'my_task_name'}
        self.task_result = TaskResult(self.host, self.task, self.return_data, self.task_fields)

    def test_task_name(self):
        self.assertEqual(self.task_result.task_name, 'my_task_name')

    def test_is_changed(self):
        self.assertFalse(self.task_result.is_changed())

    def test_is_skipped(self):
        self.assertFalse(self.task_result.is_skipped())

    def test_is_failed(self):
        self.assertFalse(self.task_result.is_failed())

    def test_is_unreachable(self):
        self.assertFalse(self.task_result.is_unreachable())

    def test_needs_debugger(self):
        self.assertFalse(self.task_result.needs_debugger())

    def test_clean_copy(self):
        clean_result = self.task_result.clean_copy()
        self.assertEqual(clean_result._result, {'key': 'value'})

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