from ansible.utils.context_objects import _make_immutable
import unittest
from ansible.utils.context_objects import *


class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({})
        self.assertEqual(instance, ImmutableDict({}))

    def test_from_options(self):
        result = CLIArgs.from_options({})
        self.assertEqual(result, {})

    def test_make_immutable(self):
        result = _make_immutable({})
        self.assertEqual(result, ImmutableDict({}))

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = GlobalCLIArgs({})
        self.assertEqual(instance, ImmutableDict({}))

    def test_from_options(self):
        result = GlobalCLIArgs.from_options({'__dict__': {}})
        self.assertEqual(result, {})

    def test_make_immutable(self):
        result = _make_immutable({})
        self.assertEqual(result, ImmutableDict({}))

if __name__ == '__main__':
    unittest.main()