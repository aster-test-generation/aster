import unittest
from thonny.jedi_utils import get_statement_of_position, parse_source, get_script_completions, get_interpreter_completions, get_definitions, _get_new_jedi_project, _tweak_completions, _using_older_jedi, ThonnyCompletion
from unittest.mock import patch
import logging
import parso
import jedi  # This line should be commented out or remove
import typing


class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = parso.tree.ParseTree('def foo(): pass')
        pos = 5
        result = get_statement_of_position(node, pos)
        self.assertIsNotNone(result)

    def test_parse_source(self):
        source = 'def foo(): pass'
        result = parse_source(source)
        self.assertIsNotNone(result)

    @patch('jedi.parser_utils.get_statement_of_position')
    def test_get_script_completions(self, mock_get_statement_of_position):
        source = 'def foo(): pass'
        row = 1
        column = 1
        filename = 'test.py'
        script_completions = get_script_completions(source, row, column, filename)
        self.assertIsNotNone(script_completions)

    @patch('jedi.Interpreter.completions')
    def test_get_interpreter_completions(self, mock_completions):
        source = 'def foo(): pass'
        namespaces = [{'name': 'test'}]
        interpreter_completions = get_interpreter_completions(source, namespaces)
        self.assertIsNotNone(interpreter_completions)

    @patch('jedi.Script.goto_definitions')
    def test_get_definitions(self, mock_goto_definitions):
        source = 'def foo(): pass'
        row = 1
        column = 1
        filename = 'test.py'
        definitions = get_definitions(source, row, column, filename)
        self.assertIsNotNone(definitions)

    def test_get_new_jedi_project(self):
        sys_path = ['/path/to/project']
        project = _get_new_jedi_project(sys_path)
        self.assertIsNotNone(project)

    def test_tweak_completions(self):
        completions = [{'name': 'foo', 'complete': 'bar'}]
        result = _tweak_completions(completions)
        self.assertIsNotNone(result)

    def test_using_older_jedi(self):
        self.assertTrue(_using_older_jedi(jedi))

    def test_thonny_completion(self):
        completion = ThonnyCompletion('foo', 'bar', 'type', 'description', 'parent', 'full_name')
        self.assertEqual(completion.name, 'foo')
        self.assertEqual(completion.complete, 'bar')
        self.assertEqual(completion.type, 'type')
        self.assertEqual(completion.description, 'description')
        self.assertEqual(completion.parent, 'parent')
        self.assertEqual(completion.full_name, 'full_name')

if __name__ == '__main__':
    unittest.main()