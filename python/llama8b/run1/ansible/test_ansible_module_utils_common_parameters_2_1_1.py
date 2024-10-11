import unittest
from ansible.module_utils.common.parameters import _list_deprecations, _list_no_log_values, _return_datastructure_name


class TestParameters(unittest.TestCase):
    def test_list_deprecations(self):
        argument_spec = {'a': {'removed_at_date': '2022-01-01'}, 'b': {'removed_in_version': '2.0'}}
        parameters = {'a': {'c': {'removed_at_date': '2023-01-01'}}, 'b': {'d': {'removed_in_version': '3.0'}}}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(len(result), 2)
        self.assertEqual(result[0]['msg'], "Param 'a' is deprecated. See the module docs for more information")
        self.assertEqual(result[0]['date'], '2022-01-01')
        self.assertEqual(result[1]['msg'], "Param 'b' is deprecated. See the module docs for more information")
        self.assertEqual(result[1]['version'], '2.0')

    def test_list_no_log_values(self):
        argument_spec = {'a': {'no_log': True}, 'b': {'options': {'c': {'no_log': True}}}}
        params = {'a': 'hello', 'b': {'c': 'world'}}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'hello', 'world'})

    def test_return_datastructure_name(self):
        obj = {'a': 'hello', 'b': {'c': 'world'}}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['hello', 'world'])

    def test_return_datastructure_name_iterable(self):
        obj = ['hello', {'b': 'world'}]
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['hello', 'world'])

    def test_return_datastructure_name_mapping(self):
        obj = {'a': 'hello', 'b': {'c': 'world'}}
        result = list(_return_datastructure_name(obj))
        self.assertEqual(result, ['hello', 'world'])

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

if __name__ == '__main__':
    unittest.main()