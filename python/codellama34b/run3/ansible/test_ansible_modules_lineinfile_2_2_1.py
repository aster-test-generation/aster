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

    def test_check_file_attrs_2(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=True)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (mock.return_value.__iadd__.return_value.__iadd__.return_value, True))

    def test_check_file_attrs_3(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=False)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_4(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=True)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (mock.return_value.__iadd__.return_value.__iadd__.return_value, True))

    def test_check_file_attrs_5(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=False)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_6(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=True)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (mock.return_value.__iadd__.return_value.__iadd__.return_value, True))

    def test_check_file_attrs_7(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=False)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

    def test_check_file_attrs_8(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=True)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (mock.return_value.__iadd__.return_value.__iadd__.return_value, True))

    def test_check_file_attrs_9(self):
        module = MagicMock()
        changed = MagicMock()
        message = MagicMock()
        diff = MagicMock()
        module.set_fs_attributes_if_different = MagicMock(return_value=False)
        result = check_file_attrs(module, changed, message, diff)
        self.assertEqual(result, (message, changed))

if __name__ == '__main__':
    unittest.main()