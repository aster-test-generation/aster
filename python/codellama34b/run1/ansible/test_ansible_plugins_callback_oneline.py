import unittest
from ansible.plugins.callback.yaml import *


class TestCallbackModule(unittest.TestCase):
    def test_v2_runner_on_failed(self):
        result = CallbackModule()
        result._result = {'exception': 'exception'}
        result._host = {'get_name': lambda: 'hostname'}
        result.v2_runner_on_failed(result, ignore_errors=False)

    def test_v2_runner_on_ok(self):
        result = CallbackModule()
        result._result = {'changed': True}
        result._host = {'get_name': lambda: 'hostname'}
        result.v2_runner_on_ok(result)

    def test_v2_runner_on_unreachable(self):
        result = CallbackModule()
        result._result = {'msg': 'msg'}
        result._host = {'get_name': lambda: 'hostname'}
        result.v2_runner_on_unreachable(result)

    def test_v2_runner_on_skipped(self):
        result = CallbackModule()
        result._host = {'get_name': lambda: 'hostname'}
        result.v2_runner_on_skipped(result)

if __name__ == '__main__':
    unittest.main()