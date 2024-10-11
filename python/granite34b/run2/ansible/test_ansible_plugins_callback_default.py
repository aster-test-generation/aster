import unittest
from ansible.plugins.callback.default import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_v2_playbook_on_stats(self):
        stats = {
            'processed': {
                'host1': {'ok': 1, 'changed': 2, 'unreachable': 3, 'failures': 4, 'skipped': 5, 'rescued': 6, 'ignored': 7},
                'host2': {'ok': 8, 'changed': 9, 'unreachable': 10, 'failures': 11, 'skipped': 12, 'rescued': 13, 'ignored': 14},
            }
        }
        self.callback.v2_runner_on_stats(stats)

    def test_v2_playbook_on_start(self):
        playbook = 'test_playbook.yml'
        self.callback.v2_runner_on_ok(result)

    def test_v2_runner_retry(self):
        result = {
            'task_name': 'test_task',
            '_result': {'retries': 3, 'attempts': 1},
        }
        self.callback.v2_runner_on_failed(result, 'test')

    def test_v2_runner_on_async_poll(self):
        result = {
            '_host': 'host1',
            '_result': {'ansible_job_id': '12345', 'started': 1234567890, 'finished': 1234567891},
        }
        self.callback.v2_runner_on_async_poll(result._result)

    def test_v2_runner_on_async_ok(self):
        result = {
            '_host': 'host1',
            '_result': {'ansible_job_id': '12345'},
        }
        self.callback.v2_runner_on_async_ok(result._result)

    def test_v2_runner_on_async_failed(self):
        result = {
            '_host': 'host1',
            '_result': {'ansible_job_id': '12345'},
        }
        self.callback.v2_runner_on_async_ok(result)

    def test_v2_playbook_on_notify(self):
        handler = 'test_handler'
        host = 'host1'
        self.callback.v2_playbook_on_notify(handler, host)

if __name__ == '__main__':
    unittest.main()