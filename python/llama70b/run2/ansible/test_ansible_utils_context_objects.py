from ansible.utils.context_objects import ImmutableDict
import unittest
from ansible.utils.context_objects import _make_immutable, CLIArgs, GlobalCLIArgs
from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs, _make_immutable


class TestMakeImmutable(unittest.TestCase):
    def test_make_immutable_string(self):
        result = _make_immutable("hello")
        self.assertEqual(result, "hello")

    def test_make_immutable_binary(self):
        result = _make_immutable(b"hello")
        self.assertEqual(result, b"hello")

    def test_make_immutable_mapping(self):
        obj = {"a": 1, "b": 2}
        result = _make_immutable(obj)
        self.assertIsInstance(result, ImmutableDict)
        self.assertEqual(result, {"a": 1, "b": 2})

    def test_make_immutable_set(self):
        obj = {1, 2, 3}
        result = _make_immutable(obj)
        self.assertIsInstance(result, frozenset)
        self.assertEqual(result, frozenset({1, 2, 3}))

    def test_make_immutable_sequence(self):
        obj = [1, 2, 3]
        result = _make_immutable(obj)
        self.assertIsInstance(result, tuple)
        self.assertEqual(result, (1, 2, 3))

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        cli_args = CLIArgs({"a": 1, "b": 2})
        self.assertIsInstance(cli_args, ImmutableDict)
        self.assertEqual(cli_args, {"a": 1, "b": 2})

    def test_from_options(self):
        class Options:
            def __init__(self):
                self.a = 1
                self.b = 2
        options = Options()
        cli_args = CLIArgs.from_options(options)
        self.assertIsInstance(cli_args, CLIArgs)
        self.assertEqual(cli_args, {"a": 1, "b": 2})

    def test_str_method(self):
        cli_args = CLIArgs({"a": 1, "b": 2})
        result = cli_args.__str__()
        self.assertEqual(result, "{'a': 1, 'b': 2}")

    def test_repr_method(self):
        cli_args = CLIArgs({"a": 1, "b": 2})
        result = cli_args.__repr__()
        self.assertEqual(result, "CLIArgs({'a': 1, 'b': 2})")

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        global_cli_args = GlobalCLIArgs({"a": 1, "b": 2})
        self.assertIsInstance(global_cli_args, GlobalCLIArgs)
        self.assertEqual(global_cli_args, {"a": 1, "b": 2})

    def test_singleton(self):
        global_cli_args1 = GlobalCLIArgs({"a": 1, "b": 2})
        global_cli_args2 = GlobalCLIArgs({"c": 3, "d": 4})
        self.assertIs(global_cli_args1, global_cli_args2)

    def test_str_method(self):
        global_cli_args = GlobalCLIArgs({"a": 1, "b": 2})
        result = global_cli_args.__str__()
        self.assertEqual(result, "{'a': 1, 'b': 2}")

    def test_repr_method(self):
        global_cli_args = GlobalCLIArgs({"a": 1, "b": 2})
        result = global_cli_args.__repr__()
        self.assertEqual(result, "GlobalCLIArgs({'a': 1, 'b': 2})")

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        cli_args = CLIArgs({'key': 'value'})
        self.assertIsInstance(cli_args, ImmutableDict)

    def test_from_options(self):
        class Options:
            def __init__(self):
                self.key = 'value'
        options = Options()
        cli_args = CLIArgs.from_options(options)
        self.assertIsInstance(cli_args, CLIArgs)

    def test_immutable(self):
        cli_args = CLIArgs({'key': 'value'})
        with self.assertRaises(TypeError):
            cli_args['new_key'] = 'new_value'

    def test_make_immutable(self):
        obj = {'key': 'value'}
        immutable_obj = _make_immutable(obj)
        self.assertIsInstance(immutable_obj, ImmutableDict)

    def test_make_immutable_sequence(self):
        obj = ['value1', 'value2']
        immutable_obj = _make_immutable(obj)
        self.assertIsInstance(immutable_obj, tuple)

    def test_make_immutable_set(self):
        obj = {'value1', 'value2'}
        immutable_obj = _make_immutable(obj)
        self.assertIsInstance(immutable_obj, frozenset)

    def test_make_immutable_mapping(self):
        obj = {'key1': 'value1', 'key2': 'value2'}
        immutable_obj = _make_immutable(obj)
        self.assertIsInstance(immutable_obj, ImmutableDict)

    def test_str_method(self):
        cli_args = CLIArgs({'key': 'value'})
        result = cli_args.__str__()
        self.assertEqual(result, "{'key': 'value'}")

    def test_repr_method(self):
        cli_args = CLIArgs({'key': 'value'})
        result = cli_args.__repr__()
        self.assertEqual(result, "CLIArgs({'key': 'value'})")

class TestGlobalCLIArgs(unittest.TestCase):
    def test_init(self):
        global_cli_args = GlobalCLIArgs({'key': 'value'})
        self.assertIsInstance(global_cli_args, CLIArgs)

    def test_singleton(self):
        global_cli_args1 = GlobalCLIArgs({'key': 'value'})
        global_cli_args2 = GlobalCLIArgs({'key': 'value'})
        self.assertEqual(global_cli_args1, global_cli_args2)

    def test_str_method(self):
        global_cli_args = GlobalCLIArgs({'key': 'value'})
        result = global_cli_args.__str__()
        self.assertEqual(result, "{'key': 'value'}")

    def test_repr_method(self):
        global_cli_args = GlobalCLIArgs({'key': 'value'})
        result = global_cli_args.__repr__()
        self.assertEqual(result, "GlobalCLIArgs({'key': 'value'})")

if __name__ == '__main__':
    unittest.main()