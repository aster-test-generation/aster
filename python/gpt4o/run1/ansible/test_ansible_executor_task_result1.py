import unittest
from ansible.executor.task_result import TaskResult
from ansible.parsing.dataloader import DataLoader

class MockTask:
    def __init__(self, name, action, no_log=False):
        self.name = name
        self.action = action
        self.no_log = no_log

    def get_name(self):
        return self.name

class TestTaskResult(unittest.TestCase):
    def setUp(self):
        self.host = "localhost"
        self.task = MockTask(name="test_task", action="debug")
        self.return_data = {"changed": True, "skipped": False, "failed": False, "unreachable": False}
        self.task_fields = {"name": "test_task", "debugger": "always"}

    def test_init(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertEqual(result._host, self.host)
        self.assertEqual(result._task, self.task)
        self.assertEqual(result._result, self.return_data)
        self.assertEqual(result._task_fields, self.task_fields)

    def test_task_name(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertEqual(result.task_name, "test_task")

    def test_is_changed(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertTrue(result.is_changed())

    def test_is_skipped(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertFalse(result.is_skipped())

    def test_is_failed(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertFalse(result.is_failed())

    def test_is_unreachable(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertFalse(result.is_unreachable())

    def test_needs_debugger(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertTrue(result.needs_debugger(globally_enabled=True))

    def test_check_key(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        self.assertTrue(result._check_key('changed'))
        self.assertFalse(result._check_key('nonexistent_key'))

    def test_clean_copy(self):
        result = TaskResult(self.host, self.task, self.return_data, self.task_fields)
        clean_result = result.clean_copy()
        self.assertIsInstance(clean_result, TaskResult)
        self.assertNotEqual(clean_result._result, result._result)

if __name__ == '__main__':
    unittest.main()