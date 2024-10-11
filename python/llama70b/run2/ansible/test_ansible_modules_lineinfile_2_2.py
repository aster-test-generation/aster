import unittest
from ansible.modules.lineinfile import *


class TestLineinfileModule(unittest.TestCase):
    def test_present(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', None, None, False, False, False, False)
        self.assertIsNotNone(result)

    def test_present_with_search_string(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', None, 'search_string', 'line', None, None, False, False, False, False)
        self.assertIsNotNone(result)

    def test_present_with_insertafter(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', 'insertafter', None, False, False, False, False)
        self.assertIsNotNone(result)

    def test_present_with_insertbefore(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', None, 'insertbefore', False, False, False, False)
        self.assertIsNotNone(result)

    def test_check_file_attrs(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        changed, msg, attr_diff = check_file_attrs(module, True, 'msg', {})
        self.assertIsNotNone(changed)
        self.assertIsNotNone(msg)
        self.assertIsNotNone(attr_diff)

    def test_write_changes(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/file'
        write_changes(module, b_lines, dest)
        self.assertTrue(os.path.exists(dest))

    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertIsNotNone(module)

    def test___str__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertIsNotNone(str(module))

    def test___repr__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertIsNotNone(repr(module))

if __name__ == '__main__':
    unittest.main()