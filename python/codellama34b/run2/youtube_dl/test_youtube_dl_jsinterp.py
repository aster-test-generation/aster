import unittest
from youtube_dl.jsinterp import *


class TestJSInterpreter(unittest.TestCase):
    def test_interpret_statement(self):
        code = "var x = 10; var y = 20; var z = x + y;"
        interpreter = JSInterpreter(code)
        result, should_abort = interpreter.interpret_statement(code, {})
        self.assertEqual(result, 30)
        self.assertFalse(should_abort)

    def test_interpret_expression(self):
        code = "var x = 10; var y = 20; var z = x + y;"
        interpreter = JSInterpreter(code)
        result = interpreter.interpret_expression(code, {}, allow_recursion=True)
        self.assertEqual(result, 30)

    def test_extract_object(self):
        code = "var x = 10; var y = 20; var z = x + y;"
        interpreter = JSInterpreter(code)
        result = interpreter.extract_object(code)
        self.assertEqual(result, {})

    def test_extract_function(self):
        code = "var x = 10; var y = 20; var z = x + y;"
        interpreter = JSInterpreter(code)
        result = interpreter.extract_function(code)
        self.assertEqual(result, None)

    def test_call_function(self):
        code = "var x = 10; var y = 20; var z = x + y;"
        interpreter = JSInterpreter(code)
        result = interpreter.call_function(code, x=10, y=20)
        self.assertEqual(result, None)

    def test_build_function(self):
        code = "var x = 10; var y = 20; var z = x + y;"
        interpreter = JSInterpreter(code)
        result = interpreter.build_function(code, 'test')
        self.assertEqual(result, None)

class TestJSInterpreter(unittest.TestCase):
    def test_interpret_statement(self):
        code = "var a = 1; var b = 2; var c = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        stmt = "var d = 4;"
        local_vars = {}
        allow_recursion = 100
        result, should_abort = instance.interpret_statement(stmt, local_vars, allow_recursion)
        self.assertEqual(result, 4)
        self.assertEqual(should_abort, False)

    def test_interpret_expression(self):
        code = "var a = 1; var b = 2; var c = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        expr = "a + b"
        local_vars = {}
        allow_recursion = 100
        result = instance.interpret_expression(expr, local_vars, allow_recursion)
        self.assertEqual(result, 3)

    def test_extract_object(self):
        code = "var a = 1; var b = 2; var c = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        objname = "a"
        result = instance.extract_object(objname)
        self.assertEqual(result, {})

    def test_extract_function(self):
        code = "var a = 1; var b = 2; var c = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        funcname = "a"
        result = instance.extract_function(funcname)
        self.assertEqual(result, None)

    def test_call_function(self):
        code = "var a = 1; var b = 2; var c = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        funcname = "a"
        args = []
        result = instance.call_function(funcname, *args)
        self.assertEqual(result, None)

    def test_build_function(self):
        code = "var a = 1; var b = 2; var c = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        argnames = []
        code = ""
        result = instance.build_function(argnames, code)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()