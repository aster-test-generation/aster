from ansible.module_utils.common.parameters import AnsibleFallbackNotFound
import os
import unittest
from ansible.module_utils.common.parameters import (
    _validate_argument_values,
    _validate_sub_spec,
    env_fallback,
    set_fallbacks
)
from ansible.module_utils.errors import (
    AnsibleValidationErrorMultiple,
    ArgumentValueError,
    ArgumentTypeError,
    SubParameterTypeError,
    AliasError,
    NoLogError,
    MutuallyExclusiveError,
    RequiredError,
    RequiredTogetherError,
    RequiredOneOfError,
    RequiredIfError,
    RequiredByError
)
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common.parameters import (
    _validate_argument_values, _validate_sub_spec, env_fallback, set_fallbacks
)
from ansible.module_utils.errors import (
    AnsibleValidationErrorMultiple, ArgumentValueError, ArgumentTypeError, SubParameterTypeError, AliasError, NoLogError, MutuallyExclusiveError, RequiredError, RequiredTogetherError, RequiredOneOfError, RequiredIfError, RequiredByError
)
from ansible.module_utils.parsing.convert_bool import BOOLEANS_FALSE, BOOLEANS_TRUE
from ansible.module_utils.common.text.formatters import lenient_lowercase
from ansible.module_utils.common._collections_compat import KeysView, Sequence
from ansible.module_utils.six import binary_type, text_type


class TestValidateArgumentValues(unittest.TestCase):
    def test_validate_argument_values_no_choices(self):
        argument_spec = {'param1': {'type': 'str'}}
        parameters = {'param1': 'value1'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_argument_values_invalid_choice(self):
        argument_spec = {'param1': {'choices': ['choice1', 'choice2']}}
        parameters = {'param1': 'invalid_choice'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentValueError)

    def test_validate_argument_values_valid_choice(self):
        argument_spec = {'param1': {'choices': ['choice1', 'choice2']}}
        parameters = {'param1': 'choice1'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

class TestValidateSubSpec(unittest.TestCase):
    def test_validate_sub_spec_no_sub_spec(self):
        argument_spec = {'param1': {'type': 'str'}}
        parameters = {'param1': 'value1'}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_sub_spec_invalid_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'sub_param1': {'type': 'str'}}}}
        parameters = {'param1': 'invalid_value'}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], SubParameterTypeError)

    def test_validate_sub_spec_valid_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'sub_param1': {'type': 'str'}}}}
        parameters = {'param1': {'sub_param1': 'value1'}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

class TestEnvFallback(unittest.TestCase):
    def test_env_fallback_found(self):
        os.environ['TEST_ENV_VAR'] = 'test_value'
        result = env_fallback('TEST_ENV_VAR')
        self.assertEqual(result, 'test_value')
        del os.environ['TEST_ENV_VAR']

    def test_env_fallback_not_found(self):
        with self.assertRaises(AnsibleFallbackNotFound):
            env_fallback('NON_EXISTENT_ENV_VAR')

class TestSetFallbacks(unittest.TestCase):
    def test_set_fallbacks_no_fallback(self):
        argument_spec = {'param1': {'type': 'str'}}
        parameters = {}
        result = set_fallbacks(argument_spec, parameters)
        self.assertEqual(result, set())
        self.assertNotIn('param1', parameters)

    def test_set_fallbacks_with_fallback(self):
        argument_spec = {'param1': {'type': 'str', 'fallback': (lambda: 'fallback_value',)}}
        parameters = {}
        result = set_fallbacks(argument_spec, parameters)
        self.assertEqual(result, set())
        self.assertIn('param1', parameters)
        self.assertEqual(parameters['param1'], 'fallback_value')

    def test_set_fallbacks_no_log(self):
        argument_spec = {'param1': {'type': 'str', 'fallback': (lambda: 'fallback_value',), 'no_log': True}}
        parameters = {}
        result = set_fallbacks(argument_spec, parameters)
        self.assertEqual(result, {'fallback_value'})
        self.assertIn('param1', parameters)
        self.assertEqual(parameters['param1'], 'fallback_value')

class TestValidateArgumentValues(unittest.TestCase):
    def test_validate_argument_values_no_choices(self):
        argument_spec = {'param1': {}}
        parameters = {'param1': 'value1'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_argument_values_with_choices(self):
        argument_spec = {'param1': {'choices': ['value1', 'value2']}}
        parameters = {'param1': 'value3'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentValueError)

    def test_validate_argument_values_with_list_choices(self):
        argument_spec = {'param1': {'choices': ['value1', 'value2']}}
        parameters = {'param1': ['value1', 'value3']}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentValueError)

    def test_validate_argument_values_with_non_iterable_choices(self):
        argument_spec = {'param1': {'choices': 123}}
        parameters = {'param1': 'value1'}
        errors = AnsibleValidationErrorMultiple()
        _validate_argument_values(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentTypeError)

class TestValidateSubSpec(unittest.TestCase):
    def test_validate_sub_spec_no_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict'}}
        parameters = {'param1': None}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 0)

    def test_validate_sub_spec_with_sub_spec(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'subparam1': {'type': 'str'}}}}
        parameters = {'param1': {'subparam1': 123}}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentTypeError)

    def test_validate_sub_spec_with_list_of_dicts(self):
        argument_spec = {'param1': {'type': 'list', 'elements': 'dict', 'options': {'subparam1': {'type': 'str'}}}}
        parameters = {'param1': [{'subparam1': 123}]}
        errors = AnsibleValidationErrorMultiple()
        _validate_sub_spec(argument_spec, parameters, errors=errors)
        self.assertEqual(len(errors), 1)
        self.assertIsInstance(errors[0], ArgumentTypeError)

class TestEnvFallback(unittest.TestCase):
    def test_env_fallback_found(self):
        os.environ['TEST_ENV'] = 'test_value'
        result = env_fallback('TEST_ENV')
        self.assertEqual(result, 'test_value')
        del os.environ['TEST_ENV']

    def test_env_fallback_not_found(self):
        with self.assertRaises(AnsibleFallbackNotFound):
            env_fallback('NON_EXISTENT_ENV')

class TestSetFallbacks(unittest.TestCase):
    def test_set_fallbacks_no_fallback(self):
        argument_spec = {'param1': {}}
        parameters = {}
        result = set_fallbacks(argument_spec, parameters)
        self.assertEqual(result, set())
        self.assertEqual(parameters, {})

    def test_set_fallbacks_with_fallback(self):
        argument_spec = {'param1': {'fallback': (env_fallback, 'TEST_ENV')}}
        parameters = {}
        os.environ['TEST_ENV'] = 'test_value'
        result = set_fallbacks(argument_spec, parameters)
        self.assertEqual(result, set())
        self.assertEqual(parameters, {'param1': 'test_value'})
        del os.environ['TEST_ENV']

    def test_set_fallbacks_with_no_log(self):
        argument_spec = {'param1': {'fallback': (env_fallback, 'TEST_ENV'), 'no_log': True}}
        parameters = {}
        os.environ['TEST_ENV'] = 'test_value'
        result = set_fallbacks(argument_spec, parameters)
        self.assertEqual(result, {'test_value'})
        self.assertEqual(parameters, {'param1': 'test_value'})
        del os.environ['TEST_ENV']

if __name__ == '__main__':
    unittest.main()