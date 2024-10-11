import unittest
from pypara.commons.errors import ProgrammingError


class TestProgrammingError(unittest.TestCase):
    def test_passert(self):
        condition = True
        message = "Broken coherence. Check your code against domain logic to fix it."
        ProgrammingError.passert(condition, message)

    def test_passert_with_message(self):
        condition = False
        message = "Test message"
        with self.assertRaises(ProgrammingError) as context:
            ProgrammingError.passert(condition, message)
        self.assertEqual(str(context.exception), message)

    def test_passert_without_message(self):
        condition = False
        message = "Broken coherence. Check your code against domain logic to fix it."
        with self.assertRaises(ProgrammingError) as context:
            ProgrammingError.passert(condition, message)
        self.assertEqual(str(context.exception), message)

if __name__ == '__main__':
    unittest.main()