import unittest
from ansible.module_utils.common.parameters import (
    _sanitize_keys_conditions,
    _validate_elements,
    _validate_argument_types
)
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.errors import AnsibleValidationErrorMultiple, ElementError, ArgumentTypeError
from ansible.module_utils.six import text_type, binary_type
from collections import deque
from itertools import chain
import datetime

class TestSanitizeKeysConditions(unittest.TestCase):
    def test_sanitize_keys_conditions_text_type(self):
        result = _sanitize_keys_conditions("test", [], [], [])
        self.assertEqual(result, "test")

    def test_sanitize_keys_conditions_binary_type(self):
        result = _sanitize_keys_conditions(b"test", [], [], [])
        self.assertEqual(result, b"test")

    def test_sanitize_keys_conditions_sequence(self):
        deferred_removals = []
        result = _sanitize_keys_conditions([1, 2, 3], [], [], deferred_removals)
        self.assertEqual(result, [])
        self.assertEqual(deferred_removals, [([1, 2, 3], [])])

    def test_sanitize_keys_conditions_set(self):
        deferred_removals = []
        result = _sanitize_keys_conditions({1, 2, 3}, [], [], deferred_removals)
        self.assertEqual(result, set())
        self.assertEqual(deferred_removals, [({1, 2, 3}, set())])

    def test_sanitize_keys_conditions_mapping(self):
        deferred_removals = []
        result = _sanitize_keys_conditions({'key': 'value'}, [], [], deferred_removals)
        self.assertEqual(result, {})
        self.assertEqual(deferred_removals, [({'key': 'value'}, {})])

    def test_sanitize_keys_conditions_tuple(self):
        result = _sanitize_keys_conditions((1, 2, 3), [], [], [])
        self.assertEqual(result, (1, 2, 3))

    def test_sanitize_keys_conditions_datetime(self):
        dt = datetime.datetime.now()
        result = _sanitize_keys_conditions(dt, [], [], [])
        self.assertEqual(result, dt)

    def test_sanitize_keys_conditions_raises_type_error(self):
        with self.assertRaises(TypeError):
            _sanitize_keys_conditions(object(), [], [], [])

class TestValidateElements(unittest.TestCase):
    def test_validate_elements(self):
        result = _validate_elements('str', 'param', ['a', 'b', 'c'])
        self.assertEqual(result, ['a', 'b', 'c'])

    def test_validate_elements_with_errors(self):
        errors = AnsibleValidationErrorMultiple()
        result = _validate_elements('int', 'param', ['1', '2', 'a'], errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ElementError)

class TestValidateArgumentTypes(unittest.TestCase):
    def test_validate_argument_types(self):
        argument_spec = {'param': {'type': 'str'}}
        parameters = {'param': 'value'}
        _validate_argument_types(argument_spec, parameters)
        self.assertEqual(parameters['param'], 'value')

    def test_validate_argument_types_with_elements(self):
        argument_spec = {'param': {'type': 'list', 'elements': 'str'}}
        parameters = {'param': ['a', 'b', 'c']}
        _validate_argument_types(argument_spec, parameters)
        self.assertEqual(parameters['param'], ['a', 'b', 'c'])

    def test_validate_argument_types_with_errors(self):
        argument_spec = {'param': {'type': 'int'}}
        parameters = {'param': 'value'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_types(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentTypeError)

if __name__ == '__main__':
    unittest.main()