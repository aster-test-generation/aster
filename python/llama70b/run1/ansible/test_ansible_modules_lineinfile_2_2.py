import unittest
from ansible.modules.lineinfile import *


class TestLineinfileModule(unittest.TestCase):
    def test_present(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', 'insertafter', None, False, False, False, False)
        self.assertTrue(result)

    def test_present_search_string(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', None, 'search_string', 'line', 'insertafter', None, False, False, False, False)
        self.assertTrue(result)

    def test_present_insertafter(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', 'insertafter', None, False, False, False, False)
        self.assertTrue(result)

    def test_present_insertbefore(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', None, 'insertbefore', False, False, False, False)
        self.assertTrue(result)

    def test_present_backrefs(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', 'insertafter', None, False, False, True, False)
        self.assertTrue(result)

    def test_present_firstmatch(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = present(module, '/path/to/file', 'regexp', None, 'line', 'insertafter', None, False, False, False, True)
        self.assertTrue(result)

    def test_check_file_attrs(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = check_file_attrs(module, True, 'msg', {})
        self.assertTrue(result)

    def test_write_changes(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = write_changes(module, ['line1', 'line2'], '/path/to/file')
        self.assertTrue(result)

    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(dest=dict(required=True), regexp=dict(), search_string=dict(), line=dict(), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), backrefs=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertIsInstance(module, AnsibleModule)

if __name__ == '__main__':
    unittest.main()