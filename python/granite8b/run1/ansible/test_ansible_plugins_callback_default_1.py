import unittest
from ansible.plugins.callback import CallbackModule


class TestDefaultCallback(unittest.TestCase):
    def setUp(self):
        self.callback = CallbackModule()

    def test_v2_runner_on_failed(self):
        result = Mock()
        result.get_name.return_value = 'Test Task'
        result._task = Mock()
        result._task.action = 'test'
        result._result = {'failed': True}
        self.callback.v2_runner_on_failed(result)
        self.callback._display.display.assert_called_once_with('fatal: [localhost]: FAILED! => {"failed": true}', color=C.COLOR_ERROR, stderr=True)

    def test_v2_runner_on_ok(self):
        result = Mock()
        result.get_name.return_value = 'Test Task'
        result._task = Mock()
        result._task.action = 'test'
        result._result = {'changed': False}
        self.callback.v2_runner_on_ok(result)
        self.callback._display.display.assert_called_once_with('ok: [localhost]', color=C.COLOR_OK)

    def test_v2_runner_on_skipped(self):
        result = Mock()
        result.get_name.return_value = 'Test Task'
        result._task = Mock()
        result._task.action = 'test'
        result._result = {'changed': False, 'skipped': True}
        self.callback.v2_runner_on_skipped(result)
        self.callback._display.display.assert_called_once_with('skipping: [localhost]', color=C.COLOR_SKIP)

if __name__ == '__main__':
    unittest.main()