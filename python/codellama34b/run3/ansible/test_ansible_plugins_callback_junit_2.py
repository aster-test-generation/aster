import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_init(self):
        instance = CallbackModule()
        self.assertIsInstance(instance, CallbackModule)

    def test_v2_runner_on_failed(self):
        instance = CallbackModule()
        result = None
        ignore_errors = None
        instance.v2_runner_on_failed(result, ignore_errors)

    def test_v2_runner_on_ok(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_ok(result)

    def test_v2_runner_on_skipped(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_skipped(result)

    def test_v2_playbook_on_include(self):
        instance = CallbackModule()
        included_file = None
        instance.v2_playbook_on_include(included_file)

    def test_v2_playbook_on_stats(self):
        instance = CallbackModule()
        stats = None
        instance.v2_playbook_on_stats(stats)

if __name__ == '__main__':
    unittest.main()