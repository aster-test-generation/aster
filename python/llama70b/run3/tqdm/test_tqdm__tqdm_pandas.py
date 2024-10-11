import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_type(self):
        result = tqdm_pandas(type, file=sys.stdout)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_tqdm(self):
        from tqdm import tqdm
        result = tqdm_pandas(tqdm, file=sys.stdout)
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_deprecation_warning(self):
        with self.assertWarns(UserWarning):
            tqdm_pandas(type, file=sys.stdout)

    def test_tqdm_pandas_kwargs(self):
        result = tqdm_pandas(type, file=sys.stdout, desc='test')
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_fp_write(self):
        from tqdm import tqdm
        t = tqdm(file=sys.stdout)
        result = tqdm_pandas(t, file=sys.stdout)
        self.assertIsInstance(result, type)

if __name__ == '__main__':
    unittest.main()