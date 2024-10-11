import unittest
import os
from unittest.mock import patch, MagicMock
from ansible.plugins.callback.junit import CallbackModule


class TestCallbackModule(unittest.TestCase):
    @patch('os.makedirs')
    @patch('os.path.exists', return_value=False)
    def test_init(self, mock_exists, mock_makedirs):
        instance = CallbackModule()
        self.assertEqual(instance._output_dir, os.path.expanduser('~/.ansible.log'))
        self.assertEqual(instance._task_class, 'false')
        self.assertEqual(instance._task_relative_path, '')
        self.assertEqual(instance._fail_on_change, 'false')
        self.assertEqual(instance._fail_on_ignore, 'false')
        self.assertEqual(instance._include_setup_tasks_in_report, 'true')
        self.assertEqual(instance._hide_task_arguments, 'false')
        self.assertEqual(instance._test_case_prefix, '')
        self.assertIsNone(instance._playbook_path)
        self.assertIsNone(instance._playbook_name)
        self.assertIsNone(instance._play_name)
        self.assertIsNotNone(instance._task_data)
        self.assertFalse(instance.disabled)
        mock_makedirs.assert_called_once_with(os.path.expanduser('~/.ansible.log'))

    def test_v2_runner_on_failed_ignore_errors(self):
        instance = CallbackModule()
        instance._fail_on_ignore = 'false'
        instance._finish_task = MagicMock()
        result = MagicMock()
        instance.v2_runner_on_failed(result, ignore_errors=True)
        instance._finish_task.assert_called_once_with('ok', result)

    def test_v2_runner_on_failed_no_ignore_errors(self):
        instance = CallbackModule()
        instance._fail_on_ignore = 'true'
        instance._finish_task = MagicMock()
        result = MagicMock()
        instance.v2_runner_on_failed(result, ignore_errors=True)
        instance._finish_task.assert_called_once_with('failed', result)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        instance._finish_task = MagicMock()
        result = MagicMock()
        instance.v2_runner_on_ok(result)
        instance._finish_task.assert_called_once_with('ok', result)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        instance._finish_task = MagicMock()
        result = MagicMock()
        instance.v2_runner_on_skipped(result)
        instance._finish_task.assert_called_once_with('skipped', result)

    def test_v2_playbook_on_include(self):
        instance = CallbackModule()
        instance._finish_task = MagicMock()
        included_file = MagicMock()
        instance.v2_playbook_on_include(included_file)
        instance._finish_task.assert_called_once_with('included', included_file)

    def test_v2_playbook_on_stats(self):
        instance = CallbackModule()
        instance._generate_report = MagicMock()
        stats = MagicMock()
        instance.v2_playbook_on_stats(stats)
        instance._generate_report.assert_called_once()

    def test_private_methods(self):
        instance = CallbackModule()
        instance._finish_task = MagicMock()
        instance._generate_report = MagicMock()
        instance._CallbackModule__private_method = MagicMock()
        instance._CallbackModule__private_method()
        instance._CallbackModule__private_method.assert_called_once()

if __name__ == '__main__':
    unittest.main()