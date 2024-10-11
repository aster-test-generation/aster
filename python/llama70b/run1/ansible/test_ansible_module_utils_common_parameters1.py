import unittest
from ansible.module_utils.common.parameters import (_get_type_validator, _get_legal_inputs, _get_unsupported_parameters, _handle_aliases, PASS_VARS, PASS_BOOLS, DEFAULT_TYPE_VALIDATORS, _ADDITIONAL_CHECKS)

class TestParameters(unittest.TestCase):
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