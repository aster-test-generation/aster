import unittest
from ansible.module_utils.common.parameters import *
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common.text.formatters import lenient_lowercase
from ansible.module_utils.common.warnings import warn
from ansible.module_utils.errors import AliasError, AnsibleFallbackNotFound, AnsibleValidationErrorMultiple, ArgumentTypeError, ArgumentValueError, ElementError, MutuallyExclusiveError, NoLogError, RequiredByError, RequiredError, RequiredIfError, RequiredOneOfError, RequiredTogetherError, SubParameterTypeError
from ansible.module_utils.parsing.convert_bool import BOOLEANS_FALSE, BOOLEANS_TRUE
from ansible.module_utils.common._collections_compat import KeysView, Set, Sequence, Mapping, MutableMapping, MutableSet, MutableSequence
from ansible.module_utils.six import binary_type, integer_types, string_types, text_type, PY2, PY3
from ansible.module_utils.common.validation import check_mutually_exclusive, check_required_arguments, check_required_together, check_required_one_of, check_required_if, check_required_by, check_type_bits, check_type_bool, check_type_bytes, check_type_dict, check_type_float, check_type_int, check_type_jsonarg, check_type_list, check_type_path, check_type_raw, check_type_str


class TestParameters(unittest.TestCase):
    def test_sanitize_keys(self):
        obj = {'a': 1, 'b': 2, 'c': 3}
        no_log_strings = ['a', 'c']
        result = sanitize_keys(obj, no_log_strings)
        self.assertEqual(result, {'b': 2})

    def test_remove_values(self):
        value = {'a': 1, 'b': 2, 'c': 3}
        no_log_strings = ['a', 'c']
        result = remove_values(value, no_log_strings)
        self.assertEqual(result, {'b': 2})

    def test_check_mutually_exclusive(self):
        result = check_mutually_exclusive({'a': 1, 'b': 2}, {'c': 3, 'd': 4})
        self.assertEqual(result, None)

    def test_check_required_arguments(self):
        result = check_required_arguments({'a': 1}, ['a', 'b'])
        self.assertEqual(result, None)

    def test_check_required_together(self):
        result = check_required_together({'a': 1, 'b': 2}, ['a', 'b'])
        self.assertEqual(result, None)

    def test_check_required_one_of(self):
        result = check_required_one_of({'a': 1, 'b': 2}, ['a', 'b'])
        self.assertEqual(result, None)

    def test_check_required_if(self):
        result = check_required_if({'a': 1}, 'a', ['b', 'c'])
        self.assertEqual(result, None)

    def test_check_required_by(self):
        result = check_required_by({'a': 1}, 'a', ['b', 'c'])
        self.assertEqual(result, None)

    def test_check_type_bits(self):
        result = check_type_bits(1, 2)
        self.assertEqual(result, None)

    def test_check_type_bool(self):
        result = check_type_bool(True)
        self.assertEqual(result, None)

    def test_check_type_bytes(self):
        result = check_type_bytes(b'hello')
        self.assertEqual(result, None)

    def test_check_type_dict(self):
        result = check_type_dict({'a': 1})
        self.assertEqual(result, None)

    def test_check_type_float(self):
        result = check_type_float(1.0)
        self.assertEqual(result, None)

    def test_check_type_int(self):
        result = check_type_int(1)
        self.assertEqual(result, None)

    def test_check_type_jsonarg(self):
        result = check_type_jsonarg({'a': 1})
        self.assertEqual(result, None)

    def test_check_type_list(self):
        result = check_type_list([1, 2, 3])
        self.assertEqual(result, None)

    def test_check_type_path(self):
        result = check_type_path('/path/to/file')
        self.assertEqual(result, None)

    def test_check_type_raw(self):
        result = check_type_raw('hello')
        self.assertEqual(result, None)

    def test_check_type_str(self):
        result = check_type_str('hello')
        self.assertEqual(result, None)

    def test_lenient_lowercase(self):
        result = lenient_lowercase('Hello World')
        self.assertEqual(result, 'hello world')

    def test_to_native(self):
        result = to_native('hello')
        self.assertEqual(result, 'hello')

if __name__ == '__main__':
    unittest.main()