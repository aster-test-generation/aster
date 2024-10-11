import unittest
from thonny.jedi_utils import *


class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        # Test case 1: Simple function definition
        source = "def my_function():\n    pass"
        node = parse_source(source)
        pos = (1, 5)  # Position at the beginning of the function name
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "funcdef")
        self.assertEqual(statement.value, "my_function")

        # Test case 2: Class definition
        source = "class MyClass:\n    def __init__(self):\n        pass"
        node = parse_source(source)
        pos = (1, 6)  # Position at the beginning of the class name
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "classdef")
        self.assertEqual(statement.value, "MyClass")

        # Test case 3: Import statement
        source = "import math"
        node = parse_source(source)
        pos = (1, 7)  # Position after the import keyword
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "import_name")
        self.assertEqual(statement.value, "import")

    def test_parse_source(self):
        source = "def my_function():\n    pass"
        node = parse_source(source)
        self.assertEqual(node.type, "file_input")
        self.assertEqual(node.children[0].type, "funcdef")
        self.assertEqual(node.children[0].value, "my_function")

    def test_get_script_completions(self):
        source = "import math\nx = math.pi\ny = x + 1"
        row, column = 3, 10  # Position after the assignment operator
        filename = "test_script.py"
        completions = get_script_completions(source, row, column, filename)
        self.assertIn("math", [c["name"] for c in completions])
        self.assertIn("pi", [c["name"] for c in completions])
        self.assertIn("x", [c["name"] for c in completions])
        self.assertIn("y", [c["name"] for c in completions])

    def test_get_interpreter_completions(self):
        source = "x = 1\ny = x + 1"
        namespaces = [{"x": 1}]
        completions = get_interpreter_completions(source, namespaces)
        self.assertIn("x", [c["name"] for c in completions])
        self.assertIn("y", [c["name"] for c in completions])

    def test_get_definitions(self):
        source = "x = 1\ny = x + 1"
        row, column = 2, 5  # Position after the assignment operator
        filename = "test_script.py"
        definitions = get_definitions(source, row, column, filename)
        self.assertEqual(len(definitions), 1)
        self.assertEqual(definitions[0].name, "x")

if __name__ == '__main__':
    unittest.main()