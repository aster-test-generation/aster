import unittest
from ansible.context import CLIArgs, GlobalCLIArgs


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        args = {'key1': 'value1', 'key2': 'value2'}
        cli_args = CLIArgs(args)
        self.assertEqual(cli_args.get('key1'), 'value1')
        self.assertEqual(cli_args.get('key2'), 'value2')

    def test_set(self):
        args = {'key1': 'value1', 'key2': 'value2'}
        cli_args = CLIArgs(args)
        cli_args.set('key3', 'value3')
        self.assertEqual(cli_args.get('key3'), 'value3')

    def test_get_default(self):
        args = {'key1': 'value1', 'key2': 'value2'}
        cli_args = CLIArgs(args)
        self.assertEqual(cli_args.get('key3', default='default_value'), 'default_value')

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        args = {'key1': 'value1', 'key2': 'value2'}
        global_cli_args = GlobalCLIArgs(args)
        self.assertEqual(global_cli_args.get('key1'), 'value1')
        self.assertEqual(global_cli_args.get('key2'), 'value2')

    def test_set(self):
        args = {'key1': 'value1', 'key2': 'value2'}
        global_cli_args = GlobalCLIArgs(args)
        global_cli_args.get('key3', 'value3')
        self.assertEqual(global_cli_args.get('key3'), 'value3')

    def test_get_default(self):
        args = {'key1': 'value1', 'key2': 'value2'}
        global_cli_args = GlobalCLIArgs(args)
        self.assertEqual(global_cli_args.get('key3', default='default_value'), 'default_value')

if __name__ == '__main__':
    unittest.main()