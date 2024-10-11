import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_init(self):
        instance = ProgrammingError("Test error message")
        self.assertIsInstance(instance, Exception)

    def test_str(self):
        instance = ProgrammingError("Test error message")
        result = str(instance)
        self.assertEqual(result, "Test error message")

    def test_repr(self):
        instance = ProgrammingError("Test error message")
        result = repr(instance)
        self.assertEqual(result, "ProgrammingError('Test error message')")

    def test_eq(self):
        instance1 = ProgrammingError("Test error message")
        instance2 = ProgrammingError("Test error message")
        self.assertEqual(instance1, instance2)

    def test_passert_true(self):
        ProgrammingError.passert(True, "Test message")
        # No exception raised, so the test passes

    def test_passert_false(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, "Test message")

    def test_passert_false_default_message(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, None)
        # The default message should be "Broken coherence. Check your code against domain logic to fix it."

if __name__ == '__main__':
    unittest.main()