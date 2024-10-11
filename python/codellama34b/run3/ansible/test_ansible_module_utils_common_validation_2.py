import unittest
from ansible.module_utils.common.validation import *



class TestCheckRequiredArguments(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = {}
        parameters = {}
        options_context = None
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_arguments_2(self):
        argument_spec = {'key': {'required': True}}
        parameters = {'key': 'value'}
        options_context = None
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_arguments_3(self):
        argument_spec = {'key': {'required': True}}
        parameters = {}
        options_context = None
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, ['key'])

    def test_check_required_arguments_4(self):
        argument_spec = {'key': {'required': True}}
        parameters = {}
        options_context = ['option1', 'option2']
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, ['key'])

class TestCheckRequiredIf(unittest.TestCase):
    def test_check_required_if(self):
        requirements = None
        parameters = {}
        options_context = None
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_2(self):
        requirements = [('key', 'value', ['key1', 'key2'])]
        parameters = {'key': 'value'}
        options_context = None
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_3(self):
        requirements = [('key', 'value', ['key1', 'key2'])]
        parameters = {'key': 'value', 'key1': 'value1'}
        options_context = None
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_4(self):
        requirements = [('key', 'value', ['key1', 'key2'])]
        parameters = {'key': 'value', 'key1': 'value1'}
        options_context = ['option1', 'option2']
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

class TestCheckMissingParameters(unittest.TestCase):
    def test_check_missing_parameters(self):
        parameters = {}
        required_parameters = None
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, [])

    def test_check_missing_parameters_2(self):
        parameters = {'key': 'value'}
        required_parameters = ['key']
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, [])

    def test_check_missing_parameters_3(self):
        parameters = {'key': 'value'}
        required_parameters = ['key', 'key1']
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, ['key1'])

    def test_check_missing_parameters_4(self):
        parameters = {'key': 'value'}
        required_parameters = ['key', 'key1']
        result = check_missing_parameters(parameters, required_parameters)
        self.assertEqual(result, ['key1'])


class TestCheckRequiredArguments(unittest.TestCase):
    def test_check_required_arguments(self):
        argument_spec = None
        parameters = None
        options_context = None
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_arguments_1(self):
        argument_spec = {'a': {'required': True}}
        parameters = {'a': 1}
        options_context = None
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_arguments_2(self):
        argument_spec = {'a': {'required': True}}
        parameters = {'b': 1}
        options_context = None
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, ['a'])

    def test_check_required_arguments_3(self):
        argument_spec = {'a': {'required': True}}
        parameters = {'a': 1}
        options_context = ['a']
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_arguments_4(self):
        argument_spec = {'a': {'required': True}}
        parameters = {'b': 1}
        options_context = ['a']
        result = check_required_arguments(argument_spec, parameters, options_context)
        self.assertEqual(result, ['a'])

class TestCheckRequiredIf(unittest.TestCase):
    def test_check_required_if(self):
        requirements = None
        parameters = None
        options_context = None
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_1(self):
        requirements = [('a', 1, ['b'])]
        parameters = {'a': 1}
        options_context = None
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_2(self):
        requirements = [('a', 1, ['b'])]
        parameters = {'a': 1, 'b': 1}
        options_context = None
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_3(self):
        requirements = [('a', 1, ['b'])]
        parameters = {'a': 1}
        options_context = ['a']
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_4(self):
        requirements = [('a', 1, ['b'])]
        parameters = {'a': 1, 'b': 1}
        options_context = ['a']
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_5(self):
        requirements = [('a', 1, ['b'])]
        parameters = {'a': 1}
        options_context = ['a']
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

    def test_check_required_if_6(self):
        requirements = [('a', 1, ['b'])]
        parameters = {'a': 1, 'b': 1}
        options_context = ['a']
        result = check_required_if(requirements, parameters, options_context)
        self.assertEqual(result, [])

if __name__ == '__main__':
    unittest.main()