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
        with self.assertWarns(Warning):
            tqdm_pandas(type, file=sys.stdout)

    def test_tqdm_pandas_kwargs(self):
        result = tqdm_pandas(type, file=sys.stdout, desc='test')
        self.assertIsInstance(result, type)

    def test_tqdm_pandas_fp_write(self):
        fp = open('test.txt', 'w')
        result = tqdm_pandas(type, file=fp)
        self.assertIsInstance(result, type)
        fp.close()

if __name__ == '__main__':
    unittest.main()