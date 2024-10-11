from ansible.context import _init_global_context
import unittest
from ansible.context import *


class TestCLIArgs(unittest.TestCase):
    def test_init_global_context(self):
        cli_args = CLIArgs({})
        _init_global_context(cli_args)
        self.assertIsInstance(CLIARGS, GlobalCLIArgs)

    def test_cliargs_deferred_get(self):
        cli_args = CLIArgs({'key': 'value'})
        inner = cliargs_deferred_get('key')
        self.assertEqual(inner(), 'value')

    def test_cliargs_deferred_get_default(self):
        cli_args = CLIArgs({'key': 'value'})
        inner = cliargs_deferred_get('non_existent_key', default='default_value')
        self.assertEqual(inner(), 'default_value')

    def test_cliargs_deferred_get_shallowcopy(self):
        cli_args = CLIArgs({'key': ['value1', 'value2']})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), ['value1', 'value2'])

    def test_cliargs_deferred_get_mapping(self):
        cli_args = CLIArgs({'key': {'a': 1, 'b': 2}})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), {'a': 1, 'b': 2})

    def test_cliargs_deferred_get_set(self):
        cli_args = CLIArgs({'key': {1, 2, 3}})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), {1, 2, 3})

    def test_cliargs_deferred_get_sequence(self):
        cli_args = CLIArgs({'key': [1, 2, 3]})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), [1, 2, 3])

    def test_cliargs_deferred_get_non_sequence(self):
        cli_args = CLIArgs({'key': 'value'})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), 'value')

if __name__ == '__main__':
    unittest.main()