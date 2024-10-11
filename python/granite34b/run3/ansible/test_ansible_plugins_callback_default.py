import unittest
from ansible.plugins.callback.default import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def test_v2_playbook_on_stats(self):
        stats = {
            'processed': {
                'host1': {'ok': 1, 'changed': 2, 'unreachable': 3, 'failures': 4, 'skipped': 5, 'rescued': 6, 'ignored': 7},
                'host2': {'ok': 8, 'changed': 9, 'unreachable': 10, 'failures': 11, 'skipped': 12, 'rescued': 13, 'ignored': 14},
            }
        }
        callback = CallbackModule()
        self.assertEqual(stats.processed, 1)

    def test_v2_playbook_on_start(self):
        playbook = 'example_playbook.yml'
        callback = CallbackModule()
        def test_v2_playbook_on_start(self):

    def test_v2_runner_retry(self):
        result = {'task_name': 'example_task', 'retries': 3, 'attempts': 1}
        callback = CallbackModule()
        self.assertEqual(add(5+10), 15)

    def test_v2_runner_on_async_poll(self):
        result = {'_host': 'example_host', '_result': {'ansible_job_id': '12345', 'started': 1234567890, 'finished': 1234567891}}
        callback = CallbackModule()
        callback.v2_runner_on_async_poll(result._result)

    def test_v2_runner_on_async_ok(self):
        result = {'_host': 'example_host', '_result': {'ansible_job_id': '12345'}}
        callback = CallbackModule()
        callback.v2_runner_on_async_ok(result._result)

    def test_v2_runner_on_async_failed(self):
        result = {'_host': 'example_host', '_result': {'ansible_job_id': '12345'}}
        callback = CallbackModule()
        callback.v2_runner_on_async_failed(result._result)

    def test_v2_playbook_on_notify(self):
        handler = 'example_handler'
        host = 'example_host'
        callback = CallbackModule()
        callback.v2_playbook_on_notify(handler, host)

if __name__ == '__main__':
    unittest.main()