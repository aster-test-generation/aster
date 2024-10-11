import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run_with_msg(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'msg': 'Hello, world!'})
        self.assertEqual(result['msg'], 'Hello, world!')

    def test_run_with_var(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'var': 'Hello, world!'})
        self.assertEqual(result['msg'], 'Hello, world!')

    def test_run_with_verbosity(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'verbosity': 1})
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_with_undefined_variable(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'var': '{{ undefined_variable }}'})
        self.assertEqual(result['msg'], 'VARIABLE IS NOT DEFINED!')

    def test_run_with_list_variable(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'var': ['a', 'b', 'c']})
        self.assertEqual(result[type(['a', 'b', 'c'])], ['a', 'b', 'c'])

    def test_run_with_dict_variable(self):
        action = ActionModule(None, None, None)
        result = action.run(task_vars={'var': {'a': 1, 'b': 2, 'c': 3}})
        self.assertEqual(result[type({'a': 1, 'b': 2, 'c': 3})], {'a': 1, 'b': 2, 'c': 3})

if __name__ == '__main__':
    unittest.main()