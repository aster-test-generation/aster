import unittest
from pypara.commons.errors import ProgrammingError

class TestProgrammingError(unittest.TestCase):
    def test_passert(self):
        ProgrammingError.passert(True, "message")

    def test_passert_false(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, "message")

    def test_passert_default_message(self):
        with self.assertRaises(ProgrammingError):
            ProgrammingError.passert(False, 'message')

if __name__ == '__main__':
    unittest.main()