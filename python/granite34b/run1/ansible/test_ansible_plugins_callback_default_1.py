import unittest
from ansible.plugins.callback.default import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        callback = CallbackModule()
        callback.set_options(task_keys=None, var_options=None, direct={})
        self.assertTrue(callback.display_skipped_hosts)
        self.assertTrue(callback.display_ok_hosts)
        self.assertTrue(callback.show_custom_stats)
        self.assertFalse(callback.display_failed_stderr)
        self.assertFalse(callback.check_mode_markers)
        self.assertFalse(callback.show_per_host_start)

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = MockResult(15)
        result._task._uuid = '1234'
        result._task.action = 'test'
        result._host.name = 'test_host'
        result._result = {'key': 'value'}
        callback.v2_runner_on_failed(result, ignore_errors=False)
        self.assertEqual(callback._last_task_banner, '1234')
        self.assertEqual(callback._last_task_name, None)

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = MockResult(10)
        result._task._uuid = '1234'
        result._task.action = 'test'
        result._host.name = 'test_host'
        result._result = {'key': 'value'}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._last_task_banner, '1234')
        self.assertEqual(callback._last_task_name, None)

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = MockResult(10)
        result._task._uuid = '1234'
        result._task.action = 'test'
        result._host.name = 'test_host'
        result._result = {'key': 'value'}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._last_task_banner, '1234')
        self.assertEqual(callback._last_task_name, None)

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = MockResult(15)
        result._task._uuid = '1234'
        result._task.action = 'test'
        result._host.name = 'test_host'
        result._result = {'key': 'value'}
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._last_task_banner, '1234')
        self.assertEqual(callback._last_task_name, None)

    def test_v2_playbook_on_no_hosts_matched(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_matched()

    def test_v2_playbook_on_no_hosts_remaining(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_remaining()

    def test_v2_playbook_on_task_start(self):
        callback = CallbackModule()
        task = Task()
        task._uuid = '1234'
        task.get_name.return_value = 'test_task'
        callback.v2_playbook_on_task_start(task, is_conditional=False)
        self.assertEqual(callback._last_task_banner, '1234')
        self.assertEqual(callback._last_task_name, 'test_task')

    def test_v2_playbook_on_cleanup_task_start(self):
        callback = CallbackModule()
        task = MockTask()
        task._uuid = '1234'
        task.get_name.return_value = 'test_task'
        callback.v2_playbook_on_cleanup_task_start(task)
        self.assertEqual(callback._last_task_banner, '1234')
        self.assertEqual(callback._last_task_name, 'test_task')

if __name__ == '__main__':
    unittest.main()