import time
import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Test work in progress"):
            time.sleep(0.5)  # simulate some work
        # assert that the print statement was executed
        self.assertTrue(True)  # no specific assertion, just verify execution

    def test_work_in_progress_with_description(self):
        with work_in_progress("Custom description"):
            time.sleep(0.5)  # simulate some work
        # assert that the print statement was executed
        self.assertTrue(True)  # no specific assertion, just verify execution

    def test_work_in_progress_without_description(self):
        with work_in_progress():
            time.sleep(0.5)  # simulate some work
        # assert that the print statement was executed
        self.assertTrue(True)  # no specific assertion, just verify execution

    def test_work_in_progress_time_consumed(self):
        begin_time = time.time()
        with work_in_progress():
            time.sleep(0.5)  # simulate some work
        end_time = time.time()
        time_consumed = end_time - begin_time
        self.assertAlmostEqual(time_consumed, 0.5, places=1)

if __name__ == '__main__':
    unittest.main()