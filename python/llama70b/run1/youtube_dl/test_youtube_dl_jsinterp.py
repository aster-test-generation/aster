import unittest
from youtube_dl.jsinterp import JSInterpreter, ExtractorError, remove_quotes
from youtube_dl.jsinterp import JSInterpreter, ExtractorError


class TestJSInterpreter(unittest.TestCase):
    def test_init(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        self.assertIsInstance(interpreter, JSInterpreter)

    def test_interpret_statement(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        stmt = 'var x = 5'
        local_vars = {}
        result, should_abort = interpreter.interpret_statement(stmt, local_vars)
        self.assertEqual(result, 5)
        self.assertFalse(should_abort)

    def test_interpret_expression(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        expr = '5 + 3'
        local_vars = {}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 8)

    def test_assign_operators(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        expr = 'x = 5'
        local_vars = {}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(local_vars, {'x': 5})

    def test_private_extract_object(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        objname = 'obj'
        code = 'var %s = { foo: function(x) { return x * 2; } };' % objname
        interpreter.code = code
        obj = interpreter._JSInterpreter__extract_object(objname)
        self.assertIsInstance(obj, dict)
        self.assertIn('foo', obj)

    def test_private_extract_function(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        funcname = 'func'
        code = 'function %s(x) { return x * 2; }' % funcname
        interpreter.code = code
        func = interpreter._JSInterpreter__extract_function(funcname)
        self.assertIsInstance(func, callable)
        self.assertEqual(func(5), 10)

    def test_build_function(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        argnames = ['x', 'y']
        code = 'return x + y;'
        func = interpreter.build_function(argnames, code)
        self.assertIsInstance(func, callable)
        self.assertEqual(func(2, 3), 5)

    def test_call_function(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        funcname = 'func'
        code = 'function %s(x) { return x * 2; }' % funcname
        interpreter.code = code
        result = interpreter.call_function(funcname, 5)
        self.assertEqual(result, 10)

    def test_str_method(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        result = str(interpreter)
        self.assertEqual(result, 'JSInterpreter')

    def test_repr_method(self):
        interpreter = JSInterpreter('code', {'objects': {}})
        result = repr(interpreter)
        self.assertEqual(result, 'JSInterpreter(code, objects={})')

    def test_eq_method(self):
        interpreter1 = JSInterpreter('code', {'objects': {}})
        interpreter2 = JSInterpreter('code', {'objects': {}})
        self.assertEqual(interpreter1, interpreter2)

class TestExtractorError(unittest.TestCase):
    def test_extractor_error(self):
        error = ExtractorError('Error message')
        self.assertIsInstance(error, Exception)
        self.assertEqual(str(error), 'Error message')

class TestRemoveQuotes(unittest.TestCase):
    def test_remove_quotes(self):
        result = remove_quotes('"hello"')
        self.assertEqual(result, 'hello')

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

    def test_interpret_expression_object_access(self):
        interpreter = JSInterpreter('code')
        expr = 'obj.member'
        local_vars = {'obj': {'member': 'value'}}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 'value')

    def test_interpret_expression_function_call(self):
        interpreter = JSInterpreter('code')
        expr = 'func(1, 2)'
        local_vars = {'func': lambda x, y: x + y}
        result = interpreter.interpret_expression(expr, local_vars)
        self.assertEqual(result, 3)

    def test_extract_object(self):
        interpreter = JSInterpreter('code')
        objname = 'obj'
        code = 'var %s = {member: function(x) { return x * 2; }};' % objname
        interpreter.code = code
        obj = interpreter.extract_object(objname)
        self.assertEqual(obj, {'member': lambda x: x * 2})

    def test_extract_function(self):
        interpreter = JSInterpreter('code')
        funcname = 'func'
        code = 'function %s(x) { return x * 2; }' % funcname
        interpreter.code = code
        func = interpreter.extract_function(funcname)
        self.assertEqual(func(2), 4)

    def test_call_function(self):
        interpreter = JSInterpreter('code')
        funcname = 'func'
        code = 'function %s(x) { return x * 2; }' % funcname
        interpreter.code = code
        result = interpreter.call_function(funcname, 2)
        self.assertEqual(result, 4)

    def test_build_function(self):
        interpreter = JSInterpreter('code')
        argnames = ['x', 'y']
        code = 'return x + y;'
        func = interpreter.build_function(argnames, code)
        self.assertEqual(func(2, 3), 5)

    def test_private_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._JSInterpreter__private_method(3)
        self.assertEqual(result, 9)

    def test_protected_method(self):
        interpreter = JSInterpreter('code')
        result = interpreter._interpret_expression('5 + 3', {})
        self.assertEqual(result, 8)

    def test_magic_method_str(self):
        interpreter = JSInterpreter('code')
        result = str(interpreter)
        self.assertEqual(result, 'JSInterpreter')

    def test_magic_method_repr(self):
        interpreter = JSInterpreter('code')
        result = repr(interpreter)
        self.assertEqual(result, 'JSInterpreter(code={})')

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