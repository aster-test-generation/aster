import os
import unittest
from ansible.plugins.callback.yaml import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        instance = CallbackModule()
        self.assertEqual(instance._output_dir, os.path.expanduser('~/.ansible.log'))
        self.assertEqual(instance._task_class, 'False')
        self.assertEqual(instance._task_relative_path, '')
        self.assertEqual(instance._fail_on_change, 'False')
        self.assertEqual(instance._fail_on_ignore, 'False')
        self.assertEqual(instance._include_setup_tasks_in_report, 'True')
        self.assertEqual(instance._hide_task_arguments, 'False')
        self.assertEqual(instance._test_case_prefix, '')
        self.assertEqual(instance._playbook_path, None)
        self.assertEqual(instance._playbook_name, None)
        self.assertEqual(instance._play_name, None)
        self.assertEqual(instance._task_data, None)
        self.assertEqual(instance.disabled, False)
        self.assertEqual(instance._task_data, {})

    def test_start_task(self):
        instance = CallbackModule()
        task = None
        instance._start_task(task)
        self.assertEqual(instance._task_data, {})

    def test_finish_task(self):
        instance = CallbackModule()
        status = None
        result = None
        instance._finish_task(status, result)
        self.assertEqual(instance._task_data, {})

    def test_build_test_case(self):
        instance = CallbackModule()
        task_data = None
        host_data = None
        result = instance._build_test_case(task_data, host_data)
        self.assertEqual(result, None)

    def test_generate_report(self):
        instance = CallbackModule()
        instance._generate_report()
        self.assertEqual(instance._task_data, {})

    def test_v2_playbook_on_start(self):
        instance = CallbackModule()
        playbook = None
        instance.v2_playbook_on_start(playbook)
        self.assertEqual(instance._playbook_path, None)
        self.assertEqual(instance._playbook_name, None)

    def test_v2_playbook_on_play_start(self):
        instance = CallbackModule()
        play = None
        instance.v2_playbook_on_play_start(play)
        self.assertEqual(instance._play_name, None)

    def test_v2_runner_on_no_hosts(self):
        instance = CallbackModule()
        task = None
        instance.v2_runner_on_no_hosts(task)
        self.assertEqual(instance._task_data, {})

    def test_v2_playbook_on_task_start(self):
        instance = CallbackModule()
        task = None
        is_conditional = None
        instance.v2_playbook_on_task_start(task, is_conditional)
        self.assertEqual(instance._task_data, {})

    def test_v2_playbook_on_cleanup_task_start(self):
        instance = CallbackModule()
        task = None
        instance.v2_playbook_on_cleanup_task_start(task)
        self.assertEqual(instance._task_data, {})

    def test_v2_playbook_on_handler_task_start(self):
        instance = CallbackModule()
        task = None
        instance.v2_playbook_on_handler_task_start(task)
        self.assertEqual(instance._task_data, {})

if __name__ == '__main__':
    unittest.main()