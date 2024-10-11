import unittest
from ansible.modules.replace import *



class TestReplace(unittest.TestCase):
    def test_check_file_attrs(self):
        instance = Replace()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_with_module_set_file_attributes_if_different(self):
        instance = Replace()
        instance.module = Module()
        instance.module.set_file_attributes_if_different = lambda x, y: True
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, True))

    def test_check_file_attrs_with_module_set_file_attributes_if_different_false(self):
        instance = Replace()
        instance.module = Module()
        instance.module.set_file_attributes_if_different = lambda x, y: False
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_with_changed_true(self):
        instance = Replace()
        result = instance.check_file_attrs(module, True, message)
        self.assertEqual(result, (message + ' and ownership, perms or SE linux context changed', True))

    def test_check_file_attrs_with_changed_false(self):
        instance = Replace()
        result = instance.check_file_attrs(module, False, message)
        self.assertEqual(result, (message + ' ownership, perms or SE linux context changed', True))

    def test_check_file_attrs_with_message_empty(self):
        instance = Replace()
        result = instance.check_file_attrs(module, changed, '')
        self.assertEqual(result, ('ownership, perms or SE linux context changed', changed))

    def test_check_file_attrs_with_message_none(self):
        instance = Replace()
        result = instance.check_file_attrs(module, changed, None)
        self.assertEqual(result, ('ownership, perms or SE linux context changed', changed))

    def test_check_file_attrs_with_changed_none(self):
        instance = Replace()
        result = instance.check_file_attrs(module, None, message)
        self.assertEqual(result, (message, None))

    def test_check_file_attrs_with_changed_none_and_message_none(self):
        instance = Replace()
        result = instance.check_file_attrs(module, None, None)
        self.assertEqual(result, ('ownership, perms or SE linux context changed', None))

    def test_check_file_attrs_with_changed_none_and_message_empty(self):
        instance = Replace()
        result = instance.check_file_attrs(module, None, '')
        self.assertEqual(result, ('ownership, perms or SE linux context changed', None))

    def test_check_file_attrs_with_changed_true_and_message_empty(self):
        instance = Replace(1, 2)
        result = instance.check_file_attrs(module, True, '')
        self.assertEqual(result, ('ownership, perms or SE linux context changed', True))

    def test_check_file_attrs_with_changed_true_and_message_none(self):
        instance = Replace()
        result = instance.check_file_attrs(module, True, None)
        self.assertEqual(result, ('ownership, perms or SE linux context changed', True))

    def test_check_file_attrs_with_changed_false_and_message_empty(self):
        instance = Replace()
        result = instance.check_file_attrs(module, False, '')
        self.assertEqual(result, ('ownership, perms or SE linux context changed', False))

if __name__ == '__main__':
    unittest.main()