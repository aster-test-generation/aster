import unittest
from flutes.timing import *


class TestWorkInProgress(unittest.TestCase):
    def test_work_in_progress(self):
        with work_in_progress() as wip:
            self.assertEqual(wip, None)

if __name__ == '__main__':
    unittest.main()