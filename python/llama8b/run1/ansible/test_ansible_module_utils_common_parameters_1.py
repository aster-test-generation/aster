import unittest
from ansible.module_utils.common.parameters import *


class TestParameters(unittest.TestCase):
    def test_get_type_validator(self):
        type_checker, wanted = _get_type_validator('str')
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

        type_checker, wanted = _get_type_validator(None)
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

        type_checker, wanted = _get_type_validator('int')
        self.assertEqual(type_checker, check_type_int)
        self.assertEqual(wanted, 'int')

    def test_get_legal_inputs(self):
        argument_spec = {'a': {'type': 'str'}, 'b': {'type': 'int'}}
        parameters = {'a': 'value', 'c': 'value'}
        legal_inputs = _get_legal_inputs(argument_spec, parameters)
        self.assertEqual(legal_inputs, ['a', 'b'])

    def test_get_unsupported_parameters(self):
        argument_spec = {'a': {'type': 'str'}, 'b': {'type': 'int'}}
        parameters = {'a': 'value', 'c': 'value'}
        unsupported_parameters = _get_unsupported_parameters(argument_spec, parameters)
        self.assertEqual(unsupported_parameters, set(['c']))

    def test_handle_aliases(self):
        argument_spec = {'a': {'type': 'str', 'aliases': ['b']}}
        parameters = {'b': 'value'}
        aliases_results = _handle_aliases(argument_spec, parameters)
        self.assertEqual(aliases_results, {'b': 'a'})

    def test_handle_aliases_deprecation(self):
        argument_spec = {'a': {'type': 'str', 'aliases': ['b'], 'deprecated_aliases': [{'name': 'c'}]}}
        parameters = {'c': 'value'}
        alias_deprecations = []
        _handle_aliases(argument_spec, parameters, alias_deprecations=alias_deprecations)
        self.assertEqual(alias_deprecations, [{'name': 'c'}])

    def test_handle_aliases_warning(self):
        argument_spec = {'a': {'type': 'str', 'aliases': ['b']}}
        parameters = {'a': 'value', 'b': 'value'}
        alias_warnings = []
        _handle_aliases(argument_spec, parameters, alias_warnings=alias_warnings)
        self.assertEqual(alias_warnings, [('a', 'b')])

    def test_get_additional_checks(self):
        self.assertEqual(_ADDITIONAL_CHECKS, ({'func': check_required_together, 'attr': 'required_together', 'err': RequiredTogetherError}, {'func': check_required_one_of, 'attr': 'required_one_of', 'err': RequiredOneOfError}, {'func': check_required_if, 'attr': 'required_if', 'err': RequiredIfError}, {'func': check_required_by, 'attr': 'required_by', 'err': RequiredByError}))

if __name__ == '__main__':
    unittest.main()