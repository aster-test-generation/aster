import unittest
from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'key': 'value'}
        cli_args = CLIArgs(mapping)
        self.assertEqual(cli_args['key'], 'value')

    def test_from_options(self):
        options = type('Options', (), {'key': 'value'})()
        cli_args = CLIArgs.from_options(options)
        self.assertEqual(cli_args['key'], 'value')

    def test_make_immutable(self):
        mapping = {'key': ['value']}
        cli_args = CLIArgs(mapping)
        self.assertIsInstance(cli_args['key'], tuple)

class TestGlobalCLIArgs(unittest.TestCase):
    def test_singleton(self):
        global_cli_args1 = GlobalCLIArgs(mapping)
        global_cli_args2 = GlobalCLIArgs()
        self.assertIs(global_cli_args1, global_cli_args2)

if __name__ == '__main__':
    unittest.main()