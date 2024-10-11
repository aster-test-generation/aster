import unittest
from ansible.module_utils.common.parameters import _validate_elements, _validate_argument_types


class TestValidateElements(unittest.TestCase):
    def test_validate_elements_str(self):
        result = _get_type_validator('str')('param', ['value1', 'value2'])
        self.assertEqual(result, ['value1', 'value2'])

    def test_validate_elements_int(self):
        result = _get_type_validator('int')('param', [1, 2])
        self.assertEqual(result, [1, 2])

    def test_validate_elements_float(self):
        result = _get_type_validator('float')('param', [1.1, 2.2])
        self.assertEqual(result, [1.1, 2.2])

    def test_validate_elements_bool(self):
        result = _get_type_validator('bool')('param', [True, False])
        self.assertEqual(result, [True, False])

    def test_validate_elements_list(self):
        result = _get_type_validator('list')('param', [['value1'], ['value2']])
        self.assertEqual(result, [['value1'], ['value2']])

    def test_validate_elements_dict(self):
        result = _get_type_validator('dict')('param', [{'key1': 'value1'}, {'key2': 'value2'}])
        self.assertEqual(result, [{'key1': 'value1'}, {'key2': 'value2'}])

    def test_validate_elements_unknown_type(self):
        with self.assertRaises(TypeError) as cm:
            _validate_elements('unknown_type', 'param', ['value1', 'value2'])
        self.assertEqual(str(cm.exception), "Invalid type 'unknown_type' for option 'param'")

class TestValidateArgumentTypes(unittest.TestCase):
    def test_validate_argument_types_str(self):
        result = _get_type_validator({'type': 'str'})('value')
        self.assertEqual(result, {'param': 'value'})

    def test_validate_argument_types_int(self):
        result = _get_type_validator({'type': 'int'})(1)
        self.assertEqual(result, {'param': 1})

    def test_validate_argument_types_float(self):
        result = _get_type_validator({'type': 'float'})(1.1)
        self.assertEqual(result, {'param': 1.1})

    def test_validate_argument_types_bool(self):
        result = _get_type_validator({'type': 'bool'})(True)
        self.assertEqual(result, {'param': True})

    def test_validate_argument_types_list(self):
        result = _get_type_validator({'type': 'list'})({'param': ['value1', 'value2']})
        self.assertEqual(result, {'param': ['value1', 'value2']})

    def test_validate_argument_types_dict(self):
        result = _get_type_validator({'type': 'dict'})({'param': {'key1': 'value1', 'key2': 'value2'}})
        self.assertEqual(result, {'param': {'key1': 'value1', 'key2': 'value2'}})

    def test_validate_argument_types_unknown_type(self):
        with self.assertRaises(TypeError) as cm:
            _validate_argument_types({'param': {'type': 'unknown_type'}}, {'param': 'value'})
        self.assertEqual(str(cm.exception), "Invalid type 'unknown_type' for option 'param'")

if __name__ == '__main__':
    unittest.main()