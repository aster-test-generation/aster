import unittest
from unittest.mock import patch
from py_backwards.utils.snippet import snippet, let, extend, VariablesReplacer, extend_tree
from typing import Callable, Any, List, Dict, Iterable, Union, TypeVar
from typed_ast import ast3 as ast


class TestSnippet(unittest.TestCase):
    def test_snippet_init(self):
        def fn():
            pass
        snippet_instance = snippet(fn)
        self.assertEqual(snippet_instance._fn, fn)

    def test_get_variables(self):
        def fn():
            pass
        snippet_instance = snippet(fn)
        variables = snippet_instance._get_variables(ast.parse(''), {})
        self.assertEqual(len(variables), 0)

    def test_get_body(self):
        def fn():
            pass
        snippet_instance = snippet(fn)
        body = snippet_instance.get_body()
        self.assertEqual(len(body), 0)

    def test_extend_tree(self):
        tree = ast.parse('a = 1')
        snippet_instance = snippet(lambda: None)
        extend_tree(tree, {'a': 'b'})
        self.assertEqual(tree.body[0].body[0].id, 'b')

    def test_replace(self):
        tree = ast.parse('a = 1')
        VariablesReplacer.replace(tree, {'a': 'b'})
        self.assertEqual(tree.body[0].body[0].id, 'b')

    def test_replace_field_or_node(self):
        node = ast.Name('a')
        replacer = VariablesReplacer({'a': 'b'})
        result = replacer._replace_field_or_node(node, 'id')
        self.assertEqual(result.id, 'b')

    def test_visit_Name(self):
        node = ast.Name('a')
        replacer = VariablesReplacer({'a': 'b'})
        result = replacer.visit_Name(node)
        self.assertEqual(result.id, 'b')

    def test_visit_FunctionDef(self):
        node = ast.FunctionDef('a', [])
        replacer = VariablesReplacer({'a': 'b'})
        result = replacer.visit_FunctionDef(node)
        self.assertEqual(node.name, 'b')

    def test_visit_Attribute(self):
        node = ast.Attribute(ast.Name('a'), 'b')
        replacer = VariablesReplacer({'a': 'c'})
        result = replacer.visit_Attribute(node)
        self.assertEqual(node.attr, 'b')

    def test_visit_keyword(self):
        node = ast.keyword('a', 'b')
        replacer = VariablesReplacer({'a': 'c'})
        result = replacer.visit_keyword(node)
        self.assertEqual(node.arg, 'c')

    def test_visit_ClassDef(self):
        node = ast.ClassDef('a', [])
        replacer = VariablesReplacer({'a': 'b'})
        result = replacer.visit_ClassDef(node)
        self.assertEqual(node.name, 'b')

    def test_visit_arg(self):
        node = ast.arg('a')
        replacer = VariablesReplacer({'a': 'b'})
        result = replacer.visit_arg(node)
        self.assertEqual(node.arg, 'b')

    def test_replace_module(self):
        module = 'a.b.c'
        replacer = VariablesReplacer({'a': 'd'})
        result = replacer._replace_module(module)
        self.assertEqual(result, 'd.b.c')

    def test_visit_ImportFrom(self):
        node = ast.ImportFrom('a', 'b', None)
        replacer = VariablesReplacer({'a': 'd'})
        result = replacer.visit_ImportFrom(node)
        self.assertEqual(node.module, 'd')

    def test_visit_alias(self):
        node = ast.alias('a', 'b')
        replacer = VariablesReplacer({'a': 'd'})
        result = replacer.visit_alias(node)
        self.assertEqual(node.name, 'd')

    def test_visit_ExceptHandler(self):
        node = ast.ExceptHandler(ast.Name('a'), [])
        replacer = VariablesReplacer({'a': 'b'})
        result = replacer.visit_ExceptHandler(node)
        self.assertEqual(node.name, 'b')

    def test_extend(self):
        extend('a')

    def test_let(self):
        let('a')

if __name__ == '__main__':
    unittest.main()