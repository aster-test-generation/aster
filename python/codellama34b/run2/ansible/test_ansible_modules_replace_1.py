import unittest
from ansible.modules.replace import *



class TestReplaceModule(unittest.TestCase):
    def test_check_file_attrs(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed(self):
        from replace import ReplaceModule
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_message(self):
        from replace import ReplaceModule
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_message(self):
        from replace import ReplaceModule
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_message(self):
        instance = ReplaceModule.ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        instance = ReplaceModule()
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module_changed_message(self):
        from replace_module import ReplaceModule
        result = instance.check_file_attrs(module, changed, message)
        self.assertEqual(result, (message, changed))

if __name__ == '__main__':
    unittest.main()