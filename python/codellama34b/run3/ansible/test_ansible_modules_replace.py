import unittest
from ansible.modules.replace import *


class TestReplace(unittest.TestCase):
    def test_main(self):
        result = main()
        self.assertEqual(result, None)

    def test_write_changes(self):
        module = AnsibleModule(argument_spec=dict(path=dict(type='path', required=True, aliases=['dest', 'destfile', 'name']), regexp=dict(type='str', required=True), replace=dict(type='str', default=''), after=dict(type='str'), before=dict(type='str'), backup=dict(type='bool', default=False), validate=dict(type='str'), encoding=dict(type='str', default='utf-8')), add_file_common_args=True, supports_check_mode=True)
        contents = b'test_contents'
        path = b'test_path'
        result = write_changes(module, contents, path)
        self.assertEqual(result, None)

    def test_check_file_attrs(self):
        module = AnsibleModule(argument_spec=dict(path=dict(type='path', required=True, aliases=['dest', 'destfile', 'name']), regexp=dict(type='str', required=True), replace=dict(type='str', default=''), after=dict(type='str'), before=dict(type='str'), backup=dict(type='bool', default=False), validate=dict(type='str'), encoding=dict(type='str', default='utf-8')), add_file_common_args=True, supports_check_mode=True)
        changed = True
        msg = b'test_msg'
        result = check_file_attrs(module, changed, msg)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()