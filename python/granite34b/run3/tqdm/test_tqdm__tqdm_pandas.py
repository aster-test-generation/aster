import sys
import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_type(self):
        self.assertTrue(isinstance(tqdm_pandas, type))

    def test_tqdm_pandas_call(self):
        tclass = tqdm_pandas()
        self.assertTrue(hasattr(tclass, '__call__'))

    def test_tqdm_pandas_private_method(self):
        tclass = tqdm_pandas()
        self.assertTrue(hasattr(tclass, '__private_method'))

    def test_tqdm_pandas_protected_method(self):
        tclass = tqdm_pandas()
        self.assertTrue(hasattr(tclass, '_protected_method'))

    def test_tqdm_pandas_magic_method(self):
        tclass = tqdm_pandas()
        self.assertTrue(hasattr(tclass, '__str__'))
        self.assertTrue(hasattr(tclass, '__repr__'))
        self.assertTrue(hasattr(tclass, '__eq__'))

if __name__ == '__main__':
    unittest.main()