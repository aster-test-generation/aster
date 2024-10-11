import unittest
from ansible.modules.lineinfile import *


class TestLineinfileModule(unittest.TestCase):
    def test___init__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertIsInstance(module, AnsibleModule)

    def test_write_changes(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        b_lines = [b'test line']
        dest = 'test_file.txt'
        write_changes(module, b_lines, dest)
        self.assertTrue(os.path.exists(dest))

    def test__validate(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        validate = 'test_validate_command %s'
        tmpfile = 'test_file.txt'
        rc, out, err = module.run_command(to_bytes(validate % tmpfile, errors='surrogate_or_strict'))
        self.assertEqual(rc, 0)

    def test___str__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertEqual(str(module), 'AnsibleModule')

    def test___repr__(self):
        module = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertEqual(repr(module), 'AnsibleModule')

    def test___eq__(self):
        module1 = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        module2 = AnsibleModule(argument_spec=dict(path=dict(required=True), regexp=dict(), search_string=dict(), state=dict(choices=['absent', 'present'], default='present'), line=dict(), backrefs=dict(type='bool', default=False), insertafter=dict(), insertbefore=dict(), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False)))
        self.assertEqual(module1, module2)

if __name__ == '__main__':
    unittest.main()