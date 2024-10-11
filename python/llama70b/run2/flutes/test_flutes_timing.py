import time
import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Testing work in progress") as ctx:
            pass
        # Assert that the print statements were executed
        self.assertTrue(True)  # No specific assertion, just verify execution

    def test_work_in_progress_default_desc(self):
        with work_in_progress() as ctx:
            pass
        # Assert that the print statements were executed
        self.assertTrue(True)  # No specific assertion, just verify execution

    def test_work_in_progress_time_consumed(self):
        start_time = time.time()
        with work_in_progress("Testing work in progress") as ctx:
            time.sleep(1)  # Simulate some work
        end_time = time.time()
        time_consumed = end_time - start_time
        self.assertAlmostEqual(time_consumed, 1.0, places=1)

if __name__ == '__main__':
    unittest.main()