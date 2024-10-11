import unittest
from ansible.module_utils.common.parameters import *
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common.text.formatters import lenient_lowercase
from ansible.module_utils.common._collections_compat import KeysView, Set, Sequence, Mapping, MutableMapping, MutableSet, MutableSequence
from ansible.module_utils.six import binary_type, integer_types, string_types, text_type, PY2, PY3
from ansible.module_utils.common.validation import check_mutually_exclusive, check_required_arguments, check_required_together, check_required_one_of, check_required_if, check_required_by, check_type_bits, check_type_bool, check_type_bytes, check_type_dict, check_type_float, check_type_int, check_type_jsonarg, check_type_list, check_type_path, check_type_raw, check_type_str
from ansible.module_utils.common.parameters import _sanitize_keys_conditions, _validate_elements, _validate_argument_types


class TestParameters(unittest.TestCase):
    def test_sanitize_keys_conditions(self):
        value = 'test'
        no_log_strings = ['test']
        ignore_keys = ['test']
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, value)

    def test_validate_elements(self):
        wanted_type = 'str'
        parameter = 'test'
        values = ['test']
        options_context = ['test']
        errors = AnsibleValidationErrorMultiple()
        result = _validate_elements(wanted_type, parameter, values, options_context, errors)
        self.assertEqual(result, ['test'])

    def test_validate_argument_types(self):
        argument_spec = {'test': {'type': 'str'}}
        parameters = {'test': 'test'}
        prefix = 'test'
        options_context = ['test']
        errors = AnsibleValidationErrorMultiple()
        result = _validate_argument_types(argument_spec, parameters, prefix, options_context, errors)
        self.assertEqual(result, {'test': 'test'})

    def test_get_type_validator(self):
        wanted_type = 'str'
        result = _get_type_validator(wanted_type)
        self.assertEqual(result, (check_type_str, 'str'))

    def test_check_mutually_exclusive(self):
        mutually_exclusive = ['test1', 'test2']
        result = check_mutually_exclusive(mutually_exclusive, ['test1', 'test2'])
        self.assertTrue(result)

    def test_check_required_arguments(self):
        required_arguments = ['test1', 'test2']
        result = check_required_arguments(required_arguments, ['test1', 'test2'])
        self.assertTrue(result)

    def test_check_required_together(self):
        required_together = ['test1', 'test2']
        result = check_required_together(required_together, ['test1', 'test2'])
        self.assertTrue(result)

    def test_check_required_one_of(self):
        required_one_of = ['test1', 'test2']
        result = check_required_one_of(required_one_of, ['test1', 'test2'])
        self.assertTrue(result)

    def test_check_required_if(self):
        required_if = ['test1', 'test2']
        result = check_required_if(required_if, ['test1', 'test2'])
        self.assertTrue(result)

    def test_check_required_by(self):
        required_by = ['test1', 'test2']
        result = check_required_by(required_by, ['test1', 'test2'])
        self.assertTrue(result)

    def test_check_type_bits(self):
        value = 1
        result = check_type_bits(value)
        self.assertTrue(result)

    def test_check_type_bool(self):
        value = True
        result = check_type_bool(value)
        self.assertTrue(result)

    def test_check_type_bytes(self):
        value = b'test'
        result = check_type_bytes(value)
        self.assertTrue(result)

    def test_check_type_dict(self):
        value = {'test': 'test'}
        result = check_type_dict(value)
        self.assertTrue(result)

    def test_check_type_float(self):
        value = 1.0
        result = check_type_float(value)
        self.assertTrue(result)

    def test_check_type_int(self):
        value = 1
        result = check_type_int(value)
        self.assertTrue(result)

    def test_check_type_jsonarg(self):
        value = 'test'
        result = check_type_jsonarg(value)
        self.assertTrue(result)

    def test_check_type_list(self):
        value = ['test']
        result = check_type_list(value)
        self.assertTrue(result)

    def test_check_type_path(self):
        value = '/test'
        result = check_type_path(value)
        self.assertTrue(result)

class TestParameters(unittest.TestCase):
    def test_sanitize_keys_conditions(self):
        value = 'test'
        no_log_strings = ['test']
        ignore_keys = ['test']
        deferred_removals = []
        result = _sanitize_keys_conditions(value, no_log_strings, ignore_keys, deferred_removals)
        self.assertEqual(result, value)

    def test_validate_elements(self):
        wanted_type = 'str'
        parameter = 'test'
        values = ['test', 'test2']
        options_context = ['test']
        errors = AnsibleValidationErrorMultiple()
        result = _validate_elements(wanted_type, parameter, values, options_context, errors)
        self.assertEqual(result, ['test', 'test2'])

    def test_validate_argument_types(self):
        argument_spec = {'param': {'type': 'str'}}
        parameters = {'param': 'test'}
        prefix = ''
        options_context = ['test']
        errors = AnsibleValidationErrorMultiple()
        result = _validate_argument_types(argument_spec, parameters, prefix, options_context, errors)
        self.assertEqual(result, {'param': 'test'})

    def test_validate_argument_types_with_elements(self):
        argument_spec = {'param': {'type': 'list', 'elements': 'str'}}
        parameters = {'param': ['test', 'test2']}
        prefix = ''
        options_context = ['test']
        errors = AnsibleValidationErrorMultiple()
        result = _validate_argument_types(argument_spec, parameters, prefix, options_context, errors)
        self.assertEqual(result, {'param': ['test', 'test2']})

if __name__ == '__main__':
    unittest.main()