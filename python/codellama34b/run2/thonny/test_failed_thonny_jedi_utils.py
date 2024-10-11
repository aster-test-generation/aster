import full_name
import parent
import description
import complete
import name
import namespaces
import _tweak_completions
import _get_new_jedi_project
import sys_path
import filename
import column
import row
import _using_older_jedi
import source
import pos
import node
import _copy_of_get_statement_of_position
import unittest
from thonny.jedi_utils import *

class TestJediUtils(unittest.TestCase):
    def test_get_statement_of_position(self):
        import jedi.parser_utils
        func = getattr(
            jedi.parser_utils, "get_statement_of_position", _copy_of_get_statement_of_position
        )
        result = func(node, pos)
        self.assertEqual(result, None)

    def test_parse_source(self):
        import parso
        result = parse_source(source)
        self.assertEqual(result, None)

    def test_get_script_completions(self):
        import jedi
        if _using_older_jedi(jedi):
            try:
                script = jedi.Script(source, row, column, filename, sys_path=sys_path)
            except Exception as e:
                logger.info("Could not get completions with given sys_path", exc_info=e)
                script = jedi.Script(source, row, column, filename)
            completions = script.completions()
        else:
            script = jedi.Script(code=source, path=filename, project=_get_new_jedi_project(sys_path))
            completions = script.complete(line=row, column=column)
        result = _tweak_completions(completions)
        self.assertEqual(result, None)

    def test_get_interpreter_completions(self):
        import jedi
        if _using_older_jedi(jedi):
            try:
                interpreter = jedi.Interpreter(source, namespaces, sys_path=sys_path)
            except Exception as e:
                logger.info("Could not get completions with given sys_path", exc_info=e)
                interpreter = jedi.Interpreter(source, namespaces)
        else:
            interpreter = jedi.Interpreter(source, namespaces)
        if hasattr(interpreter, "completions"):
            completions = interpreter.completions()
        else:
            completions = interpreter.complete()
        result = _tweak_completions(completions)
        self.assertEqual(result, None)

    def test_get_definitions(self):
        import jedi
        if _using_older_jedi(jedi):
            script = jedi.Script(source, row, column, filename)
            result = script.goto_definitions()
        else:
            script = jedi.Script(code=source, path=filename)
            result = script.infer(line=row, column=column)
        self.assertEqual(result, None)

    def test_using_older_jedi(self):
        import jedi
        result = _using_older_jedi(jedi)
        self.assertEqual(result, None)

    def test_ThonnyCompletion(self):
        result = ThonnyCompletion(name, complete, type, description, parent, full_name)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()