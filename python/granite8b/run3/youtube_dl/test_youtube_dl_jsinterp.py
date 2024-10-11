import unittest
from youtube_dl.jsinterp import JSInterpreter


class TestJSInterpreter(unittest.TestCase):
    def test_interpret_expression(self):
        interp = JSInterpreter('var x = 1; var y = 2;')
        self.assertEqual(interp.interpret_expression('x + y', {}, True), 3)
        self.assertEqual(interp.interpret_expression('x + y', {'x': 3}), 5)
        self.assertEqual(interp.interpret_expression('x + y', {'y': 3}), 5)
        self.assertEqual(interp.interpret_expression('x + y', {'x': 3, 'y': 3}), 6)

    def test_interpret_statement(self):
        interp = JSInterpreter('var x = 1; var y = 2;')
        self.assertEqual(interp.interpret_statement('x = 3', {}), (3, False))
        self.assertEqual(interp.interpret_statement('x = 3', {'x': 3}), 3)
        self.assertEqual(interp.interpret_statement('x = 3', {'y': 3}), 3)
        self.assertEqual(interp.interpret_statement('x = 3', {'x': 3, 'y': 3}), 3)

    def test_extract_object(self):
        interp = JSInterpreter('var obj = {a: 1, b: 2};')
        obj = interp.extract_object('obj')
        self.assertEqual(obj['a'], 1)
        self.assertEqual(obj['b'], 2)

    def test_extract_function(self):
        interp = JSInterpreter('var func = function(x) {return x + 1;};')
        func = interp.extract_function('func')
        self.assertEqual(func(3), 6)

    def test_call_function(self):
        interp = JSInterpreter('var func = function(x) {return x + 1;};')
        self.assertEqual(interp.call_function('func', 3), 4)

if __name__ == '__main__':
    unittest.main()