import unittest
import os
import time
from unittest.mock import MagicMock, patch
from ansible.plugins.callback.junit import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_init(self):
        self.assertEqual(self.callback._output_dir, os.path.expanduser('~/.ansible.log'))
        self.assertEqual(self.callback._task_class, 'false')
        self.assertEqual(self.callback._task_relative_path, '')
        self.assertEqual(self.callback._fail_on_change, 'false')
        self.assertEqual(self.callback._fail_on_ignore, 'false')
        self.assertEqual(self.callback._include_setup_tasks_in_report, 'true')
        self.assertEqual(self.callback._hide_task_arguments, 'false')
        self.assertEqual(self.callback._test_case_prefix, '')
        self.assertIsNone(self.callback._playbook_path)
        self.assertIsNone(self.callback._playbook_name)
        self.assertIsNone(self.callback._play_name)
        self.assertFalse(self.callback.disabled)
        self.assertTrue(os.path.exists(self.callback._output_dir))

    def test_start_task(self):
        task = MagicMock()
        task._uuid = '1234'
        task.get_name.return_value = 'test_task'
        task.get_path.return_value = '/path/to/task'
        task.action = 'action'
        task.no_log = False
        task.args = {'arg1': 'value1'}

        self.callback._play_name = 'test_play'
        self.callback._start_task(TaskData(task))
        self.assertIn('1234', self.callback._task_data)

    def test_finish_task(self):
        task = MagicMock()
        task._uuid = '1234'
        task.get_name.return_value = 'test_task'
        task.get_path.return_value = '/path/to/task'
        task.action = 'action'
        task.no_log = False
        task.args = {'arg1': 'value1'}

        result = MagicMock()
        result._task = task
        result._host = MagicMock()
        result._host._uuid = 'host1234'
        result._host.name = 'host_name'
        result._result = {'changed': False}

        self.callback._play_name = 'test_play'
        self.callback._start_task(TaskData(task))
        self.callback._finish_task('ok', result)
        self.assertIn('host1234', self.callback._task_data['1234'].host_data)

    def test_build_test_case(self):
        task_data = MagicMock()
        task_data.play = 'test_play'
        task_data.name = 'test_task'
        task_data.path = '/path/to/task'
        task_data.start = time.time()

        host_data = MagicMock()
        host_data.name = 'host_name'
        host_data.finish = time.time()
        host_data.status = 'ok'
        host_data.result = MagicMock()
        host_data.result._result = {'rc': 0}

        test_case = self.callback._build_test_case(task_data, host_data)
        self.assertEqual(test_case.name, '[host_name] test_play: test_task')

    def test_cleanse_string(self):
        result = self.callback._cleanse_string('test_string')
        self.assertEqual(result, 'test_string')

    @patch('ansible.plugins.callback.junit.to_bytes')
    @patch('ansible.plugins.callback.junit.open')
    def test_generate_report(self, mock_open, mock_to_bytes):
        task_data = MagicMock()
        task_data.action = 'action'
        task_data.host_data = {'host1234': MagicMock()}

        self.callback._task_data = {'1234': task_data}
        self.callback._playbook_name = 'test_playbook'
        self.callback._generate_report.return_value = None
        self.assertTrue(mock_open.called)

    def test_v2_playbook_on_start(self):
        playbook = MagicMock()
        playbook._file_name = '/path/to/playbook.yml'
        self.callback.v2_playbook_on_start(playbook)
        self.assertEqual(self.callback._playbook_path, '/path/to/playbook.yml')
        self.assertEqual(self.callback._playbook_name, 'playbook')

    def test_v2_playbook_on_play_start(self):
        play = MagicMock()
        play.get_name.return_value = 'test_play'
        self.callback.v2_playbook_on_play_start(play)
        self.assertEqual(self.callback._play_name, 'test_play')

    def test_v2_runner_on_no_hosts(self):
        task = MagicMock()
        task._uuid = '1234'
        self.callback.v2_runner_on_no_hosts(TaskData)
        self.assertIn('1234', self.callback._task_data)

    def test_v2_playbook_on_task_start(self):
        task = MagicMock()
        task._uuid = '1234'
        self.callback.v2_playbook_on_task_start(TaskData, False)
        self.assertIn('1234', self.callback._task_data)

    def test_v2_playbook_on_cleanup_task_start(self):
        task = MagicMock()
        task._uuid = '1234'
        self.callback.v2_playbook_on_cleanup_task_start(TaskData(task))
        self.assertIn('1234', self.callback._task_data)

    def test_v2_playbook_on_handler_task_start(self):
        task = MagicMock()
        task._uuid = '1234'
        self.callback.v2_playbook_on_handler_task_start(TaskData(task))
        self.assertIn('1234', self.callback._task_data)

if __name__ == '__main__':
    unittest.main()