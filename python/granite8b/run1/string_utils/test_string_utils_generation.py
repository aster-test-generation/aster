import unittest
from string_utils.generation import uuid, random_string, secure_random_hex, roman_range


class TestUuid(unittest.TestCase):
    def test_uuid_hex(self):
        uuid_hex = uuid(as_hex=True)
        self.assertEqual(len(uuid_hex), 32)
        self.assertTrue(uuid_hex.isalnum())

    def test_uuid_str(self):
        uuid_str = uuid(as_hex=False)
        self.assertEqual(len(uuid_str), 36)
        self.assertTrue(uuid_str.isalnum())

class TestRandomString(unittest.TestCase):
    def test_random_string_length(self):
        string_length = 10
        random_string = random_string(string_length)
        self.assertEqual(len(random_string), string_length)

    def test_random_string_characters(self):
        string_length = 10
        random_string = random_string(string_length)
        self.assertTrue(all(c in string.ascii_letters + string.digits for c in random_string))

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_length(self):
        byte_count = 10
        random_hex = secure_random_hex(byte_count)
        self.assertEqual(len(random_hex), byte_count * 2)

    def test_secure_random_hex_characters(self):
        byte_count = 10
        random_hex = secure_random_hex(byte_count)
        self.assertTrue(all(c in '0123456789abcdefABCDEF' for c in random_hex))

class TestRomanRange(unittest.TestCase):
    def test_roman_range_forward(self):
        start = 1
        stop = 10
        step = 1
        roman_range_list = list(roman_range(stop, start, step))
        expected_roman_range_list = ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX']
        self.assertEqual(roman_range_list, expected_roman_range_list)

    def test_roman_range_backward(self):
        start = 10
        stop = 1
        step = -1
        roman_range_list = list(roman_range(stop, start, step))
        expected_roman_range_list = ['X', 'IX', 'VIII', 'VII', 'VI', 'V', 'IV', 'III', 'II', 'I']
        self.assertEqual(roman_range_list, expected_roman_range_list)

    def test_roman_range_step_size(self):
        start = 1
        stop = 10
        step = 2
        roman_range_list = list(roman_range(start, stop, step))
        expected_roman_range_list = ['I', 'III', 'V', 'VII', 'IX']
        self.assertEqual(roman_range_list, expected_roman_range_list)

class TestUuid(unittest.TestCase):
    def test_uuid_as_hex(self):
        uuid_hex = uuid(as_hex=True)
        self.assertEqual(len(uuid_hex), 32)

    def test_uuid_as_string(self):
        uuid_str = uuid(as_hex=False)
        self.assertEqual(len(uuid_str), 36)

class TestRandomString(unittest.TestCase):
    def test_random_string_length(self):
        random_str = random_string(10)
        self.assertEqual(len(random_str), 10)

    def test_random_string_chars(self):
        random_str = random_string(10)
        self.assertTrue(all(c in string.ascii_letters + string.digits for c in random_str))

class TestSecureRandomHex(unittest.TestCase):
    def test_secure_random_hex_length(self):
        random_hex = secure_random_hex(10)
        self.assertEqual(len(random_hex), 20)

    def test_secure_random_hex_chars(self):
        random_hex = secure_random_hex(10)
        self.assertTrue(all(c in string.hexdigits for c in random_hex))

class TestRomanRange(unittest.TestCase):
    def test_roman_range_forward(self):
        roman_range_list = list(roman_range(10))
        self.assertEqual(roman_range_list, ['I', 'II', 'III', 'IV', 'V', 'VI', 'VII', 'VIII', 'IX', 'X'])

    def test_roman_range_backward(self):
        roman_range_list = list(roman_range(10, step=-1))
        self.assertEqual(roman_range_list, ['X', 'IX', 'VIII', 'VII', 'VI', 'V', 'IV', 'III', 'II', 'I'])

    def test_roman_range_invalid_start_stop_step(self):
        with self.assertRaises(OverflowError):
            list(roman_range(1, start=10000, step=1))
        with self.assertRaises(OverflowError):
            list(roman_range(1, start=-10000, step=1))
        with self.assertRaises(OverflowError):
            list(roman_range(1, start=1, step=10000))
        with self.assertRaises(OverflowError):
            list(roman_range(1, start=1, step=-10000))

if __name__ == '__main__':
    unittest.main()