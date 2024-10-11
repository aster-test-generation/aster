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

    def test_tqdm_pandas_class(self):
        class MyClass:
            pass
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(MyClass, foo='bar')

    def test_tqdm_pandas_deprecated(self):
        instance = object()
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(instance, foo='bar', deprecated_t=instance)

    def test_tqdm_pandas_no_deprecated(self):
        instance = object()
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(instance, foo='bar')

if __name__ == '__main__':
    unittest.main()