import unittest
from py_backwards.transformers.base import *


class TestBaseTransformer(unittest.TestCase):
    def test_transform(self):
        pass

class TestBaseNodeTransformer(unittest.TestCase):
    def test_transform(self):
        pass

class TestImportRewrite(unittest.TestCase):
    def test_import_rewrite(self):
        pass

class TestBaseImportRewrite(unittest.TestCase):
    def test_transform(self):
        pass

if __name__ == '__main__':
    unittest.main()