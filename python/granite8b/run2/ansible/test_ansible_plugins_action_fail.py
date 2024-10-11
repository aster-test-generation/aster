import unittest
from ansible.plugins.action import ActionModule


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertEqual(result['failed'], True)
        self.assertEqual(result['msg'], 'Failed as requested from task')

    def test_transfer_files(self):
        instance = ActionModule()
        self.assertEqual(instance.TRANSFERS_FILES, False)

    def test_valid_args(self):
        instance = ActionModule()
        self.assertEqual(instance._VALID_ARGS, frozenset(('msg',)))

    def test_init(self):
        instance = ActionModule()
        self.assertEqual(instance._task.args, None)

    def test_str_method(self):
        instance = ActionModule()
        self.assertEqual(instance.__str__(), 'ActionModule')

    def test_repr_method(self):
        instance = ActionModule()
        self.assertEqual(instance.__repr__(), 'ActionModule()')

    def test_eq_method(self):
        instance = ActionModule()
        self.assertEqual(instance.__eq__(None), False)

if __name__ == '__main__':
    unittest.main()