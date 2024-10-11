import logging
from typing import List, Dict
import unittest
from thonny.jedi_utils import *


class TestExampleClass(unittest.TestCase):
    def test_method_one(self):
        instance = ExampleClass()
        result = instance.method_one(1)
        self.assertEqual(result, 2)

    def test_method_two(self):
        instance = ExampleClass()
        result = instance.method_two(2)
        self.assertEqual(result, 4)

    def test_protected_method(self):
        instance = ExampleClass()
        result = instance._protected_method(3)
        self.assertEqual(result, 6)

    def test_private_method(self):
        instance = ExampleClass()
        result = instance._ExampleClass__private_method(3)
        self.assertEqual(result, 9)

    def test_str_method(self):
        instance = ExampleClass()
        result = instance.__str__()
        self.assertEqual(result, "ExampleClass")

    def test_repr_method(self):
        instance = ExampleClass()
        result = instance.__repr__()
        self.assertEqual(result, "ExampleClass(1)")

class TestExampleFunction(unittest.TestCase):
    def test_example_function(self):
        result = add(3)
        self.assertEqual(result, 2)

class TestGetStatementOfPosition(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = parse_source("def func():\n    x = 1\n    y = 2\n    return x + y").root_node().children[0]
        pos = 18
        result = get_statement_of_position(node, pos)
        self.assertEqual(result.type, "funcdef")

class TestParseSource(unittest.TestCase):
    def test_parse_source(self):
        source = "def func():\n    x = 1\n    y = 2\n    return x + y"
        result = parse_source(source)
        self.assertEqual(result.type, "module")

class TestGetScriptCompletions(unittest.TestCase):
    def test_get_script_completions(self):
        source = "import math\nmath.s"
        row = 2
        column = 5
        filename = "example.py"
        completions = get_script_completions(source, row, column, filename)
        self.assertIn("sin", completions)

class TestGetInterpreterCompletions(unittest.TestCase):
    def test_get_interpreter_completions(self):
        source = "import math\nmath.s"
        namespaces = [locals()]
        completions = get_interpreter_completions(source, namespaces)
        self.assertIn("sin", completions)

class TestGetDefinitions(unittest.TestCase):
    def test_get_definitions(self):
        source = "def func():\n    x = 1\n    y = 2\n    return x + y"
        row = 2
        column = 5
        filename = "example.py"
        definitions = get_definitions(source, row, column, filename)
        self.assertEqual(definitions[0].type, "function")

if __name__ == '__main__':
    unittest.main()