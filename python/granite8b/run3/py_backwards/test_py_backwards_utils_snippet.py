import unittest
from py_backwards.utils.snippet import snippet


class TestSnippet(unittest.TestCase):
    def test_find_variables(self):
        tree = ast.parse("let x")
        variables = list(snippet._find_variables(tree))
        self.assertEqual(variables, ["x"])

    def test_extend_tree(self):
        tree = ast.parse("extend(x)")
        variables = {"x": [ast.Num(1), ast.Num(2)]}
        snippet._extend_tree(tree, variables)
        self.assertEqual(get_source(tree), "x.extend([1, 2])")

    def test_replace_variables(self):
        tree = ast.parse("x + y")
        variables = {"x": ast.Name(id="a", ctx=ast.Load()),
                        "y": ast.Name(id="b", ctx=ast.Load())}
        snippet._replace_variables(tree, variables)
        self.assertEqual(get_source(tree), "a + b")

    def test_get_body(self):
        @snippet
        def my_function(x, y):
            let(z = x + y)
            extend(z)
            return z
        body = my_function.get_body(x=1, y=2)
        self.assertEqual(len(body), 3)
        self.assertEqual(get_source(body[0]), "z = 1 + 2")
        self.assertEqual(get_source(body[1]), "z.extend([z])")
        self.assertEqual(get_source(body[2]), "return z")

if __name__ == '__main__':
    unittest.main()