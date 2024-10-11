import unittest
from ansible.module_utils.common.yaml import load, dump


class TestTask(unittest.TestCase):
    def test_private_method(self):
        instance = Task()
        result = instance._Task__post_validate_environment('attr', 'value', 'templar')
        self.assertEqual(result, 'value')

    def test_protected_method(self):
        instance = Task()
        result = instance._Task__post_validate_changed_when('attr', 'value', 'templar')
        self.assertEqual(result, 'value')

    def test_magic_method(self):
        instance = Task()
        result = instance.__str__()
        self.assertEqual(result, 'Task')

    def test_magic_method(self):
        instance = Task()
        result = instance.__repr__()
        self.assertEqual(result, 'Task()')

if __name__ == '__main__':
    unittest.main()