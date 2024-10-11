import unittest
from ansible.module_utils.common.parameters import _get_type_validator, _get_legal_inputs, _get_unsupported_parameters, _handle_aliases
from ansible.module_utils.common._collections_compat import KeysView, Set, Sequence, Mapping, MutableMapping, MutableSet, MutableSequence
from ansible.module_utils.common.text.converters import to_bytes, to_native, to_text
from ansible.module_utils.common.text.formatters import lenient_lowercase
from ansible.module_utils.common.warnings import warn
from ansible.module_utils.errors import AliasError, AnsibleFallbackNotFound, AnsibleValidationErrorMultiple, ArgumentTypeError, ArgumentValueError, ElementError, MutuallyExclusiveError, NoLogError, RequiredByError, RequiredError, RequiredIfError, RequiredOneOfError, RequiredTogetherError, SubParameterTypeError
from ansible.module_utils.parsing.convert_bool import BOOLEANS_FALSE, BOOLEANS_TRUE
from ansible.module_utils.common.validation import check_mutually_exclusive, check_required_arguments, check_required_together, check_required_one_of, check_required_if, check_required_by, check_type_bits, check_type_bool, check_type_bytes, check_type_dict, check_type_float, check_type_int, check_type_jsonarg, check_type_list, check_type_path, check_type_raw, check_type_str


class TestParameters(unittest.TestCase):
    def test_get_type_validator(self):
        type_checker, wanted = _get_type_validator('str')
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

    def test_get_legal_inputs(self):
        argument_spec = {'func': 'str', 'attr': 'str'}
        parameters = {'func': 'str', 'attr': 'str'}
        legal_inputs = _get_legal_inputs(argument_spec, parameters)
        self.assertEqual(legal_inputs, ['func', 'attr'])

    def test_get_unsupported_parameters(self):
        argument_spec = {'func': 'str', 'attr': 'str'}
        parameters = {'func': 'str', 'attr': 'str', 'unsupported': 'str'}
        legal_inputs = _get_legal_inputs(argument_spec, parameters)
        unsupported_parameters = _get_unsupported_parameters(argument_spec, parameters, legal_inputs)
        self.assertEqual(unsupported_parameters, {'unsupported'})

    def test_handle_aliases(self):
        argument_spec = {'func': {'aliases': ['alias1', 'alias2']}}
        parameters = {'func': 'str', 'alias1': 'str', 'alias2': 'str'}
        aliases_results = _handle_aliases(argument_spec, parameters)
        self.assertEqual(aliases_results, {'alias1': 'func', 'alias2': 'func'})

    def test_handle_aliases_deprecation(self):
        argument_spec = {'func': {'aliases': ['alias1', 'alias2'], 'deprecated_aliases': [{'name': 'alias1'}]}}
        parameters = {'func': 'str', 'alias1': 'str', 'alias2': 'str'}
        alias_deprecations = []
        _handle_aliases(argument_spec, parameters, alias_deprecations=alias_deprecations)
        self.assertEqual(alias_deprecations, [{'name': 'alias1'}])

    def test_handle_aliases_warning(self):
        argument_spec = {'func': {'aliases': ['alias1', 'alias2']}}
        parameters = {'func': 'str', 'alias1': 'str', 'alias2': 'str'}
        alias_warnings = []
        _handle_aliases(argument_spec, parameters, alias_warnings=alias_warnings)
        self.assertEqual(alias_warnings, [('func', 'alias1')])

if __name__ == '__main__':
    unittest.main()