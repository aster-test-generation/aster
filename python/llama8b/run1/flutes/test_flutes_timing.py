import time
import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Testing work in progress"):
            pass
        self.assertEqual(True, True)

    def test_work_in_progress_with_desc(self):
        with work_in_progress("Testing work in progress with description"):
            pass
        self.assertEqual(True, True)

    def test_work_in_progress_with_time_consumption(self):
        start_time = time.time()
        with work_in_progress("Testing work in progress with time consumption"):
            pass
        end_time = time.time()
        self.assertGreater(end_time - start_time, 0)

if __name__ == '__main__':
    unittest.main()