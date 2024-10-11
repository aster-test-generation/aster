from ansible.plugins.callback.default import context
import unittest
from unittest.mock import MagicMock, patch
from ansible.plugins.callback.default import CallbackModule


class TestCallbackModule(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()
        self.callback._display = MagicMock()

    def test_init(self):
        self.assertIsNone(self.callback._play)
        self.assertIsNone(self.callback._last_task_banner)
        self.assertIsNone(self.callback._last_task_name)
        self.assertEqual(self.callback._task_type_cache, {})

    def test_v2_playbook_on_stats(self):
        stats = MagicMock()
        stats.processed.keys.return_value = ['host1', 'host2']
        stats.summarize.side_effect = [
            {'ok': 1, 'changed': 2, 'unreachable': 0, 'failures': 0, 'skipped': 1, 'rescued': 0, 'ignored': 0},
            {'ok': 2, 'changed': 1, 'unreachable': 0, 'failures': 1, 'skipped': 0, 'rescued': 0, 'ignored': 0}
        ]
        stats.custom = {'custom_stat': 'value'}

        self.callback.show_custom_stats = True
        self.callback.v2_playbook_on_stats(stats.__dict__)

        self.assertTrue(self.callback._display.banner.called)
        self.assertTrue(self.callback._display.display.called)

    def test_v2_playbook_on_start(self):
        playbook = MagicMock()
        playbook._file_name = 'test_playbook.yml'
        self.callback._display.verbosity = 4
        context.CLIARGS = {'args': ['arg1', 'arg2'], 'check': True}

        self.callback.v2_playbook_on_start(playbook, check_mode=False)

        self.assertTrue(self.callback._display.banner.called)
        self.assertTrue(self.callback._display.display.called)

    def test_v2_runner_retry(self):
        result = MagicMock()
        result.task_name = 'test_task'
        result._task = 'test_task'
        result._result = {'retries': 3, 'attempts': 1}

        self.callback._v2_runner_retry(result)

        self.assertTrue(self.callback._display.display.called)

    def test_v2_runner_on_async_poll(self):
        result = MagicMock()
        result._host.get_name.return_value = 'test_host'
        result._result = {'ansible_job_id': '1234', 'started': 'start_time', 'finished': 'end_time'}

        self.callback.v2_runner_on_async_poll(result)

        self.assertTrue(self.callback._display.display.called)

    def test_v2_runner_on_async_ok(self):
        result = MagicMock()
        result._host.get_name.return_value = 'test_host'
        result._result = {'ansible_job_id': '1234'}

        self.callback.v2_runner_on_async_ok(result)

        self.assertTrue(self.callback._display.display.called)

    def test_v2_runner_on_async_failed(self):
        result = MagicMock()
        result._host.get_name.return_value = 'test_host'
        result._result = {'ansible_job_id': '1234'}

        self.callback.v2_runner_on_async_failed(result)

        self.assertTrue(self.callback._display.display.called)

    def test_v2_playbook_on_notify(self):
        handler = MagicMock()
        handler.get_name.return_value = 'test_handler'
        host = 'test_host'
        self.callback._display.verbosity = 2

        self.callback.v2_playbook_on_notify(handler, host)

        self.assertTrue(self.callback._display.display.called)

if __name__ == '__main__':
    unittest.main()