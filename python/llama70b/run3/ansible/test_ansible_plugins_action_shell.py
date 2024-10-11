import unittest
from ansible.module_utils.basic import *


class TestActionModule(unittest.TestCase):
    def test_run(self):
        instance = ActionModule()
        result = instance.run(tmp=None, task_vars=None)
        self.assertIsNotNone(result)

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
        self.assertNotEqual(instance1, instance2)

    def test_private_method__task(self):
        instance = ActionModule()
        result = instance._ActionModule__task
        self.assertIsNotNone(result)

    def test_private_method__connection(self):
        instance = ActionModule()
        result = instance._ActionModule__connection
        self.assertIsNotNone(result)

    def test_private_method__play_context(self):
        instance = ActionModule()
        result = instance._ActionModule__play_context
        self.assertIsNotNone(result)

    def test_private_method__loader(self):
        instance = ActionModule()
        result = instance._ActionModule__loader
        self.assertIsNotNone(result)

    def test_private_method__templar(self):
        instance = ActionModule()
        result = instance._ActionModule__templar
        self.assertIsNotNone(result)

    def test_private_method__shared_loader_obj(self):
        instance = ActionModule()
        result = instance._ActionModule__shared_loader_obj
        self.assertIsNotNone(result)

    def test_protected_method__shared_loader_obj_action_loader(self):
        instance = ActionModule()
        result = instance._shared_loader_obj.action_loader
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()