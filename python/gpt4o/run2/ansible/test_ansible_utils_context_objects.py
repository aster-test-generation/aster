from ansible.utils.context_objects import ImmutableDict
import unittest
from ansible.utils.context_objects import _make_immutable, CLIArgs, GlobalCLIArgs


class TestMakeImmutable(unittest.TestCase):
    def test_make_immutable_with_text_type(self):
        result = _make_immutable("string")
        self.assertEqual(result, "string")

    def test_make_immutable_with_binary_type(self):
        result = _make_immutable(b"bytes")
        self.assertEqual(result, b"bytes")

    def test_make_immutable_with_mapping(self):
        result = _make_immutable({"key": "value"})
        self.assertIsInstance(result, ImmutableDict)
        self.assertEqual(result["key"], "value")

    def test_make_immutable_with_set(self):
        result = _make_immutable({"value1", "value2"})
        self.assertIsInstance(result, frozenset)
        self.assertIn("value1", result)
        self.assertIn("value2", result)

    def test_make_immutable_with_sequence(self):
        result = _make_immutable(["value1", "value2"])
        self.assertIsInstance(result, tuple)
        self.assertEqual(result, ("value1", "value2"))

    def test_make_immutable_with_other(self):
        result = _make_immutable(42)
        self.assertEqual(result, 42)

class TestCLIArgs(unittest.TestCase):
    def test_init(self):
        instance = CLIArgs({"key": "value"})
        self.assertIsInstance(instance, CLIArgs)
        self.assertEqual(instance["key"], "value")

    def test_from_options(self):
        class Options:
            def __init__(self, **kwargs):
                self.__dict__.update(kwargs)
        
        options = Options(key="value")
        instance = CLIArgs.from_options(options)
        self.assertIsInstance(instance, CLIArgs)
        self.assertEqual(instance["key"], "value")

class TestGlobalCLIArgs(unittest.TestCase):
    def test_global_cli_args_inheritance(self):
        instance = GlobalCLIArgs({"key": "value"})
        self.assertIsInstance(instance, GlobalCLIArgs)
        self.assertEqual(instance["key"], "value")

if __name__ == '__main__':
    unittest.main()