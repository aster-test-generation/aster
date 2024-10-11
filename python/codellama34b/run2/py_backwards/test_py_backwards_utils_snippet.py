import unittest
from py_backwards.utils.snippet import *


class TestSnippet(unittest.TestCase):
    def test_snippet(self):
        def fn(x):
            return x + 1
        instance = snippet(fn)
        result = instance.get_body()
        self.assertEqual(result, [typed_ast.Return(None)])

    def test_let(self):
        result = let(1)
        self.assertEqual(result, None)

    def test_extend(self):
        result = extend(1)
        self.assertEqual(result, None)



class TestSnippet(unittest.TestCase):
    def test_get_variables(self):
        fn = lambda x: x + 1
        instance = snippet(fn)
        tree = ast.parse("lambda x: x + 1")
        snippet_kwargs = {}
        result = instance._get_variables(tree, snippet_kwargs)
        self.assertEqual(result, {'x': 'x'})

    def test_get_body(self):
        fn = lambda x: x + 1
        instance = snippet(fn)
        result = instance.get_body()
        self.assertEqual(result, [ast.Return(value=ast.BinOp(left=ast.Name(id='x', ctx=ast.Load()), op=ast.Add(), right=ast.Num(n=1)))])

class TestVariablesReplacer(unittest.TestCase):
    def test_visit_Name(self):
        node = ast.Name(id='x', ctx=ast.Load())
        variables = {'x': 'y'}
        instance = VariablesReplacer(variables)
        result = instance.visit_Name(node)
        self.assertEqual(result, ast.Name(id='y', ctx=ast.Load()))

    def test_visit_FunctionDef(self):
        node = ast.FunctionDef(name='x', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[], decorator_list=[], returns=None, type_comment=None)
        variables = {'x': 'y'}
        instance = VariablesReplacer(variables)
        result = instance.visit_FunctionDef(node)
        self.assertEqual(result, ast.FunctionDef(name='y', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[], decorator_list=[], returns=None, type_comment=None))

    def test_visit_Attribute(self):
        node = ast.Attribute(value=ast.Name(id='x', ctx=ast.Load()), attr='y', ctx=ast.Load())
        variables = {'x': 'z'}
        instance = VariablesReplacer(variables)
        result = instance.visit_Attribute(node)
        self.assertEqual(result, ast.Attribute(value=ast.Name(id='z', ctx=ast.Load()), attr='y', ctx=ast.Load()))

    def test_visit_keyword(self):
        node = ast.keyword(arg='x', value=ast.Name(id='y', ctx=ast.Load()))
        variables = {'x': 'z'}
        instance = VariablesReplacer(variables)
        result = instance.visit_keyword(node)
        self.assertEqual(result, ast.keyword(arg='z', value=ast.Name(id='y', ctx=ast.Load())))

    def test_visit_ClassDef(self):
        node = ast.ClassDef(name='x', bases=[], keywords=[], body=[], decorator_list=[], type_comment=None)
        variables = {'x': 'y'}
        instance = VariablesReplacer(variables)
        result = instance.visit_ClassDef(node)
        self.assertEqual(result, ast.ClassDef(name='y', bases=[], keywords=[], body=[], decorator_list=[], type_comment=None))

    def test_visit_arg(self):
        node = ast.arg(arg='x', annotation=None)
        variables = {'x': 'y'}
        instance = VariablesReplacer(variables)
        result = instance.visit_arg(node)
        self.assertEqual(result, ast.arg(arg='y', annotation=None))

if __name__ == '__main__':
    unittest.main()