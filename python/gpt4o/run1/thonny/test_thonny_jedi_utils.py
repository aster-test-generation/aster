import unittest
from thonny.jedi_utils import *


class TestThonnyJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = MockNode()
        pos = (1, 1)
        result = get_statement_of_position(node, pos)
        self.assertIsNone(result)

    def test_copy_of_get_statement_of_position(self):
        node = MockNode()
        pos = (1, 1)
        result = _copy_of_get_statement_of_position(node, pos)
        self.assertIsNone(result)

    def test_parse_source(self):
        source = "def foo(): pass"
        result = parse_source(source)
        self.assertIsNotNone(result)

    def test_get_script_completions(self):
        source = "import os"
        row, column, filename = 1, 1, "test.py"
        result = get_script_completions(source, row, column, filename)
        self.assertIsInstance(result, list)

    def test_get_interpreter_completions(self):
        source = "import os"
        namespaces = [{}]
        result = get_interpreter_completions(source, namespaces)
        self.assertIsInstance(result, list)

    def test_get_new_jedi_project(self):
        sys_path = ["/path/to/project"]
        result = _get_new_jedi_project(sys_path)
        self.assertIsNotNone(result)

    def test_tweak_completions(self):
        completions = [MockCompletion()]
        result = _tweak_completions(completions)
        self.assertIsInstance(result, list)

    def test_get_definitions(self):
        source = "import os"
        row, column, filename = 1, 1, "test.py"
        result = get_definitions(source, row, column, filename)
        self.assertIsInstance(result, list)

    def test_using_older_jedi(self):
        import jedi
        result = _using_older_jedi(jedi)
        self.assertIsInstance(result, bool)

class TestThonnyCompletion(unittest.TestCase):
    def test_init(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(completion.name, "name")

    def test_getitem(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        result = completion["name"]
        self.assertEqual(result, "name")

class MockNode:
    def __init__(self):
        self.children = []
        self.start_pos = (0, 0)
        self.end_pos = (0, 0)

class MockCompletion:
    def __init__(self):
        self.name = "name"
        self.complete = "complete"
        self.type = "type"
        self.description = "description"
        self.parent = "parent"
        self.full_name = "full_name"

if __name__ == '__main__':
    unittest.main()