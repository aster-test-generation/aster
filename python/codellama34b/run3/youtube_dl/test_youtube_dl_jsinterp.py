import unittest
from youtube_dl.jsinterp import *


class TestJSInterpreter(unittest.TestCase):
    def test_interpret_statement(self):
        code = "var x = 1; var y = 2; var z = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        result = instance.interpret_statement("var x = 1;", {}, 100)
        self.assertEqual(result, (1, False))

    def test_interpret_expression(self):
        code = "var x = 1; var y = 2; var z = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        result = instance.interpret_expression("x", {}, 100)
        self.assertEqual(result, 1)

    def test_extract_object(self):
        code = "var x = 1; var y = 2; var z = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        result = instance.extract_object("x")
        self.assertEqual(result, {})

    def test_extract_function(self):
        code = "var x = 1; var y = 2; var z = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        result = instance.extract_function("x")
        self.assertEqual(result, None)

    def test_call_function(self):
        code = "var x = 1; var y = 2; var z = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        result = instance.call_function("x", 1)
        self.assertEqual(result, None)

    def test_build_function(self):
        code = "var x = 1; var y = 2; var z = 3;"
        objects = {}
        instance = JSInterpreter(code, objects)
        result = instance.build_function("x", "y")
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()