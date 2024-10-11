import unittest
from string_utils.generation import *


class TestUUID(unittest.TestCase):
    def test_uuid(self):
        result = uuid()
        self.assertIsInstance(result, str)

    def test_uuid_as_hex(self):
        result = uuid(True)
        self.assertIsInstance(result, str)

class TestRandomString(unittest.TestCase):
    def test_random_string(self):
        result = random_string(1)
        self.assertIsInstance(result, str)

    def test_random_string_size(self):
        result = random_string(100)
        self.assertIsInstance(result, str)

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex(self):
        result = secure_random_hex(1)
        self.assertIsInstance(result, str)

    def test_secure_random_hex_byte_count(self):
        result = secure_random_hex(100)
        self.assertIsInstance(result, str)

class TestRomanRange(unittest.TestCase):
    def test_roman_range(self):
        result = roman_range(1, 1)
        self.assertIsInstance(result, Generator)

    def test_roman_range_stop(self):
        result = roman_range(100)
        self.assertIsInstance(result, generator)

    def test_roman_range_start(self):
        result = roman_range(1, 11)
        self.assertIsInstance(result, Generator)

    def test_roman_range_step(self):
        result = roman_range(1, 10, 1)
        self.assertIsInstance(result, Generator)

if __name__ == '__main__':
    unittest.main()