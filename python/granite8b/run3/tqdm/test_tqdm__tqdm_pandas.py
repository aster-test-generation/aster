import sys
import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas(self):
        result = tqdm_pandas(1)
        self.assertEqual(result, 1)

    def test_tqdm_pandas_with_tclass(self):
        class TClass:
            def pandas(self, **kwargs):
                return kwargs
        result = tqdm_pandas(TClass())
        self.assertEqual(result, {})

    def test_tqdm_pandas_with_tclass_and_tqdm_kwargs(self):
        class TClass:
            def pandas(self, **kwargs):
                return kwargs
        result = tqdm_pandas(TClass(), desc="test")
        self.assertEqual(result, {"desc": "test"})

    def test_tqdm_pandas_with_tclass_and_tclass_kwargs(self):
        class TClass:
            def pandas(self, **kwargs):
                return kwargs
        result = tqdm_pandas(TClass(), tclass_kwargs={"desc": "test"})
        self.assertEqual(result, {"desc": "test"})

    def test_tqdm_pandas_with_tclass_and_tclass_kwargs_and_tqdm_kwargs(self):
        class TClass:
            def pandas(self, **kwargs):
                return kwargs
        result = tqdm_pandas(TClass(), tclass_kwargs={"desc": "test"}, desc="test2")
        self.assertEqual(result, {"desc": "test2"})

if __name__ == '__main__':
    unittest.main()