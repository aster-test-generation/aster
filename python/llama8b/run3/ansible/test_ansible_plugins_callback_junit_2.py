import unittest
from unittest.mock import patch, Mock
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
        result = Mock()
        result._result = {'failed': True}
        self.callback.v2_runner_on_failed(result)
        self.assertEqual(self.callback._task_data, {'failed': True})

    def test_v2_runner_on_ok(self):
        result = Mock()
        result._result = {'changed': False}
        self.callback.v2_runner_on_ok(result)
        self.assertEqual(self.callback._task_data, {'ok': True})

    def test_v2_runner_on_skipped(self):
        result = Mock()
        result._result = {'skipped': True}
        self.callback.v2_runner_on_skipped(result)
        self.assertEqual(self.callback._task_data, {'skipped': True})

    def test_v2_playbook_on_include(self):
        included_file = Mock()
        self.callback.v2_playbook_on_include(included_file)
        self.assertEqual(self.callback._task_data, {'included': included_file})

    def test_v2_playbook_on_stats(self):
        stats = Mock()
        self.callback.v2_playbook_on_stats(stats)
        self.assertEqual(self.callback._task_data, {})

    def test_generate_report(self):
        self.callback._task_data = {'ok': True, 'skipped': True, 'failed': True}
        self.callback._generate_report()
        # This test is not complete as it's hard to test the report generation

    def test_finish_task(self):
        result = Mock()
        result._result = {'changed': False}
        self.callback._finish_task('ok', result)
        self.assertEqual(self.callback._task_data, {'ok': True})

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
        other = CallbackModule()
        self.assertEqual(self.callback, other)

if __name__ == '__main__':
    unittest.main()