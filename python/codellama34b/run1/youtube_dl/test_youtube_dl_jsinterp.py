import unittest
from youtube_dl.jsinterp import *


class TestJSInterpreter(unittest.TestCase):
    def test_interpret_statement(self):
        code = "var x = 1; var y = 2; x = y + 1;"
        objects = {}
        instance = JSInterpreter(code, objects)
        stmt = "var x = 1; var y = 2; x = y + 1;"
        local_vars = {}
        allow_recursion = 100
        result, should_abort = instance.interpret_statement(stmt, local_vars, allow_recursion)
        self.assertEqual(result, 3)
        self.assertEqual(should_abort, False)

    def test_interpret_expression(self):
        code = "var x = 1; var y = 2; x = y + 1;"
        objects = {}
        instance = JSInterpreter(code, objects)
        expr = "x = y + 1"
        local_vars = {}
        allow_recursion = 100
        result = instance.interpret_expression(expr, local_vars, allow_recursion)
        self.assertEqual(result, 3)

    def test_extract_object(self):
        code = "var x = 1; var y = 2; x = y + 1;"
        objects = {}
        instance = JSInterpreter(code, objects)
        objname = "x"
        result = instance.extract_object(objname)
        self.assertEqual(result, 1)

    def test_extract_function(self):
        code = "var x = 1; var y = 2; x = y + 1;"
        objects = {}
        instance = JSInterpreter(code, objects)
        funcname = "x"
        result = instance.extract_function(funcname)
        self.assertEqual(result, 1)

    def test_call_function(self):
        code = "var x = 1; var y = 2; x = y + 1;"
        objects = {}
        instance = JSInterpreter(code, objects)
        funcname = "x"
        result = instance.call_function(funcname)
        self.assertEqual(result, 1)

    def test_build_function(self):
        code = "var x = 1; var y = 2; x = y + 1;"
        objects = {}
        instance = JSInterpreter(code, objects)
        argnames = "x"
        code = "var x = 1; var y = 2; x = y + 1;"
        result = instance.build_function(argnames, code)
        self.assertEqual(result, 1)

class TestJSInterpreter(unittest.TestCase):
    def test_interpret_statement(self):
        code = ''
        objects = {}
        instance = JSInterpreter(code, objects)
        stmt = ''
        local_vars = {}
        allow_recursion = 100
        v, should_abort = instance.interpret_statement(stmt, local_vars, allow_recursion)
        self.assertEqual(v, None)
        self.assertEqual(should_abort, False)

    def test_interpret_expression(self):
        code = ''
        objects = {}
        instance = JSInterpreter(code, objects)
        expr = ''
        local_vars = {}
        allow_recursion = 100
        v = instance.interpret_expression(expr, local_vars, allow_recursion)
        self.assertEqual(v, None)

    def test_extract_object(self):
        code = ''
        objects = {}
        instance = JSInterpreter(code, objects)
        objname = ''
        v = instance.extract_object(objname)
        self.assertEqual(v, {})

    def test_extract_function(self):
        code = ''
        objects = {}
        instance = JSInterpreter(code, objects)
        funcname = ''
        v = instance.extract_function(funcname)
        self.assertEqual(v, None)

    def test_call_function(self):
        code = ''
        objects = {}
        instance = JSInterpreter(code, objects)
        funcname = ''
        args = ()
        v = instance.call_function(funcname, *args)
        self.assertEqual(v, None)

    def test_build_function(self):
        code = ''
        objects = {}
        instance = JSInterpreter(code, objects)
        argnames = []
        code = ''
        v = instance.build_function(argnames, code)
        self.assertEqual(v, None)

if __name__ == '__main__':
    unittest.main()