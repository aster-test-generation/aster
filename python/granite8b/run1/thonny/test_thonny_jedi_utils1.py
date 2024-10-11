import unittest
from thonny.jedi_utils import *

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