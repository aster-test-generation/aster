import unittest
from youtube_dl.jsinterp import JSInterpreter, ExtractorError, remove_quotes

class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter('code', objects={'obj': 'value'})
        self.assertEqual(interpreter.code, 'code')
        self.assertEqual(interpreter._objects, {'obj': 'value'})

    def test_interpret_statement(self):
        interpreter = JSInterpreter('code')
        stmt, should_abort = interpreter.interpret_statement('var x = 5;', {}, 100)
        self.assertEqual(stmt, 5)
        self.assertFalse(should_abort)

    def test_interpret_expression(self):
        interpreter = JSInterpreter('code')
        expr = interpreter.interpret_expression('5 + 3', {}, 100)
        self.assertEqual(expr, 8)

    def test_interpret_expression_parens(self):
        interpreter = JSInterpreter('code')
        expr = interpreter.interpret_expression('(5 + 3) * 2', {}, 100)
        self.assertEqual(expr, 16)

    def test_interpret_expression_assign(self):
        interpreter = JSInterpreter('code')
        local_vars = {'x': 5}
        expr = interpreter.interpret_expression('x += 3', local_vars, 100)
        self.assertEqual(expr, 8)
        self.assertEqual(local_vars['x'], 8)

    def test_interpret_expression_var(self):
        interpreter = JSInterpreter('code')
        local_vars = {'x': 5}
        expr = interpreter.interpret_expression('x', local_vars, 100)
        self.assertEqual(expr, 5)

    def test_interpret_expression_json(self):
        interpreter = JSInterpreter('code')
        expr = interpreter.interpret_expression('["a", "b", "c"]', {}, 100)
        self.assertEqual(expr, ['a', 'b', 'c'])

    def test_interpret_expression_object(self):
        interpreter = JSInterpreter('code')
        local_vars = {'obj': {'x': 5, 'y': 3}}
        expr = interpreter.interpret_expression('obj.x', local_vars, 100)
        self.assertEqual(expr, 5)

    def test_interpret_expression_function(self):
        interpreter = JSInterpreter('code')
        local_vars = {'func': lambda x: x * 2}
        expr = interpreter.interpret_expression('func(5)', local_vars, 100)
        self.assertEqual(expr, 10)

    def test_extract_object(self):
        interpreter = JSInterpreter('code')
        obj = interpreter.extract_object('obj')
        self.assertIsInstance(obj, dict)

    def test_extract_function(self):
        interpreter = JSInterpreter('code')
        func = interpreter.extract_function('func')
        self.assertIsInstance(func, callable)

    def test_call_function(self):
        interpreter = JSInterpreter('code')
        result = interpreter.call_function('func', 5)
        self.assertEqual(result, 10)

    def test_build_function(self):
        interpreter = JSInterpreter('code')
        func = interpreter.build_function(['x'], 'x * 2')
        self.assertIsInstance(func, callable)
        self.assertEqual(func(5), 10)

    def test_private_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._JSInterpreter__private_method(5)
        self.assertEqual(result, 25)

    def test_protected_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._interpret_expression('5 + 3', {}, 100)
        self.assertEqual(result, 8)

    def test_magic_method_str(self):
        interpreter = JSInterpreter('code')
        result = str(interpreter)
        self.assertEqual(result, 'JSInterpreter')

    def test_magic_method_repr(self):
        interpreter = JSInterpreter('code')
        result = repr(interpreter)
        self.assertEqual(result, 'JSInterpreter(code)')

if __name__ == '__main__':
    unittest.main()