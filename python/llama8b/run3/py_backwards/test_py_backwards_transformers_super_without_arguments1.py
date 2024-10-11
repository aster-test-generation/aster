import unittest
from unittest.mock import patch
from py_backwards.transformers.super_without_arguments import SuperWithoutArgumentsTransformer

class TestSuperWithoutArgumentsTransformer(unittest.TestCase):
    def test_replace_super_args(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        transformer._replace_super_args(node)
        self.assertEqual(len(node.args), 2)
        self.assertEqual(node.args[0].id, 'super')
        self.assertEqual(node.args[1].id, 'self')

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_super_outside_function(self, mock_get_closest_parent_of):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.side_effect = [None, None]
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertTrue(transformer._tree_changed)

    @patch('py_backwards.transformers.super_without_arguments.get_closest_parent_of')
    def test_visit_Call_super_outside_class(self, mock_get_closest_parent_of):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        mock_get_closest_parent_of.side_effect = [None, None]
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertTrue(transformer._tree_changed)

    def test_visit_Call_super_inside_function(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        transformer._tree = ast.parse('''
            def foo():
                super()
        ''')
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(transformer._tree_changed)

    def test_visit_Call_super_inside_class(self):
        transformer = SuperWithoutArgumentsTransformer()
        node = ast.Call(func=ast.Name(id='super'), args=[])
        transformer._tree = ast.parse('''
            class Foo:
                def __init__(self):
                    super().__init__()
        ''')
        result = transformer.visit_Call(node)
        self.assertEqual(result, node)
        self.assertFalse(transformer._tree_changed)

if __name__ == '__main__':
    unittest.main()