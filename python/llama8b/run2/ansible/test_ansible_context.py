import unittest
from ansible.context import *


class TestAnsibleContext(unittest.TestCase):
    def test_init_global_context(self):
        cli_args = CLIArgs({})
        _init_global_context(cli_args)
        self.assertIsInstance(CLIARGS, GlobalCLIArgs)

    def test_cliargs_deferred_get(self):
        cli_args = CLIArgs({'key': 'value'})
        result = cliargs_deferred_get('key')(cli_args)
        self.assertEqual(result, 'value')

    def test_cliargs_deferred_get_default(self):
        cli_args = CLIArgs({'key': None})
        result = cliargs_deferred_get('key', default='default')(cli_args)
        self.assertEqual(result, 'default')

    def test_cliargs_deferred_get_shallowcopy(self):
        cli_args = CLIArgs({'key': [1, 2, 3]})
        result = cliargs_deferred_get('key', shallowcopy=True)(cli_args)
        self.assertEqual(result, [1, 2, 3])

    def test_cliargs_deferred_get_shallowcopy_mapping(self):
        cli_args = CLIArgs({'key': {'a': 1, 'b': 2}})
        result = cliargs_deferred_get('key', shallowcopy=True)(cli_args)
        self.assertEqual(result, {'a': 1, 'b': 2})

    def test_cliargs_deferred_get_shallowcopy_set(self):
        cli_args = CLIArgs({'key': {1, 2, 3}})
        result = cliargs_deferred_get('key', shallowcopy=True)(cli_args)
        self.assertEqual(result, {1, 2, 3})

    def test_cliargs_deferred_get_shallowcopy_non_sequence(self):
        cli_args = CLIArgs({'key': 'string'})
        result = cliargs_deferred_get('key', shallowcopy=True)(cli_args)
        self.assertEqual(result, 'string')

if __name__ == '__main__':
    unittest.main()