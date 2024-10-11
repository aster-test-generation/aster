import unittest
from ansible.executor.task_result import TaskResult


class TestTaskResult(unittest.TestCase):
    def test_task_name(self):
        host = None
        task = None
        return_data = None
        task_fields = None
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance.task_name
        self.assertEqual(result, None)

    def test_is_changed(self):
        host = None
        task = None
        return_data = None
        task_fields = None
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance.is_changed()
        self.assertEqual(result, False)

    def test_is_skipped(self):
        host = None
        task = None
        return_data = None
        task_fields = None
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance.is_skipped()
        self.assertEqual(result, False)

    def test_is_failed(self):
        host = None
        task = None
        return_data = None
        task_fields = None
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance.is_failed()
        self.assertEqual(result, False)

    def test_is_unreachable(self):
        host = None
        task = None
        return_data = None
        task_fields = None
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance.is_unreachable()
        self.assertEqual(result, False)

    def test_needs_debugger(self):
        host = None
        task = None
        return_data = None
        task_fields = None
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance.needs_debugger(globally_enabled=False)
        self.assertEqual(result, False)

    def test_clean_copy(self):
        host = None
        task = None
        return_data = None
        task_fields = None
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance.clean_copy()
        self.assertEqual(result, TaskResult(host, task, {}, task_fields))


if __name__ == '__main__':
    unittest.main()