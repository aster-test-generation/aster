import unittest
from ansible.context import CLIArgs, GlobalCLIArgs


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = CLIArgs(cli_args)
        self.assertEqual(args.keys, 'value1')
        self.assertEqual(args.key2, 'value2')

    def test_get(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = CLIArgs(cli_args)
        self.assertEqual(args.get('key1'), 'value1')
        self.assertEqual(args.get('key2'), 'value2')
        self.assertEqual(args.get('key3'), None)
        self.assertEqual(args.get('key3', default='default_value'), 'default_value')

    def test_set(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = CLIArgs(cli_args)
        args.set('key3', 'value3')
        self.assertEqual(args.get('key3'), 'value3')

    def test_del(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = CLIArgs(cli_args)
        del args['key1']
        self.assertEqual(args.get('key1'), None)

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = GlobalCLIArgs(cli_args)
        self.assertEqual(args.keys, 'value1')
        self.assertEqual(args.key2, 'value2')

    def test_get(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = GlobalCLIArgs(cli_args)
        self.assertEqual(args.get('key1'), 'value1')
        self.assertEqual(args.get('key2'), 'value2')
        self.assertEqual(args.get('key3'), None)
        self.assertEqual(args.get('key3', default='default_value'), 'default_value')

    def test_set(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = GlobalCLIArgs(cli_args)
        args.set('key3', 'value3')
        self.assertEqual(args.get('key3'), 'value3')

    def test_del(self):
        cli_args = {'key1': 'value1', 'key2': 'value2'}
        args = GlobalCLIArgs(cli_args)
        del args['key1']
        self.assertEqual(args.get('key1'), None)

if __name__ == '__main__':
    unittest.main()