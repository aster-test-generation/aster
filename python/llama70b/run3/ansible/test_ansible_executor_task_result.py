import unittest
from ansible.executor.task_result import TaskResult 


class TestTaskResult(unittest.TestCase):
    def test_init(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'result': 'success'}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(instance._host, host)
        self.assertEqual(instance._task, task)
        self.assertEqual(instance._result, return_data)
        self.assertEqual(instance._task_fields, task_fields)

    def test_task_name(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'result': 'success'}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(instance.task_name, 'dummy_task')

    def test_is_changed(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'changed': True}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_changed())

    def test_is_skipped(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'skipped': True}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_skipped())

    def test_is_failed(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'failed': True}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_failed())

    def test_is_unreachable(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'unreachable': True}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.is_unreachable())

    def test_needs_debugger(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'failed': True}
        task_fields = {'debugger': 'always'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance.needs_debugger())

    def test_check_key(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'changed': True}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertTrue(instance._check_key('changed'))

    def test_clean_copy(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'result': 'success', 'changed': True}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        clean_instance = instance.clean_copy()
        self.assertEqual(clean_instance._result, {'result': 'success', 'changed': True})

    def test_private_method(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'result': 'success'}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        result = instance._TaskResult__check_key('result')
        self.assertTrue(result)

    def test_magic_method_str(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'result': 'success'}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(str(instance), 'TaskResult')

    def test_magic_method_repr(self):
        host = 'localhost'
        task = 'dummy_task'
        return_data = {'result': 'success'}
        task_fields = {'name': 'dummy_task'}
        instance = TaskResult(host, task, return_data, task_fields)
        self.assertEqual(repr(instance), 'TaskResult(localhost, dummy_task, {"result": "success"})')

if __name__ == '__main__':
    unittest.main()