import unittest
from ansible.module_utils.common.parameters import _list_deprecations, _list_no_log_values

class TestParameters(unittest.TestCase):
    def test__list_deprecations(self):
        argument_spec = {'a': {'removed_at_date': '2021-01-01', 'removed_from_collection': 'ansible.builtin'}, 'b': {'removed_in_version': '2.10', 'removed_from_collection': 'ansible.builtin'}}
        parameters = {'a': 1, 'b': 2}
        result = _list_deprecations(argument_spec, parameters)
        self.assertEqual(result, [{'msg': "Param 'a' is deprecated. See the module docs for more information", 'date': '2021-01-01', 'collection_name': 'ansible.builtin'}, {'msg': "Param 'b' is deprecated. See the module docs for more information", 'version': '2.10', 'collection_name': 'ansible.builtin'}])

    def test__list_no_log_values(self):
        argument_spec = {'a': {'no_log': True, 'type': 'str'}, 'b': {'no_log': True, 'type': 'list', 'elements': 'str'}, 'c': {'no_log': True, 'type': 'dict', 'options': {'d': {'no_log': True, 'type': 'str'}}}}
        params = {'a': 'a', 'b': ['b1', 'b2'], 'c': {'d': 'd'}}
        result = _list_no_log_values(argument_spec, params)
        self.assertEqual(result, {'a', 'b1', 'b2', 'd'})

if __name__ == '__main__':
    unittest.main()