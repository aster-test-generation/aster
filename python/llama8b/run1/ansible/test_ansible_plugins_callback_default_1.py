import unittest
from ansible.module_utils.basic import AnsibleModule, AnsibleErro


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        callback = CallbackModule()
        self.assertIsNotNone(callback._play)
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
        result = {'_result': {'changed': False, 'msg': 'msg'}}
        callback.v2_runner_on_failed(result, ignore_errors=False)
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args[0][0], 'fatal: []: FAILED! => {"changed": false, "msg": "msg"}')

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {'_result': {'changed': True, 'msg': 'msg'}}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args[0][0], 'changed: []')

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {'_result': {'changed': False, 'msg': 'msg'}}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args[0][0], 'skipping: []')

    def test_v2_runner_on_unreachable(self):
        callback = CallbackModule()
        result = {'_result': {'changed': False, 'msg': 'msg'}}
        callback.v2_runner_on_unreachable(result)
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args[0][0], 'fatal: []: UNREACHABLE! => {"changed": false, "msg": "msg"}')

    def test_v2_playbook_on_no_hosts_matched(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_matched()
        self.assertEqual(callback._display.display.call_count, 1)
        self.assertEqual(callback._display.display.call_args[0][0], 'skipping: no hosts matched')

    def test_v2_playbook_on_no_hosts_remaining(self):
        callback = CallbackModule()
        callback.v2_playbook_on_no_hosts_remaining()
        self.assertEqual(callback._display.banner.call_count, 1)
        self.assertEqual(callback._display.banner.call_args[0][0], 'NO MORE HOSTS LEFT')

    def test_v2_playbook_on_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'uuid', '_name': 'name'}
        callback.v2_playbook_on_task_start(task, is_conditional=False)
        self.assertEqual(callback._task_start.call_count, 1)
        self.assertEqual(callback._task_start.call_args[0][0], task)

    def test__task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'uuid', '_name': 'name'}
        callback._task_start(task, prefix='TASK')
        self.assertEqual(callback._display.banner.call_count, 1)
        self.assertEqual(callback._display.banner.call_args[0][0], 'TASK [name]')

    def test__print_task_banner(self):
        callback = CallbackModule()
        task = {'_uuid': 'uuid', '_name': 'name'}
        callback._print_task_banner(task)
        self.assertEqual(callback._display.banner.call_count, 1)
        self.assertEqual(callback._display.banner.call_args[0][0], 'TASK [name]')

    def test_v2_playbook_on_cleanup_task_start(self):
        callback = CallbackModule()
        task = {'_uuid': 'uuid', '_name': 'name'}
        callback.v2_playbook_on_cleanup_task_start(task)
        self.assertEqual(callback._task_start.call_count, 1)
        self.assertEqual(callback._task_start.call_args[0][0], task)

if __name__ == '__main__':
    unittest.main()