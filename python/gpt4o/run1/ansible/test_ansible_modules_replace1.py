import unittest
from unittest.mock import MagicMock
from ansible.modules.replace import check_file_attrs
from ansible.module_utils.basic import AnsibleModule

class TestCheckFileAttrs(unittest.TestCase):
    def setUp(self):
        self.module = MagicMock(spec=AnsibleModule)
        self.module.params = {}
        self.module.load_file_common_arguments = MagicMock(return_value={})
        self.module.set_file_attributes_if_different = MagicMock(return_value=False)

    def test_check_file_attrs_no_change(self):
        message, changed = check_file_attrs(self.module, False, "initial message")
        self.assertEqual(message, "initial message")
        self.assertFalse(changed)

    def test_check_file_attrs_with_change(self):
        self.module.set_file_attributes_if_different.return_value = True
        message, changed = check_file_attrs(self.module, False, "initial message")
        self.assertEqual(message, "initial messageownership, perms or SE linux context changed")
        self.assertTrue(changed)

    def test_check_file_attrs_already_changed(self):
        self.module.set_file_attributes_if_different.return_value = True
        message, changed = check_file_attrs(self.module, True, "initial message")
        self.assertEqual(message, "initial message and ownership, perms or SE linux context changed")
        self.assertTrue(changed)

if __name__ == '__main__':
    unittest.main()