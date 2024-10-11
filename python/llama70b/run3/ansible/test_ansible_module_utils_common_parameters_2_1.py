import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test__sanitize_keys_conditions(self):
        value = "hello"
        no_log_strings = []
        ignore_keys = []
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, value)

    def test__validate_elements(self):
        wanted_type = "str"
        parameter = "param"
        values = ["hello", "world"]
        options_context = None
        errors = None
        result = _validate_elements(wanted_type, parameter, values, options_context, errors)
        self.assertEqual(result, ["hello", "world"])

    def test__validate_argument_types(self):
        argument_spec = {"param": {"type": "str"}}
        parameters = {"param": "hello"}
        prefix = ""
        options_context = None
        errors = None
        _validate_argument_types(argument_spec, parameters, prefix, options_context, errors)
        self.assertEqual(parameters["param"], "hello")

    def test_PASS_VARS(self):
        self.assertEqual(PASS_VARS, {'check_mode': ('check_mode', False), 'debug': ('_debug', False), 'diff': ('_diff', False), 'keep_remote_files': ('_keep_remote_files', False), 'module_name': ('_name', None), 'no_log': ('no_log', False), 'remote_tmp': ('_remote_tmp', None), 'selinux_special_fs': ('_selinux_special_fs', ['fuse', 'nfs', 'vboxsf', 'ramfs', '9p', 'vfat']), 'shell_executable': ('_shell', '/bin/sh'), 'socket': ('_socket_path', None), 'string_conversion_action': ('_string_conversion_action', 'warn'), 'syslog_facility': ('_syslog_facility', 'INFO'), 'tmpdir': ('_tmpdir', None), 'verbosity': ('_verbosity', 0), 'version': ('ansible_version', '0.0')})

    def test_PASS_BOOLS(self):
        self.assertEqual(PASS_BOOLS, ('check_mode', 'debug', 'diff', 'keep_remote_files', 'no_log'))

    def test_DEFAULT_TYPE_VALIDATORS(self):
        self.assertEqual(DEFAULT_TYPE_VALIDATORS, {'str': check_type_str, 'list': check_type_list, 'dict': check_type_dict, 'bool': check_type_bool, 'int': check_type_int, 'float': check_type_float, 'path': check_type_path, 'raw': check_type_raw, 'jsonarg': check_type_jsonarg, 'json': check_type_jsonarg, 'bytes': check_type_bytes, 'bits': check_type_bits})

if __name__ == '__main__':
    unittest.main()