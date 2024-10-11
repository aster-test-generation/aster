import unittest
from ansible.module_utils.basic import AnsibleModule, AnsibleErro


class TestCallbackModule(unittest.TestCase):
    def test_v2_playbook_on_stats(self):
        callback = CallbackModule()
        stats = {'processed': {'localhost': {'ok': 1, 'changed': 1, 'unreachable': 0, 'failures': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0}}}
        callback.v2_playbook_on_stats(stats)
        self.assertEqual(callback._display.banner, 'PLAY RECAP')
        self.assertEqual(callback._display.display, 'localhost : ok 1 changed 1 unreachable 0 failed 0 skipped 0 rescued 0 ignored 0')

    def test_v2_playbook_on_start(self):
        callback = CallbackModule()
        playbook = 'playbook.yml'
        callback.v2_playbook_on_start(playbook)
        self.assertEqual(callback._display.banner, 'PLAYBOOK: playbook.yml')

    def test_v2_runner_retry(self):
        callback = CallbackModule()
        result = {'task_name': 'task_name', 'host_label': 'host_label', 'retries': 2, 'attempts': 1}
        callback.v2_runner_retry(result)
        self.assertEqual(callback._display.display, 'FAILED - RETRYING: [host_label]: task_name (1 retries left).')

    def test_v2_runner_on_async_poll(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host'}, 'started': 'started', 'finished': 'finished', 'result': {'ansible_job_id': 'jid'}}
        callback.v2_runner_on_async_poll(result)
        self.assertEqual(callback._display.display, 'ASYNC POLL on host: jid=jid started=started finished=finished')

    def test_v2_runner_on_async_ok(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host'}, 'result': {'ansible_job_id': 'jid'}}
        callback.v2_runner_on_async_ok(result)
        self.assertEqual(callback._display.display, 'ASYNC OK on host: jid=jid')

    def test_v2_runner_on_async_failed(self):
        callback = CallbackModule()
        result = {'_host': {'get_name': lambda: 'host'}, 'result': {'ansible_job_id': 'jid'}}
        callback.v2_runner_on_async_failed(result)
        self.assertEqual(callback._display.display, 'ASYNC FAILED on host: jid=jid')

    def test_v2_playbook_on_notify(self):
        callback = CallbackModule()
        handler = 'handler'
        host = 'host'
        callback.v2_playbook_on_notify(handler, host)
        self.assertEqual(callback._display.display, 'NOTIFIED HANDLER handler for host')

if __name__ == '__main__':
    unittest.main()