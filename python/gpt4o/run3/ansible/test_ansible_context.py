import unittest
from ansible.context import CLIArgs, GlobalCLIArgs, _init_global_context, cliargs_deferred_get, CLIARGS
from ansible.module_utils.common._collections_compat import Mapping, Set
from ansible.module_utils.common.collections import is_sequence


class TestCLIArgs(unittest.TestCase):
    def test_cliargs_initialization(self):
        cli_args = CLIArgs({})
        self.assertIsInstance(cli_args, CLIArgs)

class TestGlobalCLIArgs(unittest.TestCase):
    def test_globalcliargs_initialization(self):
        global_cli_args = GlobalCLIArgs.from_options(GlobalCLIArgs())
        self.assertIsInstance(global_cli_args, GlobalCLIArgs)

class TestInitGlobalContext(unittest.TestCase):
    def test_init_global_context(self):
        _init_global_context(vars())
        self.assertIsInstance(CLIARGS, GlobalCLIArgs)

class TestCliargsDeferredGet(unittest.TestCase):
    def test_cliargs_deferred_get_default(self):
        _init_global_context(object())
        deferred_get = cliargs_deferred_get('nonexistent_key', default='default_value')
        self.assertEqual(deferred_get(), 'default_value')

    def test_cliargs_deferred_get_shallowcopy_sequence(self):
        _init_global_context(type('obj', (object,), {'key': [1, 2, 3]})())
        deferred_get = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(deferred_get(), [1, 2, 3])

    def test_cliargs_deferred_get_shallowcopy_mapping(self):
        _init_global_context(type('obj', (object,), {'__dict__': {'key': {'a': 1}}})())
        deferred_get = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(deferred_get(), {'a': 1})

    def test_cliargs_deferred_get_shallowcopy_set(self):
        _init_global_context({'key': {'a': 1, 'b': 2, 'c': 3}})
        deferred_get = cliargs_deferred_get('key', shallowcopy=True)
        self.assertEqual(deferred_get(), {1, 2, 3})

    def test_cliargs_deferred_get_no_shallowcopy(self):
        _init_global_context(type('obj', (object,), {'key': [1, 2, 3]})())
        deferred_get = cliargs_deferred_get('key', shallowcopy=False)
        self.assertIs(deferred_get(), CLIARGS.get('key'))

if __name__ == '__main__':
    unittest.main()