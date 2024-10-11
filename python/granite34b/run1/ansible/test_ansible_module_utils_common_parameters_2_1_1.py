import unittest
from ansible.module_utils.common.parameters import *


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'mutually_exclusive': [['param2', 'param3'], ['param4', 'param5']]}}
        self.assertRaises(MutuallyExclusiveError, check_mutually_exclusive, spec, params)

    def test_check_required_arguments(self):
        params = {'param1': 1}
        spec = {'param1': {'required': True}, 'param2': {'required': True}}
        self.assertRaises(RequiredError, check_required_arguments, spec, {'param1': 1})

    def test_check_required_together(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_together': [['param2', 'param3'], ['param4', 'param5']]}}
        self.assertRaises(RequiredTogetherError, check_required_together, spec, params)

    def test_check_required_one_of(self):
        params = {'param1': 1}
        spec = {'param1': {'required_one_of': [['param2', 'param3'], ['param4', 'param5']]}}
        self.assertRaises(RequiredOneOfError, check_required_one_of, spec, params)

    def test_check_required_if(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_if': [['param2', 'equals', 1], ['param3', 'equals', 2]]}}
        self.assertRaises(RequiredIfError, check_required_if, spec, params)

    def test_check_required_by(self):
        params = {'param1': 1}
        spec = {'param1': {'required_by': {'param2': 'value1', 'param3': 'value2'}}}
        self.assertRaises(RequiredByError, check_required_by, spec, params)

    def test_check_type_bits(self):
        params = {'param1': '1,2,3'}
        spec = {'param1': {'type': 'bits'}}
        self.assertRaises(ArgumentTypeError, check_type_bits, spec)

    def test_check_type_bool(self):
        params = {'param1': 'yes'}
        spec = {'param1': {'type': 'bool'}}
        self.assertRaises(ArgumentTypeError, check_type_bool, spec, params)

    def test_check_type_bytes(self):
        params = {'param1': '1024'}
        spec = {'param1': {'type': 'bytes'}}
        self.assertRaises(ArgumentTypeError, check_type_bytes, params)

    def test_check_type_dict(self):
        params = {'param1': 'key1:value1,key2:value2'}
        spec = {'param1': {'type': 'dict'}}
        self.assertRaises(ArgumentTypeError, check_type_dict, spec, params)

    def test_check_type_float(self):
        params = {'param1': '1.2'}
        spec = {'param1': {'type': 'float'}}
        self.assertRaises(ArgumentTypeError, check_type_float, spec, params)

    def test_check_type_int(self):
        params = {'param1': '10'}
        spec = {'param1': {'type': 'int'}}
        self.assertRaises(ArgumentTypeError, check_type_int, spec, params)

    def test_check_type_jsonarg(self):
        params = {'param1': '{"key1": "value1", "key2": "value2"}'}
        spec = {'param1': {'type': 'jsonarg'}}
        self.assertRaises(ArgumentTypeError, check_type_jsonarg, spec, params)

    def test_check_type_list(self):
        params = {'param1': 'value1,value2,value3'}
        spec = {'param1': {'type': 'list'}}
        self.assertRaises(ArgumentTypeError, check_type_list, spec, [params])

    def test_check_type_path(self):
        params = {'param1': '/path/to/file'}
        spec = {'param1': {'type': 'path'}}
        self.assertRaises(ArgumentTypeError, check_type_path, params)

if __name__ == '__main__':
    unittest.main()