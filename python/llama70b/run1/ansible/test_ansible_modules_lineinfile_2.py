import unittest
from ansible.modules.lineinfile import *


class TestLineinfileModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertIsInstance(module, AnsibleModule)

    def test_absent(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = absent(module, '/path/to/file', 'regexp', 'search_string', 'line', False)
        self.assertIsInstance(result, dict)

    def test__write_changes(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        b_lines = [b'line1\n', b'line2\n']
        dest = '/path/to/file'
        write_changes(module, b_lines, dest)
        # assert file contents

    def test_check_file_attrs(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        changed = True
        msg = 'file attributes changed'
        attr_diff = {}
        result = check_file_attrs(module, changed, msg, attr_diff)
        self.assertIsInstance(result, tuple)

    def test___str__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = module.__str__()
        self.assertIsInstance(result, str)

    def test___repr__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = module.__repr__()
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()