import unittest
from ansible.plugins.callback import junit


class TestCallbackModule(unittest.TestCase):
    def test_start_task(self):
        cb = CallbackModule()
        task = Mock()
        task.get_name.return_value = 'Test Task'
        task.get_path.return_value = '/path/to/task'
        cb._start_task(task)
        self.assertEqual(len(cb._task_data), 1)
        uuid = task._uuid
        self.assertIn(uuid, cb._task_data)
        task_data = cb._task_data[uuid]
        self.assertEqual(task_data.name, 'Test Task')
        self.assertEqual(task_data.path, '/path/to/task')
        self.assertEqual(task_data.play, 'N/A')
        self.assertEqual(task_data.action, 'N/A')

    def test_finish_task(self):
        cb = CallbackModule()
        task = Mock()
        task.get_name.return_value = 'Test Task'
        task.get_path.return_value = '/path/to/task'
        cb._start_task(task)
        uuid = task._uuid
        result = Mock()
        result._task = task
        result._host = Mock()
        result._host.name = 'localhost'
        cb._finish_task('ok', result)
        self.assertEqual(len(cb._task_data[uuid].host_data), 1)
        host_data = cb._task_data[uuid].host_data['localhost']
        self.assertEqual(host_data.name, 'localhost')
        self.assertEqual(host_data.status, 'ok')
        self.assertEqual(host_data.result, result)

    def test_build_test_case(self):
        cb = CallbackModule()
        task = Mock()
        task.get_name.return_value = 'Test Task'
        task.get_path.return_value = '/path/to/task'
        cb._start_task(task)
        uuid = task._uuid
        result = Mock()
        result._task = task
        result._host = Mock()
        result._host.name = 'localhost'
        cb._finish_task('ok', result)
        test_case = cb._build_test_case(cb._task_data[uuid], cb._task_data[uuid].host_data['localhost'])
        self.assertEqual(test_case.name, '[localhost] N/A: Test Task')
        self.assertEqual(test_case.classname, '/path/to/task')
        self.assertEqual(test_case.time, 0)
        self.assertEqual(test_case.system_out, 'ok')

if __name__ == '__main__':
    unittest.main()