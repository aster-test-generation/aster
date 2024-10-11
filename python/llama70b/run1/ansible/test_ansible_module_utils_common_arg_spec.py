import unittest
from ansible.module_utils.common.arg_spec import (
    ValidationResult,
    ArgumentSpecValidator,
    ModuleArgumentSpecValidator,
    _ADDITIONAL_CHECKS,
    _get_legal_inputs,
    _get_unsupported_parameters,
    _handle_aliases,
    _list_no_log_values,
    _set_defaults,
    _validate_argument_types,
    _validate_argument_values,
    _validate_sub_spec,
    set_fallbacks,
)
from ansible.module_utils.common.arg_spec import (
    ValidationResult,
    ArgumentSpecValidator,
    ModuleArgumentSpecValidator,
    _handle_aliases,
    _get_legal_inputs,
    _get_unsupported_parameters,
    _list_no_log_values,
    _set_defaults,
    _validate_argument_types,
    _validate_argument_values,
    _validate_sub_spec,
    set_fallbacks,
    check_mutually_exclusive,
    check_required_arguments,
)


class TestValidationResult(unittest.TestCase):
    def test_init(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertIsInstance(result, ValidationResult)

    def test_validated_parameters(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertEqual(result.validated_parameters, {'a': 1, 'b': 2})

    def test_unsupported_parameters(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertEqual(result.unsupported_parameters, set())

    def test_error_messages(self):
        result = ValidationResult({'a': 1, 'b': 2})
        self.assertEqual(result.error_messages, [])

class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        self.assertIsInstance(validator, ArgumentSpecValidator)

    def test_validate(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        result = validator.validate({'a': 'hello', 'b': 2})
        self.assertIsInstance(result, ValidationResult)

    def test_mutually_exclusive(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, mutually_exclusive=[['a', 'b']])
        with self.assertRaises(MutuallyExclusiveError):
            validator.validate({'a': 'hello', 'b': 2})

    def test_required_together(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_together=[['a', 'b']])
        with self.assertRaises(RequiredError):
            validator.validate({'a': 'hello'})

    def test_required_one_of(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_one_of=[['a', 'b']])
        with self.assertRaises(RequiredError):
            validator.validate({})

    def test_required_if(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_if=[{'a': 'hello'}])
        with self.assertRaises(RequiredError):
            validator.validate({'a': 'hello'})

    def test_required_by(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_by=[{'a': 'hello'}])
        with self.assertRaises(RequiredError):
            validator.validate({'a': 'hello'})

    def test__handle_aliases(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str', 'aliases': ['alias_a']}})
        aliases = validator._handle_aliases({'a': 'hello', 'alias_a': 'hello'})
        self.assertEqual(aliases, {'a': 'hello', 'alias_a': 'hello'})

    def test__get_legal_inputs(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}})
        legal_inputs = validator._get_legal_inputs({'a': 'hello'})
        self.assertEqual(legal_inputs, {'a': 'hello'})

    def test__get_unsupported_parameters(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}})
        unsupported_parameters = validator._get_unsupported_parameters({'a': 'hello', 'b': 2})
        self.assertEqual(unsupported_parameters, set(['b']))

    def test__list_no_log_values(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str', 'no_log': True}})
        no_log_values = validator._list_no_log_values({'a': 'hello'})
        self.assertEqual(no_log_values, set(['a']))

    def test__set_defaults(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str', 'default': 'hello'}})
        defaults = validator._set_defaults({'a': None})
        self.assertEqual(defaults, {'a': 'hello'})

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ModuleArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        self.assertIsInstance(validator, ModuleArgumentSpecValidator)

class TestArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        self.assertIsInstance(validator, ArgumentSpecValidator)

    def test_validate(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        result = validator.validate({'a': 'hello', 'b': 2})
        self.assertIsInstance(result, ValidationResult)

    def test_mutually_exclusive(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, mutually_exclusive=[['a', 'b']])
        with self.assertRaises(MutuallyExclusiveError):
            validator.validate({'a': 'hello', 'b': 2})

    def test_required_together(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_together=[['a', 'b']])
        with self.assertRaises(RequiredError):
            validator.validate({'a': 'hello'})

    def test_required_one_of(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_one_of=[['a', 'b']])
        with self.assertRaises(RequiredError):
            validator.validate({})

    def test_required_if(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_if={'a': 'hello'})
        with self.assertRaises(RequiredError):
            validator.validate({'a': 'hello'})

    def test_required_by(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}}, required_by={'a': 'hello'})
        with self.assertRaises(RequiredError):
            validator.validate({'a': 'hello'})

    def test_private_methods(self):
        validator = ArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        self.assertEqual(validator._ArgumentSpecValidator__valid_parameter_names, set(['a', 'b']))

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_init(self):
        validator = ModuleArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        self.assertIsInstance(validator, ModuleArgumentSpecValidator)

    def test_validate(self):
        validator = ModuleArgumentSpecValidator({'a': {'type': 'str'}, 'b': {'type': 'int'}})
        result = validator.validate({'a': 'hello', 'b': 2})
        self.assertIsInstance(result, ValidationResult)

    def test_deprecations(self):
        validator = ModuleArgumentSpecValidator({'a': {'type': 'str', 'aliases': ['alias_a']}, 'b': {'type': 'int'}})
        result = validator.validate({'a': 'hello', 'alias_a': 'hello'})
        self.assertEqual(len(result._deprecations), 1)

    def test_warnings(self):
        validator = ModuleArgumentSpecValidator({'a': {'type': 'str', 'aliases': ['alias_a']}, 'b': {'type': 'int'}})
        result = validator.validate({'a': 'hello', 'alias_a': 'hello'})
        self.assertEqual(len(result._warnings), 1)

class TestFunctions(unittest.TestCase):
    def test_handle_aliases(self):
        result = _handle_aliases({'a': {'type': 'str', 'aliases': ['alias_a']}}, {'a': 'hello', 'alias_a': 'hello'})
        self.assertEqual(result, {'a': 'hello'})

if __name__ == '__main__':
    unittest.main()