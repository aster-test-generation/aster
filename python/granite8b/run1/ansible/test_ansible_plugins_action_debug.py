import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_msg(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'msg': 'Hello, world!'})
        self.assertEqual(result['msg'], 'Hello, world!')

    def test_run_var(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'var': 'foo'})
        self.assertEqual(result['foo'], 'foo')

    def test_run_verbosity(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'verbosity': 1})
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_incompatible_options(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'msg': 'Hello, world!', 'var': 'foo'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "'msg' and 'var' are incompatible options")

if __name__ == '__main__':
    unittest.main()