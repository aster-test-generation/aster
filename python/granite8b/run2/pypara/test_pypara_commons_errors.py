import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_passert_true(self):
        ProgrammingError.passert(True, None)

    def test_passert_false(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, None)

    def test_passert_false_with_message(self):
        with self.assertRaisesRegex(ProgrammingError, "Custom message"):
            ProgrammingError.passert(False, "Custom message")

if __name__ == '__main__':
    unittest.main()