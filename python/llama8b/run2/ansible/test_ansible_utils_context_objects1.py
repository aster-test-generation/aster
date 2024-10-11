import unittest
from ansible.utils.context_objects import _make_immutable, _ABCSingleton, CLIArgs, GlobalCLIArgs

class TestMakeImmutable(unittest.TestCase):
    def test_make_immutable_text(self):
        result = _make_immutable("Hello")
        self.assertEqual(result, "Hello")

    def test_make_immutable_binary(self):
        result = _make_immutable(b"Hello")
        self.assertEqual(result, b"Hello")

    def test_make_immutable_mapping(self):
        result = _make_immutable({"a": 1, "b": 2})
        self.assertIsInstance(result, ImmutableDict)

    def test_make_immutable_set(self):
        result = _make_immutable({1, 2, 3})
        self.assertIsInstance(result, frozenset)

    def test_make_immutable_sequence(self):
        result = _make_immutable([1, 2, 3])
        self.assertIsInstance(result, tuple)

    def test_make_immutable_container(self):
        result = _make_immutable({"a": [1, 2, 3]})
        self.assertIsInstance(result, ImmutableDict)

class TestABCSingleton(unittest.TestCase):
    def test_singleton(self):
        singleton = _ABCSingleton()
        self.assertEqual(singleton, _ABCSingleton())

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        cli_args = CLIArgs({"a": 1, "b": 2})
        self.assertIsInstance(cli_args, ImmutableDict)

    def test_from_options(self):
        options = {"a": 1, "b": 2}
        cli_args = CLIArgs.from_options(options)
        self.assertIsInstance(cli_args, ImmutableDict)

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        global_cli_args = GlobalCLIArgs({"a": 1, "b": 2})
        self.assertIsInstance(global_cli_args, ImmutableDict)

    def test_singleton(self):
        global_cli_args1 = GlobalCLIArgs({"a": 1, "b": 2})
        global_cli_args2 = GlobalCLIArgs({"a": 1, "b": 2})
        self.assertEqual(global_cli_args1, global_cli_args2)

if __name__ == '__main__':
    unittest.main()