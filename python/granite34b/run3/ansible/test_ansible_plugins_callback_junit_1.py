import unittest
from ansible.plugins.callback.junit import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_start_task(self):
        from unittest.mock import MagicMock
        task._uuid = '1234'
        task.get_name.return_value = 'task_name'
        task.get_path.return_value = '/path/to/task'
        task.action = 'action'
        self.callback._start_task(task)
        self.assertIn('1234', self.callback._task_data)
        task.get_name.assert_called_once()
        task.get_path.assert_called_once()

    def test_finish_task(self):
        from unittest.mock import MagicMock
        result._task._uuid = '1234'
        result._host._uuid = '5678'
        result._host.name = 'host_name'
        self.callback._task_data['1234'] = TaskData('1234', 'task_name', '/path/to/task', 'play_name', 'action')
        self.callback._finish_task('ok', result)
        self.assertEqual(self.callback._task_data['1234'].host_data['5678'].status, 'ok')
        self.assertEqual(self.callback._task_data['1234'].host_data['5678'].result, result)

    def test_build_test_case(self):
        task_data = TaskData('1234', 'task_name', '/path/to/task', 'play_name', 'action', 'localhost')
        host_data = HostData('5678', 'host_name', 'ok', MagicMock())
        test_case = self.callback._build_test_case(task_data, host_data)
        self.assertEqual(test_case.name, '[host_name] play_name: task_name')
        self.assertEqual(test_case.classname, '/path/to/task')
        self.assertEqual(test_case.time, 0)
        self.assertEqual(test_case.system_out, '')

    def test_generate_report(self):
        test_cases = []
        for task_uuid, task_data in self.callback._task_data.items():
            for host_uuid, host_data in task_data.host_data.items():
                test_cases.append(self.callback._build_test_case(task_data, host_data))
        test_suite = TestSuite(name=self.callback._playbook_name, tests=test_cases)
        test_suites = TestSuites(suites=[test_suite])
        report = test_suites.to_pretty_xml()
        output_file = os.path.join(self.callback._output_dir, '%s-%s.xml' % (self.callback._playbook_name, time.time()))
        with open(output_file, 'wb') as xml:
            xml.write(to_bytes(report, errors='surrogate_or_strict'))

if __name__ == '__main__':
    unittest.main()