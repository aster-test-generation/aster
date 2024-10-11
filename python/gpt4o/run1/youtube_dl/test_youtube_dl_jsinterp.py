import unittest
from youtube_dl.jsinterp import JSInterpreter, ExtractorError


class TestJSInterpreter(unittest.TestCase):
    def setUp(self):
        self.code = """
        var obj = {
            "key": function(a, b) { return a + b; },
            "key2": function(c) { return c * 2; }
        };
        function testFunc(x, y) { return x - y; }
        """
        self.interpreter = JSInterpreter(self.code)

    def test_init(self):
        self.assertEqual(self.interpreter.code, self.code)
        self.assertEqual(self.interpreter._functions, {})
        self.assertEqual(self.interpreter._objects, {})

    def test_interpret_statement_var(self):
        local_vars = {}
        result, should_abort = self.interpreter.interpret_statement('var x = 5', local_vars)
        self.assertEqual(result, 5)
        self.assertFalse(should_abort)

    def test_interpret_statement_return(self):
        local_vars = {}
        result, should_abort = self.interpreter.interpret_statement('return 5', local_vars)
        self.assertEqual(result, 5)
        self.assertTrue(should_abort)

    def test_interpret_expression_empty(self):
        local_vars = {}
        result = self.interpreter.interpret_expression('', local_vars, 100)
        self.assertIsNone(result)

    def test_interpret_expression_digit(self):
        local_vars = {}
        result = self.interpreter.interpret_expression('123', local_vars, 100)
        self.assertEqual(result, 123)

    def test_interpret_expression_var(self):
        local_vars = {'x': 10}
        result = self.interpreter.interpret_expression('x', local_vars, 100)
        self.assertEqual(result, 10)

    def test_interpret_expression_parens(self):
        local_vars = {'x': 10}
        result = self.interpreter.interpret_expression('(x)', local_vars, 100)
        self.assertEqual(result, 10)

    def test_interpret_expression_addition(self):
        local_vars = {'x': 10, 'y': 5}
        result = self.interpreter.interpret_expression('x + y', local_vars, 100)
        self.assertEqual(result, 15)

    def test_interpret_expression_function_call(self):
        local_vars = {'x': 10, 'y': 5}
        result = self.interpreter.interpret_expression('testFunc(x, y)', local_vars, 100)
        self.assertEqual(result, 5)

    def test_extract_object(self):
        obj = self.interpreter.extract_object('obj')
        self.assertIn('key', obj)
        self.assertIn('key2', obj)

    def test_extract_function(self):
        func = self.interpreter.extract_function('testFunc')
        self.assertEqual(func((10, 5)), 5)

    def test_call_function(self):
        result = self.interpreter.call_function('testFunc', 10, 5)
        self.assertEqual(result, 5)

    def test_build_function(self):
        func = self.interpreter.build_function(['a', 'b'], 'return a + b')
        result = func((3, 4))
        self.assertEqual(result, 7)

    def test_private_methods(self):
        obj = self.interpreter._JSInterpreter__private_method()
        self.assertIsNotNone(obj)

    def test_protected_methods(self):
        obj = self.interpreter._protected_method()
        self.assertIsNotNone(obj)

if __name__ == '__main__':
    unittest.main()