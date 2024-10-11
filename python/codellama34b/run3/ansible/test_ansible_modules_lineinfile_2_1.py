import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule(argument_spec=dict(backrefs=dict(type='bool', default=False),
                                                  create=dict(type='bool', default=False),
                                                  backup=dict(type='bool', default=False),
                                                  firstmatch=dict(type='bool', default=False),
                                                  insertafter=dict(type='str', default='EOF'),
                                                  insertbefore=dict(type='str', default='BOF'),
                                                  line=dict(type='str', aliases=['value']),
                                                  path=dict(type='path', required=True, aliases=['dest', 'destfile', 'name']),
                                                  regexp=dict(type='str', aliases=['regex']),
                                                  state=dict(type='str', default='present', choices=['absent', 'present']),
                                                  validate=dict(type='str')),
                                                  supports_check_mode=True)
        b_lines = []
        dest = ''
        result = write_changes(module, b_lines, dest)
        self.assertEqual(result, None)

    def test_main(self):
        module = AnsibleModule(argument_spec=dict(backrefs=dict(type='bool', default=False),
                                                  create=dict(type='bool', default=False),
                                                  backup=dict(type='bool', default=False),
                                                  firstmatch=dict(type='bool', default=False),
                                                  insertafter=dict(type='str', default='EOF'),
                                                  insertbefore=dict(type='str', default='BOF'),
                                                  line=dict(type='str', aliases=['value']),
                                                  path=dict(type='path', required=True, aliases=['dest', 'destfile', 'name']),
                                                  regexp=dict(type='str', aliases=['regex']),
                                                  state=dict(type='str', default='present', choices=['absent', 'present']),
                                                  validate=dict(type='str')),
                                                  supports_check_mode=True)
        result = main(module)
        self.assertEqual(result, None)

    def test_get_matching_lines(self):
        module = AnsibleModule(argument_spec=dict(backrefs=dict(type='bool', default=False),
                                                  create=dict(type='bool', default=False),
                                                  backup=dict(type='bool', default=False),
                                                  firstmatch=dict(type='bool', default=False),
                                                  insertafter=dict(type='str', default='EOF'),
                                                  insertbefore=dict(type='str', default='BOF'),
                                                  line=dict(type='str', aliases=['value']),
                                                  path=dict(type='path', required=True, aliases=['dest', 'destfile', 'name']),
                                                  regexp=dict(type='str', aliases=['regex']),
                                                  state=dict(type='str', default='present', choices=['absent', 'present']),
                                                  validate=dict(type='str')),
                                                  supports_check_mode=True)
        b_lines = []
        result = get_matching_lines(module, b_lines)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()