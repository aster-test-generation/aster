import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress("Test work in progress"):
            pass

    def test_work_in_progress_with_custom_description(self):
        with work_in_progress("Custom description"):
            pass

    def test_work_in_progress_context_manager(self):
        with work_in_progress("Test context manager"):
            pass

    def test_work_in_progress_context_manager_with_custom_description(self):
        with work_in_progress("Custom context manager description"):
            pass

if __name__ == '__main__':
    unittest.main()