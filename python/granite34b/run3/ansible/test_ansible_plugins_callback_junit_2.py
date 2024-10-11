import unittest
from ansible.plugins.callback.junit import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_v2_runner_on_failed(self):
        result = {'task_name': 'test_task', 'result': 'failed'}
        self.callback._finish_task(result)
        self.assertEqual(self.callback.task_data['test_task']['result'], 'failed')

    def test_v2_runner_on_ok(self):
        result = {'task_name': 'test_task', 'result': 'ok'}
        self.callback._finish_task(result)
        self.assertEqual(self.callback.task_data['test_task']['result'], 'ok')

    def test_v2_runner_on_skipped(self):
        result = {'task_name': 'test_task', 'result': 'skipped'}
        self.callback._finish_task(result)
        self.assertEqual(self.callback.task_data['test_task']['result'], 'skipped')

    def test_v2_playbook_on_include(self):
        included_file = 'test_include'
        self.callback._finish_task()
        self.assertEqual(self.callback.task_data['test_include']['result'], 'included')

    def test_v2_playbook_on_stats(self):
        stats = {'test_task': {'ok': 1, 'failed': 0, 'skipped': 0}}
        self.callback._generate_report(stats)
        self.assertEqual(self.callback.disabled, True)

if __name__ == '__main__':
    unittest.main()