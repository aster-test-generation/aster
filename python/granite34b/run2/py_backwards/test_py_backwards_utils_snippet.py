import unittest
from py_backwards.utils.snippet import snippet


class TestSnippet(unittest.TestCase):
    def test_find_variables(self):
        tree = ast.parse("let x")
        variables = snippet._get_variables(tree, {"x": 1})
        self.assertEqual(variables["x"], 1)

    def test_replace_variables(self):
        tree = ast.parse("let x")
        variables = snippet._get_variables(tree, {"x": 1})
        snippet.VariablesReplacer.replace(tree, variables)
        self.assertEqual(ast.get_source(tree), "1")

    def test_extend_tree(self):
        import ast
        variables = {"x": ast.parse("y")}
        snippet.extend_tree(tree, variables)
        self.assertEqual(ast.get_source(tree), "y")

if __name__ == '__main__':
    unittest.main()