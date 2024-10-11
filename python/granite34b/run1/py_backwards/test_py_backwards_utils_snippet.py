import unittest
from py_backwards.utils.snippet import snippet


class TestSnippet(unittest.TestCase):
    def test_init(self):
        def fn():
            pass
        s = snippet(fn)
        self.assertEqual(s._fn, fn)

    def test_find_variables(self):
        def fn():
            let(x)
            let(y)
            let(z)
        s = snippet(fn)
        import ast
        variables = s._get_variables(tree, {})
        self.assertEqual(variables, {'x': 'x', 'y': 'y', 'z': 'z'})

    def test_replace_variables(self):
        def fn():
            let(x)
            let(y)
            let(z)
        s = snippet(fn)
        import ast
        variables = s._get_variables(tree, {'x': 1, 'y': 2, 'z': 3})
        VariablesReplacer.replace(tree, variables)
        self.assertEqual(get_source(fn), 'x = 1\ny = 2\nz = 3')

    def test_extend_tree(self):
        def fn():
            extend(x)
            extend(y)
            extend(z)
        s = snippet(fn)
        import ast
        variables = {'x': 1, 'y': 2, 'z': 3}
        s._extend_tree(tree, variables)
        self.assertEqual(get_source(fn), 'x = 1\ny = 2\nz = 3')

    def test_get_body(self):
        def fn():
            let(x)
            let(y)
            let(z)
        s = snippet(fn)
        body = s.get_body(x=1, y=2, z=3)
        self.assertEqual(body, [ast.Assign(targets=[ast.Name(id='x', ctx=ast.Store())], value=ast.Num(n=1)), ast.Assign(targets=[ast.Name(id='y', ctx=ast.Store())], value=ast.Num(n=2)), ast.Assign(targets=[ast.Name(id='z', ctx=ast.Store())], value=ast.Num(n=3))])

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