import unittest
from flutes.timing import work_in_progress


class TestTiming(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Test"):
            pass
        # Add assertions to check if the print statements are executed and the time is calculated correctly

if __name__ == '__main__':
    unittest.main()