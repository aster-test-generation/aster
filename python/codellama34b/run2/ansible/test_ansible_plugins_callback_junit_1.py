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
        pass

    def test_finish_task(self):
        pass

    def test_build_test_case(self):
        pass

    def test_cleanse_string(self):
        pass

    def test_generate_report(self):
        pass

    def test_v2_playbook_on_start(self):
        pass

    def test_v2_playbook_on_play_start(self):
        pass

    def test_v2_runner_on_no_hosts(self):
        pass

    def test_v2_playbook_on_task_start(self):
        pass

    def test_v2_playbook_on_cleanup_task_start(self):
        pass

    def test_v2_playbook_on_handler_task_start(self):
        pass

if __name__ == '__main__':
    unittest.main()