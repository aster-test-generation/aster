import unittest
from ansible.plugins.callback import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_v2_playbook_on_stats(self):
        cb = CallbackModule()
        stats = {}
        cb.v2_playbook_on_stats(stats)

    def test_v2_playbook_on_start(self):
        cb = CallbackModule()
        playbook = {}
        cb.v2_playbook_on_start(playbook)

    def test_v2_runner_retry(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_retry(result)

    def test_v2_runner_on_async_poll(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_async_poll(result)

    def test_v2_runner_on_async_ok(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_async_ok(result)

    def test_v2_runner_on_async_failed(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_async_failed(result)

    def test_v2_playbook_on_notify(self):
        cb = CallbackModule()
        handler = {}
        host = {}
        cb.v2_playbook_on_notify(handler, host)

if __name__ == '__main__':
    unittest.main()