import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_type(self):
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(type, file=sys.stdout)

    def test_tqdm_pandas_instance(self):
        instance = object()
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(instance, file=sys.stdout)

    def test_tqdm_pandas_deprecated(self):
        instance = object()
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(instance, file=sys.stdout, deprecated_t=instance)

    def test_tqdm_pandas_non_deprecated(self):
        instance = object()
        with self.assertRaises(TqdmDeprecationWarning):
            tqdm_pandas(instance, file=sys.stdout, deprecated_t=None)

    def test_tqdm_pandas_str(self):
        result = str(tqdm_pandas(object()))
        self.assertEqual(result, "tqdm.pandas(...)")

    def test_tqdm_pandas_repr(self):
        result = repr(tqdm_pandas(object()))
        self.assertEqual(result, "tqdm.pandas(...)")

if __name__ == '__main__':
    unittest.main()