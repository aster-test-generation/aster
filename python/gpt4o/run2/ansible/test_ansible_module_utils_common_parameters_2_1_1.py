import unittest
from ansible.module_utils.common.parameters import _list_deprecations, _list_no_log_values, _return_datastructure_name
from ansible.module_utils.common.text.converters import to_native
from ansible.module_utils.common.collections import is_iterable
from ansible.module_utils.common._collections_compat import Mapping
from ansible.module_utils.six import string_types, text_type, binary_type, integer_types


class TestListDeprecations(unittest.TestCase):
    def test_list_deprecations_no_deprecations(self):
        argument_spec = {'param1': {'type': 'str'}}
        parameters = {'param1': 'value1'}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [])

    def test_list_deprecations_with_removed_at_date(self):
        argument_spec = {'param1': {'type': 'str', 'removed_at_date': '2023-01-01'}}
        parameters = {'param1': 'value1'}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'param1' is deprecated. See the module docs for more information", 'date': '2023-01-01', 'collection_name': None}])

    def test_list_deprecations_with_removed_in_version(self):
        argument_spec = {'param1': {'type': 'str', 'removed_in_version': '2.0'}}
        parameters = {'param1': 'value1'}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'param1' is deprecated. See the module docs for more information", 'version': '2.0', 'collection_name': None}])

    def test_list_deprecations_with_sub_parameters(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'subparam1': {'type': 'str', 'removed_in_version': '2.0'}}}}
        parameters = {'param1': {'subparam1': 'value1'}}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'param1[\"subparam1\"]' is deprecated. See the module docs for more information", 'version': '2.0', 'collection_name': None}])

class TestListNoLogValues(unittest.TestCase):
    def test_list_no_log_values_no_no_log(self):
        argument_spec = {'param1': {'type': 'str'}}
        params = {'param1': 'value1'}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, set())

    def test_list_no_log_values_with_no_log(self):
        argument_spec = {'param1': {'type': 'str', 'no_log': True}}
        params = {'param1': 'value1'}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'value1'})

    def test_list_no_log_values_with_sub_parameters(self):
        argument_spec = {'param1': {'type': 'dict', 'options': {'subparam1': {'type': 'str', 'no_log': True}}}}
        params = {'param1': {'subparam1': 'value1'}}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'value1'})

class TestReturnDatastructureName(unittest.TestCase):
    def test_return_datastructure_name_string(self):
        result = list(_return_datastructure_name('test'))
        self.assertEqual(result, ['test'])

    def test_return_datastructure_name_mapping(self):
        result = list(_return_datastructure_name({'key': 'value'}))
        self.assertEqual(result, ['value'])

    def test_return_datastructure_name_iterable(self):
        result = list(_return_datastructure_name(['value1', 'value2']))
        self.assertEqual(result, ['value1', 'value2'])

    def test_return_datastructure_name_integer(self):
        result = list(_return_datastructure_name(123))
        self.assertEqual(result, ['123'])

    def test_return_datastructure_name_unknown_type(self):
        with self.assertRaises(TypeError):
            list(_return_datastructure_name(object()))

if __name__ == '__main__':
    unittest.main()