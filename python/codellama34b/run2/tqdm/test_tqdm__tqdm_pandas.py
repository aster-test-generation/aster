import unittest
from tqdm._tqdm_pandas import *


class TestTqdmPandas(unittest.TestCase):
    def test_tqdm_pandas(self):
        tclass = TqdmDeprecationWarning
        tqdm_kwargs = {}
        tqdm_pandas(tclass, **tqdm_kwargs)

if __name__ == '__main__':
    unittest.main()