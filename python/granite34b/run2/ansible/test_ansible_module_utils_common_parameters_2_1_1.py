import unittest
from ansible.module_utils.common.parameters import *


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_check_mutually_exclusive(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'mutually_exclusive': [['param2', 'param3'], ['param4', 'param5']]}}
        self.assertEqual(check_mutually_exclusive(spec, params), [])

    def test_check_required_arguments(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required': True}, 'param2': {'required': True}}
        self.assertEqual(check_required_arguments(spec, params), [])

    def test_check_required_together(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_together': [['param2', 'param3'], ['param4', 'param5']]}}
        self.assertEqual(check_required_together(spec, params), [])

    def test_check_required_one_of(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_one_of': [['param2', 'param3'], ['param4', 'param5']]}}
        self.assertEqual(check_required_one_of(spec, params), [])

    def test_check_required_if(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_if': [['param2', 'equals', 1], ['param3', 'equals', 2]]}}
        self.assertEqual(check_required_if(spec, params), [])

    def test_check_required_by(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'required_by': {'param2': 'value1', 'param3': 'value2'}}}
        self.assertEqual(check_required_by(spec, params), [])

    def test_check_type_bits(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'type': 'bits', 'elements': 'str'}}
        self.assertEqual(check_type_bits(spec), None)

    def test_check_type_bool(self):
        params = {'param1': True, 'param2': False}
        spec = {'param1': {'type': 'bool'}, 'param2': {'type': 'bool'}}
        self.assertEqual(check_type_bool(spec, params), True)

    def test_check_type_bytes(self):
        params = {'param1': b'bytes', 'param2': 'string'}
        spec = {'param1': {'type': 'bytes'}, 'param2': {'type': 'bytes'}}
        self.assertEqual(check_type_bytes(spec, params), None)

    def test_check_type_dict(self):
        params = {'param1': {'key': 'value'}, 'param2': {'key': 'value'}}
        spec = {'param1': {'type': 'dict'}, 'param2': {'type': 'dict'}}
        self.assertEqual(check_type_dict(spec, params), True)

    def test_check_type_float(self):
        params = {'param1': 1.0, 'param2': 2.0}
        spec = {'param1': {'type': 'float'}, 'param2': {'type': 'float'}}
        self.assertEqual(check_type_float(spec, params), None)

    def test_check_type_int(self):
        params = {'param1': 1, 'param2': 2}
        spec = {'param1': {'type': 'int'}, 'param2': {'type': 'int'}}
        self.assertEqual(check_type_int(spec, params), TypeError)

    def test_check_type_jsonarg(self):
        params = {'param1': '{"key": "value"}', 'param2': '{"key": "value"}'}
        spec = {'param1': {'type': 'jsonarg'}, 'param2': {'type': 'jsonarg'}}
        self.assertEqual(check_type_jsonarg(spec, params), None)

if __name__ == '__main__':
    unittest.main()