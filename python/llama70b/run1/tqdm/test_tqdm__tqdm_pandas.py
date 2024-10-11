import unittest
from tqdm._tqdm_pandas import tqdm_pandas, TqdmDeprecationWarning


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_type(self):
        result = tqdm_pandas(type, file=sys.stdout)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_tqdm(self):
        from tqdm import tqdm
        result = tqdm_pandas(tqdm, file=sys.stdout)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_deprecation_warning(self):
        with self.assertWarns(TqdmDeprecationWarning):
            tqdm_pandas(type, file=sys.stdout)

    def test_tqdm_pandas_fp_write(self):
        result = tqdm_pandas(type, file=sys.stdout)
        self.assertIsNotNone(result.fp.write)

    def test_tqdm_pandas_pandas_method(self):
        from pandas import DataFrame
        df = DataFrame({'A': [1, 2, 3]})
        result = tqdm_pandas(df, file=sys.stdout)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_deprecated_t(self):
        from tqdm import tqdm
        t = tqdm(range(3), file=sys.stdout)
        result = tqdm_pandas(t, file=sys.stdout)
        self.assertIsInstance(result, type)

if __name__ == '__main__':
    unittest.main()