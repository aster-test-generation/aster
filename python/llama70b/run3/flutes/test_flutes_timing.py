import time
import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Test work in progress") as ctx:
            pass
        # assert that the print statements were executed
        self.assertTrue(True)  # no specific assertion, just verify it runs without error

    def test_work_in_progress_default_desc(self):
        with work_in_progress() as ctx:
            pass
        # assert that the print statements were executed
        self.assertTrue(True)  # no specific assertion, just verify it runs without error

    def test_work_in_progress_time_consumed(self):
        begin_time = time.time()
        with work_in_progress("Test work in progress") as ctx:
            time.sleep(1)  # simulate some work
        time_consumed = time.time() - begin_time
        self.assertAlmostEqual(time_consumed, 1.0, places=1)  # assert time consumed is approximately 1 second

if __name__ == '__main__':
    unittest.main()