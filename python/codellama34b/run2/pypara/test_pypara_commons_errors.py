import unittest
from pypara.commons.errors import *


class TestProgrammingError(unittest.TestCase):
    def test_passert(self):
        ProgrammingError.passert(True, "Broken coherence. Check your code against domain logic to fix it.")

    def test_passert_with_message(self):
        ProgrammingError.passert(True, "Test message")

    def test_passert_with_false_condition(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, "Broken coherence. Check your code against domain logic to fix it.")

    def test_passert_with_false_condition_and_message(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, "Test message")

if __name__ == '__main__':
    unittest.main()