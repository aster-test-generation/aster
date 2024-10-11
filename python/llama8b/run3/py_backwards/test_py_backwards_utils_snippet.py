import unittest
from py_backwards.utils.snippet import snippet, let, extend, VariablesReplacer, extend_tree
from typing import Callable, Any, Dict, List


class TestSnippet(unittest.TestCase):
    def test_snippet_init(self):
        def test_fn():
            pass
        snippet_instance = snippet(test_fn)
        self.assertEqual(snippet_instance._fn, test_fn)

    def test_get_variables(self):
        def test_fn():
            pass
        snippet_instance = snippet(test_fn)
        variables = snippet_instance._get_variables(ast.parse(''), {})
        self.assertEqual(len(variables), 0)

    def test_get_body(self):
        def test_fn():
            pass
        snippet_instance = snippet(test_fn)
        body = snippet_instance.get_body()
        self.assertEqual(len(body), 0)

    def test_extend_tree(self):
        tree = ast.parse('extend(1)')
        extend_tree(tree, {'extend': 2})
        self.assertEqual(tree.body[0].body[0].n, ast.Num(2))

    def test_replace(self):
        tree = ast.parse('let x = 1')
        VariablesReplacer.replace(tree, {'x': 'y'})
        self.assertEqual(tree.body[0].targets[0].id, 'y')

    def test_replace_field_or_node(self):
        node = ast.Name('x')
        node = VariablesReplacer()._replace_field_or_node(node, 'id', True)
        self.assertEqual(node.id, 'x')

    def test_visit_Name(self):
        node = ast.Name('x')
        node = VariablesReplacer()._replace_field_or_node(node, 'id', True)
        self.assertEqual(node.id, 'x')

    def test_visit_FunctionDef(self):
        node = ast.FunctionDef('x')
        node = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(node.name, 'x')

    def test_visit_Attribute(self):
        node = ast.Attribute('x', 'y')
        node = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(node.attr, 'y')

    def test_visit_keyword(self):
        node = ast.keyword('x', 'y')
        node = VariablesReplacer()._replace_field_or_node(node, 'arg')
        self.assertEqual(node.arg, 'x')

    def test_visit_ClassDef(self):
        node = ast.ClassDef('x')
        node = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(node.name, 'x')

    def test_visit_arg(self):
        node = ast.arg('x')
        node = VariablesReplacer()._replace_field_or_node(node, 'arg')
        self.assertEqual(node.arg, 'x')

    def test_visit_ImportFrom(self):
        node = ast.ImportFrom('x', 'y')
        node.module = VariablesReplacer()._replace_module(node.module)
        self.assertEqual(node.module, 'y')

    def test_visit_alias(self):
        node = ast.alias('x', 'y')
        node.name = VariablesReplacer()._replace_module(node.name)
        self.assertEqual(node.name, 'y')

    def test_visit_ExceptHandler(self):
        node = ast.ExceptHandler('x')
        node = VariablesReplacer()._replace_field_or_node(node, 'name')
        self.assertEqual(node.name, 'x')

if __name__ == '__main__':
    unittest.main()