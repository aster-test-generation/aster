from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs
import unittest

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'key1': 'value1', 'key2': 'value2'}
        cli_args = CLIArgs(mapping)
        self.assertEqual(cli_args['key1'], 'value1')
        self.assertEqual(cli_args['key2'], 'value2')

    def test_from_options(self):
        options = type('Options', (), {'key1': 'value1', 'key2': 'value2'})()
        cli_args = CLIArgs.from_options(options)
        self.assertEqual(cli_args['key1'], 'value1')
        self.assertEqual(cli_args['key2'], 'value2')

    def test_make_immutable(self):
        mapping = {'key1': ['value1', 'value2'], 'key2': {'subkey1': 'subvalue1', 'subkey2': 'subvalue2'}}
        cli_args = CLIArgs(mapping)
        self.assertIsInstance(cli_args['key1'], tuple)
        self.assertIsInstance(cli_args['key2'], frozenset)
        self.assertIsInstance(cli_args['key2']['subkey1'], str)
        self.assertIsInstance(cli_args['key2']['subkey2'], str)

class TestGlobalCLIArgs(unittest.TestCase):
    def test_singleton(self):
        global_cli_args1 = GlobalCLIArgs()
        global_cli_args2 = GlobalCLIArgs()
        self.assertEqual(global_cli_args1, global_cli_args2)

if __name__ == '__main__':
    unittest.main()