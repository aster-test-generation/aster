import unittest
from youtube_dl.jsinterp import JSInterpreter

class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter("var x = 1;")
        self.assertEqual(interpreter._objects, {})

    def test_interpret_statement(self):
        interpreter = JSInterpreter("var x = 1;")
        result, _ = interpreter.interpret_statement("x = 2;", {}, allow_recursion=100)
        self.assertEqual(result, 2)

    def test_interpret_expression(self):
        interpreter = JSInterpreter("var x = 1;")
        result = interpreter.interpret_expression("x", {}, allow_recursion=100)
        self.assertEqual(result, 1)

    def test_extract_object(self):
        interpreter = JSInterpreter("var obj = {a: function() { return 1; }};")
        obj = interpreter.extract_object("obj")
        self.assertEqual(obj["a"](), 1)

    def test_extract_function(self):
        interpreter = JSInterpreter("function f(x) { return x; }")
        func = interpreter.extract_function("f")
        self.assertEqual(func(1), 1)

    def test_call_function(self):
        interpreter = JSInterpreter("function f(x) { return x; }")
        result = interpreter.call_function("f", 1)
        self.assertEqual(result, 1)

    def test_build_function(self):
        interpreter = JSInterpreter("")
        func = interpreter.build_function(["x"], "return x;")
        self.assertEqual(func(1), 1)

    def test_private_methods(self):
        interpreter = JSInterpreter("")
        with self.assertRaises(AttributeError):
            interpreter.__private_method()

    def test_protected_methods(self):
        interpreter = JSInterpreter("")
        with self.assertRaises(AttributeError):
            interpreter._JSInterpreter__protected_method()

    def test_magic_methods(self):
        interpreter = JSInterpreter("")
        self.assertEqual(str(interpreter), "<youtube_dl.jsinterp.JSInterpreter object at 0x...>")
        self.assertEqual(repr(interpreter), "<youtube_dl.jsinterp.JSInterpreter object at 0x...>")

if __name__ == '__main__':
    unittest.main()