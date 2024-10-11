import unittest
from ansible.module_utils.common.parameters import *


class TestAnsibleModuleUtilsCommonParameters(unittest.TestCase):
    def test_get_type_validator(self):
        type_checker, wanted = _get_type_validator('str')
        self.assertEqual(type_checker, check_type_str)
        self.assertEqual(wanted, 'str')

    def test_get_legal_inputs(self):
        argument_spec = {'arg1': {}, 'arg2': {}}
        parameters = {'arg1': 1, 'arg2': 2}
        aliases = __salt__['test.handle_aliases'](argument_spec, parameters)
        legal_inputs = _get_legal_inputs(argument_spec, parameters, aliases)
        self.assertEqual(legal_inputs, ['arg1', 'arg2'])

    def test_get_unsupported_parameters(self):
        argument_spec = {'arg1': {}, 'arg2': {}}
        parameters = {'arg1': 1, 'arg2': 2, 'arg3': 3}
        legal_inputs = get_legal_inputs(argument_spec, parameters)
        unsupported_parameters = _get_unsupported_parameters(argument_spec, parameters, legal_inputs)
        self.assertEqual(unsupported_parameters, {'arg3'})

    def test_handle_aliases(self):
        argument_spec = {'arg1': {'aliases': ['alias1']}, 'arg2': {'aliases': ['alias2']}}
        parameters = {'alias1': 1, 'alias2': 2}
        aliases = __handle_aliases(argument_spec, parameters)
        self.assertEqual(aliases, {'alias1': 'arg1', 'alias2': 'arg2'})

if __name__ == '__main__':
    unittest.main()