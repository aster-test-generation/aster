from ansible.module_utils.common.parameters import _set_defaults

import unittest
from ansible.module_utils.common.parameters import *

class Test_set_defaults(unittest.TestCase):
    def test_set_defaults(self):
        argument_spec = {}
        parameters = {}
        set_default = True
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_1(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {}
        set_default = True
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_2(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = True
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_3(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = False
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_4(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = True
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_5(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = False
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_6(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = True
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_7(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = False
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_8(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = True
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_9(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = False
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

    def test_set_defaults_10(self):
        argument_spec = {'param': {'default': 'default_value'}}
        parameters = {'param': 'value'}
        set_default = True
        result = _set_defaults(argument_spec, parameters, set_default)
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()