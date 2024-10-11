import sys
import unittest
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas_class(self):
        class T:
            pass
        tqdm_pandas(T)

    def test_tqdm_pandas_instance(self):
        class T:
            def pandas(self, **kwargs):
                pass
        tqdm_pandas(T())

    def test_tqdm_pandas_function(self):
        def t():
            pass
        tqdm_pandas(t)

    def test_tqdm_pandas_magic_method(self):
        class T:
            def __init__(self):
                pass
            def pandas(self, **kwargs):
                pass
        tqdm_pandas(T())

    def test_tqdm_pandas_private_method(self):
        class T:
            def __init__(self):
                pass
            def __str__(self):
                pass
            def pandas(self, **kwargs):
                pass
        tqdm_pandas(T())

    def test_tqdm_pandas_protected_method(self):
        class T:
            def __init__(self):
                pass
            def _protected_method(self):
                pass
            def pandas(self, **kwargs):
                pass
        tqdm_pandas(T())

    def test_tqdm_pandas_kwargs(self):
        class T:
            def __init__(self):
                pass
            def pandas(self, **kwargs):
                self.kwargs = kwargs
        tqdm_pandas(T(), file=sys.stderr)
        self.assertEqual(T().kwargs['file'], sys.stderr)

if __name__ == '__main__':
    unittest.main()