from ansible.utils.context_objects import ImmutableDict
import unittest
from ansible.utils.context_objects import CLIArgs, GlobalCLIArgs, _make_immutable


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

    def test_str_method(self):
        cli_args = CLIArgs({'key': 'value'})
        self.assertEqual(str(cli_args), "{'key': 'value'}")

    def test_repr_method(self):
        cli_args = CLIArgs({'key': 'value'})
        self.assertEqual(repr(cli_args), "CLIArgs({'key': 'value'})")

    def test_eq_method(self):
        cli_args1 = CLIArgs({'key': 'value'})
        cli_args2 = CLIArgs({'key': 'value'})
        self.assertEqual(cli_args1, cli_args2)

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
        self.assertEqual(str(global_cli_args), "{'key': 'value'}")

    def test_repr_method(self):
        global_cli_args = GlobalCLIArgs({'key': 'value'})
        self.assertEqual(repr(global_cli_args), "GlobalCLIArgs({'key': 'value'})")

    def test_eq_method(self):
        global_cli_args1 = GlobalCLIArgs({'key': 'value'})
        global_cli_args2 = GlobalCLIArgs({'key': 'value'})
        self.assertEqual(global_cli_args1, global_cli_args2)

class TestMakeImmutable(unittest.TestCase):
    def test_text_type(self):
        result = _make_immutable('hello')
        self.assertEqual(result, 'hello')

    def test_binary_type(self):
        result = _make_immutable(b'hello')
        self.assertEqual(result, b'hello')

    def test_mapping(self):
        result = _make_immutable({'key': 'value'})
        self.assertIsInstance(result, ImmutableDict)

    def test_set(self):
        result = _make_immutable({1, 2, 3})
        self.assertIsInstance(result, frozenset)

    def test_sequence(self):
        result = _make_immutable([1, 2, 3])
        self.assertIsInstance(result, tuple)

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
        self.assertEqual(result, "{'key': 'value'}")

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
        self.assertEqual(result, "{'key': 'value'}")

if __name__ == '__main__':
    unittest.main()