import unittest
from ansible.plugins.callback.yaml import *



class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        instance = CallbackModule()
        instance.set_options(task_keys=None, var_options=None, direct=None)
        self.assertEqual(instance.display_skipped_hosts, C.DISPLAY_SKIPPED_HOSTS)
        self.assertEqual(instance.display_ok_hosts, True)
        self.assertEqual(instance.show_custom_stats, C.SHOW_CUSTOM_STATS)
        self.assertEqual(instance.display_failed_stderr, False)
        self.assertEqual(instance.check_mode_markers, False)
        self.assertEqual(instance.show_per_host_start, False)

    def test_v2_runner_on_failed(self):
        result = None
        ignore_errors = False
        instance = CallbackModule()
        instance.v2_runner_on_failed(result, ignore_errors)
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._last_task_banner, None)
        self.assertEqual(instance._last_task_name, None)
        self.assertEqual(instance._task_type_cache, {})

    def test_v2_runner_on_ok(self):
        result = None
        instance = CallbackModule()
        instance.v2_runner_on_ok(result)
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._last_task_banner, None)
        self.assertEqual(instance._last_task_name, None)
        self.assertEqual(instance._task_type_cache, {})

    def test_v2_runner_on_skipped(self):
        result = None
        instance = CallbackModule()
        instance.v2_runner_on_skipped(result)
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._last_task_banner, None)
        self.assertEqual(instance._last_task_name, None)
        self.assertEqual(instance._task_type_cache, {})

    def test_v2_runner_on_unreachable(self):
        result = None
        instance = CallbackModule()
        instance.v2_runner_on_unreachable(result)
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._last_task_banner, None)
        self.assertEqual(instance._last_task_name, None)
        self.assertEqual(instance._task_type_cache, {})

    def test_v2_playbook_on_no_hosts_matched(self):
        instance = CallbackModule()
        instance.v2_playbook_on_no_hosts_matched()
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._last_task_banner, None)
        self.assertEqual(instance._last_task_name, None)
        self.assertEqual(instance._task_type_cache, {})

    def test_v2_playbook_on_no_hosts_remaining(self):
        instance = CallbackModule()
        instance.v2_playbook_on_no_hosts_remaining()
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._last_task_banner, None)
        self.assertEqual(instance._last_task_name, None)
        self.assertEqual(instance._task_type_cache, {})

    def test_v2_playbook_on_task_start(self):
        task = None
        is_conditional = None
        instance = CallbackModule()
        instance.v2_playbook_on_task_start(task, is_conditional)
        self.assertEqual(instance._play, None)
        self.assertEqual(instance._last_task_banner, None)
        self.assertEqual(instance._last_task_name, None)
        self.assertEqual(instance._task_type_cache, {})

if __name__ == '__main__':
    unittest.main()