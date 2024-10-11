import unittest
from ansible.plugins.callback import CallbackModule, COMPAT_OPTIONS, DOCUMENTATIO


class TestCallbackModule(unittest.TestCase):
    def test___init__(self):
        instance = CallbackModule()
        self.assertIsInstance(instance, CallbackModule)

    def test_set_options(self):
        instance = CallbackModule()
        instance.set_options(task_keys=None, var_options=None, direct=None)
        self.assertTrue(hasattr(instance, 'display_skipped_hosts'))

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'failed': True}, '_task': {'_uuid': 'task_uuid'}}
        instance.v2_runner_on_failed(result, ignore_errors=False)
        self.assertTrue(instance._display.messages)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': False}, '_task': {'_uuid': 'task_uuid'}}
        instance.v2_runner_on_ok(result)
        self.assertTrue(instance._display.messages)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = {'_result': {'skipped': True}, '_task': {'_uuid': 'task_uuid'}}
        instance.v2_runner_on_skipped(result)
        self.assertTrue(instance._display.messages)

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = {'_result': {'unreachable': True}, '_task': {'_uuid': 'task_uuid'}}
        instance.v2_runner_on_unreachable(result)
        self.assertTrue(instance._display.messages)

    def test_v2_playbook_on_no_hosts_matched(self):
        instance = CallbackModule()
        instance.v2_playbook_on_no_hosts_matched()
        self.assertTrue(instance._display.messages)

    def test_v2_playbook_on_no_hosts_remaining(self):
        instance = CallbackModule()
        instance.v2_playbook_on_no_hosts_remaining()
        self.assertTrue(instance._display.messages)

    def test_v2_playbook_on_task_start(self):
        instance = CallbackModule()
        task = {'_uuid': 'task_uuid', 'get_name': lambda: 'task_name'}
        instance.v2_playbook_on_task_start(task, is_conditional=False)
        self.assertTrue(instance._display.messages)

    def test__task_start(self):
        instance = CallbackModule()
        task = {'_uuid': 'task_uuid', 'get_name': lambda: 'task_name'}
        instance._task_start(task, prefix='TASK')
        self.assertTrue(instance._last_task_name)

    def test__print_task_banner(self):
        instance = CallbackModule()
        task = {'_uuid': 'task_uuid', 'get_name': lambda: 'task_name'}
        instance._print_task_banner(task)
        self.assertTrue(instance._display.messages)

    def test_v2_playbook_on_cleanup_task_start(self):
        instance = CallbackModule()
        task = {'_uuid': 'task_uuid', 'get_name': lambda: 'task_name'}
        instance.v2_playbook_on_cleanup_task_start(task)
        self.assertTrue(instance._display.messages)

    def test_v2_playbook_on_handler_task_start(self):
        instance = CallbackModule()
        task = {'_uuid': 'task_uuid', 'get_name': lambda: 'task_name'}
        instance.v2_playbook_on_handler_task_start(task)
        self.assertTrue(instance._display.messages)

    def test_v2_runner_on_start(self):
        instance = CallbackModule()
        host = {'get_name': lambda: 'host_name'}
        task = {'_uuid': 'task_uuid', 'get_name': lambda: 'task_name'}
        instance.v2_runner_on_start(host, task)
        self.assertTrue(instance._display.messages)

    def test_v2_playbook_on_play_start(self):
        instance = CallbackModule()
        play = {'get_name': lambda: 'play_name'}
        instance.v2_playbook_on_play_start(play)
        self.assertTrue(instance._display.messages)

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        result = {'_result': {'diff': 'diff_content'}, '_task': {'_uuid': 'task_uuid'}}
        instance.v2_on_file_diff(result)
        self.assertTrue(instance._display.messages)

    def test_v2_runner_item_on_ok(self):
        instance = CallbackModule()
        result = {'_result': {'changed': False}, '_task': {'_uuid': 'task_uuid'}}
        instance.v2_runner_item_on_ok(result)
        self.assertTrue(instance._display.messages)

    def test_v2_runner_item_on_failed(self):
        instance = CallbackModule()
        result = {'_result': {'failed': True}, '_task': {'_uuid': 'task_uuid'}}
        instance.v2_runner_item_on_failed(result)
        self.assertTrue(instance._display.messages)

if __name__ == '__main__':
    unittest.main()