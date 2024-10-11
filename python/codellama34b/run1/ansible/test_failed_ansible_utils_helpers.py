
import unittest
from ansible.utils.helpers import *

class TestPctToInt(unittest.TestCase):
    def test_pct_to_int(self):
        result = pct_to_int(1, 100)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage(self):
        result = pct_to_int("10%", 100)
        self.assertEqual(result, 10)

    def test_pct_to_int_with_percentage_and_min_value(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_2(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_3(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_4(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_5(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_6(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_7(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_8(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_9(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_10(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_11(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_12(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

    def test_pct_to_int_with_percentage_and_min_value_13(self):
        result = pct_to_int("1%", 100, 10)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()