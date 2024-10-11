import unittest
from thonny.jedi_utils import get_statement_of_position, parse_source, get_script_completions, get_interpreter_completions, get_definitions, _copy_of_get_statement_of_position, _get_new_jedi_project, _tweak_completions, _using_older_jedi, ThonnyCompletion
from unittest.mock import patch
import logging
import parso
import jedi  # This line should be commented out or remove


class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = parso.parse('a = 1')
        pos = 3
        result = get_statement_of_position(node, pos)
        self.assertIsNotNone(result)

    def test_parse_source(self):
        source = 'a = 1'
        result = parse_source(source)
        self.assertIsNotNone(result)

    def test_get_script_completions(self):
        source = 'a = 1'
        row = 1
        column = 1
        filename = 'test.py'
        result = get_script_completions(source, row, column, filename)
        self.assertIsNotNone(result)

    def test_get_interpreter_completions(self):
        source = 'a = 1'
        namespaces = [{'name': 'a', 'type': 'variable'}]
        result = get_interpreter_completions(source, namespaces)
        self.assertIsNotNone(result)

    def test_get_definitions(self):
        source = 'a = 1'
        row = 1
        column = 1
        filename = 'test.py'
        result = get_definitions(source, row, column, filename)
        self.assertIsNotNone(result)

    @patch('thonny.jedi_utils.jedi.parser_utils.get_statement_of_position')
    def test_get_statement_of_position_patch(self, mock_get_statement_of_position):
        node = parso.parse('a = 1')
        pos = 3
        mock_get_statement_of_position.return_value = 'statement'
        result = get_statement_of_position(node, pos)
        self.assertEqual(result, 'statement')

    @patch('thonny.jedi_utils.jedi.parser_utils._copy_of_get_statement_of_position')
    def test_copy_of_get_statement_of_position_patch(self, mock_copy_of_get_statement_of_position):
        node = parso.parse('a = 1')
        pos = 3
        mock_copy_of_get_statement_of_position.return_value = 'statement'
        result = _copy_of_get_statement_of_position(node, pos)
        self.assertEqual(result, 'statement')

    @patch('thonny.jedi_utils.jedi.Project')
    def test_get_new_jedi_project_patch(self, mock_jedi_project):
        sys_path = ['path']
        result = _get_new_jedi_project(sys_path)
        self.assertEqual(result, mock_jedi_project.return_value)

    @patch('thonny.jedi_utils.jedi.Interpreter')
    def test_tweak_completions_patch(self, mock_jedi_interpreter):
        completions = ['completion1', 'completion2']
        result = _tweak_completions(completions)
        self.assertEqual(result, [ThonnyCompletion(name='completion1', complete='completion1', type=None, description=None, parent=None, full_name='completion1'), ThonnyCompletion(name='completion2', complete='completion2', type=None, description=None, parent=None, full_name='completion2')])

    @patch('thonny.jedi_utils.jedi.Script')
    def test_using_older_jedi_patch(self, mock_jedi_script):
        result = _using_older_jedi(jedi)
        self.assertTrue(result)

    def test_ThonnyCompletion(self):
        completion = ThonnyCompletion('name', 'complete', None, None, None, 'full_name')
        self.assertEqual(completion.name, 'name')
        self.assertEqual(completion.complete, 'complete')
        self.assertEqual(completion.type, None)
        self.assertEqual(completion.description, None)
        self.assertEqual(completion.parent, None)
        self.assertEqual(completion.full_name, 'full_name')

if __name__ == '__main__':
    unittest.main()