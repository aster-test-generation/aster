import unittest
from ansible.plugins.callback import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_failed(result)
        self.assertEqual(cb._task_data['state'], 'failed')

    def test_v2_runner_on_ok(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_ok(result)
        self.assertEqual(cb._task_data['state'], 'ok')

    def test_v2_runner_on_skipped(self):
        cb = CallbackModule()
        result = {}
        cb.v2_runner_on_skipped(result)
        self.assertEqual(cb._task_data['state'], 'skipped')

    def test_v2_playbook_on_include(self):
        cb = CallbackModule()
        included_file = {}
        cb.v2_playbook_on_include(included_file)
        self.assertEqual(cb._task_data['state'], 'included')

    def test_v2_playbook_on_stats(self):
        cb = CallbackModule()
        stats = {}
        cb.v2_playbook_on_stats(stats)
        self.assertEqual(cb._task_data['state'], 'stats')

if __name__ == '__main__':
    unittest.main()