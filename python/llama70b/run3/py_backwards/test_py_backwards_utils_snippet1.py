import unittest
from py_backwards.utils.snippet import *

class TestVariablesReplacer(unittest.TestCase):
    def test_init(self):
        replacer = VariablesReplacer({'x': 'y'})
        self.assertEqual(replacer._variables, {'x': 'y'})

    def test_replace_field_or_node(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.Name(id='x')
        result = replacer._replace_field_or_node(node, 'id')
        self.assertEqual(result.id, 'y')

    def test_visit_Name(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.Name(id='x')
        result = replacer.visit_Name(node)
        self.assertEqual(result.id, 'y')

    def test_visit_FunctionDef(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.FunctionDef(name='x', args=[], body=[])
        result = replacer.visit_FunctionDef(node)
        self.assertEqual(result.name, 'y')

    def test_visit_Attribute(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.Attribute(attr='x', ctx=ast.Load())
        result = replacer.visit_Attribute(node)
        self.assertEqual(result.attr, 'y')

    def test_visit_keyword(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.keyword(arg='x', value=ast.Str(s=''))
        result = replacer.visit_keyword(node)
        self.assertEqual(result.arg, 'y')

    def test_visit_ClassDef(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.ClassDef(name='x', bases=[], body=[])
        result = replacer.visit_ClassDef(node)
        self.assertEqual(result.name, 'y')

    def test_visit_arg(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.arg(arg='x', annotation=None)
        result = replacer.visit_arg(node)
        self.assertEqual(result.arg, 'y')

    def test_replace_module(self):
        replacer = VariablesReplacer({'x': 'y'})
        result = replacer._replace_module('a.x.b')
        self.assertEqual(result, 'a.y.b')

    def test_visit_ImportFrom(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.ImportFrom(module='a.x.b', names=[ast.alias(name='c', asname=None)])
        result = replacer.visit_ImportFrom(node)
        self.assertEqual(result.module, 'a.y.b')

    def test_visit_alias(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.alias(name='x', asname=None)
        result = replacer.visit_alias(node)
        self.assertEqual(result.name, 'y')

    def test_visit_ExceptHandler(self):
        replacer = VariablesReplacer({'x': 'y'})
        node = ast.ExceptHandler(type=ast.Name(id='x'), body=[])
        result = replacer.visit_ExceptHandler(node)
        self.assertEqual(result.type.id, 'y')

    def test_replace(self):
        replacer = VariablesReplacer({'x': 'y'})
        tree = ast.parse('def x(): pass')
        result = VariablesReplacer.replace(tree, {'x': 'y'})
        self.assertEqual(result.body[0].name, 'y')

class TestSnippet(unittest.TestCase):
    def test_init(self):
        snippet_instance = snippet(lambda: None)
        self.assertIsNotNone(snippet_instance._fn)

    def test_get_variables(self):
        snippet_instance = snippet(lambda: None)
        tree = ast.parse('def x(): pass')
        result = snippet_instance._get_variables(tree, {'x': 'y'})
        self.assertEqual(result, {'x': 'y'})

    def test_get_body(self):
        snippet_instance = snippet(lambda: None)
        result = snippet_instance.get_body(x='y')
        self.assertIsNotNone(result)

class TestFunctions(unittest.TestCase):
    def test_find_variables(self):
        tree = ast.parse('def x(): let(y)')
        result = list(find_variables(tree))
        self.assertEqual(result, ['y'])

    def test_extend_tree(self):
        tree = ast.parse('def x(): extend(y)')
        variables = {'y': 'z'}
        extend_tree(tree, variables)
        self.assertIsNotNone(tree)

if __name__ == '__main__':
    unittest.main()