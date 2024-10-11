import unittest
from youtube_dl.jsinterp import JSInterpreter, ExtractorError, remove_quotes


class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter('code', objects={'obj': 'value'})
        self.assertEqual(interpreter.code, 'code')
        self.assertEqual(interpreter._objects, {'obj': 'value'})

    def test_interpret_statement(self):
        interpreter = JSInterpreter('code')
        stmt = 'var x = 5'
        local_vars = {}
        result, should_abort = interpreter.interpret_statement(stmt, local_vars)
        self.assertEqual(result, 5)
        self.assertFalse(should_abort)

    def test_interpret_expression(self):
        interpreter = JSInterpreter('code')
        expr = '5 + 3'
        local_vars = {}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 8)

    def test_interpret_expression_parens(self):
        interpreter = JSInterpreter('code')
        expr = '(5 + 3) * 2'
        local_vars = {}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 16)

    def test_interpret_expression_assign(self):
        interpreter = JSInterpreter('code')
        expr = 'x = 5'
        local_vars = {}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 5)
        self.assertEqual(local_vars, {'x': 5})

    def test_interpret_expression_array_access(self):
        interpreter = JSInterpreter('code')
        expr = 'arr[0]'
        local_vars = {'arr': [1, 2, 3]}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 1)

    def test_interpret_expression_function_call(self):
        interpreter = JSInterpreter('code')
        expr = 'func(1, 2)'
        local_vars = {'func': lambda x, y: x + y}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 3)

    def test_extract_object(self):
        interpreter = JSInterpreter('code')
        objname = 'obj'
        code = 'var %s = {a: 1, b: function(x) {return x * 2}};' % objname
        interpreter.code = code
        obj = interpreter.extract_object(objname)
        self.assertEqual(obj, {'a': 1, 'b': interpreter.build_function(['x'], 'return x * 2')})

    def test_extract_function(self):
        interpreter = JSInterpreter('code')
        funcname = 'func'
        code = 'function %s(x, y) {return x + y};' % funcname
        interpreter.code = code
        func = interpreter.extract_function(funcname)
        self.assertEqual(func([1, 2]), 3)

    def test_call_function(self):
        interpreter = JSInterpreter('code')
        funcname = 'func'
        code = 'function %s(x, y) {return x + y};' % funcname
        interpreter.code = code
        result = interpreter.call_function(funcname, 1, 2)
        self.assertEqual(result, 3)

    def test_build_function(self):
        interpreter = JSInterpreter('code')
        argnames = ['x', 'y']
        code = 'return x + y'
        func = interpreter.build_function(argnames, code)
        self.assertEqual(func([1, 2]), 3)

    def test_private_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._JSInterpreter__extract_object('obj')
        self.assertIsInstance(result, dict)

    def test_protected_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._extract_function('func')
        self.assertIsInstance(result, callable)

    def test_magic_method_init(self):
        interpreter = JSInterpreter('code')
        self.assertIsInstance(interpreter, JSInterpreter)

    def test_magic_method_str(self):
        interpreter = JSInterpreter('code')
        self.assertEqual(str(interpreter), 'JSInterpreter')

    def test_magic_method_repr(self):
        interpreter = JSInterpreter('code')
        self.assertEqual(repr(interpreter), 'JSInterpreter(code)')

    def test_magic_method_eq(self):
        interpreter1 = JSInterpreter('code1')
        interpreter2 = JSInterpreter('code2')
        self.assertNotEqual(interpreter1, interpreter2)

class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter('code', {'objects': 'objects'})
        self.assertEqual(interpreter.code, 'code')
        self.assertEqual(interpreter._objects, {'objects': 'objects'})

    def test_interpret_statement(self):
        interpreter = JSInterpreter('code')
        stmt, abort = interpreter.interpret_statement('var x = 5', {}, 100)
        self.assertEqual(stmt, 5)
        self.assertFalse(abort)

    def test_interpret_expression(self):
        interpreter = JSInterpreter('code')
        expr = interpreter.interpret_expression('5', {}, 100)
        self.assertEqual(expr, 5)

    def test_interpret_expression_parens(self):
        interpreter = JSInterpreter('code')
        expr = interpreter.interpret_expression('(5)', {}, 100)
        self.assertEqual(expr, 5)

    def test_interpret_expression_assign(self):
        interpreter = JSInterpreter('code')
        local_vars = {'x': 5}
        expr = interpreter.interpret_expression('x = 10', local_vars, 100)
        self.assertEqual(expr, 10)
        self.assertEqual(local_vars['x'], 10)

    def test_interpret_expression_var(self):
        interpreter = JSInterpreter('code')
        local_vars = {'x': 5}
        expr = interpreter.interpret_expression('x', local_vars, 100)
        self.assertEqual(expr, 5)

    def test_interpret_expression_json(self):
        interpreter = JSInterpreter('code')
        expr = interpreter.interpret_expression('["a", "b"]', {}, 100)
        self.assertEqual(expr, ['a', 'b'])

    def test_interpret_expression_object(self):
        interpreter = JSInterpreter('code')
        local_vars = {'obj': {'a': 1, 'b': 2}}
        expr = interpreter.interpret_expression('obj.a', local_vars, 100)
        self.assertEqual(expr, 1)

    def test_interpret_expression_function(self):
        interpreter = JSInterpreter('code')
        local_vars = {'func': lambda: 5}
        expr = interpreter.interpret_expression('func()', local_vars, 100)
        self.assertEqual(expr, 5)

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
        func = interpreter.extract_function('func')
        result = interpreter.call_function('func', 1, 2)
        self.assertEqual(result, func((1, 2)))

    def test_build_function(self):
        interpreter = JSInterpreter('code')
        func = interpreter.build_function(['x', 'y'], 'return x + y')
        self.assertIsInstance(func, callable)
        self.assertEqual(func((1, 2)), 3)

    def test_private_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._JSInterpreter__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._interpret_expression('5', {}, 100)
        self.assertEqual(result, 5)

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