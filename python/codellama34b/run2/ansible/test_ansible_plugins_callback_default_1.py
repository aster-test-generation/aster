import unittest
from ansible.plugins.callback.yaml import *



class TestCallbackModule(unittest.TestCase):
    def test_set_options(self):
        instance = CallbackModule()
        instance.set_options(task_keys=None, var_options=None, direct=None)
        for option, constant in COMPAT_OPTIONS:
            try:
                value = instance.get_option(option)
            except (AttributeError, KeyError):
                instance._display.deprecated("'%s' is subclassing DefaultCallback without the corresponding doc_fragment." % instance._load_name, version='2.14', collection_name='ansible.builtin')
                value = constant
            setattr(instance, option, value)

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = None
        ignore_errors = False
        instance.v2_runner_on_failed(result, ignore_errors)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_ok(result)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_skipped(result)

    def test_v2_runner_on_unreachable(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_unreachable(result)

    def test_v2_playbook_on_no_hosts_matched(self):
        instance = CallbackModule()
        instance.v2_playbook_on_no_hosts_matched()

    def test_v2_playbook_on_no_hosts_remaining(self):
        instance = CallbackModule()
        instance.v2_playbook_on_no_hosts_remaining()

    def test_v2_playbook_on_task_start(self):
        instance = CallbackModule()
        task = None
        is_conditional = None
        instance.v2_playbook_on_task_start(task, is_conditional)

    def test_v2_playbook_on_cleanup_task_start(self):
        instance = CallbackModule()
        task = None
        instance.v2_playbook_on_cleanup_task_start(task)

    def test_v2_playbook_on_handler_task_start(self):
        instance = CallbackModule()
        task = None
        instance.v2_playbook_on_handler_task_start(task)

    def test_v2_runner_on_start(self):
        instance = CallbackModule()
        host = None
        task = None
        instance.v2_runner_on_start(host, task)

    def test_v2_on_file_diff(self):
        instance = CallbackModule()
        result = None
        instance.v2_on_file_diff(result)

    def test_v2_runner_item_on_ok(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_item_on_ok(result)

    def test_v2_runner_item_on_failed(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_item_on_failed(result)

    def test_v2_runner_item_on_skipped(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_item_on_skipped(result)

    def test_v2_playbook_on_include(self):
        instance = CallbackModule()
        included_file = None
        instance.v2_playbook_on_include(included_file)

    def test_v2_playbook_on_play_start(self):
        instance = CallbackModule()
        play = None
        instance.v2_playbook_on_play_start(play)

if __name__ == '__main__':
    unittest.main()