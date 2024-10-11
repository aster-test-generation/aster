import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_passert_true(self):
        ProgrammingError.passert(True, "Test message")
        self.fail("ProgrammingError should not be raised")

    def test_passert_false(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, "Test message")

    def test_passert_no_message(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False)

    def test_passert_message(self):
        with self.assertRaises(ProgrammingError) as e:
            ProgrammingError.passert(False, "Test message")
        self.assertEqual(str(e.exception), "Test message")

    def test_str_method(self):
        error = ProgrammingError("Test message")
        self.assertEqual(str(error), "Test message")

    def test_repr_method(self):
        error = ProgrammingError("Test message")
        self.assertEqual(repr(error), "ProgrammingError('Test message')")

    def test_eq_method(self):
        error1 = ProgrammingError("Test message 1")
        error2 = ProgrammingError("Test message 2")
        self.assertNotEqual(error1, error2)

if __name__ == '__main__':
    unittest.main()