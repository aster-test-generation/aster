import unittest
from py_backwards.utils.snippet import VariablesReplacer, snippet, find_variables, extend_tree, let, extend
import ast


class TestVariablesReplacer(unittest.TestCase):
    def test_init(self):
        replacer = VariablesReplacer({'x': 'y'})
        self.assertEqual(replacer._variables, {'x': 'y'})

    def test_replace_field_or_node(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.Name(id='x')
        replacer._replace_field_or_node(node, 'id')
        self.assertEqual(node.id, 'y')

    def test_visit_Name(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.Name(id='x')
        replacer.visit_Name(node)
        self.assertEqual(node.id, 'y')

    def test_visit_FunctionDef(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.FunctionDef(name='x', args=[], body=[])
        replacer.visit_FunctionDef(node)
        self.assertEqual(node.name, 'y')

    def test_visit_Attribute(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.Attribute(attr='x', ctx=ast.Load())
        replacer.visit_Attribute(node)
        self.assertEqual(node.attr, 'y')

    def test_visit_keyword(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.keyword(arg='x', value=ast.Str(s=''))
        replacer.visit_keyword(node)
        self.assertEqual(node.arg, 'y')

    def test_visit_ClassDef(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.ClassDef(name='x', bases=[], body=[])
        replacer.visit_ClassDef(node)
        self.assertEqual(node.name, 'y')

    def test_visit_arg(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.arg(arg='x', annotation=None)
        replacer.visit_arg(node)
        self.assertEqual(node.arg, 'y')

    def test_replace_module(self):
        replacer = VariablesReplacer({'x': 'y'})
        result = replacer._replace_module('x.y.z')
        self.assertEqual(result, 'y.y.z')

    def test_visit_ImportFrom(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.ImportFrom(module='x.y', names=[ast.alias(name='z', asname=None)])
        replacer.visit_ImportFrom(node)
        self.assertEqual(node.module, 'y.y')

    def test_visit_alias(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.alias(name='x', asname=None)
        replacer.visit_alias(node)
        self.assertEqual(node.name, 'y')

    def test_visit_ExceptHandler(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.ExceptHandler(type=ast.Name(id='x'), body=[])
        replacer.visit_ExceptHandler(node)
        self.assertEqual(node.type.id, 'y')

    def test_replace(self):
        replacer = VariablesReplacer({'x': 'y'})
        tree = ast.parse('def x(): pass')
        VariablesReplacer.replace(tree, {'x': 'y'})
        self.assertEqual(tree.body[0].name, 'y')

class TestSnippet(unittest.TestCase):
    def test_init(self):
        snip = snippet(lambda: None)
        self.assertEqual(snip._fn, lambda: None)

    def test_get_variables(self):
        snip = snippet(lambda: None)
        tree = ast.parse('def x(): let(y)')
        variables = snip._get_variables(tree, {'y': 'z'})
        self.assertEqual(variables, {'y': 'z'})

    def test_get_body(self):
        snip = snippet(lambda: None)
        result = snip.get_body(y='z')
        self.assertIsInstance(result, list)

class TestFindVariables(unittest.TestCase):
    def test_find_variables(self):
        tree = ast.parse('def x(): let(y)')
        result = list(find_variables(tree))
        self.assertEqual(result, ['y'])

class TestExtendTree(unittest.TestCase):
    def test_extend_tree(self):
        tree = ast.parse('def x(): extend(y)')
        variables = {'y': ast.Str(s='hello')}
        extend_tree(tree, variables)
        self.assertEqual(tree.body[0].body[0].value.s, 'hello')

class TestLetAndExtend(unittest.TestCase):
    def test_let(self):
        result = let('x')
        self.assertIsNone(result)

    def test_extend(self):
        result = extend('x')
        self.assertIsNone(result)

if __name__ == '__main__':
    unittest.main()