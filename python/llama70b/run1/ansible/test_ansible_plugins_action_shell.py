import unittest
from ansible.module_utils.basic import *


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsInstance(result, dict)

    def test___init__(self):
        instance = ActionModule()
        self.assertIsNotNone(instance)

    def test__shared_loader_obj(self):
        instance = ActionModule()
        self.assertIsNotNone(instance._shared_loader_obj)

    def test__task(self):
        instance = ActionModule()
        self.assertIsNotNone(instance._task)

    def test__connection(self):
        instance = ActionModule()
        self.assertIsNotNone(instance._connection)

    def test__play_context(self):
        instance = ActionModule()
        self.assertIsNotNone(instance._play_context)

    def test__loader(self):
        instance = ActionModule()
        self.assertIsNotNone(instance._loader)

    def test__templar(self):
        instance = ActionModule()
        self.assertIsNotNone(instance._templar)

    def test___str__(self):
        instance = ActionModule()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        instance = ActionModule()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test___eq__(self):
        instance1 = ActionModule()
        instance2 = ActionModule()
        self.assertFalse(instance1 == instance2)

if __name__ == '__main__':
    unittest.main()