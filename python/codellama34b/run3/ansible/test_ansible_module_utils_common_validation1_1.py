
import unittest
from ansible.module_utils.common.validation import *

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