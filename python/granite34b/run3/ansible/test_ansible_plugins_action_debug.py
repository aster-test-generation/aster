import unittest
from ansible.plugins.action.debug import ActionModule


class TestActionModule(unittest.TestCase):
    def setUp(self):
        self.action = ActionModule(task=None, connection=None, play_context=None, loader=None, templar=None, shared_loader_obj=None)

    def test_run_msg(self):
        result = self.action.run(task_vars={'msg': 'Hello world!'})
        self.assertEqual(result['msg'], 'Hello world!')

    def test_run_var(self):
        result = self.action.run(task_vars={'var': 'x'})
        self.assertEqual(result['x'], 'x')

    def test_run_verbosity(self):
        result = self.action.run(task_vars={'verbosity': 1})
        self.assertEqual(result['verbosity'], 1)

    def test_run_verbosity_met(self):
        result = self.action.run(task_vars={'verbosity': 2})
        self.assertEqual(result['skipped'], True)

    def test_run_msg_and_var(self):
        result = self.action.run(task_vars={'msg': 'Hello world!', 'var': 'x'})
        self.assertEqual(result['failed'], True)

    def test_run_undefined_var(self):
        result = self.action.run(task_vars={'var': 'y'})
        self.assertEqual(result['y'], 'VARIABLE IS NOT DEFINED!')

    def test_run_list_var(self):
        result = self.action.run(task_vars={'var': ['a', 'b', 'c']})
        self.assertEqual(result['list'], ['a', 'b', 'c'])

    def test_run_dict_var(self):
        result = self.action.run(task_vars={'var': {'x': 1, 'y': 2, 'z': 3}})
        self.assertEqual(result['dict'], {'x': 1, 'y': 2, 'z': 3})

if __name__ == '__main__':
    unittest.main()