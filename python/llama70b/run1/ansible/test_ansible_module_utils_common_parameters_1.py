import unittest
from ansible.module_utils.common.parameters import *
from ansible.module_utils.common.parameters import (_get_type_validator, _get_legal_inputs, _get_unsupported_parameters, _handle_aliases, PASS_VARS, PASS_BOOLS, DEFAULT_TYPE_VALIDATORS, _ADDITIONAL_CHECKS)

class TestParameters(unittest.TestCase):


class TestParameters(unittest.TestCase):
    def test_get_type_validator(self):
        from openapi_spec_validator import _get_type_validator
        self.assertEqual(result, (check_type_str, 'str'))

    def test_get_legal_inputs(self):
        argument_spec = {'foo': {'type': 'str'}}
        parameters = {'foo': 'bar'}
        from module_name import _get_legal_inputs
        self.assertEqual(result, ['foo'])

    def test_get_unsupported_parameters(self):
        argument_spec = {'foo': {'type': 'str'}}
        parameters = {'foo': 'bar', 'baz': 'qux'}
        from module_name import _get_unsupported_parameters
        self.assertEqual(result, {'baz'})

    def test_handle_aliases(self):
        argument_spec = {'foo': {'type': 'str', 'aliases': ['bar', 'baz']}}
        parameters = {'bar': 'qux'}
        from ansible.parsing.yaml.objects import AnsibleVaultEncryptedUnicode
        self.assertEqual(result, {'bar': 'foo', 'baz': 'foo'})

    def test_handle_aliases_deprecations(self):
        argument_spec = {'foo': {'type': 'str', 'aliases': ['bar', 'baz'], 'deprecated_aliases': [{'name': 'bar', 'version': '2.0'}]}}
        parameters = {'bar': 'qux'}
        alias_deprecations = []
        from ansible.module_utils.basic import _handle_aliases
        self.assertEqual(result, {'bar': 'foo', 'baz': 'foo'})
        self.assertEqual(alias_deprecations, [{'name': 'bar', 'version': '2.0'}])

    def test_PASS_VARS(self):
        self.assertEqual(PASS_VARS, {'check_mode': ('check_mode', False), 'debug': ('_debug', False), 'diff': ('_diff', False), 'keep_remote_files': ('_keep_remote_files', False), 'module_name': ('_name', None), 'no_log': ('no_log', False), 'remote_tmp': ('_remote_tmp', None), 'selinux_special_fs': ('_selinux_special_fs', ['fuse', 'nfs', 'vboxsf', 'ramfs', '9p', 'vfat']), 'shell_executable': ('_shell', '/bin/sh'), 'socket': ('_socket_path', None), 'string_conversion_action': ('_string_conversion_action', 'warn'), 'syslog_facility': ('_syslog_facility', 'INFO'), 'tmpdir': ('_tmpdir', None), 'verbosity': ('_verbosity', 0), 'version': ('ansible_version', '0.0')})

    def test_PASS_BOOLS(self):
        self.assertEqual(PASS_BOOLS, ('check_mode', 'debug', 'diff', 'keep_remote_files', 'no_log'))

    def test_DEFAULT_TYPE_VALIDATORS(self):
        self.assertEqual(DEFAULT_TYPE_VALIDATORS, {'str': check_type_str, 'list': check_type_list, 'dict': check_type_dict, 'bool': check_type_bool, 'int': check_type_int, 'float': check_type_float, 'path': check_type_path, 'raw': check_type_raw, 'jsonarg': check_type_jsonarg, 'json': check_type_jsonarg, 'bytes': check_type_bytes, 'bits': check_type_bits})

    def test__get_type_validator(self):
        result = _get_type_validator('str')
        self.assertEqual(result, (DEFAULT_TYPE_VALIDATORS['str'], 'str'))

    def test__get_legal_inputs(self):
        argument_spec = {'key': {'type': 'str'}}
        parameters = {'key': 'value'}
        result = _get_legal_inputs(argument_spec, parameters)
        self.assertEqual(result, ['key'])

    def test__get_unsupported_parameters(self):
        argument_spec = {'key': {'type': 'str'}}
        parameters = {'key': 'value', 'unknown': 'value'}
        result = _get_unsupported_parameters(argument_spec, parameters)
        self.assertEqual(result, {'unknown'})

    def test__handle_aliases(self):
        argument_spec = {'key': {'type': 'str', 'aliases': ['alias']}}
        parameters = {'alias': 'value'}
        result = _handle_aliases(argument_spec, parameters)
        self.assertEqual(result, {'alias': 'key'})

    def test_PASS_VARS(self):
        self.assertEqual(PASS_VARS, {'check_mode': ('check_mode', False), 'debug': ('_debug', False), 'diff': ('_diff', False), 'keep_remote_files': ('_keep_remote_files', False), 'module_name': ('_name', None), 'no_log': ('no_log', False), 'remote_tmp': ('_remote_tmp', None), 'selinux_special_fs': ('_selinux_special_fs', ['fuse', 'nfs', 'vboxsf', 'ramfs', '9p', 'vfat']), 'shell_executable': ('_shell', '/bin/sh'), 'socket': ('_socket_path', None), 'string_conversion_action': ('_string_conversion_action', 'warn'), 'syslog_facility': ('_syslog_facility', 'INFO'), 'tmpdir': ('_tmpdir', None), 'verbosity': ('_verbosity', 0), 'version': ('ansible_version', '0.0')})

    def test_PASS_BOOLS(self):
        self.assertEqual(PASS_BOOLS, ('check_mode', 'debug', 'diff', 'keep_remote_files', 'no_log'))

    def test_DEFAULT_TYPE_VALIDATORS(self):
        self.assertEqual(DEFAULT_TYPE_VALIDATORS, {'str': _get_type_validator('str')[0], 'list': _get_type_validator('list')[0], 'dict': _get_type_validator('dict')[0], 'bool': _get_type_validator('bool')[0], 'int': _get_type_validator('int')[0], 'float': _get_type_validator('float')[0], 'path': _get_type_validator('path')[0], 'raw': _get_type_validator('raw')[0], 'jsonarg': _get_type_validator('jsonarg')[0], 'json': _get_type_validator('jsonarg')[0], 'bytes': _get_type_validator('bytes')[0], 'bits': _get_type_validator('bits')[0]})

    def test__ADDITIONAL_CHECKS(self):
        self.assertEqual(_ADDITIONAL_CHECKS, ({'func': _get_type_validator('required_together')[0], 'attr': 'required_together', 'err': RequiredTogetherError}, {'func': _get_type_validator('required_one_of')[0], 'attr': 'required_one_of', 'err': RequiredOneOfError}, {'func': _get_type_validator('required_if')[0], 'attr': 'required_if', 'err': RequiredIfError}, {'func': _get_type_validator('required_by')[0], 'attr': 'required_by', 'err': RequiredByError}))

if __name__ == '__main__':
    unittest.main()