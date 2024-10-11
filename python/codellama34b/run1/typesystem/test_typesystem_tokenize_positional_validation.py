import unittest
from typesystem.tokenize.positional_validation import *


class TestValidateWithPositions(unittest.TestCase):
    def test_validate_with_positions(self):
        token = Token('value', 1, 2)
        validator = Field()
        result = validate_with_positions(token=token, validator=validator)
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()