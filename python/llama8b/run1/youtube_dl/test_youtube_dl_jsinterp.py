import unittest
from youtube_dl.jsinterp import JSInterpreter


class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        code = "var x = 1; var y = 2;"
        interpreter = JSInterpreter(code)
        self.assertEqual(interpreter._objects, {})

    def test_interpret_statement(self):
        code = "var x = 1;"
        interpreter = JSInterpreter(code)
        result, _ = interpreter.interpret_statement(code, {}, 100)
        self.assertEqual(result, 1)

    def test_interpret_expression(self):
        code = "1 + 2"
        interpreter = JSInterpreter(code)
        result = interpreter.interpret_expression(code, {}, 100)
        self.assertEqual(result, 3)

    def test_assign_operator(self):
        code = "x = 1"
        interpreter = JSInterpreter(code)
        result = interpreter.interpret_expression(code, {"x": None}, 100)
        self.assertEqual(result, 1)

    def test_function_call(self):
        code = "function add(x, y) { return x + y; } add(1, 2)"
        interpreter = JSInterpreter(code)
        result = interpreter.interpret_expression(code, {}, 100)
        self.assertEqual(result, 3)

    def test_object_extraction(self):
        code = "var obj = {a: function() { return 1; }}; obj.a()"
        interpreter = JSInterpreter(code)
        result = interpreter.interpret_expression(code, {}, 100)
        self.assertEqual(result, 1)

    def test_function_extraction(self):
        code = "function add(x, y) { return x + y; } add(1, 2)"
        interpreter = JSInterpreter(code)
        result = interpreter.interpret_expression(code, {}, 100)
        self.assertEqual(result, 3)

    def test_call_function(self):
        code = "function add(x, y) { return x + y; }"
        interpreter = JSInterpreter(code)
        result = interpreter.call_function("add", 1, 2)
        self.assertEqual(result, 3)

    def test_extract_object(self):
        code = "var obj = {a: function() { return 1; }}; obj.a()"
        interpreter = JSInterpreter(code)
        result = interpreter.extract_object("obj")
        self.assertEqual(result, {"a": lambda: 1})

    def test_extract_function(self):
        code = "function add(x, y) { return x + y; }"
        interpreter = JSInterpreter(code)
        result = interpreter.extract_function("add")
        self.assertEqual(result(1, 2), 3)

    def test_build_function(self):
        code = "function add(x, y) { return x + y; }"
        interpreter = JSInterpreter(code)
        result = interpreter.build_function(["x", "y"], code)
        self.assertEqual(result(1, 2), 3)

if __name__ == '__main__':
    unittest.main()