import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_passert_true(self):
        ProgrammingError.passert(True, None)

    def test_passert_false(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, None)

    def test_passert_false_with_message(self):
        with self.assertRaises(ProgrammingError) as cm:
            ProgrammingError.passert(False, "Custom message")
        self.assertEqual(str(cm.exception), "Broken coherence. Check your code against domain logic to fix it. Custom message")

    def test_passert_true_with_message(self):
        ProgrammingError.passert(True, "Custom message")

if __name__ == '__main__':
    unittest.main()