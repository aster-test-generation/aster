import unittest
from youtube_dl.jsinterp import JSInterpreter




class TestJSInterpreter(unittest.TestCase):
    def test_interpret_statement(self):
        interp = JSInterpreter('var x = 1;')
        self.assertEqual(interp.interpret_statement('x = 2;', {'x': 0}), (2, False))
        self.assertEqual(interp.interpret_statement('return 3;', {'x': 0}), (3, True))

    def test_interpret_expression(self):
        interp = JSInterpreter('var x = 1;')
        self.assertEqual(interp.interpret_expression('2 + 3', {'x': 0}), 5)
        self.assertEqual(interp.interpret_expression('x', {'x': 0}), 0)
        self.assertEqual(interp.interpret_expression('x + 1', {'x': 0}), 1)
        self.assertEqual(interp.interpret_expression('x[0]', {'x': [1, 2, 3]}), 1)
        self.assertEqual(interp.interpret_expression('x["length"]', {'x': [1, 2, 3]}), 3)
        self.assertEqual(interp.interpret_expression('x["split"]("")', {'x': 'abc'}), ['a', 'b', 'c'])
        self.assertEqual(interp.interpret_expression('x["reverse"]()', {'x': [1, 2, 3]}), [3, 2, 1])
        self.assertEqual(interp.interpret_expression('x["splice"](1, 1)', {'x': [1, 2, 3]}), [2])
        self.assertEqual(interp.interpret_expression('x["slice"](1)', {'x': [1, 2, 3]}), [2, 3])

    def test_extract_object(self):
        interp = JSInterpreter('')
        obj = interp.extract_object('x')
        self.assertEqual(obj['length'], 0)
        self.assertEqual(obj['split'](''), [])
        self.assertEqual(obj['reverse'](), [])
        self.assertEqual(obj['splice'](1, 1), [])
        self.assertEqual(obj['slice'](1), [])

    def test_extract_function(self):
        interp = JSInterpreter('')
        func = interp.extract_function('x')
        self.assertEqual(func(), None)

    def test_call_function(self):
        interp = JSInterpreter('')
        self.assertEqual(interp.call_function('x'), None)

if __name__ == '__main__':
    unittest.main()