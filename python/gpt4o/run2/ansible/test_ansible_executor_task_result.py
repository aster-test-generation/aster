import unittest
from ansible.executor.task_result import TaskResult
from unittest.mock import MagicMock


class TestTaskResult(unittest.TestCase):

    def setUp(self):
        self.host = MagicMock()
        self.task = MagicMock()
        self.return_data = {'changed': True, 'skipped': False, 'failed': False, 'unreachable': False}
        self.task_fields = {'name': 'test_task', 'debugger': 'always'}
        self.instance = TaskResult(self.host, self.task, self.return_data, self.task_fields)

    def test_init(self):
        self.assertEqual(self.instance._host, self.host)
        self.assertEqual(self.instance._task, self.task)
        self.assertEqual(self.instance._result, self.return_data)
        self.assertEqual(self.instance._task_fields, self.task_fields)

    def test_task_name(self):
        self.assertEqual(self.instance.task_name, 'test_task')

    def test_is_changed(self):
        self.assertTrue(self.instance.is_changed())

    def test_is_skipped(self):
        self.assertFalse(self.instance.is_skipped())

    def test_is_failed(self):
        self.assertFalse(self.instance.is_failed())

    def test_is_unreachable(self):
        self.assertFalse(self.instance.is_unreachable())

    def test_needs_debugger(self):
        self.assertTrue(self.instance.needs_debugger(globally_enabled=True))

    def test_check_key(self):
        self.assertTrue(self.instance._check_key('changed'))
        self.assertFalse(self.instance._check_key('nonexistent_key'))

    def test_clean_copy(self):
        clean_instance = self.instance.clean_copy()
        self.assertIsInstance(clean_instance, TaskResult)
        self.assertNotEqual(clean_instance._result, self.instance._result)

if __name__ == '__main__':
    unittest.main()