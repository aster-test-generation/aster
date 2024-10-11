import unittest
from flutes.timing import work_in_progress


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress():
            pass

    def test_work_in_progress_with_description(self):
        with work_in_progress("Doing something"):
            pass

    def test_work_in_progress_context_manager(self):
        with work_in_progress() as wip:
            self.assertEqual(wip.get_desc(), "Work in progress")
            self.assertIsInstance(wip.begin_time, float)
        self.assertIsInstance(wip.time_consumed, float)

    def test_work_in_progress_context_manager_with_description(self):
        with work_in_progress("Doing something") as wip:
            self.assertEqual(wip.desc, "Doing something")
            self.assertIsInstance(wip.begin_time, float)
        self.assertIsInstance(wip.time_consumed, float)

if __name__ == '__main__':
    unittest.main()