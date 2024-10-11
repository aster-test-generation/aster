import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator, ModuleArgumentSpecValidator


class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate_legal_inputs(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec)
        result = validator.validate({'option_one': 'value', 'option_two': 123})
        self.assertEqual(result.validated_parameters, {'option_one': 'value', 'option_two': 123})

    def test_validate_unsupported_parameters(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec)
        result = validator.validate({'option_one': 'value', 'option_two': 123, 'unsupported_option': 'value'})
        self.assertEqual(result.unsupported_parameters, {'unsupported_option'})

    def test_validate_mutually_exclusive(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec, mutually_exclusive=[('option_one', 'option_two')])
        result = validator.validate({'option_one': 'value', 'option_two': 123})
        self.assertEqual(result.errors.messages, ['parameters are mutually exclusive: option_one|option_two'])

    def test_validate_required_together(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec, required_together=[('option_one', 'option_two')])
        result = validator.validate({'option_one': 'value'})
        self.assertEqual(result.errors.messages, ['parameters are required together: option_one, option_two'])

    def test_validate_required_one_of(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec, required_one_of=[('option_one', 'option_two')])
        result = validator.validate({'option_one': 'value'})
        self.assertEqual(result.validated_parameters, {'option_one': 'value', 'option_two': None})

    def test_validate_required_if(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec, required_if=[('option_one', 'value', ['option_two'])])
        result = validator.validate({'option_one': 'value'})
        self.assertEqual(result.errors.messages, ['option_one is value but all of the following are missing: option_two'])

    def test_validate_required_by(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec, required_by=[('option_one', True, ['option_two'])])
        result = validator.validate({'option_one': 'value'})
        self.assertEqual(result.validated_parameters, {'option_one': 'value'})

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_validate_legal_inputs(self):
        argument_spec = {
            'option_one': {'type': 'str'},
            'option_two': {'type': 'int'},
        }
        validator = ModuleArgumentSpecValidator(argument_spec)
        result = validator.validate({'option_one': 'value', 'option_two': 123})
        self.assertEqual(result.validated_parameters, {'option_one': 'value', 'option_two': 123})

if __name__ == '__main__':
    unittest.main()