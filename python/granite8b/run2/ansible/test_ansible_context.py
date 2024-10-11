from ansible.context import _init_global_context
import unittest
from ansible.context import *


class TestCLIArgs(unittest.TestCase):
    def test_cliargs_deferred_get(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        _init_global_context(cli_args)
        result = cliargs_deferred_get('key1')()
        self.assertEqual(result, 'value1')
        result = cliargs_deferred_get('key2')()
        self.assertEqual(result, 'value2')
        result = cliargs_deferred_get('key3', default='default_value')()
        self.assertEqual(result, 'default_value')
        result = cliargs_deferred_get('key1', shallowcopy=True)()
        self.assertEqual(result, 'value1')
        result = cliargs_deferred_get('key2', shallowcopy=True)()
        self.assertEqual(result, 'value2')
        result = cliargs_deferred_get('key3', shallowcopy=True, default='default_value')()
        self.assertEqual(result, 'default_value')

if __name__ == '__main__':
    unittest.main()