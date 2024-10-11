import sys
import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_type(self):
        self.assertTrue(isinstance(tqdm_pandas, type))

    def test_tqdm_pandas_call(self):
        result = tqdm_pandas()
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_kwargs(self):
        result = tqdm_pandas(total=100)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_tclass(self):
        class TClass:
            pass
        result = tqdm_pandas(TClass)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_tclass_kwargs(self):
        class TClass:
            pass
        result = tqdm_pandas(TClass, total=100)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_tclass_kwargs_deprecated(self):
        class TClass:
            def pandas(self):
                pass
        result = tqdm_pandas(TClass, total=100)
        self.assertIsInstance(result, type)

if __name__ == '__main__':
    unittest.main()