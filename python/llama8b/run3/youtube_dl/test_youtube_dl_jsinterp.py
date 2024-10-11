import unittest
from youtube_dl.jsinterp import JSInterpreter


class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter("var a = 1;")
        self.assertEqual(interpreter._functions, {})
        self.assertEqual(interpreter._objects, {})

    def test_interpret_statement(self):
        interpreter = JSInterpreter("var a = 1;")
        result, _ = interpreter.interpret_statement("var a = 1;", {}, 100)
        self.assertEqual(result, 1)

    def test_interpret_expression(self):
        interpreter = JSInterpreter("var a = 1;")
        result = interpreter.interpret_expression("a", {}, 100)
        self.assertEqual(result, 1)

    def test_assign_operator(self):
        interpreter = JSInterpreter("var a = 1;")
        result = interpreter.interpret_expression("a = 2", {}, 100)
        self.assertEqual(result, 2)

    def test_function_call(self):
        interpreter = JSInterpreter("function add(a, b) { return a + b; }")
        result = interpreter.call_function("add", 1, 2)
        self.assertEqual(result, 3)

    def test_object_extraction(self):
        interpreter = JSInterpreter("var obj = { a: 1, b: 2 };")
        obj = interpreter.extract_object("obj")
        self.assertEqual(obj, {"a": 1, "b": 2})

    def test_function_extraction(self):
        interpreter = JSInterpreter("function add(a, b) { return a + b; }")
        func = interpreter.extract_function("add")
        self.assertEqual(func(1, 2), 3)

    def test_call_function(self):
        interpreter = JSInterpreter("function add(a, b) { return a + b; }")
        result = interpreter.call_function("add", 1, 2)
        self.assertEqual(result, 3)

    def test_extract_object(self):
        interpreter = JSInterpreter("var obj = { a: 1, b: 2 };")
        obj = interpreter.extract_object("obj")
        self.assertEqual(obj, {"a": 1, "b": 2})

    def test_extract_function(self):
        interpreter = JSInterpreter("function add(a, b) { return a + b; }")
        func = interpreter.extract_function("add")
        self.assertEqual(func(1, 2), 3)

    def test_build_function(self):
        interpreter = JSInterpreter("")
        func = interpreter.build_function(["a", "b"], "return a + b;")
        self.assertEqual(func(1, 2), 3)

    def test_call_build_function(self):
        interpreter = JSInterpreter("")
        func = interpreter.build_function(["a", "b"], "return a + b;")
        result = func(1, 2)
        self.assertEqual(result, 3)

class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter('var x = 5;')
        self.assertEqual(interpreter._objects, {})

    def test_interpret_statement(self):
        interpreter = JSInterpreter('var x = 5;')
        result, _ = interpreter.interpret_statement('x = 6;', {}, allow_recursion=100)
        self.assertEqual(result, 6)

    def test_interpret_expression(self):
        interpreter = JSInterpreter('var x = 5;')
        result = interpreter.interpret_expression('x', {}, allow_recursion=100)
        self.assertEqual(result, 5)

    def test_extract_object(self):
        interpreter = JSInterpreter('var obj = {a: function() {return 1;}};')
        obj = interpreter.extract_object('obj')
        self.assertEqual(obj['a'](), 1)

    def test_extract_function(self):
        interpreter = JSInterpreter('function add(x, y) {return x + y;}')
        func = interpreter.extract_function('add')
        self.assertEqual(func(1, 2), 3)

    def test_call_function(self):
        interpreter = JSInterpreter('function add(x, y) {return x + y;}')
        result = interpreter.call_function('add', 1, 2)
        self.assertEqual(result, 3)

    def test_build_function(self):
        interpreter = JSInterpreter('function add(x, y) {return x + y;}')
        func = interpreter.build_function(['x', 'y'], 'return x + y;')
        self.assertEqual(func(1, 2), 3)

    def test_private_method(self):
        interpreter = JSInterpreter('var x = 5;')
        result = interpreter._JSInterpreter__private_method(x)
        self.assertEqual(result, 5)

    def test_protected_method(self):
        interpreter = JSInterpreter('var x = 5;')
        result = interpreter._JSInterpreter__protected_method(x)
        self.assertEqual(result, 5)

    def test_str_method(self):
        interpreter = JSInterpreter('var x = 5;')
        result = str(interpreter)
        self.assertEqual(result, '<youtube_dl.jsinterp.JSInterpreter object at ...>')

    def test_repr_method(self):
        interpreter = JSInterpreter('var x = 5;')
        result = repr(interpreter)
        self.assertEqual(result, 'youtube_dl.jsinterp.JSInterpreter(...)')

    def test_eq_method(self):
        interpreter1 = JSInterpreter('var x = 5;')
        interpreter2 = JSInterpreter('var x = 5;')
        self.assertEqual(interpreter1, interpreter2)

if __name__ == '__main__':
    unittest.main()