import unittest
from ansible.module_utils._text import to_native


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test__supports_check_mode(self):
        instance = ActionModule()
        self.assertTrue(instance._supports_check_mode)

    def test__supports_async(self):
        instance = ActionModule()
        self.assertTrue(instance._supports_async)

    def test__execute_module(self):
        instance = ActionModule()
        result = instance._execute_module(task_vars=None, wrap_async=False)
        self.assertIsInstance(result, dict)

    def test__remove_tmp_path(self):
        instance = ActionModule()
        instance._connection = mock.Mock()
        instance._connection._shell = mock.Mock()
        instance._connection._shell.tmpdir = '/tmp/path'
        instance._remove_tmp_path(instance._connection._shell.tmpdir)
        instance._connection._shell.tmpdir = None
        self.assertIsNone(instance._connection._shell.tmpdir)

    def test___init__(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionBase)

    def test___str__(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertEqual(result, 'ActionModule')

    def test___repr__(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertEqual(result, 'ActionModule()')

    def test___eq__(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertTrue(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()