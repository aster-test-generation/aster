import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_v2_playbook_on_stats(self):
        instance = CallbackModule()
        stats = None
        instance.v2_playbook_on_stats(stats)

    def test_v2_playbook_on_start(self):
        instance = CallbackModule()
        playbook = None
        instance.v2_playbook_on_start(playbook)

    def test_v2_runner_retry(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_retry(result)

    def test_v2_runner_on_async_poll(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_async_poll(result)

    def test_v2_runner_on_async_ok(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_async_ok(result)

    def test_v2_runner_on_async_failed(self):
        instance = CallbackModule()
        result = None
        instance.v2_runner_on_async_failed(result)

    def test_v2_playbook_on_notify(self):
        instance = CallbackModule()
        handler = None
        host = None
        instance.v2_playbook_on_notify(handler, host)

if __name__ == '__main__':
    unittest.main()