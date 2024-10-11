import unittest
from mimesis.random import *


class TestRandom(unittest.TestCase):
    def test_randints(self):
        instance = Random()
        result = instance.randints(3, 1, 100)
        self.assertEqual(len(result), 3)

    def test_urandom(self):
        result = Random.urandom(10)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        instance = Random()
        result = instance.generate_string('abc', 3)
        self.assertEqual(len(result), 3)

    def test_custom_code(self):
        instance = Random()
        result = instance.custom_code('@c@d', 'c', 'd')
        self.assertEqual(len(result), 2)

    def test_uniform(self):
        instance = Random()
        result = instance.uniform(1.0, 2.0, 15)
        self.assertEqual(result, 1.0)

    def test_randstr(self):
        instance = Random()
        result = instance.randstr(True)
        self.assertEqual(len(result), 32)

class TestGetRandomItem(unittest.TestCase):
    def test_get_random_item(self):
        result = get_random_item(Random)
        self.assertEqual(result, Random)

if __name__ == '__main__':
    unittest.main()