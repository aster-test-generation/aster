import unittest
from ansible.modules.replace import check_file_attrs
from ansible.module_utils.basic import AnsibleModule
from unittest.mock import MagicMock


class TestReplaceModule(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                path=dict(type='path', required=True, aliases=['dest', 'destfile', 'name']),
                regexp=dict(type='str', required=True),
                replace=dict(type='str', required=True),
                after=dict(type='str', required=False),
                backup=dict(type='bool', default=False),
                validate=dict(type='str', required=False),
                encoding=dict(type='str', default='utf-8'),
                unsafe_writes=dict(type='bool', default=False),
            ),
            supports_check_mode=True
        )

    def test_check_file_attrs(self):
        changed = False
        message = "Test message"
        result_message, result_changed = check_file_attrs(self.module, changed, message)
        self.assertIsInstance(result_message, str)
        self.assertIsInstance(result_changed, bool)

    def test_check_file_attrs_changed(self):
        changed = True
        message = "Test message"
        result_message, result_changed = check_file_attrs(self.module, changed, message)
        self.assertIn('ownership, perms or SE linux context changed', result_message)
        self.assertTrue(result_changed)

    def test_check_file_attrs_no_change(self):
        changed = False
        message = "Test message"
        result_message, result_changed = check_file_attrs(self.module, changed, message)
        self.assertEqual(result_message, "Test message")
        self.assertFalse(result_changed)

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