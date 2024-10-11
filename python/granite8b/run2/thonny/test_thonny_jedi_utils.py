import unittest
from thonny.jedi_utils import *


class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        # Test with a simple function
        source = "def my_function(x):\n    return x + 1"
        node = parse_source(source)
        pos = source.index("x") + 1
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "funcdef")

        # Test with a class method
        source = "class MyClass:\n    def my_method(self, x):\n        return x + 1"
        node = parse_source(source)
        pos = source.index("x") + 1
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "funcdef")

        # Test with a class attribute
        source = "class MyClass:\n    my_attribute = 1"
        node = parse_source(source)
        pos = source.index("my_attribute") + 1
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "class")

        # Test with a module-level variable
        source = "my_variable = 1"
        node = parse_source(source)
        pos = source.index("my_variable") + 1
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "module")

    def test_parse_source(self):
        source = "def my_function(x):\n    return x + 1"
        node = parse_source(source)
        self.assertEqual(node.type, "file_input")

    def test_get_script_completions(self):
        source = "import math\nmath.s"
        completions = get_script_completions(source, 2, 10, "example.py")
        self.assertIn("sin", completions)
        self.assertIn("sqrt", completions)

    def test_get_interpreter_completions(self):
        namespaces = [
            {"my_variable": 1},
            {"my_function": lambda x: x + 1},
        ]
        completions = get_interpreter_completions("my_variable", namespaces)
        self.assertIn("my_variable", completions)
        completions = get_interpreter_completions("my_functio", namespaces)
        self.assertIn("my_function", completions)

    def test_get_definitions(self):
        source = "def my_function(x):\n    return x + 1\nmy_variable = my_function(1)"
        definitions = get_definitions(source, 2, 10, "example.py")
        self.assertEqual(definitions[0].type, "function")
        self.assertEqual(definitions[1].type, "module")

if __name__ == '__main__':
    unittest.main()