import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_passert_true_condition(self):
        # Test passert with a true condition
        try:
            ProgrammingError.passert(True, "This should not raise an error")
        except ProgrammingError:
            self.fail("ProgrammingError was raised unexpectedly!")

    def test_passert_false_condition_with_message(self):
        # Test passert with a false condition and a custom message
        with self.assertRaises(ProgrammingError) as context:
            ProgrammingError.passert(False, "Custom error message")
        self.assertEqual(str(context.exception), "Custom error message")

    def test_passert_false_condition_without_message(self):
        # Test passert with a false condition and no custom message
        with self.assertRaises(ProgrammingError) as context:
            ProgrammingError.passert(False, None)
        self.assertEqual(str(context.exception), "Broken coherence. Check your code against domain logic to fix it.")

if __name__ == '__main__':
    unittest.main()