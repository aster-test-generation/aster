import unittest
from ansible.plugins.callback import CallbackModule, TaskData, HostData, TestCase, TestError, TestFailure, TestSuite, TestSuite


class TestCallbackModule(unittest.TestCase):
    def test___init__(self):
        instance = CallbackModule()
        self.assertIsNotNone(instance)

    def test__start_task(self):
        instance = CallbackModule()
        task = MockTask()
        instance._start_task(task)
        self.assertIn(task._uuid, instance._task_data)

    def test__finish_task(self):
        instance = CallbackModule()
        task_uuid = '123'
        result = MockResult()
        instance._task_data[task_uuid] = TaskData(task_uuid, 'name', 'path', 'play', 'action')
        instance._finish_task('ok', result)
        self.assertIn(task_uuid, instance._task_data)

    def test__build_test_case(self):
        instance = CallbackModule()
        task_data = TaskData('123', 'name', 'path', 'play', 'action')
        host_data = HostData('456', 'host_name', 'ok', MockResult())
        test_case = instance._build_test_case(task_data, host_data)
        self.assertIsInstance(test_case, TestCase)

    def test__cleanse_string(self):
        instance = CallbackModule()
        value = 'hello world'
        cleansed_value = instance._cleanse_string(value)
        self.assertEqual(cleansed_value, value)

    def test__generate_report(self):
        instance = CallbackModule()
        instance._task_data = {'123': TaskData('123', 'name', 'path', 'play', 'action')}
        instance._playbook_name = 'playbook_name'
        report = instance._generate_report()
        self.assertIsInstance(report, str)

    def test_v2_playbook_on_start(self):
        instance = CallbackModule()
        playbook = MockPlaybook()
        instance.v2_playbook_on_start(playbook)
        self.assertEqual(instance._playbook_path, playbook._file_name)

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

class MockTask:
    def __init__(self):
        self._uuid = '123'
        self.get_name = lambda: 'task_name'
        self.get_path = lambda: 'task_path'
        self.action = 'task_action'
        self.args = {'arg1': 'value1'}

class MockResult:
    def __init__(self):
        self._result = {'rc': 0, 'changed': False}

class MockPlaybook:
    def __init__(self):
        self._file_name = 'playbook_file_name'

class MockPlay:
    def __init__(self):
        self.get_name = lambda: 'play_name'

if __name__ == '__main__':
    unittest.main()