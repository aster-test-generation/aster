import unittest
from ansible.modules.lineinfile import *


class TestLineinfileModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertIsInstance(module, AnsibleModule)

    def test_absent(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = absent(module, '/path/to/file', 'regexp', None, 'line', False)
        self.assertIsInstance(result, dict)

    def test___str__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertEqual(str(module), 'AnsibleModule')

    def test___repr__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertEqual(repr(module), 'AnsibleModule()')

    def test__check_file_attrs(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = module._check_file_attrs(True, 'msg', {'attr_diff': {}})
        self.assertIsInstance(result, tuple)

    def test_write_changes(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        module.write_changes(['line1', 'line2'], '/path/to/file')

    def test_backup_local(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        result = module.backup_local('/path/to/file')
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()