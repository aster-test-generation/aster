import unittest
from youtube_dl.jsinterp import JSInterpreter, ExtractorError

class TestJSInterpreter(unittest.TestCase):
    def setUp(self):
        self.code = """
        var testObj = {
            "key1": function(a, b) { return a + b; },
            "key2": function(a, b) { return a * b; }
        };
        function testFunc(a, b) { return a - b; }
        """
        self.interpreter = JSInterpreter(self.code)

    def test_init(self):
        self.assertEqual(self.interpreter.code, self.code)
        self.assertEqual(self.interpreter._functions, {})
        self.assertEqual(self.interpreter._objects, {})

    def test_interpret_statement_var(self):
        local_vars = {}
        result, should_abort = self.interpreter.interpret_statement('var x = 5', local_vars)
        self.assertEqual(local_vars['x'], 5)
        self.assertFalse(should_abort)

    def test_interpret_statement_return(self):
        local_vars = {}
        result, should_abort = self.interpreter.interpret_statement('return 5', local_vars)
        self.assertEqual(result, 5)
        self.assertTrue(should_abort)

    def test_interpret_expression_empty(self):
        result = self.interpreter.interpret_expression('', {})
        self.assertIsNone(result)

    def test_interpret_expression_parens(self):
        result = self.interpreter.interpret_expression('(5 + 3)', {})
        self.assertEqual(result, 8)

    def test_interpret_expression_assign(self):
        local_vars = {'x': 5}
        result = self.interpreter.interpret_expression('x += 3', local_vars)
        self.assertEqual(local_vars['x'], 8)

    def test_interpret_expression_digit(self):
        result = self.interpreter.interpret_expression('123', {})
        self.assertEqual(result, 123)

    def test_interpret_expression_var(self):
        local_vars = {'x': 5}
        result = self.interpreter.interpret_expression('x', local_vars)
        self.assertEqual(result, 5)

    def test_interpret_expression_json(self):
        result = self.interpreter.interpret_expression('"test"', {})
        self.assertEqual(result, "test")

    def test_interpret_expression_index(self):
        local_vars = {'arr': [1, 2, 3]}
        result = self.interpreter.interpret_expression('arr[1]', local_vars)
        self.assertEqual(result, 2)

    def test_interpret_expression_member(self):
        local_vars = {'obj': {'key': 'value'}}
        result = self.interpreter.interpret_expression('obj.key', local_vars)
        self.assertEqual(result, 'value')

    def test_interpret_expression_function_call(self):
        local_vars = {'testFunc': lambda a, b: a - b}
        result = self.interpreter.interpret_expression('testFunc(5, 3)', local_vars)
        self.assertEqual(result, 2)

    def test_extract_object(self):
        obj = self.interpreter.extract_object('testObj')
        self.assertIn('key1', obj)
        self.assertIn('key2', obj)

    def test_extract_function(self):
        func = self.interpreter.extract_function('testFunc')
        self.assertEqual(func((5, 3)), 2)

    def test_call_function(self):
        result = self.interpreter.call_function('testFunc', 5, 3)
        self.assertEqual(result, 2)

    def test_build_function(self):
        func = self.interpreter.build_function(['a', 'b'], 'return a + b;')
        result = func((5, 3))
        self.assertEqual(result, 8)

    def test_interpret_expression_unsupported(self):
        with self.assertRaises(ExtractorError):
            self.interpreter.interpret_expression('unsupported_expr', {})

if __name__ == '__main__':
    unittest.main()