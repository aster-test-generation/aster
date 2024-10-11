import unittest
from typed_ast import ast3 as ast
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer, return_from_generator


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def setUp(self):
        self.transformer = ReturnFromGeneratorTransformer(tree)

    def test_find_generator_returns_with_yield(self):
        node = ast.parse("""
        def test():
            yield 1
            return 2
        """).body[0]
        result = self.transformer._find_generator_returns(node)
        self.assertEqual(len(result), 1)
        self.assertIsInstance(result[0][1], ast.Return)

    def test_find_generator_returns_without_yield(self):
        node = ast.parse("""
        def test():
            return 2
        """).body[0]
        result = self.transformer._find_generator_returns(node)
        self.assertEqual(result, [])

    def test_replace_return(self):
        node = ast.parse("""
        def test():
            return 2
        """).body[0]
        return_stmt = node.body[0]
        self.transformer._replace_return(node, return_stmt)
        self.assertIsInstance(node.body[0], ast.Raise)

    def test_visit_FunctionDef_with_generator_returns(self):
        node = ast.parse("""
        def test():
            yield 1
            return 2
        """).body[0]
        result = self.transformer.visit_FunctionDef(node)
        self.assertTrue(self.transformer._tree_changed)
        self.assertIsInstance(result.body[1], ast.Raise)

    def test_visit_FunctionDef_without_generator_returns(self):
        node = ast.parse("""
        def test():
            return 2
        """).body[0]
        result = self.transformer.visit_FunctionDef(node)
        self.assertFalse(self.transformer._tree_changed)
        self.assertIsInstance(result.body[0], ast.Return)

class TestReturnFromGeneratorSnippet(unittest.TestCase):
    def test_return_from_generator(self):
        exc = None
        try:
            exec("""
def test():
    return_from_generator(2)
test()
            """)
        except StopIteration as e:
            exc = e
        self.assertIsNotNone(exc)
        self.assertEqual(exc.value, 2)

if __name__ == '__main__':
    unittest.main()