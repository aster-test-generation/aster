import unittest
from ansible.plugins.callback.junit import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_start_task(self):
        task = Mock()
        task._uuid = '1234'
        task.get_name.return_value = 'task_name'
        task.get_path.return_value = '/path/to/task'
        task.action = 'action'
        task.no_log = False
        task.args = {'arg1': 'value1', 'arg2': 'value2'}

        self.callback._start_task(task)

        self.assertEqual(self.callback._task_data['1234'].name, 'task_name arg1=value1, arg2=value2')
        self.assertEqual(self.callback._task_data['1234'].path, '/path/to/task')
        self.assertEqual(self.callback._task_data['1234'].play, 'play_name')
        self.assertEqual(self.callback._task_data['1234'].action, 'action')

    def test_finish_task(self):
        task = Task()
        task._uuid = '1234'
        result = MockResult()
        result._task = task
        result._host = MockHost()
        result._host._uuid = '5678'
        result._host.name = 'host_name'
        result._result = {'rc': 0, 'msg': 'Task completed successfully', 'changed': False}

        self.callback._task_data['1234'] = TaskData('1234', 'task_name', '/path/to/task', 'play_name', 'action')

        self.callback._finish_task('ok', result)

        self.assertEqual(self.callback._task_data['1234'].host_data['5678'].status, 'ok')
        self.assertEqual(self.callback._task_data['1234'].host_data['5678'].result, result)

    def test_build_test_case(self):
        task_data = TaskData('1234', 'task_name', '/path/to/task', 'play_name', 'action', 'host_name')
        host_data = HostData('5678', 'host_name', 'ok', MockResult())

        test_case = self.callback._build_test_case(task_data, host_data)

        self.assertEqual(test_case.name, '[host_name] play_name: task_name')
        self.assertEqual(test_case.classname, '/path/to/task')
        self.assertEqual(test_case.time, 0.0)
        self.assertEqual(test_case.system_out, '')

    def test_generate_report(self):
        from unittest.mock import MagicMock
        test_suite = TestSuite(name='test_suite', cases=test_cases)
        test_suites = TestSuites(suites=[test_suite])
        report = test_suites.to_pretty_xml()

        self.callback._task_data = {'1234': TaskData('1234', 'task_name', '/path/to/task', 'play_name', 'action')}
        self.callback._playbook_name = 'playbook_name'

        self.callback._generate_report()

        with open(os.path.join(self.callback._output_dir, 'playbook_name-timestamp.xml'), 'r') as xml:
            self.assertEqual(xml.read(), report)

if __name__ == '__main__':
    unittest.main()