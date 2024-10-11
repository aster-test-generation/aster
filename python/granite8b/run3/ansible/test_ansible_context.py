from ansible.context import _init_global_context
import unittest
from ansible.context import *


class TestCLIArgs(unittest.TestCase):
    def test_cliargs_deferred_get(self):
        result = cliargs_deferred_get('key', default='default')()
        self.assertEqual(result, 'default')

class TestGlobalCLIArgs(unittest.TestCase):
    def test_from_options(self):
        cli_args = {'key': 'value'}
        _init_global_context(cli_args)
        result = CLIARGS.get('key')
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()