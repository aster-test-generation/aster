import unittest
from ansible.executor.task_result import TaskResult


class TestTaskResult(unittest.TestCase):
    def test_init(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'changed': True, 'results': [{'changed': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(instance._host, host)
        self.assertEqual(instance._task, task)
        self.assertEqual(instance._result, return_data)
        self.assertEqual(instance._task_fields, task_fields)

    def test_task_name(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'changed': True, 'results': [{'changed': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(instance.task_name, task)

    def test_is_changed(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'changed': True, 'results': [{'changed': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_changed())

    def test_is_skipped(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'results': [{'skipped': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_skipped())

    def test_is_failed(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'failed': True}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_failed())

    def test_is_unreachable(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'unreachable': True}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_unreachable())

    def test_needs_debugger(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'failed': True}
        task_fields = {'debugger': 'always'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.needs_debugger())

    def test_clean_copy(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'changed': True, 'results': [{'changed': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        clean_instance = instance.clean_copy()
        self.assertEqual(clean_instance._host, host)
        self.assertEqual(clean_instance._task, task)
        self.assertEqual(clean_instance._result, return_data)
        self.assertEqual(clean_instance._task_fields, task_fields)

    def test_private_method(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'changed': True, 'results': [{'changed': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(instance._check_key('changed'), True)

    def test_str_method(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'changed': True, 'results': [{'changed': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(str(instance), 'TaskResult')

    def test_repr_method(self):
        host = 'localhost'
        task = 'task_name'
        return_data = {'changed': True, 'results': [{'changed': True}]}
        task_fields = {'name': 'task_name'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(repr(instance), 'TaskResult(host=localhost, task=task_name, return_data={...}, task_fields={...})')

if __name__ == '__main__':
    unittest.main()