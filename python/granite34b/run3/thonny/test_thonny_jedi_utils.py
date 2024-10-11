import math
import unittest
from thonny.jedi_utils import *


class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        # Test case 1
        node = parse_source("def func():\n    pass")
        pos = (1, 4)
        result = get_statement_of_position(node, pos)
        self.assertEqual(result.type, "funcdef")
        # Test case 2
        node = parse_source("if True:\n    pass")
        pos = (1, 4)
        result = get_statement_of_position(node, pos)
        self.assertEqual(result.type, "if_stmt")

    def test_parse_source(self):
        # Test case 1
        source = "def func():\n    pass"
        result = parse_source(source)
        self.assertEqual(result.type, "file_input")
        # Test case 2
        source = "if True:\n    pass"
        result = parse_source(source)
        self.assertEqual(result.type, "file_input")

    def test_get_script_completions(self):
        # Test case 1
        source = "import math\nmath."
        row = 2
        column = 6
        filename = "test.py"
        sys_path = None
        result = get_script_completions(source, row, column, filename, sys_path)
        self.assertTrue(len(result) > 0)
        # Test case 2
        source = "import math\nmath."
        row = 2
        column = 6
        filename = "test.py"
        sys_path = ["path/to/some/library"]
        result = get_script_completions(source, row, column, filename, sys_path)
        self.assertTrue(len(result) > 0)

    def test_get_interpreter_completions(self):
        # Test case 1
        source = "import math\nmath."
        namespaces = [math]
        sys_path = None
        result = get_interpreter_completions(source, namespaces, sys_path)
        self.assertTrue(len(result) > 0)
        # Test case 2
        source = "import math\nmath."
        namespaces = [math]
        sys_path = ["path/to/some/library"]
        result = get_interpreter_completions(source, namespaces, sys_path)
        self.assertTrue(len(result) > 0)

    def test_get_definitions(self):
        # Test case 1
        source = "def func():\n    pass\nfunc()"
        row = 3
        column = 5
        filename = "test.py"
        result = get_definitions(source, row, column, filename)
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].type, "function")
        # Test case 2
        source = "class MyClass:\n    def method(self):\n        pass\nMyClass().method()"
        row = 3
        column = 17
        filename = "test.py"
        result = get_definitions(source, row, column, filename)
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].type, "function")

if __name__ == '__main__':
    unittest.main()