import sys
import unittest
from unittest.mock import MagicMock, patch
from tqdm._tqdm_pandas import tqdm_pandas


class TestTqdmPandas(unittest.TestCase):
    @patch('tqdm._tqdm_pandas.TqdmDeprecationWarning')
    def test_tqdm_pandas_with_tclass_type(self, mock_warning):
        class MockTqdm:
            @staticmethod
            def pandas(**kwargs):
                pass

        mock_tclass = MockTqdm
        tqdm_pandas(mock_tclass, file=sys.stderr)
        mock_warning.assert_called_once_with(
            "Please use `tqdm.pandas(...)` instead of `tqdm_pandas(tqdm, ...)`.",
            fp_write=sys.stderr.write
        )

    @patch('tqdm._tqdm_pandas.TqdmDeprecationWarning')
    def test_tqdm_pandas_with_tclass_instance(self, mock_warning):
        class MockTqdm:
            def __init__(self):
                self.fp = sys.stderr

            @staticmethod
            def pandas(**kwargs):
                pass

        mock_tclass = MockTqdm()
        tqdm_pandas(mock_tclass, file=sys.stderr)
        mock_warning.assert_called_once_with(
            "Please use `tqdm.pandas(...)` instead of `tqdm_pandas(tqdm(...))`.",
            fp_write=sys.stderr.write
        )

    @patch('tqdm._tqdm_pandas.TqdmDeprecationWarning')
    def test_tqdm_pandas_with_tclass_name_startswith_tqdm_(self, mock_warning):
        class MockTqdm:
            __name__ = 'tqdm_mock'

            @staticmethod
            def pandas(**kwargs):
                pass

        mock_tclass = MockTqdm
        tqdm_pandas(mock_tclass, file=sys.stderr)
        mock_warning.assert_called_once_with(
            "Please use `tqdm.pandas(...)` instead of `tqdm_pandas(tqdm, ...)`.",
            fp_write=sys.stderr.write
        )

if __name__ == '__main__':
    unittest.main()