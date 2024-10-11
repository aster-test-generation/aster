import unittest
from ansible.utils.context_objects import _make_immutable, _ABCSingleton, CLIArgs, GlobalCLIArgs


class TestMakeImmutable(unittest.TestCase):
    def test_text_type(self):
        result = _make_immutable('test')
        self.assertEqual(result, 'test')

    def test_binary_type(self):
        result = _make_immutable(b'test')
        self.assertEqual(result, b'test')

    def test_mapping(self):
        result = _make_immutable({'a': 1, 'b': 2})
        self.assertIsInstance(result, ImmutableDict)

    def test_set(self):
        result = _make_immutable({1, 2, 3})
        self.assertIsInstance(result, frozenset)

    def test_sequence(self):
        result = _make_immutable([1, 2, 3])
        self.assertEqual(result, (1, 2, 3))

class TestABCSingleton(unittest.TestCase):
    def test_singleton(self):
        self.assertEqual(_ABCSingleton(), _ABCSingleton())

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
        self.assertEqual(GlobalCLIArgs(), GlobalCLIArgs())

if __name__ == '__main__':
    unittest.main()