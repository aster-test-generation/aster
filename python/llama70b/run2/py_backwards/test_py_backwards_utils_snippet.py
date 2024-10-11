import unittest
from py_backwards.utils.snippet import find_variables, VariablesReplacer, snippet, let, extend
import ast


class TestFindVariables(unittest.TestCase):
    def test_find_variables(self):
        tree = ast.parse("let(x)")
        result = list(find_variables(tree))
        self.assertEqual(result, ["x"])

class TestVariablesReplacer(unittest.TestCase):
    def test_init(self):
        replacer = VariablesReplacer({"x": "y"})
        self.assertEqual(replacer._variables, {"x": "y"})

    def test_replace_field_or_node(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.Name(id="x")
        replacer._replace_field_or_node(node, "id")

    def test_visit_Name(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.Name(id="x")
        replacer.visit_Name(node)

    def test_visit_FunctionDef(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.FunctionDef(name="x", args=ast.arguments([], []), body=[])
        replacer.visit_FunctionDef(node)

    def test_visit_Attribute(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.Attribute(attr="x", ctx=ast.Load())
        replacer.visit_Attribute(node)

    def test_visit_keyword(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.keyword(arg="x", value=ast.Str(s=""))
        replacer.visit_keyword(node)

    def test_visit_ClassDef(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.ClassDef(name="x", bases=[], body=[])
        replacer.visit_ClassDef(node)

    def test_visit_arg(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.arg(arg="x", annotation=None)
        replacer.visit_arg(node)

    def test_replace_module(self):
        replacer = VariablesReplacer({"x": "y"})
        result = replacer._replace_module("x.z")
        self.assertEqual(result, "y.z")

    def test_visit_ImportFrom(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.ImportFrom(module="x.z", names=[ast.alias(name="x", asname=None)], level=0)
        replacer.visit_ImportFrom(node)

    def test_visit_alias(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.alias(name="x", asname=None)
        replacer.visit_alias(node)

    def test_visit_ExceptHandler(self):
        replacer = VariablesReplacer({"x": "y"})
        node = ast.ExceptHandler(type=ast.Name(id="x"), body=[])
        replacer.visit_ExceptHandler(node)

    def test_replace(self):
        replacer = VariablesReplacer({"x": "y"})
        tree = ast.parse("def x(): pass")
        result = VariablesReplacer.replace(tree, {"x": "y"})
        self.assertEqual(result.body[0].name, "y")

class TestSnippet(unittest.TestCase):
    def test_init(self):
        snippet_instance = snippet(lambda: None)
        self.assertEqual(snippet_instance._fn, lambda: None)

    def test_get_variables(self):
        snippet_instance = snippet(lambda: None)
        tree = ast.parse("let(x)")
        result = snippet_instance._get_variables(tree, {})
        self.assertEqual(result, {"x": "x"})

    def test_get_body(self):
        snippet_instance = snippet(lambda: None)
        result = snippet_instance.get_body(x="y")
        self.assertEqual(len(result), 1)

class TestLetAndExtend(unittest.TestCase):
    def test_let(self):
        result = let("x")

    def test_extend(self):
        result = extend("x")

if __name__ == '__main__':
    unittest.main()