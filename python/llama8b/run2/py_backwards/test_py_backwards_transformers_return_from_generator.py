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
        self._tree_changed = True
        self.assertEqual(result, node)

    def test_find_generator_returns(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.parse('''
            def foo():
                yield 1
                return 2
        ''')[1]
        result = transformer._find_generator_returns(node)
        self.assertEqual(len(result), 1)

    def test_replace_return(self):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.parse('''
            def foo():
                return 1
        ''')[1]
        return_ = node.body[0]
        transformer._replace_return(node, return_)
        self.assertEqual(len(node.body), 0)

    def test_get_body(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value=1)
        self.assertEqual(len(result), 1)

    def test_get_body_multiple_lines(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value=[1, 2, 3])
        self.assertEqual(len(result), 3)

    def test_get_body_empty_list(self):
        transformer = ReturnFromGeneratorTransformer()
        result = return_from_generator.get_body(return_value=[])
        self.assertEqual(len(result), 0)

    @patch('py_backwards.transformers.return_from_generator.return_from_generator.get_body')
    def test_visit_FunctionDef_side_effect(self, mock_get_body):
        transformer = ReturnFromGeneratorTransformer()
        node = ast.parse('''
            def foo():
                yield 1
                return 2
        ''')[1]
        mock_get_body.return_value = ['line1', 'line2']
        result = transformer.visit_FunctionDef(node)
        self._tree_changed = True
        self.assertEqual(result, node)
        mock_get_body.assert_called_once()

if __name__ == '__main__':
    unittest.main()