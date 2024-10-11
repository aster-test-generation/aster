import unittest
from ansible.executor.task_result import TaskResult


class TestTaskResult(unittest.TestCase):
    def test_init(self):
        host = 'localhost'
        task = 'task'
        return_data = {'changed': True}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(instance._host, host)
        self.assertEqual(instance._task, task)
        self.assertEqual(instance._result, return_data)
        self.assertEqual(instance._task_fields, task_fields)

    def test_task_name(self):
        host = 'localhost'
        task = 'task'
        return_data = {'changed': True}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(instance.task_name, 'task_name')

    def test_is_changed(self):
        host = 'localhost'
        task = 'task'
        return_data = {'changed': True}
        instance = TaskResult(host, task, return_data)
        self.assertTrue(instance.is_changed())

    def test_is_skipped(self):
        host = 'localhost'
        task = 'task'
        return_data = {'results': [{'skipped': True}]}
        instance = TaskResult(host, task, return_data)
        self.assertTrue(instance.is_skipped())

    def test_is_failed(self):
        host = 'localhost'
        task = 'task'
        return_data = {'failed': True}
        instance = TaskResult(host, task, return_data)
        self.assertTrue(instance.is_failed())

    def test_is_unreachable(self):
        host = 'localhost'
        task = 'task'
        return_data = {'unreachable': True}
        instance = TaskResult(host, task, return_data)
        self.assertTrue(instance.is_unreachable())

    def test_needs_debugger(self):
        host = 'localhost'
        task = 'task'
        return_data = {'failed': True}
        instance = TaskResult(host, task, return_data)
        self.assertTrue(instance.needs_debugger())

    def test_check_key(self):
        host = 'localhost'
        task = 'task'
        return_data = {'changed': True}
        instance = TaskResult(host, task, return_data)
        self.assertTrue(instance._check_key('changed'))

    def test_clean_copy(self):
        host = 'localhost'
        task = 'task'
        return_data = {'changed': True, 'results': [{'skipped': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        clean_instance = instance.clean_copy()
        self.assertEqual(clean_instance._result, {'changed': True})

if __name__ == '__main__':
    unittest.main()