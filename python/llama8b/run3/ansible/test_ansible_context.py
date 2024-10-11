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
        cli_args = CLIArgs({'key': None})
        inner = cliargs_deferred_get('key', default='default_value')
        self.assertEqual(inner(), 'default_value')

    def test_cliargs_deferred_get_shallowcopy(self):
        cli_args = CLIArgs({'key': [1, 2, 3]})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), [1, 2, 3])

    def test_cliargs_deferred_get_shallowcopy_mapping(self):
        cli_args = CLIArgs({'key': {'a': 1, 'b': 2}})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), {'a': 1, 'b': 2})

    def test_cliargs_deferred_get_shallowcopy_set(self):
        cli_args = CLIArgs({'key': {1, 2, 3}})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), {1, 2, 3})

    def test_cliargs_deferred_get_shallowcopy_sequence(self):
        cli_args = CLIArgs({'key': [1, 2, 3]})
        inner = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(inner(), [1, 2, 3])

    def test_cliargs_deferred_get_shallowcopy_mapping_copy(self):
        cli_args = CLIArgs({'key': {'a': 1, 'b': 2}})
        inner = cliargs_deferred_get('key', shallowcopy=False)
        self.assertEqual(inner(), {'a': 1, 'b': 2})

    def test_cliargs_deferred_get_shallowcopy_set_copy(self):
        cli_args = CLIArgs({'key': {1, 2, 3}})
        inner = cliargs_deferred_get('key', shallowcopy=False)
        self.assertEqual(inner(), {1, 2, 3})

    def test_cliargs_deferred_get_shallowcopy_sequence_copy(self):
        cli_args = CLIArgs({'key': [1, 2, 3]})
        inner = cliargs_deferred_get('key', shallowcopy=False)
        self.assertEqual(inner(), [1, 2, 3])

if __name__ == '__main__':
    unittest.main()