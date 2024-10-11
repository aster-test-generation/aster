import string
import unittest
from mimesis.random import Random


class TestRandom(unittest.TestCase):
    def setUp(self):
        self.random = Random()

    def test_randints(self):
        result = self.random.randints()
        self.assertIsInstance(result, list)
        self.assertGreater(len(result), 0)

    def test_urandom(self):
        result = self.random.urandom(10)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        result = self.random.generate_string(string.ascii_letters, 10)
        self.assertEqual(len(result), 10)

    def test_custom_code(self):
        result = self.random.custom_code()
        self.assertIsInstance(result, str)

    def test_uniform(self):
        result = self.random.uniform(1, 10)
        self.assertGreaterEqual(result, 1)
        self.assertLessEqual(result, 10)

    def test_randstr(self):
        result = self.random.randstr()
        self.assertIsInstance(result, str)
        self.assertGreater(len(result), 0)

if __name__ == '__main__':
    unittest.main()