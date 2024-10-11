import unittest
from ansible.playbook.handler import HandlerTaskInclude


class TestHandlerTaskInclude(unittest.TestCase):
    def test_load(self):
        data = {'foo': 'bar'}
        block = 'block'
        role = 'role'
        task_include = 'task_include'
        variable_manager = 'variable_manager'
        loader = 'loader'
        result = HandlerTaskInclude.load(data, block, role, task_include, variable_manager, loader)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_init(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        self.assertEqual(instance.block, 'block')
        self.assertEqual(instance.role, 'role')
        self.assertEqual(instance.task_include, 'task_include')

    def test_check_options(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        data = {'foo': 'bar'}
        result = instance.check_options(data, data)
        self.assertIsInstance(result, HandlerTaskInclude)

    def test_load_data(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        data = {'foo': 'bar'}
        variable_manager = 'variable_manager'
        loader = 'loader'
        result = instance.load_data(data, variable_manager=variable_manager, loader=loader)
        self.assertIsInstance(result, dict)

    def test_str(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq(self):
        instance1 = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        instance2 = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        self.assertTrue(instance1 == instance2)

    def test_private_method__validate_options(self):
        instance = HandlerTaskInclude(block='block', role='role', task_include='task_include')
        data = {'foo': 'bar'}
        result = instance._HandlerTaskInclude__validate_options(data)
        self.assertIsNone(result)

class TestTaskInclude(unittest.TestCase):
    def test_VALID_INCLUDE_KEYWORDS(self):
        self.assertIsInstance(TaskInclude.VALID_INCLUDE_KEYWORDS, set)

if __name__ == '__main__':
    unittest.main()