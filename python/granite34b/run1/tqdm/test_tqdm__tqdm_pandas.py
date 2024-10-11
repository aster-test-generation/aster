import sys
import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_type(self):
        self.assertTrue(isinstance(tqdm_pandas, type))

    def test_tqdm_pandas_call(self):
        from tqdm import TqdmDeprecationWarning
        with self.assertWarns(TqdmDeprecationWarning):
            tqdm_pandas(tclass=tqdm_pandas)

    def test_tqdm_pandas_kwargs(self):
        from tqdm import TqdmDeprecationWarning
        with self.assertWarns(TqdmDeprecationWarning):
            tqdm_pandas(tclass=tqdm_pandas, **tqdm_kwargs)

    def test_tqdm_pandas_private_method(self):
        from tqdm import TqdmDeprecationWarning
        with self.assertWarns(TqdmDeprecationWarning):
            tqdm_pandas(tclass=tqdm_pandas)

    def test_tqdm_pandas_protected_method(self):
        from tqdm import TqdmDeprecationWarning
        with self.assertWarns(TqdmDeprecationWarning):
            tqdm_pandas(tclass=tqdm_pandas)

    def test_tqdm_pandas_magic_method(self):
        from tqdm import TqdmDeprecationWarning
        with self.assertWarns(TqdmDeprecationWarning):
            tqdm_pandas(tclass=tqdm_pandas)

if __name__ == '__main__':
    unittest.main()