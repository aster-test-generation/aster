import unittest
from py_backwards.transformers.base import *
    def test_get_replaced_import_from_part(self):
        self.assertRaises(NotImplementedError, BaseImportRewrite._get_replaced_import_from_part, None, None, None, None)

    def test_replace_import_from_names(self):
        self.assertRaises(NotImplementedError, BaseImportRewrite._replace_import_from_names, None, None, None)

if __name__ == '__main__':
    unittest.main()

class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        self.assertRaises(NotImplementedError, BaseTransformer.transform, None)

class TestBaseNodeTransformer(unittest.TestCase):
    def test_transform(self):
        self.assertRaises(NotImplementedError, BaseNodeTransformer.transform, BaseNodeTransformer())

    def test_import_rewrite(self):
        self.assertRaises(NotImplementedError, import_rewrite, None, None)

if __name__ == '__main__':
    unittest.main()