import unittest
from ansible.utils.context_objects import _make_immutable, _ABCSingleton, CLIArgs, GlobalCLIArgs


class TestMakeImmutable(unittest.TestCase):
    def test_text_type(self):
        result = _make_immutable('hello')
        self.assertEqual(result, 'hello')

    def test_binary_type(self):
        result = _make_immutable(b'hello')
        self.assertEqual(result, b'hello')

    def test_mapping(self):
        result = _make_immutable({'a': 1, 'b': 2})
        self.assertIsInstance(result, ImmutableDict)

    def test_set(self):
        result = _make_immutable({1, 2, 3})
        self.assertIsInstance(result, frozenset)

    def test_sequence(self):
        result = _make_immutable([1, 2, 3])
        self.assertIsInstance(result, tuple)

    def test_non_container(self):
        result = _make_immutable(42)
        self.assertEqual(result, 42)

class TestABCSingleton(unittest.TestCase):
    def test_singleton(self):
        singleton = _ABCSingleton()
        self.assertEqual(singleton, _ABCSingleton())

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        args = CLIArgs({'a': 1, 'b': 2})
        self.assertEqual(args, {'a': 1, 'b': 2})

    def test_from_options(self):
        options = {'a': 1, 'b': 2}
        args = CLIArgs.from_options(options)
        self.assertEqual(args, {'a': 1, 'b': 2})

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        args = GlobalCLIArgs({'a': 1, 'b': 2})
        self.assertEqual(args, {'a': 1, 'b': 2})

    def test_singleton(self):
        singleton = GlobalCLIArgs()
        self.assertEqual(singleton, GlobalCLIArgs())

if __name__ == '__main__':
    unittest.main()