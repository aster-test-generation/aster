import unittest
from py_backwards.utils.snippet import *


class TestSnippet(unittest.TestCase):
    def test_snippet(self):
        def fn():
            pass
        instance = snippet(fn)
        result = instance.get_body()
        self.assertEqual(result, [typed_ast.Pass()])

    def test_let(self):
        result = let(1)
        self.assertEqual(result, None)

    def test_extend(self):
        result = extend(1)
        self.assertEqual(result, None)

class Testsnippet(unittest.TestCase):
    def test_snippet(self):
        self.assertEqual(snippet(None)._fn, None)

    def test_get_variables(self):
        self.assertEqual(snippet(None)._get_variables(None, None), None)

    def test_get_body(self):
        self.assertEqual(snippet(None).get_body(), None)

    def test_let(self):
        self.assertEqual(let(None), None)

    def test_extend(self):
        self.assertEqual(extend(None), None)

    def test_VariablesReplacer(self):
        self.assertEqual(VariablesReplacer(None)._variables, None)

    def test_VariablesReplacer_replace_field_or_node(self):
        self.assertEqual(VariablesReplacer(None)._replace_field_or_node(None, None, None), None)

    def test_VariablesReplacer_replace_module(self):
        self.assertEqual(VariablesReplacer(None)._replace_module(None), None)

    def test_VariablesReplacer_visit_Name(self):
        self.assertEqual(VariablesReplacer(None).visit_Name(None), None)

    def test_VariablesReplacer_visit_FunctionDef(self):
        self.assertEqual(VariablesReplacer(None).visit_FunctionDef(None), None)

    def test_VariablesReplacer_visit_Attribute(self):
        self.assertEqual(VariablesReplacer(None).visit_Attribute(None), None)

    def test_VariablesReplacer_visit_keyword(self):
        self.assertEqual(VariablesReplacer(None).visit_keyword(None), None)

    def test_VariablesReplacer_visit_ClassDef(self):
        self.assertEqual(VariablesReplacer(None).visit_ClassDef(None), None)

    def test_VariablesReplacer_visit_arg(self):
        self.assertEqual(VariablesReplacer(None).visit_arg(None), None)

    def test_VariablesReplacer_visit_ImportFrom(self):
        self.assertEqual(VariablesReplacer(None).visit_ImportFrom(None), None)

    def test_VariablesReplacer_visit_alias(self):
        self.assertEqual(VariablesReplacer(None).visit_alias(None), None)

    def test_VariablesReplacer_visit_ExceptHandler(self):
        self.assertEqual(VariablesReplacer(None).visit_ExceptHandler(None), None)

    def test_VariablesReplacer_replace(self):
        self.assertEqual(VariablesReplacer.replace(None, None), None)

    def test_extend_tree(self):
        self.assertEqual(extend_tree(None, None), None)

    def test_find_variables(self):
        self.assertEqual(find_variables(None), None)

    def test_VariablesGenerator(self):
        self.assertEqual(VariablesGenerator.generate(None), None)

    def test_get_source(self):
        self.assertEqual(get_source(None), None)

if __name__ == '__main__':
    unittest.main()