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
            def __init__(self):
                self.option1 = "value1"
                self.option2 = "value2"

        options = Options()
        instance = CLIArgs.from_options(options)
        self.assertIsInstance(instance, CLIArgs)
        self.assertEqual(instance["option1"], "value1")
        self.assertEqual(instance["option2"], "value2")

class TestGlobalCLIArgs(unittest.TestCase):
    def test_singleton_behavior(self):
        instance1 = GlobalCLIArgs({"key": "value"})
        instance2 = GlobalCLIArgs({"key": "value"})
        self.assertIs(instance1, instance2)

if __name__ == '__main__':
    unittest.main()