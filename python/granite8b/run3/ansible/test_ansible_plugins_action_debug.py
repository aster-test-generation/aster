import unittest
from ansible.plugins.action import debug


class TestActionModule(unittest.TestCase):
    def test_run(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars=None)
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_msg(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'msg': 'Hello, world!'})
        self.assertEqual(result['msg'], 'Hello, world!')

    def test_run_with_var(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'var': 'Hello, world!'})
        self.assertEqual(result['msg'], 'Hello, world!')

    def test_run_with_verbosity(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'verbosity': 1})
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_incompatible_options(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'msg': 'Hello, world!', 'var': 'Hello, world!'})
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], "'msg' and 'var' are incompatible options")

    def test_run_with_undefined_variable(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'var': '{{ foo }}'})
        self.assertEqual(result['msg'], 'VARIABLE IS NOT DEFINED!')

    def test_run_with_list_variable(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'var': [1, 2, 3]})
        self.assertEqual(result['list'], [1, 2, 3])

    def test_run_with_dict_variable(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'var': {'a': 1, 'b': 2}})
        self.assertEqual(result['dict'], {'a': 1, 'b': 2})

    def test_run_with_verbosity_0(self):
        action = ActionModule()
        result = action.run(tmp=None, task_vars={'verbosity': 0})
        self.assertEqual(result['skipped_reason'], "Verbosity threshold not met.")
        self.assertEqual(result['skipped'], True)

if __name__ == '__main__':
    unittest.main()