import unittest
from ansible.context import *


class TestCLIArgs(unittest.TestCase):
    def test_cliargs_deferred_get(self):
        CLIARGS = CLIArgs({'key': 'value'})
        result = cliargs_deferred_get('key')()
        self.assertEqual(result, 'value')

if __name__ == '__main__':
    unittest.main()