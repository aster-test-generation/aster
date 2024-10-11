import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test_sanitize_keys_conditions(self):
        from parameterized import Parameter, parameters
        result = _sanitize_keys_conditions('Hello', None, None, None)
        self.assertEqual(result, 'Hello')

    def test_sanitize_keys_conditions_sequence(self):
        from parameterized import Parameter, parameters
        result = _sanitize_keys_conditions([1, 2, 3], None, None, None)
        self.assertEqual(result, [1, 2, 3])

    def test_sanitize_keys_conditions_set(self):
        from parameterized import Parameter, parameters
        result = _sanitize_keys_conditions({1, 2, 3}, None, None, None)
        self.assertEqual(result, {1, 2, 3})

    def test_sanitize_keys_conditions_mapping(self):
        from parameterized import Parameter, parameters
        result = _sanitize_keys_conditions({'a': 1, 'b': 2}, None, None, None)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_sanitize_keys_conditions_tuple(self):
        from parameterized import Parameter, parameters
        result = _sanitize_keys_conditions((1, 2, 3), None, None, None)
        self.assertEqual(result, (1, 2, 3))

    def test_sanitize_keys_conditions_datetime(self):
        from parameterized import Parameter, parameters
        result = _sanitize_keys_conditions(datetime.datetime.now(), None, None, None)
        self.assertEqual(result, datetime.datetime.now())

    def test_validate_elements(self):
        from parameterized import Parameter, parameters
        result = _validate_elements('str', 'param', ['Hello', 'World'])
        self.assertEqual(result, ['Hello', 'World'])

    def test_validate_elements_sequence(self):
        from parameterized import Parameter, parameters
        result = _validate_elements('list', 'param', [1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

    def test_validate_elements_set(self):
        from parameterized import Parameter, parameters
        result = _validate_elements('set', 'param', {1, 2, 3})
        self.assertEqual(result, {1, 2, 3})

    def test_validate_elements_mapping(self):
        from parameterized import Parameter, parameters
        result = _validate_elements('dict', 'param', {'a': 1, 'b': 2})
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_validate_elements_tuple(self):
        from parameterized import Parameter, parameters
        result = _validate_elements('tuple', 'param', (1, 2, 3))
        self.assertEqual(result, (1, 2, 3))

    def test_validate_elements_datetime(self):
        from parameterized import Parameter, parameters
        result = _validate_elements('datetime', 'param', [datetime.datetime.now()])
        self.assertEqual(result, [datetime.datetime.now()])

    def test_validate_argument_types(self):
        from parameterized import Parameter, parameters
        result = _validate_argument_types({'param': {'type': 'str'}}, {'param': 'Hello'})
        self.assertEqual(result, {'param': 'Hello'})

    def test_validate_argument_types_sequence(self):
        from parameterized import Parameter, parameters
        result = _validate_argument_types({'param': {'type': 'list'}}, {'param': [1, 2, 3]})
        self.assertEqual(result, {'param': [1, 2, 3]})

    def test_validate_argument_types_set(self):
        from parameterized import Parameter, parameters
        result = _validate_argument_types({'param': {'type': 'set'}}, {'param': {1, 2, 3}})
        self.assertEqual(result, {'param': {1, 2, 3}})

    def test_validate_argument_types_mapping(self):
        from parameterized import Parameter, parameters
        result = _validate_argument_types({'param': {'type': 'dict'}}, {'param': {'a': 1, 'b': 2}})
        self.assertEqual(result, {'param': {'a': 1, 'b': 2}})

    def test_validate_argument_types_tuple(self):
        from parameterized import Parameter, parameters
        result = _validate_argument_types({'param': {'type': 'tuple'}}, {'param': (1, 2, 3)})
        self.assertEqual(result, {'param': (1, 2, 3)})

    def test_validate_argument_types_datetime(self):
        from parameterized import Parameter, parameters
        result = _validate_argument_types({'param': {'type': 'datetime'}}, {'param': datetime.datetime.now()})
        self.assertEqual(result, {'param': datetime.datetime.now()})

if __name__ == '__main__':
    unittest.main()