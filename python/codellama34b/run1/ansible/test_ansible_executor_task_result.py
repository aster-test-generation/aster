import unittest
from ansible.executor.task_result import TaskResult


class TestTaskResult(unittest.TestCase):
    def test_init(self):
        instance = TaskResult(None, None, None)
        self.assertIsInstance(instance, TaskResult)

    def test_task_name(self):
        instance = TaskResult(None, None, None)
        result = instance.task_name
        self.assertIsNone(result)

    def test_is_changed(self):
        instance = TaskResult(None, None, None)
        result = instance.is_changed()
        self.assertFalse(result)

    def test_is_skipped(self):
        instance = TaskResult(None, None, None)
        result = instance.is_skipped()
        self.assertFalse(result)

    def test_is_failed(self):
        instance = TaskResult(None, None, None)
        result = instance.is_failed()
        self.assertFalse(result)

    def test_is_unreachable(self):
        instance = TaskResult(None, None, None)
        result = instance.is_unreachable()
        self.assertFalse(result)

    def test_needs_debugger(self):
        instance = TaskResult(None, None, None)
        result = instance.needs_debugger()
        self.assertFalse(result)

    def test_clean_copy(self):
        instance = TaskResult(None, None, None)
        result = instance.clean_copy()
        self.assertIsInstance(result, TaskResult)


if __name__ == '__main__':
    unittest.main()