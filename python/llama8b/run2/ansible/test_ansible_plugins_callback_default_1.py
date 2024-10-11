import unittest
from ansible.plugins.callback.yamldump import CallbackModul


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        callback = CallbackModule()
        self.assertIsNone(callback._play)
        self.assertIsNone(callback._last_task_banner)
        self.assertIsNone(callback._last_task_name)
        self.assertEqual(callback._task_type_cache, {})

    def test_set_options(self):
        callback = CallbackModule()
        callback.set_options(task_keys=['key1'], var_options={'var1': 'value1'}, direct=True)
        self.assertEqual(callback.display_skipped_hosts, C.DISPLAY_SKIPPED_HOSTS)
        self.assertEqual(callback.display_ok_hosts, True)
        self.assertEqual(callback.show_custom_stats, C.SHOW_CUSTOM_STATS)
        self.assertEqual(callback.display_failed_stderr, False)
        self.assertEqual(callback.check_mode_markers, False)
        self.assertEqual(callback.show_per_host_start, False)

    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {'_result': {'changed': False, 'failed': True}}
        callback.v2_runner_on_failed(result, ignore_errors=False)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'_result': {'changed': True}}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {'_result': {'skipped': True}}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_playbook_on_no_hosts_matched(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_matched()
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_playbook_on_no_hosts_remaining(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_remaining()
        self.assertEqual(callback._display.banner.call_count, 1)

    def test_v2_playbook_on_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'uuid1'}
        callback.v2_playbook_on_task_start(task, is_conditional=False)
        self.assertEqual(callback._task_start.call_count, 1)

    def test_v2_playbook_on_cleanup_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'uuid1'}
        callback.v2_playbook_on_cleanup_task_start(task)
        self.assertEqual(callback._task_start.call_count, 1)

    def test_v2_playbook_on_handler_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'uuid1'}
        callback.v2_playbook_on_handler_task_start(task)
        self.assertEqual(callback._task_start.call_count, 1)

    def test_v2_runner_on_start(self):
        callback = CallbackModule()
        host = 'host1'
        task = {'_uuid': 'uuid1'}
        callback.v2_runner_on_start(host, task)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_playbook_on_play_start(self):
        callback = CallbackModule()
        play = {'_name': 'play1'}
        callback.v2_playbook_on_play_start(play)
        self.assertEqual(callback._display.banner.call_count, 1)

    def test_v2_on_file_diff(self):
        callback = CallbackModule()
        result = {'_result': {'diff': 'diff1'}}
        callback.v2_on_file_diff(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_item_on_ok(self):
        callback = CallbackModule()
        result = {'_result': {'changed': True}}
        callback.v2_runner_item_on_ok(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_item_on_failed(self):
        callback = CallbackModule()
        result = {'_result': {'failed': True}}
        callback.v2_runner_item_on_failed(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_runner_item_on_skipped(self):
        callback = CallbackModule()
        result = {'_result': {'skipped': True}}
        callback.v2_runner_item_on_skipped(result)
        self.assertEqual(callback._display.display.call_count, 1)

    def test_v2_playbook_on_include(self):
        callback = CallbackModule()
        included_file = {'_filename': 'file1'}
        callback.v2_playbook_on_include(included_file)
        self.assertEqual(callback._display.display.call_count, 1)

if __name__ == '__main__':
    unittest.main()