import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test_list_deprecations(self):
        argument_spec = {'arg1': {'removed_at_date': '2022-01-01'}}
        parameters = {'arg1': 'value'}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'arg1' is deprecated. See the module docs for more information", 'date': '2022-01-01', 'collection_name': None}])

    def test_list_no_log_values(self):
        argument_spec = {'arg1': {'no_log': True}}
        params = {'arg1': 'secret'}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'secret'})

    def test_return_datastructure_name(self):
        obj = {'key': 'value'}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['value'])

    def test_return_datastructure_name_list(self):
        obj = [{'key': 'value1'}, {'key': 'value2'}]
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['value1', 'value2'])

    def test_return_datastructure_name_string(self):
        obj = 'hello'
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['hello'])

    def test_DEFAULT_TYPE_VALIDATORS(self):
        self.assertEqual(DEFAULT_TYPE_VALIDATORS, {'str': check_type_str, 'list': check_type_list, 'dict': check_type_dict, 'bool': check_type_bool, 'int': check_type_int, 'float': check_type_float, 'path': check_type_path, 'raw': check_type_raw, 'jsonarg': check_type_jsonarg, 'json': check_type_jsonarg, 'bytes': check_type_bytes, 'bits': check_type_bits})

    def test_PASS_VARS(self):
        self.assertEqual(PASS_VARS, {'check_mode': ('check_mode', False), 'debug': ('_debug', False), 'diff': ('_diff', False), 'keep_remote_files': ('_keep_remote_files', False), 'module_name': ('_name', None), 'no_log': ('no_log', False), 'remote_tmp': ('_remote_tmp', None), 'selinux_special_fs': ('_selinux_special_fs', ['fuse', 'nfs', 'vboxsf', 'ramfs', '9p', 'vfat']), 'shell_executable': ('_shell', '/bin/sh'), 'socket': ('_socket_path', None), 'string_conversion_action': ('_string_conversion_action', 'warn'), 'syslog_facility': ('_syslog_facility', 'INFO'), 'tmpdir': ('_tmpdir', None), 'verbosity': ('_verbosity', 0), 'version': ('ansible_version', '0.0')})

    def test_PASS_BOOLS(self):
        self.assertEqual(PASS_BOOLS, ('check_mode', 'debug', 'diff', 'keep_remote_files', 'no_log'))

if __name__ == '__main__':
    unittest.main()