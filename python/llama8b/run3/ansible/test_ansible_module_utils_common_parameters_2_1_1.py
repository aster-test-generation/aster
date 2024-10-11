import unittest
from ansible.module_utils.common.parameters import *
from ansible.module_utils.common.parameters import _list_deprecations, _list_no_log_values, _return_datastructure_name


class TestParameters(unittest.TestCase):
    def test_list_deprecations(self):
        argument_spec = {'arg1': {'removed_at_date': '2022-01-01'}}
        parameters = {'arg1': {'value': 'value1'}}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0]['msg'], "Param 'arg1' is deprecated. See the module docs for more information")

    def test_list_no_log_values(self):
        argument_spec = {'arg1': {'no_log': True}}
        params = {'arg1': 'value1'}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'value1'})

    def test_return_datastructure_name(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['value1', 'value2'])

    def test_return_datastructure_name_iterable(self):
        obj = ['value1', 'value2']
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['value1', 'value2'])

    def test_return_datastructure_name_mapping(self):
        obj = {'key1': {'subkey1': 'subvalue1'}}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['subvalue1'])

    def test_return_datastructure_name_tuple(self):
        obj = (1, 2, 3)
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['1', '2', '3'])

    def test_return_datastructure_name_bool(self):
        obj = True
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, [])

    def test_return_datastructure_name_none(self):
        obj = None
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, [])

class TestParameters(unittest.TestCase):
    def test_list_deprecations(self):
        argument_spec = {'arg1': {'removed_at_date': '2022-01-01'}, 'arg2': {'removed_in_version': '2.0'}}
        parameters = {'arg1': 'value1', 'arg2': 'value2'}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0]['msg'], "Param 'arg1' is deprecated. See the module docs for more information")
        self.assertEqual(result[1]['msg'], "Param 'arg2' is deprecated. See the module docs for more information")

    def test_list_no_log_values(self):
        argument_spec = {'arg1': {'no_log': True}, 'arg2': {'options': {'type': 'dict'}, 'no_log': True}}
        params = {'arg1': 'value1', 'arg2': {'key1': 'value1', 'key2': 'value2'}}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(len(result), 2)
        self.assertEqual(result, {'value1', 'key1', 'key2'})

    def test_return_datastructure_name(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(len(result), 4)
        self.assertEqual(result[0], 'value1')
        self.assertEqual(result[1], 'value2')

class TestParameters(unittest.TestCase):
    def test_list_deprecations(self):
        argument_spec = {'arg1': {'removed_at_date': '2022-01-01'}, 'arg2': {'removed_in_version': '2.0'}}
        parameters = {'arg1': 'value1', 'arg2': 'value2'}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0]['msg'], "Param 'arg1' is deprecated. See the module docs for more information")
        self.assertEqual(result[1]['msg'], "Param 'arg2' is deprecated. See the module docs for more information")

    def test_list_no_log_values(self):
        argument_spec = {'arg1': {'no_log': True}, 'arg2': {'options': {'type': 'dict'}, 'no_log': True}}
        parameters = {'arg1': 'value1', 'arg2': {'key1': 'value1', 'key2': 'value2'}}
        result = _list_no_log_values(argument_spec, parameters)
        self.assertEqual(len(result), 2)
        self.assertEqual(result, {'arg1', 'arg2'})

    def test_return_datastructure_name(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0], 'value1')
        self.assertEqual(result[1], 'value2')

        obj = ['value1', 'value2']
        result = list(_return_datastructure_name(obj))
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0], 'value1')
        self.assertEqual(result[1], 'value2')

        obj = {'key1': 'value1', 'key2': 'value2', 'key3': {'subkey1': 'subvalue1', 'subkey2': 'subvalue2'}}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(len(result), 4)
        self.assertEqual(result[0], 'value1')
        self.assertEqual(result[1], 'value2')
        self.assertEqual(result[2], 'subvalue1')
        self.assertEqual(result[3], 'subvalue2')

if __name__ == '__main__':
    unittest.main()