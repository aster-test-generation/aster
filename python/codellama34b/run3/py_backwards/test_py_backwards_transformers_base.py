import unittest
from py_backwards.transformers.base import *


class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        self.assertRaises(TypeError, BaseTransformer.transform)

class TestBaseNodeTransformer(unittest.TestCase):
    def test_transform(self):
        self.assertRaises(TypeError, BaseNodeTransformer.transform)

class TestBaseImportRewrite(unittest.TestCase):
    def test_transform(self):
        self.assertRaises(TypeError, BaseImportRewrite.transform)

if __name__ == '__main__':
    unittest.main()