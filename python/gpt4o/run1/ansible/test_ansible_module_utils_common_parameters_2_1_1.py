import unittest
from ansible.module_utils.common.parameters import _list_deprecations, _list_no_log_values, _return_datastructure_name
from ansible.module_utils.common._collections_compat import Mapping
from ansible.module_utils.six import string_types


class TestListDeprecations(unittest.TestCase):
    def test_list_deprecations_no_deprecations(self):
        argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int'}
        }
        parameters = {
            'param1': 'value1',
            'param2': 2
        }
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [])

    def test_list_deprecations_with_removed_at_date(self):
        argument_spec = {
            'param1': {'type': 'str', 'removed_at_date': '2023-01-01'}
        }
        parameters = {
            'param1': 'value1'
        }
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'param1' is deprecated. See the module docs for more information", 'date': '2023-01-01', 'collection_name': None}])

    def test_list_deprecations_with_removed_in_version(self):
        argument_spec = {
            'param1': {'type': 'str', 'removed_in_version': '2.0'}
        }
        parameters = {
            'param1': 'value1'
        }
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'param1' is deprecated. See the module docs for more information", 'version': '2.0', 'collection_name': None}])

    def test_list_deprecations_with_sub_parameters(self):
        argument_spec = {
            'param1': {
                'type': 'dict',
                'options': {
                    'subparam1': {'type': 'str', 'removed_in_version': '2.0'}
                }
            }
        }
        parameters = {
            'param1': {'subparam1': 'value1'}
        }
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'param1[\"subparam1\"]' is deprecated. See the module docs for more information", 'version': '2.0', 'collection_name': None}])

class TestListNoLogValues(unittest.TestCase):
    def test_list_no_log_values_no_no_log(self):
        argument_spec = {
            'param1': {'type': 'str'},
            'param2': {'type': 'int'}
        }
        params = {
            'param1': 'value1',
            'param2': 2
        }
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, set())

    def test_list_no_log_values_with_no_log(self):
        argument_spec = {
            'param1': {'type': 'str', 'no_log': True}
        }
        params = {
            'param1': 'value1'
        }
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'value1'})

    def test_list_no_log_values_with_sub_parameters(self):
        argument_spec = {
            'param1': {
                'type': 'dict',
                'options': {
                    'subparam1': {'type': 'str', 'no_log': True}
                }
            }
        }
        params = {
            'param1': {'subparam1': 'value1'}
        }
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'value1'})

class TestReturnDatastructureName(unittest.TestCase):
    def test_return_datastructure_name_string(self):
        obj = 'test'
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['test'])

    def test_return_datastructure_name_mapping(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['value1', 'value2'])

    def test_return_datastructure_name_iterable(self):
        obj = ['value1', 'value2']
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['value1', 'value2'])

    def test_return_datastructure_name_bool(self):
        obj = True
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, [])

    def test_return_datastructure_name_number(self):
        obj = 123
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['123'])

    def test_return_datastructure_name_unknown_type(self):
        obj = object()
        with self.assertRaises(TypeError):
            list(_return_datastructure_name(obj))

if __name__ == '__main__':
    unittest.main()