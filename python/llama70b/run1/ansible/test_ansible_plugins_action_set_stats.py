import unittest
from ansible.module_utils._text import to_bytes


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test_init(self):
        instance = ActionModule()
        self.assertIsInstance(instance, ActionModule)

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
        self.assertTrue(instance1 == instance2)

    def test_TRANSFERS_FILES(self):
        self.assertFalse(ActionModule.TRANSFERS_FILES)

    def test_VALID_ARGS(self):
        self.assertIsInstance(ActionModule._VALID_ARGS, frozenset)

    def test_private__templar(self):
        instance = ActionModule()
        templar = instance._ActionModule__templar
        self.assertIsInstance(templar, object)

    def test_protected_task(self):
        instance = ActionModule()
        task = instance._task
        self.assertIsInstance(task, object)

    def test_protected_task_args(self):
        instance = ActionModule()
        task_args = instance._task.args
        self.assertIsInstance(task_args, dict)

if __name__ == '__main__':
    unittest.main()