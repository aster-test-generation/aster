import unittest
from ansible.plugins.callback.default import CallbackModule as juni


class TestCallbackModule(unittest.TestCase):
    def test___init__(self):
        instance = junit.CallbackModule()
        self.assertIsNotNone(instance._output_dir)
        self.assertIsNotNone(instance._task_class)
        self.assertIsNotNone(instance._task_relative_path)
        self.assertIsNotNone(instance._fail_on_change)
        self.assertIsNotNone(instance._fail_on_ignore)
        self.assertIsNotNone(instance._include_setup_tasks_in_report)
        self.assertIsNotNone(instance._hide_task_arguments)
        self.assertIsNotNone(instance._test_case_prefix)
        self.assertIsNotNone(instance._playbook_path)
        self.assertIsNotNone(instance._playbook_name)
        self.assertIsNotNone(instance._play_name)
        self.assertIsNotNone(instance._task_data)
        self.assertFalse(instance.disabled)

    def test_v2_runner_on_failed(self):
        instance = junit.CallbackModule()
        result = {'foo': 'bar'}
        instance.v2_runner_on_failed(result)
        self.assertEqual(instance._task_data, {'foo': 'bar'})

    def test_v2_runner_on_ok(self):
        instance = junit.CallbackModule()
        result = {'foo': 'bar'}
        instance.v2_runner_on_ok(result)
        self.assertEqual(instance._task_data, {'foo': 'bar'})

    def test_v2_runner_on_skipped(self):
        instance = junit.CallbackModule()
        result = {'foo': 'bar'}
        instance.v2_runner_on_skipped(result)
        self.assertEqual(instance._task_data, {'foo': 'bar'})

    def test_v2_playbook_on_include(self):
        instance = junit.CallbackModule()
        included_file = {'foo': 'bar'}
        instance.v2_playbook_on_include(included_file)
        self.assertEqual(instance._task_data, {'foo': 'bar'})

    def test_v2_playbook_on_stats(self):
        instance = junit.CallbackModule()
        stats = {'foo': 'bar'}
        instance.v2_playbook_on_stats(stats)
        self.assertEqual(instance._task_data, {'foo': 'bar'})

    def test__finish_task(self):
        instance = junit.CallbackModule()
        result = {'foo': 'bar'}
        instance._finish_task('ok', result)
        self.assertEqual(instance._task_data, {'foo': 'bar'})

    def test__generate_report(self):
        instance = junit.CallbackModule()
        instance._generate_report()
        # assert report generated correctly

    def test___str__(self):
        instance = junit.CallbackModule()
        self.assertEqual(str(instance), 'CallbackModule')

    def test___repr__(self):
        instance = junit.CallbackModule()
        self.assertEqual(repr(instance), 'CallbackModule()')

if __name__ == '__main__':
    unittest.main()