import unittest
from ansible.plugins.callback import CallbackModule


class TestDefaultCallback(unittest.TestCase):
    def test_v2_playbook_on_stats(self):
        callback = CallbackModule()
        stats = {'processed': {'host1': {'ok': 1, 'changed': 0, 'unreachable': 0, 'failed': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0}, 'host2': {'ok': 1, 'changed': 0, 'unreachable': 0, 'failed': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0}}}
        callback.v2_playbook_on_stats(stats)

    def test_v2_playbook_on_start(self):
        callback = CallbackModule()
        playbook = {'_file_name': 'playbook.yml'}
        callback.v2_playbook_on_start(playbook)

    def test_v2_runner_retry(self):
        callback = CallbackModule()
        result = {'task_name': 'task1', '_task': 'task1', '_result': {'retries': 3, 'attempts': 1}}
        callback.v2_runner_retry(result)

    def test_v2_runner_on_async_poll(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host1'}, '_result': {'ansible_job_id': '123', 'started': '2022-01-01', 'finished': '2022-01-02'}}
        callback.v2_runner_on_async_poll(result)

    def test_v2_runner_on_async_ok(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host1'}, '_result': {'ansible_job_id': '123'}}
        callback.v2_runner_on_async_ok(result)

    def test_v2_runner_on_async_failed(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host1'}, '_result': {'ansible_job_id': '123'}}
        callback.v2_runner_on_async_failed(result)

    def test_v2_playbook_on_notify(self):
        callback = CallbackModule()
        handler = {'get_name': lambda: 'handler1'}
        host = 'host1'
        callback.v2_playbook_on_notify(handler, host)

if __name__ == '__main__':
    unittest.main()