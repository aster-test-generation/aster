import unittest
from ansible.modules.lineinfile import *



class TestLineInFile(unittest.TestCase):
    def test_main(self):
        module = AnsibleModule(argument_spec=dict(path=dict(type='path', required=True, aliases=['dest', 'destfile', 'name']), state=dict(type='str', default='present', choices=['absent', 'present']), regexp=dict(type='str', aliases=['regex']), search_string=dict(type='str'), line=dict(type='str', aliases=['value']), insertafter=dict(type='str'), insertbefore=dict(type='str'), backrefs=dict(type='bool', default=False), create=dict(type='bool', default=False), backup=dict(type='bool', default=False), firstmatch=dict(type='bool', default=False), validate=dict(type='str')), mutually_exclusive=[['insertbefore', 'insertafter'], ['regexp', 'search_string'], ['backrefs', 'search_string']], add_file_common_args=True, supports_check_mode=True)
        params = module.params
        create = params['create']
        backup = params['backup']
        backrefs = params['backrefs']
        path = params['path']
        firstmatch = params['firstmatch']
        regexp = params['regexp']
        search_string = params['search_string']
        line = params['line']
        if '' in [regexp, search_string]:
            msg = 'The %s is an empty string, which will match every line in the file. This may have unintended consequences, such as replacing the last line in the file rather than appending.'
            param_name = 'search string'
            if regexp == '':
                param_name = 'regular expression'
                msg += " If this is desired, use '^' to match every line in the file and avoid this warning."
            module.warn(msg % param_name)
        b_path = to_bytes(path, errors='surrogate_or_strict')
        if os.path.isdir(b_path):
            module.fail_json(rc=256, msg='Path %s is a directory !' % path)
        if params['state'] == 'present':
            if backrefs and regexp is None:
                module.fail_json(msg='regexp is required with backrefs=true')
            if line is None:
                module.fail_json(msg='line is required with state=present')
            ins_bef, ins_aft = (params['insertbefore'], params['insertafter'])
            if ins_bef is None and ins_aft is None:
                ins_aft = 'EOF'
            present(module, path, regexp, search_string, line, ins_aft, ins_bef, create, backup, backrefs, firstmatch)
        else:
            if (regexp, search_string, line) == (None, None, None):
                module.fail_json(msg='one of line, search_string, or regexp is required with state=absent')
            absent(module, path, regexp, search_string, line, backup)

if __name__ == '__main__':
    unittest.main()