import unittest
from ansible.plugins.callback.junit import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_start_task(self):
        task = MockTask()
        task._uuid = '1234'
        task.get_name.return_value = 'task_name'
        task.get_path.return_value = '/path/to/task'
        task.action = 'action'
        self.callback._start_task(task)
        self.assertIn('1234', self.callback._task_data)
        task_data = self.callback._task_data['1234']
        self.assertEqual(task_data.uuid, '1234')
        self.assertEqual(task_data.name, 'task_name')
        self.assertEqual(task_data.path, '/path/to/task')
        self.assertEqual(task_data.play, 'play_name')
        self.assertEqual(task_data.action, 'action')

    def test_finish_task(self):
        task = Mock()
        task._uuid = '1234'
        result = MockResult()
        result._task = task
        result._host = MockHost()
        result._host._uuid = '5678'
        result._host.name = 'host_name'
        result._result = {'changed': True}
        self.callback._task_data['1234'] = TaskData('1234', 'task_name', '/path/to/task', 'play_name', 'action')
        self.callback._finish_task('ok', result)
        task_data = self.callback._task_data['1234']
        self.assertEqual(len(task_data.host_data), 1)
        host_data = task_data.host_data['5678']
        self.assertEqual(host_data.uuid, '5678')
        self.assertEqual(host_data.name, 'host_name')
        self.assertEqual(host_data.status, 'failed')
        self.assertEqual(host_data.result, result)

    def test_build_test_case(self):
        task_data = TaskData('1234', 'task_name', '/path/to/task', 'play_name', 'action', 'host_name')
        host_data = HostData('5678', 'host_name', 'ok', MockResult())
        test_case = self.callback._build_test_case(task_data, host_data)
        self.assertEqual(test_case.name, '[host_name] play_name: task_name')
        self.assertEqual(test_case.classname, '/path/to/task')
        self.assertEqual(test_case.time, 0)
        self.assertEqual(test_case.system_out, '')

    def test_generate_report(self):
        test_cases = []
        for i in range(3):
            task_data = TaskData(str(i), f'task_{i}', f'/path/to/task_{i}', 'play_name', 'action', 'host_name')
            host_data = HostData(str(i), f'host_{i}', 'ok', MockResult())
            test_cases.append(self.callback._build_test_case(task_data, host_data))
        self.callback._task_data = {str(i): task_data for i, task_data in enumerate(test_cases)}
        self.callback._generate_report()
        report_file = os.path.join(self.callback._output_dir, f'{self.callback._playbook_name}-{time.time()}.xml')
        self.assertTrue(os.path.exists(report_file))

if __name__ == '__main__':
    unittest.main()