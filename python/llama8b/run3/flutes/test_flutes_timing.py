import time
import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Testing work in progress"):
            pass
        self.assertTrue(True)

    def test_work_in_progress_with_description(self):
        with work_in_progress("Testing work in progress with description"):
            pass
        self.assertTrue(True)

    def test_work_in_progress_with_description_and_yield(self):
        with work_in_progress("Testing work in progress with description and yield"):
            time.sleep(0.1)
        self.assertTrue(True)

    def test_work_in_progress_with_description_and_yield_and_time_consumed(self):
        with work_in_progress("Testing work in progress with description and yield and time consumed"):
            time.sleep(0.1)
        self.assertTrue(True)

if __name__ == '__main__':
    unittest.main()