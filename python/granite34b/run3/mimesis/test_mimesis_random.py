import string
import unittest
from mimesis.random import Random, get_random_item, random


class TestRandom(unittest.TestCase):
    def setUp(self):
        self.random = Random()

    def test_randints(self):
        result = self.random.randints()
        self.assertTrue(isinstance(result, list))
        self.assertTrue(all(isinstance(x, int) for x in result))

    def test_urandom(self):
        result = self.random.urandom()
        self.assertTrue(isinstance(result, bytes))

    def test_generate_string(self):
        result = self.random.generate_string(string.ascii_letters, 10)
        self.assertTrue(isinstance(result, str))
        self.assertEqual(len(result), 10)

    def test_custom_code(self):
        result = self.random.custom_code()
        self.assertTrue(isinstance(result, str))

    def test_uniform(self):
        result = self.random.uniform(1, 10)
        self.assertTrue(isinstance(result, float))

    def test_randstr(self):
        result = self.random.randstr()
        self.assertTrue(isinstance(result, str))

class TestGetRandomItem(unittest.TestCase):
    def test_get_random_item(self):
        result = get_random_item(string.ascii_letters)
        self.assertTrue(isinstance(result, str))

class TestRandomModule(unittest.TestCase):
    def test_random(self):
        result = random.randint(1, 10)
        self.assertTrue(isinstance(result, int))

if __name__ == '__main__':
    unittest.main()