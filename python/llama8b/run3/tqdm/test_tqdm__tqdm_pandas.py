import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_type(self):
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(int, foo='bar')

    def test_tqdm_pandas_instance(self):
        instance = object()
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(instance, foo='bar')

    def test_tqdm_pandas_valid(self):
        instance = type('MyClass', (), {'pandas': lambda self: None})
        tqdm_pandas(instance, foo='bar')

    def test_tqdm_pandas_deprecated(self):
        instance = type('MyClass', (), {'pandas': lambda self: None})
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(instance, foo='bar', deprecated_t=instance)

    def test_tqdm_pandas_file(self):
        instance = type('MyClass', (), {'fp': sys.stderr})
        tqdm_pandas(instance, foo='bar')

    def test_tqdm_pandas_no_file(self):
        instance = type('MyClass', (), {})
        with self.assertRaises(AttributeError):
            tqdm_pandas(instance, foo='bar')

if __name__ == '__main__':
    unittest.main()