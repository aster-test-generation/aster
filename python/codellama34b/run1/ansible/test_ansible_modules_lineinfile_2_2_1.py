import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_check_file_attrs(self):
        module = Module()
        changed = False
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_diff(self):
        module = Module()
        changed = False
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_message(self):
        module = Module()
        changed = False
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_module(self):
        module = Module()
        changed = False
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_message(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_diff(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_message_diff(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_message_module(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_diff_module(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_message_diff_module(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_changed_message_module_diff(self):
        module = Module()
        changed = True
        message = "Test Message"
        diff = "Test Diff"
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

if __name__ == '__main__':
    unittest.main()