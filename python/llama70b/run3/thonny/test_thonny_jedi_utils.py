import unittest
from thonny.jedi_utils import *


class TestThonnyCompletion(unittest.TestCase):
    def test_init(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(completion.name, "name")
        self.assertEqual(completion.complete, "complete")
        self.assertEqual(completion.type, "type")
        self.assertEqual(completion.description, "description")
        self.assertEqual(completion.parent, "parent")
        self.assertEqual(completion.full_name, "full_name")

    def test_getitem(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(completion["name"], "name")
        self.assertEqual(completion["complete"], "complete")
        self.assertEqual(completion["type"], "type")
        self.assertEqual(completion["description"], "description")
        self.assertEqual(completion["parent"], "parent")
        self.assertEqual(completion["full_name"], "full_name")

    def test_str(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(str(completion), "ThonnyCompletion(name, complete, type, description, parent, full_name)")

    def test_repr(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(repr(completion), "ThonnyCompletion(name, complete, type, description, parent, full_name)")

    def test_eq(self):
        completion1 = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        completion2 = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(completion1, completion2)

class TestGetStatementOfPosition(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = parse_source("def foo(): pass")
        pos = (1, 0)
        result = get_statement_of_position(node, pos)
        self.assertIsNotNone(result)

    def test_copy_of_get_statement_of_position(self):
        node = parse_source("def foo(): pass")
        pos = (1, 0)
        result = _copy_of_get_statement_of_position(node, pos)
        self.assertIsNotNone(result)

class TestParseSource(unittest.TestCase):
    def test_parse_source(self):
        source = "def foo(): pass"
        result = parse_source(source)
        self.assertIsNotNone(result)

class TestGetScriptCompletions(unittest.TestCase):
    def test_get_script_completions(self):
        source = "def foo(): pass"
        row = 1
        column = 0
        filename = "test.py"
        result = get_script_completions(source, row, column, filename)
        self.assertIsNotNone(result)

class TestGetInterpreterCompletions(unittest.TestCase):
    def test_get_interpreter_completions(self):
        source = "def foo(): pass"
        namespaces = [{"name": "foo", "value": "bar"}]
        result = get_interpreter_completions(source, namespaces)
        self.assertIsNotNone(result)

class TestGetDefinitions(unittest.TestCase):
    def test_get_definitions(self):
        source = "def foo(): pass"
        row = 1
        column = 0
        filename = "test.py"
        result = get_definitions(source, row, column, filename)
        self.assertIsNotNone(result)

class TestUsingOlderJedi(unittest.TestCase):
    def test_using_older_jedi(self):
        import jedi
        result = _using_older_jedi(jedi)
        self.assertIsInstance(result, bool)

class TestGetNewJediProject(unittest.TestCase):
    def test_get_new_jedi_project(self):
        sys_path = ["path/to/sys"]
        result = _get_new_jedi_project(sys_path)
        self.assertIsNotNone(result)

class TestTweakCompletions(unittest.TestCase):
    def test_tweak_completions(self):
        completions = [{"name": "foo", "complete": "bar", "type": "baz"}]
        result = _tweak_completions(completions)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()