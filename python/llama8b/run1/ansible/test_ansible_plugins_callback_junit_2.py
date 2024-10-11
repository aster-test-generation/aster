import unittest
from unittest.mock import patch
from ansible.utils.display import Displa
from ansible.module_utils._text import to_bytes, to_text
from ansible.utils._junit_xml import TestCase, TestError, TestFailure, TestSuite, TestSuites
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

    def test_v2_runner_on_failed(self):
        with patch.object(self.callback, '_finish_task') as finish_task:
            self.callback.v2_runner_on_failed({'failed': True})
            finish_task.assert_called_once_with('failed', {'failed': True})

    def test_v2_runner_on_ok(self):
        with patch.object(self.callback, '_finish_task') as finish_task:
            self.callback.v2_runner_on_ok({'ok': True})
            finish_task.assert_called_once_with('ok', {'ok': True})

    def test_v2_runner_on_skipped(self):
        with patch.object(self.callback, '_finish_task') as finish_task:
            self.callback.v2_runner_on_skipped({'skipped': True})
            finish_task.assert_called_once_with('skipped', {'skipped': True})

    def test_v2_playbook_on_include(self):
        with patch.object(self.callback, '_finish_task') as finish_task:
            self.callback.v2_playbook_on_include('included_file')
            finish_task.assert_called_once_with('included', 'included_file')

    def test_v2_playbook_on_stats(self):
        with patch.object(self.callback, '_generate_report') as generate_report:
            self.callback.v2_playbook_on_stats({'stats': 'stats'})
            generate_report.assert_called_once()

    def test_generate_report(self):
        with patch.object(self.callback, '_output_dir') as output_dir:
            with patch.object(self.callback, '_task_data') as task_data:
                self.callback._generate_report()
                output_dir.assert_called_once()
                task_data.assert_called_once()

    def test_finish_task(self):
        with patch.object(self.callback, '_task_data') as task_data:
            self.callback._finish_task('ok', {'ok': True})
            task_data.assert_called_once()

    def test__init__(self):
        self.callback.__init__()
        self.assertEqual(self.callback._output_dir, os.path.expanduser('~/.ansible.log'))
        self.assertEqual(self.callback._task_class, 'false')
        self.assertEqual(self.callback._task_relative_path, '')
        self.assertEqual(self.callback._fail_on_change, 'false')
        self.assertEqual(self.callback._fail_on_ignore, 'false')
        self.assertEqual(self.callback._include_setup_tasks_in_report, 'true')
        self.assertEqual(self.callback._hide_task_arguments, 'false')
        self.assertEqual(self.callback._test_case_prefix, '')

    def test__str__(self):
        self.assertEqual(str(self.callback), 'CallbackModule')

    def test__repr__(self):
        self.assertEqual(repr(self.callback), 'CallbackModule()')

    def test__eq__(self):
        self.assertEqual(self.callback, self.callback)

if __name__ == '__main__':
    unittest.main()