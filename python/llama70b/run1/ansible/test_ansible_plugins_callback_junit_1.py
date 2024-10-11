import unittest
from ansible.plugins.callback import CallbackModule, TaskData, HostData, TestCase, TestError, TestFailure, TestSuite, TestSuite


class TestCallbackModule(unittest.TestCase):
    def test___init__(self):
        instance = CallbackModule()
        self.assertIsNotNone(instance._output_dir)
        self.assertIsNotNone(instance._task_class)
        self.assertIsNotNone(instance._task_relative_path)
        self.assertIsNotNone(instance._fail_on_change)
        self.assertIsNotNone(instance._fail_on_ignore)
        self.assertIsNotNone(instance._include_setup_tasks_in_report)
        self.assertIsNotNone(instance._hide_task_arguments)
        self.assertIsNotNone(instance._test_case_prefix)
        self.assertIsNotNone(instance._playbook_path)
        self.assertIsNotNone(instance._playbook_name)
        self.assertIsNotNone(instance._play_name)
        self.assertIsNotNone(instance._task_data)

    def test__start_task(self):
        instance = CallbackModule()
        task = MockTask()
        instance._start_task(task)
        self.assertIn(task._uuid, instance._task_data)

    def test__finish_task(self):
        instance = CallbackModule()
        task_uuid = '12345'
        result = MockResult()
        instance._task_data[task_uuid] = TaskData(task_uuid, 'task_name', 'path', 'play', 'action')
        instance._finish_task('ok', result)
        self.assertIn(task_uuid, instance._task_data)
        self.assertEqual(instance._task_data[task_uuid].hosts[0].status, 'ok')

    def test__build_test_case(self):
        instance = CallbackModule()
        task_data = TaskData('12345', 'task_name', 'path', 'play', 'action')
        host_data = HostData('host_uuid', 'host_name', 'ok', MockResult())
        test_case = instance._build_test_case(task_data, host_data)
        self.assertIsInstance(test_case, TestCase)

    def test__cleanse_string(self):
        instance = CallbackModule()
        value = 'hello world'
        cleansed_value = instance._cleanse_string(value)
        self.assertEqual(cleansed_value, value)

    def test__generate_report(self):
        instance = CallbackModule()
        instance._task_data = {'12345': TaskData('12345', 'task_name', 'path', 'play', 'action')}
        instance._playbook_name = 'playbook_name'
        report = instance._generate_report()
        self.assertIsInstance(report, str)

    def test_v2_playbook_on_start(self):
        instance = CallbackModule()
        playbook = MockPlaybook()
        instance.v2_playbook_on_start(playbook)
        self.assertEqual(instance._playbook_path, playbook._file_name)
        self.assertEqual(instance._playbook_name, os.path.splitext(os.path.basename(playbook._file_name))[0])

    def test_v2_playbook_on_play_start(self):
        instance = CallbackModule()
        play = MockPlay()
        instance.v2_playbook_on_play_start(play)
        self.assertEqual(instance._play_name, play.get_name())

    def test_v2_runner_on_no_hosts(self):
        instance = CallbackModule()
        task = MockTask()
        instance.v2_runner_on_no_hosts(task)
        self.assertIn(task._uuid, instance._task_data)

    def test_v2_playbook_on_task_start(self):
        instance = CallbackModule()
        task = MockTask()
        instance.v2_playbook_on_task_start(task, True)
        self.assertIn(task._uuid, instance._task_data)

    def test_v2_playbook_on_cleanup_task_start(self):
        instance = CallbackModule()
        task = MockTask()
        instance.v2_playbook_on_cleanup_task_start(task)
        self.assertIn(task._uuid, instance._task_data)

    def test_v2_playbook_on_handler_task_start(self):
        instance = CallbackModule()
        task = MockTask()
        instance.v2_playbook_on_handler_task_start(task)
        self.assertIn(task._uuid, instance._task_data)

class TestTaskData(unittest.TestCase):
    def test___init__(self):
        task_data = TaskData('12345', 'task_name', 'path', 'play', 'action')
        self.assertEqual(task_data.uuid, '12345')
        self.assertEqual(task_data.name, 'task_name')
        self.assertEqual(task_data.path, 'path')
        self.assertEqual(task_data.play, 'play')
        self.assertEqual(task_data.action, 'action')
        self.assertEqual(task_data.host_data, {})

    def test_add_host(self):
        task_data = TaskData('12345', 'task_name', 'path', 'play', 'action')
        host_data = HostData('host_uuid', 'host_name', 'ok', MockResult())
        task_data.add_host(host_data)
        self.assertIn(host_data.uuid, task_data.host_data)


if __name__ == '__main__':
    unittest.main()