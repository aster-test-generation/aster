import unittest
from unittest.mock import patch
from py_backwards.transformers.metaclass import MetaclassTransformer, class_bases, six_import


class TestMetaclassTransformer(unittest.TestCase):
    def test_visit_Module(self):
        transformer = MetaclassTransformer()
        node = ast.Module(body=[ast.Expr(ast.Call(ast.Name('six_import'), []))])
        result = transformer.visit_Module(node)
        self.assertEqual(result.body[0].value.func.id, 'six_import')

    def test_visit_ClassDef(self):
        transformer = MetaclassTransformer()
        node = ast.ClassDef('Test', [], [], [], kwonlyargs=[])
        result = transformer.visit_ClassDef(node)
        self.assertEqual(result.bases, [])

    @patch('py_backwards.transformers.metaclass._tree_changed')
    def test_visit_ClassDef_with_metaclass(self, mock_tree_changed):
        transformer = MetaclassTransformer()
        node = ast.ClassDef('Test', [], [], [], kwonlyargs=[], keywords=[ast.keyword(arg='metaclass', value=ast.Name('Meta'))])
        result = transformer.visit_ClassDef(node)
        self.assertEqual(result.bases, [])
        mock_tree_changed.assert_called_once()

    def test_class_bases(self):
        metaclass = ast.Name('Meta')
        bases = [ast.Name('object')]
        result = class_bases(metaclass, bases)
        self.assertEqual(result.elts, [metaclass, *bases])

    def test_six_import(self):
        result = six_import.get_body()
        self.assertEqual(result, [ast.Import([ast.ImportSpec(name='six', asname='_py_backwards_six')])])

if __name__ == '__main__':
    unittest.main()