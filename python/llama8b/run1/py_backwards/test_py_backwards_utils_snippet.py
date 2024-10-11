import unittest
from unittest.mock import patch
from py_backwards.utils.snippet import snippet, let, extend, VariablesReplacer, extend_tree
from typing import Callable, Any, List, Dict, Iterable, Union, TypeVar
from typed_ast import ast3 as ast


class TestSnippet(unittest.TestCase):
    def test_snippet_init(self):
        def dummy_fn():
            pass
        snippet_instance = snippet(dummy_fn)
        self.assertEqual(snippet_instance._fn, dummy_fn)

    def test_get_variables(self):
        snippet_instance = snippet(lambda: None)
        variables = snippet_instance._get_variables(ast.parse(''), {})
        self.assertEqual(len(variables), 0)

    def test_get_variables_with_snippet_kwargs(self):
        snippet_instance = snippet(lambda: None)
        variables = snippet_instance._get_variables(ast.parse(''), {'a': 'b'})
        self.assertEqual(variables['a'], 'b')

    def test_get_body(self):
        def dummy_fn():
            pass
        snippet_instance = snippet(dummy_fn)
        body = snippet_instance.get_body(a=1, b=2)
        self.assertEqual(len(body), 1)

    def test_extend_tree(self):
        tree = ast.parse('a = 1')
        extend_tree(tree, {'a': 2})
        self.assertEqual(tree.body[0].body[0].value.n, 2)

    def test_replace(self):
        tree = ast.parse('a = 1')
        VariablesReplacer.replace(tree, {'a': 2})
        self.assertEqual(tree.body[0].body[0].value.n, 2)

    def test_replace_field_or_node(self):
        node = ast.Name(id='a')
        result = VariablesReplacer()._replace_field_or_node(node, 'id', True)
        self.assertEqual(result.id, 'a')

    def test_visit_Name(self):
        node = ast.Name(id='a')
        result = VariablesReplacer()._replace_field_or_node(node, 'id', True)
        self.assertEqual(result.id, 'a')

    def test_visit_FunctionDef(self):
        node = ast.FunctionDef(name='a')
        result = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(result.name, 'a')

    def test_visit_Attribute(self):
        node = ast.Attribute(value=ast.Name(id='a'), attr='b')
        result = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(result.attr, 'b')

    def test_visit_keyword(self):
        node = ast.keyword(arg='a')
        result = VariablesReplacer()._replace_field_or_node(node, 'arg')
        self.assertEqual(result.arg, 'a')

    def test_visit_ClassDef(self):
        node = ast.ClassDef(name='a')
        result = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(result.name, 'a')

    def test_visit_arg(self):
        node = ast.arg(arg='a')
        result = VariablesReplacer()._replace_field_or_node(node, 'arg')
        self.assertEqual(result.arg, 'a')

    def test_visit_ImportFrom(self):
        node = ast.ImportFrom(module='a')
        result = VariablesReplacer()._replace_module(node.module)
        self.assertEqual(result, 'a')

    def test_visit_alias(self):
        node = ast.alias(name='a', asname='b')
        result = VariablesReplacer()._replace_module(node.name)
        self.assertEqual(result, 'a')

    def test_visit_ExceptHandler(self):
        node = ast.ExceptHandler(type=ast.Name(id='a'))
        result = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(result.name, 'a')

if __name__ == '__main__':
    unittest.main()