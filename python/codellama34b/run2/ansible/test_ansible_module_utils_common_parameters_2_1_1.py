import unittest
from ansible.module_utils.common.parameters import *


class Test_list_deprecations(unittest.TestCase):
    def test_list_deprecations(self):
        argument_spec = {}
        parameters = {}
        prefix = ''
        result = list_deprecations(argument_spec, parameters, prefix)
        self.assertEqual(result, [])

class Test_list_no_log_values(unittest.TestCase):
    def test_list_no_log_values(self):
        argument_spec = {}
        params = {}
        result = list_no_log_values(argument_spec, params)
        self.assertEqual(result, set())

class Test_return_datastructure_name(unittest.TestCase):
    def test_return_datastructure_name(self):
        obj = {}
        result = return_datastructure_name(obj)
        self.assertEqual(result, set())

if __name__ == '__main__':
    unittest.main()