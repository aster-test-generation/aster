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
        self.assertEqual(self.callback._task_data, {'status': 'failed'})

    def test_v2_runner_on_ok(self):
        result = Mock()
        result._result = {'changed': False}
        self.callback.v2_runner_on_ok(result)
        self.assertEqual(self.callback._task_data, {'status': 'ok'})

    def test_v2_runner_on_skipped(self):
        result = Mock()
        result._result = {'skipped': True}
        self.callback.v2_runner_on_skipped(result)
        self.assertEqual(self.callback._task_data, {'status': 'skipped'})

    def test_v2_playbook_on_include(self):
        included_file = Mock()
        self.callback.v2_playbook_on_include(included_file)
        self.assertEqual(self.callback._task_data, {'status': 'included'})

    def test_v2_playbook_on_stats(self):
        stats = Mock()
        self.callback.v2_playbook_on_stats(stats)
        self.callback._generate_report()

    def test_generate_report(self):
        with patch('ansible.utils._junit_xml.TestSuites') as mock_test_suites:
            self.callback._generate_report()
            mock_test_suites.assert_called_once()

    def test_finish_task(self):
        result = Mock()
        self.callback._finish_task('ok', result)
        self.assertEqual(self.callback._task_data, {'status': 'ok'})

    def test_get_output_dir(self):
        self.assertEqual(self.callback._get_output_dir(), self.callback._output_dir)

    def test_get_task_class(self):
        self.assertEqual(self.callback._get_task_class(), self.callback._task_class)

    def test_get_task_relative_path(self):
        self.assertEqual(self.callback._get_task_relative_path(), self.callback._task_relative_path)

    def test_get_fail_on_change(self):
        self.assertEqual(self.callback._get_fail_on_change(), self.callback._fail_on_change)

    def test_get_fail_on_ignore(self):
        self.assertEqual(self.callback._get_fail_on_ignore(), self.callback._fail_on_ignore)

    def test_get_include_setup_tasks_in_report(self):
        self.assertEqual(self.callback._get_include_setup_tasks_in_report(), self.callback._include_setup_tasks_in_report)

    def test_get_hide_task_arguments(self):
        self.assertEqual(self.callback._get_hide_task_arguments(), self.callback._hide_task_arguments)

    def test_get_test_case_prefix(self):
        self.assertEqual(self.callback._get_test_case_prefix(), self.callback._test_case_prefix)

if __name__ == '__main__':
    unittest.main()