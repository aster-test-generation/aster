import unittest
from thonny.jedi_utils import get_statement_of_position, parse_source, get_script_completions, get_interpreter_completions, get_definitions, _get_new_jedi_project, _tweak_completions, _using_older_jedi, ThonnyCompletion
from thonny.jedi_utils import _copy_of_get_statement_of_position
from unittest.mock import patch
import logging
import parso
import jedi  # This line is not necessary for a test case
import typing


class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = parso.tree.parse("def foo(): pass")
        pos = 10
        result = get_statement_of_position(node, pos)
        self.assertIsNotNone(result)

    def test_parse_source(self):
        source = "def foo(): pass"
        result = parse_source(source)
        self.assertIsNotNone(result)

    def test_get_script_completions(self):
        source = "def foo(): pass"
        row = 1
        column = 1
        filename = "test.py"
        result = get_script_completions(source, row, column, filename)
        self.assertIsNotNone(result)

    def test_get_interpreter_completions(self):
        source = "def foo(): pass"
        namespaces = [{"name": "foo"}]
        result = get_interpreter_completions(source, namespaces)
        self.assertIsNotNone(result)

    def test_get_definitions(self):
        source = "def foo(): pass"
        row = 1
        column = 1
        filename = "test.py"
        result = get_definitions(source, row, column, filename)
        self.assertIsNotNone(result)

    def test_get_new_jedi_project(self):
        sys_path = ["path/to/project"]
        result = _get_new_jedi_project(sys_path)
        self.assertIsNotNone(result)

    def test_tweak_completions(self):
        completions = [{"name": "foo"}]
        result = _tweak_completions(completions)
        self.assertIsNotNone(result)

    def test_using_older_jedi(self):
        result = _using_older_jedi(jedi)
        self.assertTrue(result)

    def test_thonny_completion(self):
        completion = ThonnyCompletion("foo", "bar", "type", "description", "parent", "full_name")
        self.assertEqual(completion.name, "foo")
        self.assertEqual(completion.complete, "bar")
        self.assertEqual(completion.type, "type")
        self.assertEqual(completion.description, "description")
        self.assertEqual(completion.parent, "parent")
        self.assertEqual(completion.full_name, "full_name")

    @patch('thonny.jedi_utils.logger')
    def test_get_script_completions_with_error(self, mock_logger):
        source = "def foo(): pass"
        row = 1
        column = 1
        filename = "test.py"
        mock_logger.info("Could not get completions with given sys_path")
        result = get_script_completions(source, row, column, filename, sys_path=["path/to/project"])
        self.assertIsNotNone(result)

    @patch('thonny.jedi_utils.jedi')
    def test_get_interpreter_completions_with_error(self, mock_jedi):
        source = "def foo(): pass"
        namespaces = [{"name": "foo"}]
        mock_jedi.__version__ = "0.12"
        result = get_interpreter_completions(source, namespaces)
        self.assertIsNotNone(result)

    @patch('thonny.jedi_utils.jedi')
    def test_get_definitions_with_error(self, mock_jedi):
        source = "def foo(): pass"
        row = 1
        column = 1
        filename = "test.py"
        mock_jedi.__version__ = "0.12"
        result = get_definitions(source, row, column, filename)
        self.assertIsNotNone(result)

if __name__ == '__main__':
    unittest.main()