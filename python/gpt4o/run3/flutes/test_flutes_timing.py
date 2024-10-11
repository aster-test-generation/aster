import unittest
from unittest.mock import patch
from flutes.timing import work_in_progress
import time


class TestWorkInProgress(unittest.TestCase):
    @patch('flutes.timing.time.time', side_effect=[100.0, 105.0])
    def test_work_in_progress(self, mock_time):
        with patch('builtins.print') as mock_print:
            with work_in_progress("Test"):
                pass
            mock_print.assert_any_call("Test... ", end='', flush=True)
            mock_print.assert_any_call("done. (5.00s)")

if __name__ == '__main__':
    unittest.main()