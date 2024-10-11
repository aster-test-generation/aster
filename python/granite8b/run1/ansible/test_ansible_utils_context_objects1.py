import unittest
from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs

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