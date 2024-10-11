import unittest
from ansible.plugins.action.yaml import *


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(None, None)
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_msg(self):
        instance = ActionModule()
        result = instance.run(None, {'msg': 'Hello world!'})
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_var(self):
        instance = ActionModule()
        result = instance.run(None, {'var': 'Hello world!'})
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_verbosity(self):
        instance = ActionModule()
        result = instance.run(None, {'verbosity': 0})
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_msg_and_var(self):
        instance = ActionModule()
        result = instance.run(None, {'msg': 'Hello world!', 'var': 'Hello world!'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "'msg' and 'var' are incompatible options")

    def test_run_with_msg_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(None, {'msg': 'Hello world!', 'verbosity': 0})
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_var_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(None, {'var': 'Hello world!', 'verbosity': 0})
        self.assertEqual(result['failed'], False)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_msg_var_and_verbosity(self):
        instance = ActionModule()
        result = instance.run(None, {'msg': 'Hello world!', 'var': 'Hello world!', 'verbosity': 0})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "'msg' and 'var' are incompatible options")

if __name__ == '__main__':
    unittest.main()