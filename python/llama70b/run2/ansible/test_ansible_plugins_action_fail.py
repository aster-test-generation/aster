import unittest
from ansible.module_utils.basic import *


class TestActionModule(unittest.TestCase):
    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionBase)

    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIn('failed', result)
        self.assertIn('msg', result)
        self.assertTrue(result['failed'])

    def test_run_with_msg(self):
        instance = ActionModule()
        instance._task.args = {'msg': 'Custom failure message'}
        result = instance.run(tmp=None, task_vars=None)
        self.assertIn('failed', result)
        self.assertIn('msg', result)
        self.assertTrue(result['failed'])
        self.assertEqual(result['msg'], 'Custom failure message')

    def test_TRANSFERS_FILES(self):
        instance = ActionModule()
        self.assertFalse(instance.TRANSFERS_FILES)

    def test_VALID_ARGS(self):
        instance = ActionModule()
        self.assertEqual(instance._VALID_ARGS, frozenset(('msg',)))

    def test_str_method(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertNotEqual(instance1, instance2)

    def test_private_method__task(self):
        instance = ActionModule()
        with self.assertRaises(AttributeError):
            instance.__task

if __name__ == '__main__':
    unittest.main()