import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_v2_playbook_on_stats(self):
        instance = CallbackModule()
        stats = None
        result = instance.v2_playbook_on_stats(stats)
        self.assertEqual(result, None)

    def test_v2_playbook_on_start(self):
        instance = CallbackModule()
        playbook = None
        result = instance.v2_playbook_on_start(playbook)
        self.assertEqual(result, None)

    def test_v2_runner_retry(self):
        instance = CallbackModule()
        result = None
        result = instance.v2_runner_retry(result)
        self.assertEqual(result, None)

    def test_v2_runner_on_async_poll(self):
        instance = CallbackModule()
        result = None
        result = instance.v2_runner_on_async_poll(result)
        self.assertEqual(result, None)

    def test_v2_runner_on_async_ok(self):
        instance = CallbackModule()
        result = None
        result = instance.v2_runner_on_async_ok(result)
        self.assertEqual(result, None)

    def test_v2_runner_on_async_failed(self):
        instance = CallbackModule()
        result = None
        result = instance.v2_runner_on_async_failed(result)
        self.assertEqual(result, None)

    def test_v2_playbook_on_notify(self):
        instance = CallbackModule()
        handler = None
        host = None
        result = instance.v2_playbook_on_notify(handler, host)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()