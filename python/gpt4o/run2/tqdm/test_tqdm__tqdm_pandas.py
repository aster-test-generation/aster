import sys
import unittest
from unittest.mock import MagicMock, patch
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    @patch('tqdm._tqdm_pandas.TqdmDeprecationWarning')
    def test_tqdm_pandas_with_tclass_type(self, mock_warning):
        tclass = MagicMock()
        tclass.pandas = MagicMock()
        tqdm_pandas(tclass, file=sys.stderr)
        tclass.pandas.assert_called_once()
        mock_warning.assert_called_once_with(
            "Please use `tqdm.pandas(...)` instead of `tqdm_pandas(tqdm, ...)`.",
            fp_write=sys.stderr.write
        )

    @patch('tqdm._tqdm_pandas.TqdmDeprecationWarning')
    def test_tqdm_pandas_with_tclass_instance(self, mock_warning):
        tclass = MagicMock()
        tclass.fp = sys.stderr
        type(tclass).pandas = MagicMock()
        tqdm_pandas(tclass)
        type(tclass).pandas.assert_called_once_with(deprecated_t=tclass)
        mock_warning.assert_called_once_with(
            "Please use `tqdm.pandas(...)` instead of `tqdm_pandas(tqdm(...))`.",
            fp_write=sys.stderr.write
        )

    @patch('tqdm._tqdm_pandas.TqdmDeprecationWarning')
    def test_tqdm_pandas_with_tclass_name_startswith_tqdm_(self, mock_warning):
        tclass = MagicMock()
        tclass.__name__ = 'tqdm_custom'
        tclass.pandas = MagicMock()
        tqdm_pandas(tclass, file=sys.stderr)
        tclass.pandas.assert_called_once()
        mock_warning.assert_called_once_with(
            "Please use `tqdm.pandas(...)` instead of `tqdm_pandas(tqdm, ...)`.",
            fp_write=sys.stderr.write
        )

if __name__ == '__main__':
    unittest.main()