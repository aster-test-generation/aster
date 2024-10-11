import unittest
from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'key1': 'value1', 'key2': 'value2'}
        cli_args = CLIArgs(mapping)
        self.assertEqual(cli_args['key1'], 'value1')
        self.assertEqual(cli_args['key2'], 'value2')

    def test_from_options(self):
        options = type('Options', (), {'key1': 'value1', 'key2': 'value2'})()
        cli_args = CLIArgs.from_options(options)
        self.assertEqual(cli_args['key1'], 'value2')
        self.assertEqual(cli_args['key2'], 'value2')

    def test_make_immutable(self):
        mapping = {'key1': ['value1', 'value2'], 'key2': {'subkey1': 'subvalue1', 'subkey2': 'subvalue2'}}
        immutable_dict = CLIArgs._make_immutable(mapping)
        self.assertIsInstance(immutable_dict, ImmutableDict)
        self.assertEqual(immutable_dict['key1'], ('value1', 'value2'))
        self.assertEqual(immutable_dict['key2'], {'subkey1': 'subvalue1', 'subkey2': 'subvalue2'})

class TestGlobalCLIArgs(unittest.TestCase):
    def test_singleton(self):
        global_cli_args1 = GlobalCLIArgs(mapping)
        global_cli_args2 = GlobalCLIArgs()
        self.assertEqual(global_cli_args1, global_cli_args2)

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'a': 1, 'b': 2}
        cli_args = CLIArgs(mapping)
        self.assertEqual(cli_args['a'], 1)
        self.assertEqual(cli_args['b'], 2)

    def test_from_options(self):
        options = type('Options', (), {'a': 1, 'b': 2})()
        cli_args = CLIArgs.from_options(options)
        self.assertEqual(cli_args['a'], 1)
        self.assertEqual(cli_args['b'], 2)

    def test_make_immutable(self):
        obj = {'a': 1, 'b': [2, 3]}
        immutable_obj = CLIArgs._make_immutable(obj)
        self.assertEqual(immutable_obj['a'], 1)
        self.assertEqual(immutable_obj['b'], (2, 3))

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'a': 1, 'b': 2}
        global_cli_args = GlobalCLIArgs(mapping)
        self.assertEqual(global_cli_args['a'], 1)
        self.assertEqual(global_cli_args['b'], 2)

    def test_from_options(self):
        options = type('Options', (), {'a': 1, 'b': 2})()
        global_cli_args = GlobalCLIArgs.from_options(options)
        self.assertEqual(global_cli_args['a'], 1)
        self.assertEqual(global_cli_args['b'], 2)

    def test_make_immutable(self):
        obj = {'a': 1, 'b': [2, 3]}
        immutable_obj = GlobalCLIArgs._make_immutable(obj)
        self.assertEqual(immutable_obj['a'], 1)
        self.assertEqual(immutable_obj['b'], (2, 3))

if __name__ == '__main__':
    unittest.main()