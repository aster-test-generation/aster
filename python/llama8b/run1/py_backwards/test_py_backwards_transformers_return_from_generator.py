import unittest
from unittest.mock import patch
from py_backwards.transformers.return_from_generator import ReturnFromGeneratorTransformer, return_from_generator


class TestReturnFromGeneratorTransformer(unittest.TestCase):
    def test_visit_FunctionDef(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.parse('''
            def foo():
                yield 1
                return 2
        ''')[1]
        result = transformer.visit_FunctionDef(node)
        self.assertTrue(transformer._tree_changed)
        self.assertEqual(result, node)

    def test_find_generator_returns(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.parse('''
            def foo():
                yield 1
                return 2
        ''')[1]
        result = transformer._find_generator_returns(node)
        self.assertEqual(result, [(node, node.body[1])])

    def test_replace_return(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.parse('''
            def foo():
                return 1
        ''')[1]
        return_ = node.body[0]
        transformer._replace_return(node, return_)
        self.assertEqual(node.body, [])

    def test_get_body(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value=1)
        self.assertEqual(result, ['1'])

    def test_get_body_multiple_lines(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value='hello\nworld')
        self.assertEqual(result, ['hello\n', 'world'])

    def test_get_body_empty(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value='')
        self.assertEqual(result, [])

    def test_get_body_none(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value=None)
        self.assertEqual(result, [])

    @patch('py_backwards.transformers.return_from_generator.return_from_generator')
    def test_visit_FunctionDef_mock(self, mock_return_from_generator):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.parse('''
            def foo():
                yield 1
                return 2
        ''')[1]
        result = transformer.visit_FunctionDef(node)
        mock_return_from_generator.assert_called_once()
        self.assertEqual(result, node)

if __name__ == '__main__':
    unittest.main()