import unittest
from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'key': 'value'}
        cli_args = CLIArgs(mapping)
        self.assertEqual(cli_args['key'], 'value')

    def test_from_options(self):
        options = {'key': 'value'}
        cli_args = CLIArgs.from_options(options)
        self.assertEqual(cli_args['key'], 'value')

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'key': 'value'}
        global_cli_args = GlobalCLIArgs(mapping)
        self.assertEqual(global_cli_args['key'], 'value')

    def test_from_options(self):
        options = {'key': 'value'}
        global_cli_args = GlobalCLIArgs.from_options(options)
        self.assertEqual(global_cli_args['key'], 'value')

if __name__ == '__main__':
    unittest.main()