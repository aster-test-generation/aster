import unittest
from py_backwards.utils.snippet import snippet

class TestSnippet(unittest.TestCase):
    def test_find_variables(self):
        tree = ast.parse("let(x) + let(y)")
        variables = snippet._find_variables(tree)
        self.assertEqual(set(variables), {"x", "y"})

    def test_replace_variables(self):
        tree = ast.parse("let(x) + let(y)")
        variables = {"x": "a", "y": "b"}
        snippet._replace_variables(tree, variables)
        source = ast.unparse(tree)
        self.assertEqual(source, "a + b")

    def test_extend_tree(self):
        tree = ast.parse("extend(x)")
        variables = {"x": ast.parse("1 + 2")}
        snippet._extend_tree(tree, variables)
        source = ast.unparse(tree)
        self.assertEqual(source, "1 + 2")

    def test_snippet(self):
        def fn():
            let(x)
            let(y)
            extend(x)
            extend(y)
        snippet_kwargs = {"x": 1, "y": 2}
        snippet_body = snippet(fn).get_body(**snippet_kwargs)
        source = ast.unparse(snippet_body)
        self.assertEqual(source, "1\n2")

if __name__ == '__main__':
    unittest.main()