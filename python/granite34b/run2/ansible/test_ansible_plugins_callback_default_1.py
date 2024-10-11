import unittest
from ansible.plugins.callback.default import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_set_options(self):
        self.callback.set_options(task_keys=['task_key'], var_options={'var_option': 'value'}, direct={'direct': 'value'})
        self.assertEqual(self.callback.get_option('task_key'), 'value')
        self.assertEqual(self.callback.get_option('var_option'), 'value')
        self.assertEqual(self.callback.get_option('direct'), 'value')

    def test_v2_runner_on_failed(self):
        result = {'_result': {'key': 'value'}, '_task': {'_uuid': 'uuid', 'action': 'action', 'loop': 'loop', 'args': {'arg': 'value'}}}
        self.callback.v2_runner_on_ok(result)
        self.assertEqual(self.callback._last_task_banner, 'uuid')

    def test_v2_runner_on_ok(self):
        result = {'_result': {'key': 'value'}, '_task': {'_uuid': 'uuid', 'action': 'action', 'loop': 'loop', 'args': {'arg': 'value'}}}
        self.callback.v2_runner_on_ok(result._result)
        self.assertEqual(self.callback._last_task_banner, 'uuid')

    def test_v2_runner_on_skipped(self):
        result = {'_result': {'key': 'value'}, '_task': {'_uuid': 'uuid', 'action': 'action', 'loop': 'loop', 'args': {'arg': 'value'}}}
        self.callback.display_skipped_hosts(result)
        self.assertEqual(self.callback._last_task_banner, 'uuid')

    def test_v2_runner_on_unreachable(self):
        result = {'_result': {'key': 'value'}, '_task': {'_uuid': 'uuid', 'action': 'action', 'loop': 'loop', 'args': {'arg': 'value'}}}
        self.callback.v2_runner_on_unreachable(result._result)
        self.assertEqual(self.callback._last_task_banner, 'uuid')

    def test_v2_playbook_on_no_hosts_matched(self):
        self.callback.v2_playbook_on_no_hosts_matched()

    def test_v2_playbook_on_no_hosts_remaining(self):
        self.callback.v2_playbook_on_no_hosts_remaining()

    def test_v2_playbook_on_task_start(self):
        task = {'_uuid': 'uuid', 'get_name': lambda: 'name', 'no_log': False, 'args': {'arg': 'value'}}
        self.callback.v2_playbook_on_task_start(task._uuid, is_conditional=False)
        self.assertEqual(self.callback._last_task_banner, 'uuid')

    def test_v2_playbook_on_cleanup_task_start(self):
        task = {'_uuid': 'uuid', 'get_name': lambda: 'name', 'no_log': False, 'args': {'arg': 'value'}}
        self.callback.v2_playbook_on_cleanup_task_start(None)
        self.assertEqual(self.callback._last_task_banner, 'uuid')

    def test_v2_playbook_on_handler_task_start(self):
        task = {'_uuid': 'uuid', 'get_name': lambda: 'name', 'no_log': False, 'args': {'arg': 'value'}}
        self.callback.v2_playbook_on_handler_task_start(None)
        self.assertEqual(self.callback._last_task_banner, 'uuid')

    def test_v2_runner_on_start(self):
        host = 'host'
        task = 'task'
        self.callback.v2_runner_on_start(host, task, **kwargs)

    def test_v2_playbook_on_play_start(self):
        play = {'get_name': lambda: 'name', 'check_mode': False}
        self.callback.v2_playbook_on_play_start(play.get_name())

if __name__ == '__main__':
    unittest.main()