import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator

class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate_argument_types(self):
        argument_spec = {
            'foo': {'type': 'str'},
            'bar': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {'foo': 'hello', 'bar': 123}
        result = validator.validate(parameters)
        self.assertEqual(result.errors.messages, [])

    def test_validate_argument_values(self):
        argument_spec = {
            'foo': {'type': 'str', 'choices': ['hello', 'world']},
            'bar': {'type': 'int', 'min': 0, 'max': 100},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {'foo': 'hello', 'bar': 50}
        result = validator.validate(parameters)
        self.assertEqual(result.errors.messages, [])

    def test_validate_sub_spec(self):
        argument_spec = {
            'foo': {'type': 'dict', 'required': True, 'options': {'bar': {'type': 'str'}}},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {'foo': {'bar': 'hello'}}
        result = validator.validate(parameters)
        self.assertEqual(result.errors.messages, [])

    def test_validate_sub_spec_with_invalid_key(self):
        argument_spec = {
            'foo': {'type': 'dict', 'required': True, 'options': {'bar': {'type': 'str'}}},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {'foo': {'baz': 'hello'}}
        result = validator.validate(parameters)
        self.assertEqual(result.errors.messages, ['foo.baz. Supported parameters include: foo.'])

if __name__ == '__main__':
    unittest.main()