import unittest
from ansible.modules.lineinfile import *
from unittest.mock import MagicMock


class TestLineInFile(unittest.TestCase):
    def test_check_file_attrs(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args_set_fs_attributes_if_different(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args_set_fs_attributes_if_different_changed(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args_set_fs_attributes_if_different_changed_message(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args_set_fs_attributes_if_different_changed_message_ownership_perms_or_se_linux_context_changed(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args_set_fs_attributes_if_different_changed_message_ownership_perms_or_se_linux_context_changed_module_set_fs_attributes_if_different(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args_set_fs_attributes_if_different_changed_message_ownership_perms_or_se_linux_context_changed_module_set_fs_attributes_if_different_file_args(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_file_args_set_fs_attributes_if_different_changed_message_ownership_perms_or_se_linux_context_changed_module_set_fs_attributes_if_different_file_args_changed(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

if __name__ == '__main__':
    unittest.main()