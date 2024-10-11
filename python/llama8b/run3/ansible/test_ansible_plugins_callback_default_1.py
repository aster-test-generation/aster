import unittest
from ansible.plugins.callback.yamldump import CallbackModul


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        callback = CallbackModule()
        self.assertIsNotNone(callback._play)
        self.assertIsNone(callback._last_task_banner)
        self.assertIsNone(callback._last_task_name)
        self.assertIsNone(callback._task_type_cache)

    def test_set_options(self):
        callback = CallbackModule()
        callback.set_options(task_keys=['key1'], var_options={'var1': 'value1'}, direct=True)
        self.assertEqual(callback.get_option('display_skipped_hosts'), C.DISPLAY_SKIPPED_HOSTS)
        self.assertTrue(callback.get_option('display_ok_hosts'))
        self.assertTrue(callback.get_option('show_custom_stats'))
        self.assertFalse(callback.get_option('display_failed_stderr'))
        self.assertFalse(callback.get_option('check_mode_markers'))
        self.assertFalse(callback.get_option('show_per_host_start'))

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {'_result': {'changed': False, 'failed': True, 'msg': 'error message'}}
        callback.v2_runner_on_failed(result, ignore_errors=False)
        self.assertEqual(callback._display.display.call_args[0][0], 'fatal: []: FAILED! => {"changed": false, "failed": true, "msg": "error message"}')

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'_result': {'changed': True, 'msg': 'success message'}}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display.call_args[0][0], 'changed: []')

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {'_result': {'skipped': True, 'msg': 'skipped message'}}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display.call_args[0][0], 'skipping: []')

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {'_result': {'unreachable': True, 'msg': 'unreachable message'}}
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._display.display.call_args[0][0], 'fatal: []: UNREACHABLE! => {"unreachable": true, "msg": "unreachable message"}')

    def test_v2_playbook_on_no_hosts_matched(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_matched()
        self.assertEqual(callback._display.display.call_args[0][0], 'skipping: no hosts matched')

    def test_v2_playbook_on_no_hosts_remaining(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_remaining()
        self.assertEqual(callback._display.banner.call_args[0][0], 'NO MORE HOSTS LEFT')

    def test_v2_playbook_on_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'task_uuid', '_name': 'task_name'}
        callback.v2_playbook_on_task_start(task, is_conditional=False)
        self.assertEqual(callback._task_start.call_args[0][0], task)

    def test_v2_playbook_on_cleanup_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'task_uuid', '_name': 'task_name'}
        callback.v2_playbook_on_cleanup_task_start(task)
        self.assertEqual(callback._task_start.call_args[0][0], task)

    def test_v2_playbook_on_handler_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'task_uuid', '_name': 'task_name'}
        callback.v2_playbook_on_handler_task_start(task)
        self.assertEqual(callback._task_start.call_args[0][0], task)

    def test_v2_runner_on_start(self):
        callback = CallbackModule()
        host = 'host_name'
        task = {'_name': 'task_name'}
        callback.v2_runner_on_start(host, task)
        self.assertEqual(callback._display.display.call_args[0][0], ' [started %s on %s]' % (task, host))

    def test_v2_playbook_on_play_start(self):
        callback = CallbackModule()
        play = {'_name': 'play_name'}
        callback.v2_playbook_on_play_start(play)
        self.assertEqual(callback._display.banner.call_args[0][0], 'PLAY []')

    def test_v2_on_file_diff(self):
        callback = CallbackModule()
        result = {'_result': {'diff': 'diff_message'}}
        callback.v2_on_file_diff(result)
        self.assertEqual(callback._display.display.call_args[0][0], 'diff_message')

if __name__ == '__main__':
    unittest.main()