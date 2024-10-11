import unittest
from thonny.roughparse import _is_char_in_string, _build_char_in_string_func

class TestRoughParse(unittest.TestCase):
    def test_is_char_in_string(self):
        result = _is_char_in_string(0)
        self.assertEqual(result, 1)

    def test_build_char_in_string_func(self):
        func = _build_char_in_string_func(10)
        result = func(5)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()