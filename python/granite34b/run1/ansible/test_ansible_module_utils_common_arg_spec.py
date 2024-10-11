import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator, ModuleArgumentSpecValidator


class TestArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'key1': {'type': 'str'},
            'key2': {'type': 'int'},
            'key3': {'type': 'bool'},
        }
        self.mutually_exclusive = [
            ['key1', 'key2'],
            ['key2', 'key3'],
        ]

    def test_validate(self):
        parameters = {'key1': 'value1', 'key2': 123}
        validator = ArgumentSpecValidator(self.argument_spec, mutually_exclusive=self.mutually_exclusive)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, {'key1': 'value1', 'key2': 123})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_mutually_exclusive(self):
        parameters = {'key1': 'value1', 'key2': 123}
        validator = ArgumentSpecValidator(self.argument_spec, mutually_exclusive=self.mutually_exclusive)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, {'key1': 'value1', 'key2': 123})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_unsupported_parameters(self):
        parameters = {'key1': 'value1', 'key2': 123, 'key4': 'value4'}
        validator = ArgumentSpecValidator(self.argument_spec, mutually_exclusive=self.mutually_exclusive)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, {'key1': 'value1', 'key2': 123, 'key3': None})
        self.assertEqual(result.unsupported_parameters, {'key4'})
        self.assertEqual(result.error_messages, [])

    def test_validate_type_error(self):
        parameters = {'key1': 'value1', 'key2': '123'}
        validator = ArgumentSpecValidator(self.argument_spec, mutually_exclusive=self.mutually_exclusive)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, {'key1': 'value1', 'key2': 123, 'key3': None})
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, ['"key2" must be of type <class \'int\'>'])

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def setUp(self):
        self.argument_spec = {
            'key1': {'type': 'str'},
            'key2': {'type': 'int'},
            'key3': {'type': 'bool'},
        }
        self.mutually_exclusive = [
            ['key1', 'key2'],
            ['key2', 'key3'],
        ]

    def test_validate(self):
        parameters = {'key1': 'value1', 'key2': 123}
        validator = ModuleArgumentSpecValidator(self.argument_spec, mutually_exclusive=self.mutually_exclusive)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_mutually_exclusive(self):
        parameters = {'key1': 'value1', 'key2': 123}
        validator = ModuleArgumentSpecValidator(self.argument_spec, mutually_exclusive=self.mutually_exclusive)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, parameters)
        self.assertEqual(result.unsupported_parameters, set())
        self.assertEqual(result.error_messages, [])

    def test_validate_unsupported_parameters(self):
        parameters = {'key1': 'value1', 'key2': 123, 'key4': 'value4'}
        validator = ModuleArgumentSpecValidator(self.argument_spec, mutually_exclusive=self.mutually_exclusive)
        result = validator.validate(parameters)
        self.assertEqual(result.validated_parameters, {'key1': 'value1', 'key2': 123, 'key3': None})
        self.assertEqual(result.unsupported_parameters, {'key4'})
        self.assertEqual(result.error_messages, [])

if __name__ == '__main__':
    unittest.main()