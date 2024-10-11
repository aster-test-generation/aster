import os
import unittest
from ansible.plugins.callback import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        cb = CallbackModule()
        self.assertEqual(cb._output_dir, os.path.expanduser('~/.ansible.log'))
        self.assertEqual(cb._task_class, 'False')
        self.assertEqual(cb._task_relative_path, '')
        self.assertEqual(cb._fail_on_change, 'False')
        self.assertEqual(cb._fail_on_ignore, 'False')
        self.assertEqual(cb._include_setup_tasks_in_report, 'True')
        self.assertEqual(cb._hide_task_arguments, 'False')
        self.assertEqual(cb._test_case_prefix, '')
        self.assertEqual(cb._playbook_path, None)
        self.assertEqual(cb._playbook_name, None)
        self.assertEqual(cb._play_name, None)
        self.assertEqual(cb._task_data, {})
        self.assertFalse(cb.disabled)

    def test_v2_runner_on_failed(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_failed(result, ignore_errors=False)
        self.assertEqual(cb._task_data, {'status': 'failed', 'result': result})

    def test_v2_runner_on_ok(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_ok(result)
        self.assertEqual(cb._task_data, {'status': 'ok', 'result': result})

    def test_v2_runner_on_skipped(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_skipped(result)
        self.assertEqual(cb._task_data, {'status': 'skipped', 'result': result})

    def test_v2_playbook_on_include(self):
        cb = CallbackModule()
        included_file = {}
        cb.v2_playbook_on_include(included_file)
        self.assertEqual(cb._task_data, {'status': 'included', 'result': included_file})

    def test_v2_playbook_on_stats(self):
        cb = CallbackModule()
        stats = {}
        cb.v2_playbook_on_stats(stats)
        self.assertEqual(cb._task_data, {})

if __name__ == '__main__':
    unittest.main()