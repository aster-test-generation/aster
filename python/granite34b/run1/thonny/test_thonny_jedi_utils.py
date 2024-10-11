import math
import unittest
from thonny.jedi_utils import *


class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        # Test case 1: statement is a simple expression
        source = "x = 1"
        node = parse_source(source)
        pos = (1, 1)
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "simple_stmt")
        self.assertEqual(statement.children[0].value, "x = 1")

        # Test case 2: statement is a function definition
        source = "def my_function():\n    pass"
        node = parse_source(source)
        pos = (1, 1)
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "funcdef")
        self.assertEqual(statement.children[0].value, "def")

        # Test case 3: statement is a class definition
        source = "class MyClass:\n    pass"
        node = parse_source(source)
        pos = (1, 1)
        statement = get_statement_of_position(node, pos)
        self.assertEqual(statement.type, "classdef")
        self.assertEqual(statement.children[0].value, "class")

    def test_parse_source(self):
        source = "x = 1\ny = 2"
        node = parse_source(source)
        self.assertEqual(node.type, "file_input")
        self.assertEqual(len(node.children), 2)
        self.assertEqual(node.children[0].type, "simple_stmt")
        self.assertEqual(node.children[0].children[0].value, "x = 1")
        self.assertEqual(node.children[1].type, "simple_stmt")
        self.assertEqual(node.children[1].children[0].value, "y = 2")

    def test_get_script_completions(self):
        source = "x = 1\ny = x"
        completions = get_script_completions(source, 2, 6, "test.py")
        self.assertEqual(len(completions), 1)
        self.assertEqual(completions[0]["name"], "x")
        self.assertEqual(completions[0]["type"], "statement")

        source = "import math\nmath."
        completions = get_script_completions(source, 2, 7, "test.py")
        self.assertGreater(len(completions), 10)
        self.assertEqual(completions[0]["name"], "pi")
        self.assertEqual(completions[0]["type"], "statement")

    def test_get_interpreter_completions(self):
        source = ""
        namespaces = [{"math": math}]
        completions = get_interpreter_completions(source, namespaces)
        self.assertGreater(len(completions), 10)
        self.assertEqual(completions[0]["name"], "pi")
        self.assertEqual(completions[0]["type"], "statement")

    def test_get_definitions(self):
        source = "x = 1\ny = x"
        definitions = get_definitions(source, 2, 6, "test.py")
        self.assertEqual(len(definitions), 1)
        self.assertEqual(definitions[0].name, "x")
        self.assertEqual(definitions[0].type, "statement")

        source = "import math\nmath."
        definitions = get_definitions(source, 2, 7, "test.py")
        self.assertGreater(len(definitions), 10)
        self.assertEqual(definitions[0].name, "pi")
        self.assertEqual(definitions[0].type, "statement")

if __name__ == '__main__':
    unittest.main()