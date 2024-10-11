import unittest
from ansible.module_utils.common.arg_spec import ArgumentSpecValidator, ModuleArgumentSpecValidator

class TestArgumentSpecValidator(unittest.TestCase):
    def test_validate_argument_types(self):
        argument_spec = {
            'foo': {'type': 'str'},
            'bar': {'type': 'int'},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {'foo': 'hello', 'bar': '42'}
        result = validator.validate(parameters)
        self.assertEqual(len(result.errors.messages), 1)
        self.assertEqual(result.errors.messages[0], "parameter bar must be of type 'int', got 'str'")

    def test_validate_argument_values(self):
        argument_spec = {
            'foo': {'choices': ['a', 'b', 'c']},
            'bar': {'choices': [1, 2, 3]},
        }
        validator = ArgumentSpecValidator(argument_spec)
        parameters = {'foo': 'd', 'bar': 4}
        result = validator.validate(parameters)
        self.assertEqual(len(result.errors.messages), 2)
        self.assertEqual(result.errors.messages[0], "value of foo must be one of: a, b, c, got: d")
        self.assertEqual(result.errors.messages[1], "value of bar must be one of: 1, 2, 3, got: 4")

class TestModuleArgumentSpecValidator(unittest.TestCase):
    def test_validate_sub_spec(self):
        argument_spec = {
            'foo': {'type': 'dict', 'options': {'a': {'type': 'str'}}},
            'bar': {'type': 'dict', 'options': {'b': {'type': 'int'}}},
        }
        validator = ModuleArgumentSpecValidator(argument_spec)
        parameters = {'foo': {'a': 'hello'}, 'bar': {'b': '42'}}
        result = validator.validate(parameters)
        self.assertEqual(len(result.errors.messages), 0)

if __name__ == '__main__':
    unittest.main()