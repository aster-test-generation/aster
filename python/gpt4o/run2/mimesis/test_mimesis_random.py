import unittest
from mimesis.random import Random, get_random_item, random as random_instance
import string
import uuid


class TestRandom(unittest.TestCase):
    def setUp(self):
        self.instance = Random()

    def test_randints(self):
        result = self.instance.randints(3, 1, 10)
        self.assertEqual(len(result), 3)
        for num in result:
            self.assertTrue(1 <= num <= 10)

    def test_randints_invalid_amount(self):
        with self.assertRaises(ValueError):
            self.instance.randints(0)

    def test_urandom(self):
        result = Random.urandom(5)
        self.assertEqual(len(result), 5)

    def test_generate_string(self):
        result = self.instance.generate_string(string.ascii_letters, 10)
        self.assertEqual(len(result), 10)
        for char in result:
            self.assertIn(char, string.ascii_letters)

    def test_custom_code(self):
        result = self.instance.custom_code(mask='@@@###', char='@', digit='#')
        self.assertEqual(len(result), 6)
        for char in result[:3]:
            self.assertTrue(char.isalpha())
        for char in result[3:]:
            self.assertTrue(char.isdigit())

    def test_custom_code_same_placeholder(self):
        with self.assertRaises(ValueError):
            self.instance.custom_code(mask='@@@###', char='@', digit='@')

    def test_uniform(self):
        result = self.instance.uniform(1.0, 2.0, 5)
        self.assertTrue(1.0 <= result <= 2.0)
        self.assertEqual(len(str(result).split('.')[1]), 5)

    def test_randstr_unique(self):
        result = self.instance.randstr(unique=True)
        self.assertEqual(len(result), 32)
        self.assertTrue(uuid.UUID(result, version=4))

    def test_randstr_non_unique(self):
        result = self.instance.randstr(unique=False, length=10)
        self.assertEqual(len(result), 10)
        for char in result:
            self.assertIn(char, string.ascii_letters + string.digits)

    def test_randstr_default_length(self):
        result = self.instance.randstr(unique=False)
        self.assertTrue(16 <= len(result) <= 128)

class TestGetRandomItem(unittest.TestCase):
    def test_get_random_item_with_instance(self):
        enum = [1, 2, 3, 4, 5]
        result = get_random_item(enum, random_instance)
        self.assertIn(result, enum)

    def test_get_random_item_without_instance(self):
        enum = [1, 2, 3, 4, 5]
        result = get_random_item(enum)
        self.assertIn(result, enum)

if __name__ == '__main__':
    unittest.main()