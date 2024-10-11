import unittest
from ansible.plugins.callback import junit


class TestCallbackModule(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        callback = CallbackModule()
        result = {}
        callback.v2_runner_on_failed(result)
        self.assertEqual(callback._task_data['status'], 'failed')

    def test_v2_runner_on_ok(self):
        callback = CallbackModule()
        result = {}
        callback.v2_runner_on_ok(result)
        self.assertEqual(callback._task_data['status'], 'ok')

    def test_v2_runner_on_skipped(self):
        callback = CallbackModule()
        result = {}
        callback.v2_runner_on_skipped(result)
        self.assertEqual(callback._task_data['status'], 'skipped')

    def test_v2_playbook_on_include(self):
        callback = CallbackModule()
        included_file = {}
        callback.v2_playbook_on_include(included_file)
        self.assertEqual(callback._task_data['status'], 'included')

    def test_v2_playbook_on_stats(self):
        callback = CallbackModule()
        stats = {}
        callback.v2_playbook_on_stats(stats)
        self.assertEqual(callback._task_data['status'], 'stats')

if __name__ == '__main__':
    unittest.main()