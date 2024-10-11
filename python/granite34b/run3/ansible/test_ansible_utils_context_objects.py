import unittest
from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'key1': 'value1', 'key2': 'value2'}
        cli_args = CLIArgs(mapping)
        self.assertEqual(cli_args['key1'], 'value1')
        self.assertEqual(cli_args['key2'], 'value2')

    def test_from_options(self):
        options = {'option1': 'value1', 'option2': 'value2'}
        cli_args = CLIArgs.from_options(options)
        self.assertEqual(cli_args['option1'], 'value1')
        self.assertEqual(cli_args['option2'], 'value2')

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        mapping = {'key1': 'value1', 'key2': 'value2'}
        global_cli_args = GlobalCLIArgs(mapping)
        self.assertEqual(global_cli_args['key1'], 'value1')
        self.assertEqual(global_cli_args['key2'], 'value2')

    def test_from_options(self):
        options = {'option1': 'value1', 'option2': 'value2'}
        global_cli_args = GlobalCLIArgs.from_options(options)
        self.assertEqual(global_cli_args['option1'], 'value1')
        self.assertEqual(global_cli_args['option2'], 'value2')

if __name__ == '__main__':
    unittest.main()