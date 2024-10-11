import unittest
from ansible.executor.task_result import TaskResult

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
        self.task_result._result['changed'] = True
        self.assertTrue(self.task_result.is_changed())

    def test_is_skipped(self):
        self.task_result._result['skipped'] = True
        self.assertTrue(self.task_result.is_skipped())

    def test_is_failed(self):
        self.task_result._result['failed'] = True
        self.assertTrue(self.task_result.is_failed())

    def test_is_unreachable(self):
        self.task_result._result['unreachable'] = True
        self.assertTrue(self.task_result.is_unreachable())

    def test_needs_debugger(self):
        self.task_result._task_fields['debugger'] = 'always'
        self.assertTrue(self.task_result.needs_debugger(globally_enabled=True))

    def test_clean_copy(self):
        clean_result = self.task_result.clean_copy()
        self.assertEqual(clean_result._result, {'key': 'value'})

if __name__ == '__main__':
    unittest.main()