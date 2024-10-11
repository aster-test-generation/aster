import unittest
from ansible.modules.lineinfile import *



class TestLineinfile(unittest.TestCase):
    def test_write_changes(self):
        module = AnsibleModule(argument_spec={})
        b_lines = []
        dest = ""
        tmpfd, tmpfile = tempfile.mkstemp(dir=module.tmpdir)
        with os.fdopen(tmpfd, 'wb') as f:
            f.writelines(b_lines)
        validate = module.params.get('validate', None)
        valid = not validate
        if validate:
            if '%s' not in validate:
                module.fail_json(msg='validate must contain %%s: %s' % validate)
            rc, out, err = module.run_command(to_bytes(validate % tmpfile, errors='surrogate_or_strict'))
            valid = rc == 0
            if rc != 0:
                module.fail_json(msg='failed to validate: rc:%s error:%s' % (rc, err))
        if valid:
            module.atomic_move(tmpfile, to_native(os.path.realpath(to_bytes(dest, errors='surrogate_or_strict')), errors='surrogate_or_strict'), unsafe_writes=module.params['unsafe_writes'])

    def test_AnsibleModule(self):
        AnsibleModule(argument_spec=dict())

    def test_AnsibleModule_exit_json(self):
        AnsibleModule(argument_spec=dict()).exit_json()

    def test_AnsibleModule_fail_json(self):
        AnsibleModule(argument_spec=dict()).fail_json()

    def test_AnsibleModule_run_command(self):
        AnsibleModule(argument_spec=dict()).run_command()

    def test_AnsibleModule_atomic_move(self):
        AnsibleModule(argument_spec={}).atomic_move()

    def test_AnsibleModule_load_file_common_arguments(self):
        AnsibleModule(argument_spec=dict()).load_file_common_arguments()

    def test_AnsibleModule_load_file_common_arguments_check_invalid_arguments(self):
        AnsibleModule(argument_spec=dict()).load_file_common_arguments_check_invalid_arguments()

    def test_AnsibleModule_load_file_common_arguments_check_invalid_arguments_fail_on_undefined(self):
        AnsibleModule(argument_spec=dict()).load_file_common_arguments_check_invalid_arguments_fail_on_undefined()

    def test_AnsibleModule_load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined(self):
        AnsibleModule(argument_spec=dict()).load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined()

    def test_AnsibleModule_load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined_fail_on_undefined(self):
        AnsibleModule(argument_spec=dict()).load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined_fail_on_undefined()

    def test_AnsibleModule_load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined_fail_on_undefined_fail_on_undefined(self):
        AnsibleModule(argument_spec=dict()).load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined_fail_on_undefined_fail_on_undefined()

    def test_AnsibleModule_load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined_fail_on_undefined_fail_on_undefined_fail_on_undefined(self):
        AnsibleModule(argument_spec=dict()).load_file_common_arguments_check_invalid_arguments_fail_on_undefined_fail_on_undefined_fail_on_undefined_fail_on_undefined_fail_on_undefined()

if __name__ == '__main__':
    unittest.main()