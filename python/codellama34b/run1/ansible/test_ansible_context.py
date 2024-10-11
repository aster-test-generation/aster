import unittest
from ansible.context import *



class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({})
        self.assertEqual(instance.args, {})

    def test_get(self):
        instance = CLIArgs({})
        result = instance.get('key', default=None)
        self.assertEqual(result, None)

    def test_from_options(self):
        result = GlobalCLIArgs.from_options({})
        self.assertEqual(result.args, {})

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = GlobalCLIArgs({})
        self.assertEqual(instance.args, {})

    def test_get(self):
        instance = GlobalCLIArgs({})
        result = instance.get('key', default=None)
        self.assertEqual(result, None)

    def test_from_options(self):
        result = GlobalCLIArgs.from_options({})
        self.assertEqual(result.args, {})

if __name__ == '__main__':
    unittest.main()