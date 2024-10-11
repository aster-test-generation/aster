import unittest
from ansible.plugins.callback.yaml import *


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

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = None
        ignore_errors = False
        instance.v2_runner_on_failed(result, ignore_errors)
        self.assertEqual(instance._task_data, {})

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_ok(result)
        self.assertEqual(instance._task_data, {})

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_skipped(result)
        self.assertEqual(instance._task_data, {})

    def test_v2_playbook_on_include(self):
        instance = CallbackModule()
        included_file = None
        instance.v2_playbook_on_include(included_file)
        self.assertEqual(instance._task_data, {})

    def test_v2_playbook_on_stats(self):
        instance = CallbackModule()
        stats = None
        instance.v2_playbook_on_stats(stats)
        self.assertEqual(instance._task_data, {})

if __name__ == '__main__':
    unittest.main()