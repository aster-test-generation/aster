from thonny.jedi_utils import _using_older_jedi
import unittest
from thonny.jedi_utils import *


class TestGetStatementOfPosition(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = None
        pos = None
        result = get_statement_of_position(node, pos)
        self.assertEqual(result, None)

class TestParseSource(unittest.TestCase):
    def test_parse_source(self):
        source = None
        result = parse_source(source)
        self.assertEqual(result, None)

class TestGetScriptCompletions(unittest.TestCase):
    def test_get_script_completions(self):
        source = None
        row = None
        column = None
        filename = None
        sys_path = None
        result = get_script_completions(source, row, column, filename, sys_path)
        self.assertEqual(result, None)

class TestGetInterpreterCompletions(unittest.TestCase):
    def test_get_interpreter_completions(self):
        source = None
        namespaces = None
        sys_path = None
        result = get_interpreter_completions(source, namespaces, sys_path)
        self.assertEqual(result, None)

class TestGetDefinitions(unittest.TestCase):
    def test_get_definitions(self):
        source = None
        row = None
        column = None
        filename = None
        result = get_definitions(source, row, column, filename)
        self.assertEqual(result, None)

class TestUsingOlderJedi(unittest.TestCase):
    def test_using_older_jedi(self):
        jedi = None
        result = _using_older_jedi(jedi)
        self.assertEqual(result, None)

class TestThonnyCompletion(unittest.TestCase):
    def test_thonny_completion(self):
        name = None
        complete = None
        type = None
        description = None
        parent = None
        full_name = None
        result = ThonnyCompletion(name, complete, type, description, parent, full_name)
        self.assertEqual(result, None)

class TestThonnyCompletion(unittest.TestCase):
    def test_init(self):
        instance = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(instance.name, "name")
        self.assertEqual(instance.complete, "complete")
        self.assertEqual(instance.type, "type")
        self.assertEqual(instance.description, "description")
        self.assertEqual(instance.parent, "parent")
        self.assertEqual(instance.full_name, "full_name")

    def test_getitem(self):
        instance = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        result = instance["name"]
        self.assertEqual(result, "name")

class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        result = get_statement_of_position("node", "pos")
        self.assertEqual(result, None)

    def test_parse_source(self):
        result = parse_source("source")
        self.assertEqual(result, None)

    def test_get_script_completions(self):
        result = get_script_completions("source", "row", "column", "filename", "sys_path")
        self.assertEqual(result, None)

    def test_get_interpreter_completions(self):
        result = get_interpreter_completions("source", "namespaces", "sys_path")
        self.assertEqual(result, None)

    def test_get_definitions(self):
        result = get_definitions("source", "row", "column", "filename")
        self.assertEqual(result, None)

    def test__get_new_jedi_project(self):
        result = _get_new_jedi_project("sys_path")
        self.assertEqual(result, None)

    def test__tweak_completions(self):
        result = _tweak_completions("completions")
        self.assertEqual(result, None)

    def test__using_older_jedi(self):
        result = _using_older_jedi("jedi")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()