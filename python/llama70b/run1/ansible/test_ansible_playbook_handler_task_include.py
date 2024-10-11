import unittest
from ansible.playbook.handler import HandlerTaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_load(self):
        data = {'some': 'data'}
        block = 'block'
        role = 'role'
        task_include = 'task_include'
        variable_manager = 'variable_manager'
        loader = 'loader'
        result = HandlerTaskInclude.load(data, block, role, task_include, variable_manager, loader)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_init(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        self.assertIsNotNone(instance)

    def test_check_options(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        data = {'some': 'data'}
        result = instance.check_options(data, data)
        self.assertIsNotNone(result)

    def test_load_data(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        data = {'some': 'data'}
        variable_manager = 'variable_manager'
        loader = 'loader'
        result = instance.load_data(data, variable_manager=variable_manager, loader=loader)
        self.assertIsNotNone(result)

    def test_str_method(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        instance2 = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        self.assertTrue(instance1 == instance2)

    def test_private_method__init_subclass(self):
        class Subclass(HandlerTaskInclude):
            pass
        result = Subclass()._HandlerTaskInclude__init_subclass__()
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()