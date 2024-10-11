import unittest
from thonny.jedi_utils import *
from unittest.mock import patch, MagicMock


class TestThonnyJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = unittest.mock.Mock()
        pos = (1, 1)
        result = get_statement_of_position(node, pos)
        self.assertIsNotNone(result)

    def test__copy_of_get_statement_of_position(self):
        from parso.python import tree
        node = unittest.mock.Mock()
        node.children = [unittest.mock.Mock(start_pos=(0, 0), end_pos=(2, 2), type="simple_stmt")]
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

    def test__get_new_jedi_project(self):
        sys_path = ["path/to/project"]
        result = _get_new_jedi_project(sys_path)
        self.assertIsNotNone(result)

    def test__tweak_completions(self):
        completion = unittest.mock.Mock(name="name", complete="complete", type="type", description="description", parent="parent", full_name="full_name")
        completions = [completion]
        result = _tweak_completions(completions)
        self.assertIsInstance(result, list)

    def test_get_definitions(self):
        source = "def foo(): pass"
        row, column, filename = 1, 1, "test.py"
        result = get_definitions(source, row, column, filename)
        self.assertIsInstance(result, list)

    def test__using_older_jedi(self):
        jedi = unittest.mock.Mock(__version__="0.13.0")
        result = _using_older_jedi(jedi)
        self.assertTrue(result)

class TestThonnyCompletion(unittest.TestCase):
    def test_init(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        self.assertEqual(completion.name, "name")

    def test_getitem(self):
        completion = ThonnyCompletion("name", "complete", "type", "description", "parent", "full_name")
        result = completion["name"]
        self.assertEqual(result, "name")

class TestThonnyJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        node = MagicMock()
        pos = (1, 1)
        with patch('thonny.jedi_utils.jedi.parser_utils.get_statement_of_position', return_value='statement') as mock_func:
            result = get_statement_of_position(node, pos)
            self.assertEqual(result, 'statement')
            mock_func.assert_called_once_with(node, pos)

    def test__copy_of_get_statement_of_position(self):
        from parso.python import tree
        node = MagicMock()
        node.children = [MagicMock(start_pos=(0, 0), end_pos=(2, 2), type='simple_stmt')]
        pos = (1, 1)
        result = _copy_of_get_statement_of_position(node, pos)
        self.assertEqual(result, node.children[0])

    def test_parse_source(self):
        source = "def foo(): pass"
        with patch('thonny.jedi_utils.parso.parse', return_value='parsed_source') as mock_parse:
            result = parse_source(source)
            self.assertEqual(result, 'parsed_source')
            mock_parse.assert_called_once_with(source)

    def test_get_script_completions(self):
        source = "import os"
        row, column, filename = 1, 1, "test.py"
        with patch('thonny.jedi_utils.jedi.Script') as mock_script, \
             patch('thonny.jedi_utils._using_older_jedi', return_value=True), \
             patch('thonny.jedi_utils._tweak_completions', return_value='tweaked_completions'):
            mock_script.return_value.completions.return_value = 'completions'
            result = get_script_completions(source, row, column, filename)
            self.assertEqual(result, 'tweaked_completions')

    def test_get_interpreter_completions(self):
        source = "import os"
        namespaces = [{}]
        with patch('thonny.jedi_utils.jedi.Interpreter') as mock_interpreter, \
             patch('thonny.jedi_utils._using_older_jedi', return_value=True), \
             patch('thonny.jedi_utils._tweak_completions', return_value='tweaked_completions'):
            mock_interpreter.return_value.completions.return_value = 'completions'
            result = get_interpreter_completions(source, namespaces)
            self.assertEqual(result, 'tweaked_completions')

    def test__get_new_jedi_project(self):
        sys_path = ["/path/to/lib"]
        with patch('thonny.jedi_utils.jedi.Project', return_value='project') as mock_project:
            result = _get_new_jedi_project(sys_path)
            self.assertEqual(result, 'project')
            mock_project.assert_called_once_with(path=sys_path[0], added_sys_path=sys_path)

    def test__tweak_completions(self):
        completion = MagicMock()
        completion.name = "name"
        completion.complete = "complete"
        completion.type = "type"
        completion.description = "description"
        completion.parent = "parent"
        completion.full_name = "full_name"
        completions = [completion]
        result = _tweak_completions(completions)
        self.assertEqual(len(result), 1)
        self.assertEqual(result[0].name, "name")

    def test_get_definitions(self):
        source = "import os"
        row, column, filename = 1, 1, "test.py"
        with patch('thonny.jedi_utils.jedi.Script') as mock_script, \
             patch('thonny.jedi_utils._using_older_jedi', return_value=True):
            mock_script.return_value.goto_definitions.return_value = 'definitions'
            result = get_definitions(source, row, column, filename)
            self.assertEqual(result, 'definitions')

    def test__using_older_jedi(self):
        jedi = MagicMock()
        jedi.__version__ = "0.15.2"
        result = _using_older_jedi(jedi)
        self.assertTrue(result)

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

if __name__ == '__main__':
    unittest.main()