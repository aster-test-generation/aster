import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Test work in progress"):
            pass

    def test_work_in_progress_with_description(self):
        with work_in_progress("Test work in progress with description"):
            pass

    def test_work_in_progress_with_custom_description(self):
        with work_in_progress("Custom description"):
            pass

if __name__ == '__main__':
    unittest.main()