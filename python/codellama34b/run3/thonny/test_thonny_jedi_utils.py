import unittest
from thonny.jedi_utils import *


class TestThonnyCompletion(unittest.TestCase):
    def test_init(self):
        result = ThonnyCompletion(name="name", complete="complete", type="type", description="description", parent="parent", full_name="full_name")
        self.assertEqual(result.name, "name")
        self.assertEqual(result.complete, "complete")
        self.assertEqual(result.type, "type")
        self.assertEqual(result.description, "description")
        self.assertEqual(result.parent, "parent")
        self.assertEqual(result.full_name, "full_name")

    def test_getitem(self):
        result = ThonnyCompletion(name="name", complete="complete", type="type", description="description", parent="parent", full_name="full_name")
        self.assertEqual(result["name"], "name")
        self.assertEqual(result["complete"], "complete")
        self.assertEqual(result["type"], "type")
        self.assertEqual(result["description"], "description")
        self.assertEqual(result["parent"], "parent")
        self.assertEqual(result["full_name"], "full_name")

class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        result = get_statement_of_position(node="node", pos="pos")
        self.assertEqual(result, None)

    def test_parse_source(self):
        result = parse_source(source="source")
        self.assertEqual(result, None)

    def test_get_script_completions(self):
        result = get_script_completions(source="source", row=1, column=1, filename="filename", sys_path=None)
        self.assertEqual(result, None)

    def test_get_interpreter_completions(self):
        result = get_interpreter_completions(source="source", namespaces=None, sys_path=None)
        self.assertEqual(result, None)

    def test_get_definitions(self):
        result = get_definitions(source="source", row=1, column=1, filename="filename")
        self.assertEqual(result, None)

    def test__get_new_jedi_project(self):
        result = _get_new_jedi_project(sys_path=None)
        self.assertEqual(result, None)

    def test__tweak_completions(self):
        result = _tweak_completions(completions=None)
        self.assertEqual(result, None)

    def test__using_older_jedi(self):
        result = _using_older_jedi(jedi=None)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()