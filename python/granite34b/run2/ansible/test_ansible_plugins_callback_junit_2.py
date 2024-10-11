import os
import unittest
from ansible.plugins.callback.junit import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_init(self):
        self.assertEqual(self.callback._output_dir, os.path.expanduser('~/.ansible.log'))
        self.assertEqual(self.callback._task_class, 'false')
        self.assertEqual(self.callback._task_relative_path, '')
        self.assertEqual(self.callback._fail_on_change, 'False')
        self.assertEqual(self.callback._fail_on_ignore, 'False')
        self.assertEqual(self.callback._include_setup_tasks_in_report, 'True')
        self.assertEqual(self.callback._hide_task_arguments, 'False')
        self.assertEqual(self.callback._test_case_prefix, '')

    def test_v2_runner_on_failed(self):
        result = 'some result'
        self.callback.v2_runner_on_ok(result)
        self.assertEqual(self.callback._task_data['result'], 'failed')

    def test_v2_runner_on_ok(self):
        result = 'some result'
        self.callback._finish_task(result)
        self.assertEqual(self.callback._task_data['result'], 'ok')

    def test_v2_runner_on_skipped(self):
        result = 'some result'
        self.callback.v2_runner_on_ok(result)
        self.assertEqual(self.callback._task_data['result'], 'skipped')

    def test_v2_playbook_on_include(self):
        included_file = 'some file'
        self.callback._finish_task(task_result)
        self.assertEqual(self.callback._task_data['result'], 'included')

    def test_v2_playbook_on_stats(self):
        stats = 'some stats'
        self.callback._generate_report(stats)
        self.assertEqual(self.callback._task_data['result'], 'stats')

if __name__ == '__main__':
    unittest.main()