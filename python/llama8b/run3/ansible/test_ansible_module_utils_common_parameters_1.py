import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test_get_type_validator(self):
        type_checker, wanted = _get_type_validator('str')
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

        type_checker, wanted = _get_type_validator(check_type_int)
        self.assertEqual(type_checker, check_type_int)
        self.assertEqual(wanted, 'int')

    def test_get_legal_inputs(self):
        argument_spec = {'a': {'type': 'str'}, 'b': {'type': 'list'}}
        parameters = {'a': 'value', 'b': ['value']}
        legal_inputs = _get_legal_inputs(argument_spec, parameters)
        self.assertEqual(legal_inputs, ['a', 'b'])

    def test_get_unsupported_parameters(self):
        argument_spec = {'a': {'type': 'str'}, 'b': {'type': 'list'}}
        parameters = {'c': 'value'}
        unsupported_parameters = _get_unsupported_parameters(argument_spec, parameters)
        self.assertEqual(unsupported_parameters, [('c',)])

    def test_handle_aliases(self):
        argument_spec = {'a': {'type': 'str', 'aliases': ['b']}}
        parameters = {'b': 'value'}
        aliases_results = _handle_aliases(argument_spec, parameters)
        self.assertEqual(aliases_results, {'b': 'a'})

    def test_handle_aliases_deprecation(self):
        argument_spec = {'a': {'type': 'str', 'aliases': ['b'], 'deprecated_aliases': [{'name': 'c'}]}}
        parameters = {'c': 'value'}
        alias_deprecations = []
        _handle_aliases(argument_spec, parameters, alias_deprecations=alias_deprecations)
        self.assertEqual(alias_deprecations, [{'name': 'c'}])

    def test_handle_aliases_warning(self):
        argument_spec = {'a': {'type': 'str', 'aliases': ['b']}}
        parameters = {'a': 'value', 'b': 'value'}
        alias_warnings = []
        _handle_aliases(argument_spec, parameters, alias_warnings=alias_warnings)
        self.assertEqual(alias_warnings, [('a', 'b')])

    def test_get_additional_checks(self):
        self.assertEqual(_ADDITIONAL_CHECKS, ({'func': check_required_together, 'attr': 'required_together', 'err': RequiredTogetherError}, {'func': check_required_one_of, 'attr': 'required_one_of', 'err': RequiredOneOfError}, {'func': check_required_if, 'attr': 'required_if', 'err': RequiredIfError}, {'func': check_required_by, 'attr': 'required_by', 'err': RequiredByError}))

    def test_pass_vars(self):
        self.assertEqual(PASS_VARS, {'check_mode': ('check_mode', False), 'debug': ('_debug', False), 'diff': ('_diff', False), 'keep_remote_files': ('_keep_remote_files', False), 'module_name': ('_name', None), 'no_log': ('no_log', False), 'remote_tmp': ('_remote_tmp', None), 'selinux_special_fs': ('_selinux_special_fs', ['fuse', 'nfs', 'vboxsf', 'ramfs', '9p', 'vfat']), 'shell_executable': ('_shell', '/bin/sh'), 'socket': ('_socket_path', None), 'string_conversion_action': ('_string_conversion_action', 'warn'), 'syslog_facility': ('_syslog_facility', 'INFO'), 'tmpdir': ('_tmpdir', None), 'verbosity': ('_verbosity', 0), 'version': ('ansible_version', '0.0')})

    def test_pass_bools(self):
        self.assertEqual(PASS_BOOLS, ('check_mode', 'debug', 'diff', 'keep_remote_files', 'no_log'))

    def test_default_type_validators(self):
        self.assertEqual(DEFAULT_TYPE_VALIDATORS, {'str': check_type_str, 'list': check_type_list, 'dict': check_type_dict, 'bool': check_type_bool, 'int': check_type_int, 'float': check_type_float, 'path': check_type_path, 'raw': check_type_raw, 'jsonarg': check_type_jsonarg, 'json': check_type_jsonarg, 'bytes': check_type_bytes, 'bits': check_type_bits})

if __name__ == '__main__':
    unittest.main()