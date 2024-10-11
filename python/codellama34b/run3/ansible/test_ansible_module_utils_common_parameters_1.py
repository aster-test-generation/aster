from ansible.module_utils.common.parameters import _get_type_validator
import unittest
from ansible.module_utils.common.parameters import *



class Test_get_type_validator(unittest.TestCase):
    def test_get_type_validator(self):
        wanted = None
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_str, 'str'))

    def test_get_type_validator_2(self):
        wanted = 'str'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_str, 'str'))

    def test_get_type_validator_3(self):
        wanted = 'list'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_list, 'list'))

    def test_get_type_validator_4(self):
        wanted = 'dict'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_dict, 'dict'))

    def test_get_type_validator_5(self):
        wanted = 'bool'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_bool, 'bool'))

    def test_get_type_validator_6(self):
        wanted = 'int'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_int, 'int'))

    def test_get_type_validator_7(self):
        wanted = 'float'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_float, 'float'))

    def test_get_type_validator_8(self):
        wanted = 'path'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_path, 'path'))

    def test_get_type_validator_9(self):
        wanted = 'raw'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_raw, 'raw'))

    def test_get_type_validator_10(self):
        wanted = 'jsonarg'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_jsonarg, 'jsonarg'))

    def test_get_type_validator_11(self):
        wanted = 'json'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_jsonarg, 'jsonarg'))

    def test_get_type_validator_12(self):
        wanted = 'bytes'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_bytes, 'bytes'))

    def test_get_type_validator_13(self):
        wanted = 'bits'
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_bits, 'bits'))

    def test_get_type_validator_14(self):
        wanted = check_type_str
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_str, 'str'))

    def test_get_type_validator_15(self):
        wanted = check_type_list
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_list, 'list'))

    def test_get_type_validator_16(self):
        wanted = check_type_dict
        result = _get_type_validator(wanted)
        self.assertEqual(result, (check_type_dict, 'dict'))

if __name__ == '__main__':
    unittest.main()