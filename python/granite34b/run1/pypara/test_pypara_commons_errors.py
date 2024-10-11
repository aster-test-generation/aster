import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_passert_with_true_condition(self):
        try:
            ProgrammingError.passert(True, "This should not raise an exception")
        except ProgrammingError as e:
            self.fail("passert raised ProgrammingError unexpectedly")

    def test_passert_with_false_condition_and_message(self):
        with self.assertRaises(ProgrammingError) as cm:
            ProgrammingError.passert(False, "This is the expected error message")
        self.assertEqual(str(cm.exception), "This is the expected error message")

    def test_passert_with_false_condition_and_no_message(self):
        with self.assertRaises(ProgrammingError) as cm:
            ProgrammingError.passert(False, None)
        self.assertEqual(str(cm.exception), "Broken coherence. Check your code against domain logic to fix it.")

if __name__ == '__main__':
    unittest.main()