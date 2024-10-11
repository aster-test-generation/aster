import unittest
from py_backwards.utils.snippet import *
from typed_ast import ast3 as ast


class TestFindVariables(unittest.TestCase):
    def test_find_variables(self):
        source = "let(x)"
        tree = ast.parse(source)
        result = list(find_variables(tree))
        self.assertEqual(result, ['x'])

class TestVariablesReplacer(unittest.TestCase):
    def setUp(self):
        self.variables = {'x': 'y'}
        self.replacer = VariablesReplacer(self.variables)

    def test_replace_field_or_node(self):
        node = ast.Name(id='x')
        result = self.replacer._replace_field_or_node(node, 'id', True)
        self.assertEqual(result.id, 'y')

    def test_visit_Name(self):
        node = ast.Name(id='x')
        result = self.replacer.visit_Name(node)
        self.assertEqual(result.id, 'y')

    def test_visit_FunctionDef(self):
        node = ast.FunctionDef(name='x', args=ast.arguments(args=[], vararg=None, kwonlyargs=[], kw_defaults=[], kwarg=None, defaults=[]), body=[], decorator_list=[])
        result = self.replacer.visit_FunctionDef(node)
        self.assertEqual(result.name, 'y')

    def test_visit_Attribute(self):
        node = ast.Attribute(value=ast.Name(id='obj'), attr='x')
        result = self.replacer.visit_Attribute(node)
        self.assertEqual(result.attr, 'x')

    def test_visit_keyword(self):
        node = ast.keyword(arg='x', value=ast.Constant(value=1))
        result = self.replacer.visit_keyword(node)
        self.assertEqual(result.arg, 'y')

    def test_visit_ClassDef(self):
        node = ast.ClassDef(name='x', bases=[], keywords=[], body=[], decorator_list=[])
        result = self.replacer.visit_ClassDef(node)
        self.assertEqual(result.name, 'y')

    def test_visit_arg(self):
        node = ast.arg(arg='x')
        result = self.replacer.visit_arg(node)
        self.assertEqual(result.arg, 'y')

    def test_replace_module(self):
        result = self.replacer._replace_module('x.y')
        self.assertEqual(result, 'y.y')

    def test_visit_ImportFrom(self):
        node = ast.ImportFrom(module='x', names=[], level=0)
        result = self.replacer.visit_ImportFrom(node)
        self.assertEqual(result.module, 'y')

    def test_visit_alias(self):
        node = ast.alias(name='x', asname=None)
        result = self.replacer.visit_alias(node)
        self.assertEqual(result.name, 'y')

    def test_visit_ExceptHandler(self):
        node = ast.ExceptHandler(type=None, name='x', body=[])
        result = self.replacer.visit_ExceptHandler(node)
        self.assertEqual(result.name, 'y')

    def test_replace_classmethod(self):
        tree = ast.parse("def x(): pass")
        result = VariablesReplacer.replace(tree, self.variables)
        self.assertEqual(result.body[0].name, 'y')

class TestExtendTree(unittest.TestCase):
    def test_extend_tree(self):
        source = "extend(x)"
        tree = ast.parse(source)
        variables = {'x': ast.Expr(value=ast.Constant(value=1))}
        extend_tree(tree, variables)
        self.assertIsInstance(tree.body[0].value, typed_ast._ast3.Constant)

class TestSnippet(unittest.TestCase):
    def setUp(self):
        def sample_fn():
            let(x)
        self.snippet = snippet(sample_fn)

    def test_init(self):
        self.assertIsNotNone(self.snippet._fn)

    def test_get_variables(self):
        source = "let(x)"
        tree = ast.parse(source)
        snippet_kwargs = {'x': ast.Name(id='y')}
        result = self.snippet._get_variables(tree, snippet_kwargs)
        self.assertEqual(result['x'], 'y')

    def test_get_body(self):
        result = self.snippet.get_body(x=ast.Name(id='y'))
        self.assertIsInstance(result, list)

if __name__ == '__main__':
    unittest.main()