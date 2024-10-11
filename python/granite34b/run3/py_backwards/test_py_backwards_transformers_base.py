import unittest
from py_backwards.transformers.base import BaseTransformer, BaseNodeTransformer
    def test_replace_import_from_module(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        result = transformer._replace_import_from_module(tree.body[0], "example.module", "new.module")
        self.assertEqual(result.module, "new.module")
    def test_get_replaced_import_from_part(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        result = transformer._get_replaced_import_from_part(tree.body[0], tree.body[0].names[0], names_to_replace)
        self.assertEqual(result.module, "new.module.function")
    def test_replace_import_from_names(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        result = transformer._replace_import_from_names(tree.body[0], names_to_replace)
        self.assertEqual(len(result.names), 1)


class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        import ast
        result = BaseTransformer.transform(tree)
        self.assertEqual(result.transformed_tree, tree)
        self.assertFalse(result.transformed)
        self.assertEqual(result.dependencies, [])

class TestBaseNodeTransformer(unittest.TestCase):
    def test_transform(self):
        import ast
        result = BaseNodeTransformer.transform(tree)
        self.assertEqual(result.transformed_tree, tree)
        self.assertFalse(result.transformed)
        self.assertEqual(result.dependencies, [])

    def test_init(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        self.assertEqual(transformer._tree, tree)
        self.assertFalse(transformer._tree_changed)

    def test_get_matched_rewrite(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        rewrite = transformer._get_matched_rewrite("example.module")
        self.assertIsNone(rewrite)

    def test_replace_import(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        result = transformer._replace_import(tree.body[0], "example.module", "new.module")
        self.assertEqual(result.body[0].names[0].name, "new.module")
        self.assertTrue(transformer._tree_changed)

        self.assertTrue(transformer._tree_changed)

    def test_get_names_to_replace(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        names_to_replace = dict(transformer._get_names_to_replace(tree.body[0]))
        self.assertEqual(len(names_to_replace), 1)
        self.assertEqual(names_to_replace["example.module.function"], ("example.module", "new.module"))

        names_to_replace = dict(transformer._get_names_to_replace(tree.body[0]))
        self.assertEqual(result.names[0].name, "function")
        self.assertTrue(transformer._tree_changed)

        names_to_replace = dict(transformer._get_names_to_replace(tree.body[0]))
        self.assertEqual(result.names[0].name, "new.module.function")
        self.assertTrue(transformer._tree_changed)

    def test_visit_import(self):
        import ast
        transformer = BaseNodeTransformer(tree)
        result = transformer.visit_Import(tree.body[0])
        self.assertEqual(result.names[0].name, "example.module")
        self.assertFalse(transformer._tree_changed)

if __name__ == '__main__':
    unittest.main()