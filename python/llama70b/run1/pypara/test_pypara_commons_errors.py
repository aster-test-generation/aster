import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_init(self):
        instance = ProgrammingError("Test error message")
        self.assertIsInstance(instance, Exception)

    def test_str_method(self):
        instance = ProgrammingError("Test error message")
        result = instance.__str__()
        self.assertEqual(result, "Test error message")

    def test_repr_method(self):
        instance = ProgrammingError("Test error message")
        result = instance.__repr__()
        self.assertEqual(result, "ProgrammingError('Test error message')")

    def test_eq_method(self):
        instance1 = ProgrammingError("Test error message")
        instance2 = ProgrammingError("Test error message")
        self.assertTrue(instance1 == instance2)

    def test_passert_true(self):
        ProgrammingError.passert(True, "Test message")
        # No exception raised, so test passes

    def test_passert_false(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, "Test message")

    def test_passert_false_default_message(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, None)
        # Default message should be "Broken coherence. Check your code against domain logic to fix it."

if __name__ == '__main__':
    unittest.main()