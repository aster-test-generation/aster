import unittest
from ansible.plugins.callback.yaml import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_start_task(self):
        cb = CallbackModule()
        task = Mock()
        task.get_name.return_value = 'test_task'
        task.get_path.return_value = '/path/to/task'
        cb._start_task(task)
        self.assertEqual(len(cb._task_data), 1)
        self.assertEqual(cb._task_data[0].name, 'test_task')
        self.assertEqual(cb._task_data[0].path, '/path/to/task')

    def test_finish_task(self):
        cb = CallbackModule()
        task = Mock()
        task.get_name.return_value = 'test_task'
        task.get_path.return_value = '/path/to/task'
        cb._start_task(task)
        result = Mock()
        result._task = task
        result._host = Mock()
        result._host.name = 'test_host'
        cb._finish_task('ok', result)
        self.assertEqual(len(cb._task_data[0].host_data), 1)
        self.assertEqual(cb._task_data[0].host_data[0].name, 'test_host')
        self.assertEqual(cb._task_data[0].host_data[0].status, 'ok')

    def test_build_test_case(self):
        cb = CallbackModule()
        task = Mock()
        task.get_name.return_value = 'test_task'
        task.get_path.return_value = '/path/to/task'
        cb._start_task(task)
        result = Mock()
        result._task = task
        result._host = Mock()
        result._host.name = 'test_host'
        cb._finish_task('ok', result)
        test_case = cb._build_test_case(cb._task_data[0], cb._task_data[0].host_data[0])
        self.assertEqual(test_case.name, '[test_host] /path/to/task: test_task')
        self.assertEqual(test_case.classname, '/path/to/task')
        self.assertEqual(test_case.time, 0)
        self.assertEqual(test_case.system_out, '')

if __name__ == '__main__':
    unittest.main()