import unittest
from unittest.mock import patch, Mock
from ansible.plugins.callback import CallbackModul


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_init(self):
        self.assertEqual(self.callback._output_dir, os.path.expanduser('~/.ansible.log'))
        self.assertEqual(self.callback._task_class, 'False')
        self.assertEqual(self.callback._task_relative_path, '')
        self.assertEqual(self.callback._fail_on_change, 'False')
        self.assertEqual(self.callback._fail_on_ignore, 'False')
        self.assertEqual(self.callback._include_setup_tasks_in_report, 'True')
        self.assertEqual(self.callback._hide_task_arguments, 'False')
        self.assertEqual(self.callback._test_case_prefix, '')

    def test_start_task(self):
        task = Mock()
        self.callback._start_task(task)
        self.assertIn(task._uuid, self.callback._task_data)

    def test_finish_task(self):
        task = Mock()
        result = Mock()
        self.callback._finish_task('ok', result)
        self.assertEqual(self.callback._task_data[task._uuid].status, 'ok')

    def test_build_test_case(self):
        task_data = Mock()
        host_data = Mock()
        test_case = self.callback._build_test_case(task_data, host_data)
        self.assertIsInstance(test_case, unittest.mock._mock.Mock)

    def test_generate_report(self):
        self.callback._generate_report()
        self.assertTrue(os.path.exists(self.callback._output_dir))

    def test_v2_playbook_on_start(self):
        playbook = Mock()
        self.callback.v2_playbook_on_start(playbook)
        self.assertEqual(self.callback._playbook_path, playbook._file_name)
        self.assertEqual(self.callback._playbook_name, os.path.splitext(os.path.basename(self.callback._playbook_path))[0])

    def test_v2_playbook_on_play_start(self):
        play = Mock()
        self.callback.v2_playbook_on_play_start(play)
        self.assertEqual(self.callback._play_name, play.get_name())

    def test_v2_runner_on_no_hosts(self):
        task = Mock()
        self.callback.v2_runner_on_no_hosts(task)
        self.callback._start_task(task)

    def test_v2_playbook_on_task_start(self):
        task = Mock()
        self.callback.v2_playbook_on_task_start(task, True)
        self.callback._start_task(task)

    def test_v2_playbook_on_cleanup_task_start(self):
        task = Mock()
        self.callback.v2_playbook_on_cleanup_task_start(task)
        self.callback._start_task(task)

    def test_v2_playbook_on_handler_task_start(self):
        task = Mock()
        self.callback.v2_playbook_on_handler_task_start(task)
        self.callback._start_task(task)

if __name__ == '__main__':
    unittest.main()