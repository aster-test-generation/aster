import unittest
from ansible.module_utils.common.parameters import *


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_get_type_validator(self):
        type_checker, wanted = _get_type_validator('str')
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

    def test_get_legal_inputs(self):
        argument_spec = {'name': {'aliases': ['name1', 'name2']}, 'age': {'default': 30}}
        parameters = {'name1': 'John', 'age': 25}
        aliases = self._handle_aliases(argument_spec, parameters)
        legal_inputs = _get_legal_inputs(argument_spec, parameters, aliases)
        self.assertEqual(legal_inputs, ['name', 'name1', 'name2', 'age'])

    def test_get_unsupported_parameters(self):
        argument_spec = {'name': {}, 'age': {}}
        parameters = {'name': 'John', 'age': 25, 'city': 'New York'}
        legal_inputs = get_legal_inputs(argument_spec, parameters)
        unsupported_parameters = _get_unsupported_parameters(argument_spec, parameters, legal_inputs)
        self.assertEqual(unsupported_parameters, {'city'})

    def test_handle_aliases(self):
        argument_spec = {'name': {'aliases': ['name1', 'name2']}, 'age': {'default': 30}}
        parameters = {'name1': 'John', 'age': 25}
        aliases = __salt__['test.handle_aliases'](argument_spec, parameters)
        self.assertEqual(aliases, {'name1': 'name', 'name2': 'name'})

if __name__ == '__main__':
    unittest.main()