import unittest
from ansible.utils.context_objects import *


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({})
        self.assertIsInstance(instance, CLIArgs)

    def test_from_options(self):
        instance = CLIArgs.from_options(None)
        self.assertIsInstance(instance, CLIArgs)

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = GlobalCLIArgs({})
        self.assertIsInstance(instance, GlobalCLIArgs)

    def test_from_options(self):
        instance = GlobalCLIArgs.from_options(None)
        self.assertIsInstance(instance, GlobalCLIArgs)

if __name__ == '__main__':
    unittest.main()