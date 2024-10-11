import unittest
from ansible.module_utils.common.parameters import *



class Test_get_type_validator(unittest.TestCase):
    def test_get_type_validator(self):
        wanted = None
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'str'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'list'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'dict'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'bool'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'int'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'float'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'path'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'raw'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'jsonarg'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'json'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'bytes'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

    def test_get_type_validator(self):
        wanted = 'bits'
        result = _get_type_validator(wanted)
        self.assertEqual(result, None)

class Test_get_legal_inputs(unittest.TestCase):
    def test_get_legal_inputs(self):
        argument_spec = None
        parameters = None
        aliases = None
        result = _get_legal_inputs(argument_spec, parameters, aliases)
        self.assertEqual(result, None)

    def test_get_legal_inputs(self):
        argument_spec = None
        parameters = None
        aliases = None
        result = _get_legal_inputs(argument_spec, parameters, aliases)
        self.assertEqual(result, None)

    def test_get_legal_inputs(self):
        argument_spec = None
        parameters = None
        aliases = None
        result = _get_legal_inputs(argument_spec, parameters, aliases)
        self.assertEqual(result, None)

    def test_get_legal_inputs(self):
        argument_spec = None
        parameters = None
        aliases = None
        result = _get_legal_inputs(argument_spec, parameters, aliases)
        self.assertEqual(result, None)

    def test_get_legal_inputs(self):
        argument_spec = None
        parameters = None
        aliases = None
        result = get_legal_inputs(argument_spec, parameters, aliases)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()