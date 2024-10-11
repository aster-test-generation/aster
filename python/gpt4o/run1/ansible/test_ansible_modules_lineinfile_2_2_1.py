import unittest
from ansible.modules.lineinfile import check_file_attrs
from ansible.module_utils.basic import AnsibleModule


class TestCheckFileAttrs(unittest.TestCase):
    def setUp(self):
        self.module = AnsibleModule(
            argument_spec=dict(
                path=dict(type='path', required=True),
                regexp=dict(type='str', aliases=['regex']),
                search_string=dict(type='str'),
                state=dict(type='str', choices=['absent', 'present'], default='present'),
                line=dict(type='str', aliases=['value']),
                backrefs=dict(type='bool', default=False),
                insertafter=dict(type='str', choices=['EOF', '*regex*'], default='EOF'),
                insertbefore=dict(type='str', choices=['BOF', '*regex*']),
                create=dict(type='bool', default=False),
                backup=dict(type='bool', default=False),
                firstmatch=dict(type='bool', default=False),
                others=dict(type='str')
            )
        )
        self.module.params = {
            'path': '/tmp/testfile',
            'state': 'present',
            'line': 'test line'
        }

    def test_check_file_attrs_changed(self):
        changed = False
        message = ''
        diff = {}
        self.module.set_fs_attributes_if_different = lambda x, y, diff: True
        result_message, result_changed = check_file_attrs(self.module, changed, message, diff)
        self.assertEqual(result_message, 'ownership, perms or SE linux context changed')
        self.assertTrue(result_changed)

    def test_check_file_attrs_not_changed(self):
        changed = False
        message = ''
        diff = {}
        self.module.set_fs_attributes_if_different = lambda x, y, diff: False
        result_message, result_changed = check_file_attrs(self.module, changed, message, diff)
        self.assertEqual(result_message, '')
        self.assertFalse(result_changed)

if __name__ == '__main__':
    unittest.main()