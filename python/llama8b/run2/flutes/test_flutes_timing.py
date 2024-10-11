import time
import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Test"):
            pass
        self.assertTrue(True)

    def test_work_in_progress_with_description(self):
        with work_in_progress("Test description"):
            pass
        self.assertTrue(True)

    def test_work_in_progress_with_yield(self):
        with work_in_progress("Test") as timer:
            time.sleep(0.1)
        self.assertGreater(time.time() - timer, 0.1)

    def test_work_in_progress_with_yield_and_description(self):
        with work_in_progress("Test description") as timer:
            time.sleep(0.1)
        self.assertGreater(time.time() - timer, 0.1)

    def test_work_in_progress_with_yield_and_description_and_time_consumed(self):
        with work_in_progress("Test description") as timer:
            time.sleep(0.1)
        self.assertGreater(time.time() - timer, 0.1)
        self.assertGreaterEqual(timer, 0.1)

if __name__ == '__main__':
    unittest.main()