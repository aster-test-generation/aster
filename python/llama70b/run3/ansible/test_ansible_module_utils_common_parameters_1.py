import unittest
from ansible.module_utils.common.parameters import *
from ansible.module_utils.common.parameters import (_get_type_validator, _get_legal_inputs, _get_unsupported_parameters, _handle_aliases, PASS_VARS, PASS_BOOLS, DEFAULT_TYPE_VALIDATORS, _ADDITIONAL_CHECKS)

class TestGetTypeValidator(unittest.TestCase):


class TestGetTypeValidator(unittest.TestCase):
    def test_get_type_validator_str(self):
        from openapi_spec_validator import _get_type_validator
        self.assertEqual(result, (check_type_str, 'str'))

    def test_get_type_validator_list(self):
        from openapi_spec_validator import _get_type_validator
        self.assertEqual(result, (check_type_list, 'list'))

    def test_get_type_validator_callable(self):
        def custom_validator(x):
            return True
        from django.core.exceptions import ValidationError
        self.assertEqual(result, (custom_validator, 'custom_validator'))

class TestGetLegalInputs(unittest.TestCase):
    def test_get_legal_inputs(self):
        argument_spec = {'foo': {'type': 'str'}, 'bar': {'type': 'int'}}
        parameters = {'foo': 'hello', 'bar': 42, 'baz': 'qux'}
        from module_name import _get_legal_inputs
        self.assertEqual(result, ['foo', 'bar'])

class TestGetUnsupportedParameters(unittest.TestCase):
    def test_get_unsupported_parameters(self):
        argument_spec = {'foo': {'type': 'str'}, 'bar': {'type': 'int'}}
        parameters = {'foo': 'hello', 'bar': 42, 'baz': 'qux', 'qux': 'quux'}
        from module_name import _get_unsupported_parameters
        self.assertEqual(result, {'baz', 'qux'})

class TestHandleAliases(unittest.TestCase):
    def test_handle_aliases(self):
        argument_spec = {'foo': {'type': 'str', 'aliases': ['bar', 'baz']}}
        parameters = {'bar': 'hello', 'baz': 'qux'}
        from module_name import _handle_aliases
        self.assertEqual(result, {'bar': 'foo', 'baz': 'foo'})

    def test_get_type_validator_str(self):
        result = _get_type_validator('str')
        self.assertEqual(result, (DEFAULT_TYPE_VALIDATORS['str'], 'str'))

    def test_get_type_validator_callable(self):
        def custom_validator(x):
            pass
        result = _get_type_validator(custom_validator)
        self.assertEqual(result, (custom_validator, 'custom_validator'))

class TestGetLegalInputs(unittest.TestCase):
    def test_get_legal_inputs(self):
        argument_spec = {'foo': {'type': 'str'}, 'bar': {'type': 'int'}}
        parameters = {'foo': 'hello', 'bar': 42, 'baz': 'qux'}
        result = _get_legal_inputs(argument_spec, parameters)
        self.assertEqual(result, ['foo', 'bar', 'baz'])

class TestGetUnsupportedParameters(unittest.TestCase):
    def test_get_unsupported_parameters(self):
        argument_spec = {'foo': {'type': 'str'}, 'bar': {'type': 'int'}}
        parameters = {'foo': 'hello', 'bar': 42, 'baz': 'qux', 'qux': 'quux'}
        result = _get_unsupported_parameters(argument_spec, parameters)
        self.assertEqual(result, {'baz', 'qux'})

class TestHandleAliases(unittest.TestCase):
    def test_handle_aliases(self):
        argument_spec = {'foo': {'type': 'str', 'aliases': ['bar', 'baz']}}
        parameters = {'bar': 'hello', 'baz': 'world'}
        result = _handle_aliases(argument_spec, parameters)
        self.assertEqual(result, {'bar': 'foo', 'baz': 'foo'})

class TestPASS_VARS(unittest.TestCase):
    def test_pass_vars(self):
        self.assertEqual(PASS_VARS, {'check_mode': ('check_mode', False), 'debug': ('_debug', False), 'diff': ('_diff', False), 'keep_remote_files': ('_keep_remote_files', False), 'module_name': ('_name', None), 'no_log': ('no_log', False), 'remote_tmp': ('_remote_tmp', None), 'selinux_special_fs': ('_selinux_special_fs', ['fuse', 'nfs', 'vboxsf', 'ramfs', '9p', 'vfat']), 'shell_executable': ('_shell', '/bin/sh'), 'socket': ('_socket_path', None), 'string_conversion_action': ('_string_conversion_action', 'warn'), 'syslog_facility': ('_syslog_facility', 'INFO'), 'tmpdir': ('_tmpdir', None), 'verbosity': ('_verbosity', 0), 'version': ('ansible_version', '0.0')})

class TestPASS_BOOLS(unittest.TestCase):
    def test_pass_bools(self):
        self.assertEqual(PASS_BOOLS, ('check_mode', 'debug', 'diff', 'keep_remote_files', 'no_log'))

class TestDEFAULT_TYPE_VALIDATORS(unittest.TestCase):
    def test_default_type_validators(self):
        self.assertEqual(DEFAULT_TYPE_VALIDATORS, {'str': _get_type_validator('str')[0], 'list': _get_type_validator('list')[0], 'dict': _get_type_validator('dict')[0], 'bool': _get_type_validator('bool')[0], 'int': _get_type_validator('int')[0], 'float': _get_type_validator('float')[0], 'path': _get_type_validator('path')[0], 'raw': _get_type_validator('raw')[0], 'jsonarg': _get_type_validator('jsonarg')[0], 'json': _get_type_validator('jsonarg')[0], 'bytes': _get_type_validator('bytes')[0], 'bits': _get_type_validator('bits')[0]})

class TestADDITIONAL_CHECKS(unittest.TestCase):
    def test_additional_checks(self):
        self.assertEqual(_ADDITIONAL_CHECKS, ({'func': _get_type_validator('required_together')[0], 'attr': 'required_together', 'err': RequiredTogetherError}, {'func': _get_type_validator('required_one_of')[0], 'attr': 'required_one_of', 'err': RequiredOneOfError}, {'func': _get_type_validator('required_if')[0], 'attr': 'required_if', 'err': RequiredIfError}, {'func': _get_type_validator('required_by')[0], 'attr': 'required_by', 'err': RequiredByError}))

if __name__ == '__main__':
    unittest.main()