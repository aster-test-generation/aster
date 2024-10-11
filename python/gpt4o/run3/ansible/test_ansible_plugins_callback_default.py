import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.callback.default import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()
        self.callback._display = MagicMock()
        self.callback._display.verbosity = 2

    def test_init(self):
        self.assertIsNone(self.callback._play)
        self.assertIsNone(self.callback._last_task_banner)
        self.assertIsNone(self.callback._last_task_name)
        self.assertEqual(self.callback._task_type_cache, {})

    def test_v2_playbook_on_stats(self):
        stats = MagicMock()
        stats.processed.keys.return_value = ['host1', 'host2']
        stats.summarize.return_value = {
            'ok': 1, 'changed': 1, 'unreachable': 0, 'failures': 0, 'skipped': 0, 'rescued': 0, 'ignored': 0
        }
        stats.custom = {}
        self.callback.v2_playbook_on_stats(stats={'check': 'value'})
        self.callback._display.banner.assert_called_with('PLAY RECAP')

    def test_v2_playbook_on_start(self):
        playbook = MagicMock()
        playbook._file_name = 'test_playbook.yml'
        self.CLIARGS = {'check': False, 'args': []}
        self.callback.v2_playbook_on_start(playbook)
        self.callback._display.banner.assert_called_with('PLAYBOOK: test_playbook.yml')

    def test_v2_runner_retry(self):
        result = MagicMock()
        result.task_name = 'test_task'
        result._task = 'test_task'
        result._result = {'retries': 3, 'attempts': 1}
        self.callback._v2_runner_retry(result)
        self.callback._display.display.assert_called_with(
            'FAILED - RETRYING: [None]: test_task (2 retries left).', color=C.COLOR_DEBUG
        )

    def test_v2_runner_on_async_poll(self):
        result = MagicMock()
        result._host.get_name.return_value = 'test_host'
        result._result = {'ansible_job_id': '1234', 'started': 'start_time', 'finished': 'end_time'}
        self.callback.v2_runner_on_async_poll(result)
        self.callback._display.display.assert_called_with(
            'ASYNC POLL on test_host: jid=1234 started=start_time finished=end_time', color=self.COLOR_DEBUG
        )

    def test_v2_runner_on_async_ok(self):
        result = MagicMock()
        result._host.get_name.return_value = 'test_host'
        result._result = {'ansible_job_id': '1234'}
        self.callback.v2_runner_on_async_ok(result)
        self.callback._display.display.assert_called_with(
            'ASYNC OK on test_host: jid=1234', color=Color.COLOR_DEBUG
        )

    def test_v2_runner_on_async_failed(self):
        result = MagicMock()
        result._host.get_name.return_value = 'test_host'
        result._result = {'ansible_job_id': '1234'}
        self.callback.v2_runner_on_async_failed(result)
        self.callback._display.display.assert_called_with(
            'ASYNC FAILED on test_host: jid=1234', color=COLOR_DEBUG
        )

    def test_v2_playbook_on_notify(self):
        handler = MagicMock()
        handler.get_name.return_value = 'test_handler'
        host = 'test_host'
        self.callback.v2_playbook_on_notify(handler, host)
        self.callback._display.display.assert_called_with(
            'NOTIFIED HANDLER test_handler for test_host', color=self.COLOR_VERBOSE, screen_only=True
        )

if __name__ == '__main__':
    unittest.main()