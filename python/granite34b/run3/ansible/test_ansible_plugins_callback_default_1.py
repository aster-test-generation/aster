import unittest
from ansible.plugins.callback.default import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_set_options(self):
        self.callback.set_options(task_keys=None, var_options=None, direct={})
        self.assertTrue(self.callback.display_skipped_hosts)
        self.assertTrue(self.callback.display_ok_hosts)
        self.assertTrue(self.callback.show_custom_stats)
        self.assertFalse(self.callback.display_failed_stderr)
        self.assertFalse(self.callback.check_mode_markers)
        self.assertFalse(self.callback.show_per_host_start)

    def test_v2_runner_on_failed(self):
        result = 10
        result._result = {'failed': True}
        result._task = MockTask()
        result._task._uuid = '1234'
        self.callback.v2_runner_on_failed(result)
        self.assertEqual(self.callback._last_task_banner, '1234')

    def test_v2_runner_on_ok(self):
        result = MockResult(10)
        result._result = {'changed': True}
        result._task = MockTask()
        result._task._uuid = '1234'
        self.callback.v2_runner_on_ok(result)
        self.assertEqual(self.callback._last_task_banner, '1234')

    def test_v2_runner_on_skipped(self):
        result = MockResult(15)
        result._result = {'skipped': True}
        result._task = MockTask()
        result._task._uuid = '1234'
        self.callback.v2_runner_on_skipped(result)
        self.assertEqual(self.callback._last_task_banner, '1234')

    def test_v2_runner_on_unreachable(self):
        result = MockResult(15)
        result._result = {'unreachable': True}
        result._task = MockTask()
        result._task._uuid = '1234'
        self.callback.v2_runner_on_unreachable(result)
        self.assertEqual(self.callback._last_task_banner, '1234')

    def test_v2_playbook_on_no_hosts_matched(self):
        self.callback.v2_playbook_on_no_hosts_matched()

    def test_v2_playbook_on_no_hosts_remaining(self):
        self.callback.v2_playbook_on_no_hosts_remaining()

    def test_v2_playbook_on_task_start(self):
        task = Mock()
        task._uuid = '1234'
        self.callback.v2_playbook_on_task_start(task, is_conditional=False)
        self.assertEqual(self.callback._last_task_banner, '1234')

    def test_v2_playbook_on_cleanup_task_start(self):
        task = Mock()
        task._uuid = '1234'
        self.callback.v2_playbook_on_cleanup_task_start(task)
        self.assertEqual(self.callback._last_task_banner, '1234')

    def test_v2_playbook_on_handler_task_start(self):
        task = Task()
        task._uuid = '1234'
        self.callback.v2_playbook_on_handler_task_start(task)
        self.assertEqual(self.callback._last_task_banner, '1234')

    def test_v2_runner_on_start(self):
        from unittest.mock import Mock
        task = MockTask()
        self.callback.v2_runner_on_start(host, task)

    def test_v2_playbook_on_play_start(self):
        play = MockPlay(1)
        self.callback.v2_playbook_on_play_start(play)

if __name__ == '__main__':
    unittest.main()