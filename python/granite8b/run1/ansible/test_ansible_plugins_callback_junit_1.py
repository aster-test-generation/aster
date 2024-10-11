import unittest
from ansible.plugins.callback import junit


class TestCallbackModule(unittest.TestCase):
    def test_start_task(self):
        cb = CallbackModule()
        task = Mock()
        task._uuid = '1234'
        cb._start_task(task)
        self.assertEqual(len(cb._task_data), 1)
        self.assertEqual(cb._task_data['1234'].name, '')
        self.assertEqual(cb._task_data['1234'].path, '')
        self.assertEqual(cb._task_data['1234'].play, '')
        self.assertEqual(cb._task_data['1234'].action, '')

    def test_finish_task(self):
        cb = CallbackModule()
        task = Mock()
        task._uuid = '1234'
        result = Mock()
        result._task = task
        result._host = Mock()
        result._host._uuid = '5678'
        cb._start_task(task)
        cb._finish_task('ok', result)
        self.assertEqual(len(cb._task_data['1234'].host_data), 1)
        self.assertEqual(cb._task_data['1234'].host_data['5678'].name, '')
        self.assertEqual(cb._task_data['1234'].host_data['5678'].status, 'ok')
        self.assertEqual(cb._task_data['1234'].host_data['5678'].result, result)

    def test_build_test_case(self):
        cb = CallbackModule()
        task = Mock()
        task._uuid = '1234'
        task.get_name.return_value = 'Test Task'
        task.get_path.return_value = '/path/to/task'
        result = Mock()
        result._task = task
        result._host = Mock()
        result._host._uuid = '5678'
        result._host.name = 'localhost'
        cb._start_task(task)
        cb._finish_task('ok', result)
        test_case = cb._build_test_case(cb._task_data['1234'], cb._task_data['1234'].host_data['5678'])
        self.assertEqual(test_case.name, '[localhost] /path/to/task: Test Task')
        self.assertEqual(test_case.classname, '/path/to/task')
        self.assertEqual(test_case.time, 0)
        self.assertEqual(test_case.system_out, '')

if __name__ == '__main__':
    unittest.main()