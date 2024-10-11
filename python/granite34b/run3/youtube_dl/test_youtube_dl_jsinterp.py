import unittest
from youtube_dl.jsinterp import JSInterpreter


class TestJSInterpreter(unittest.TestCase):
    def test_interpret_statement(self):
        code = 'var x = 1; return x + 1;'
        interpreter = JSInterpreter(code)
        result, should_abort = interpreter.interpret_statement(code, {'x': 1})
        self.assertEqual(result, 2)
        self.assertTrue(should_abort)

    def test_interpret_expression(self):
        code = '1 + 2 * 3 - 4 ^ 5 | 6'
        interpreter = JSInterpreter(code)
        result = interpreter.interpret_expression(code, {}, allow_recursion=True)
        self.assertEqual(result, 11)

    def test_extract_object(self):
        code = 'var obj = {method: function(x) {return x + 1;}};'
        interpreter = JSInterpreter(code)
        obj = interpreter.extract_object('obj')
        self.assertEqual(obj['method'](1), 1)

    def test_extract_function(self):
        code = 'function func(x) {return x + 1;}'
        interpreter = JSInterpreter(code)
        func = interpreter.extract_function('func')
        self.assertEqual(func(1), [2])

    def test_call_function(self):
        code = 'function func(x) {return x + 1;}'
        interpreter = JSInterpreter(code)
        result = interpreter.call_function('func', 1)
        self.assertEqual(result, 2)

    def test_build_function(self):
        code = 'function func(x) {return x + 1;}'
        interpreter = JSInterpreter(code)
        func = interpreter.build_function(['x'], 'return x + 1;')
        self.assertEqual(func(1), [2])

if __name__ == '__main__':
    unittest.main()