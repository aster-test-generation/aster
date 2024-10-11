import string
import unittest
from mimesis.random import Random


class TestRandom(unittest.TestCase):
    def test_randints(self):
        random = Random()
        result = random.randints(amount=5, a=1, b=10)
        self.assertEqual(len(result), 5)
        self.assertTrue(all(isinstance(x, int) for x in result))
        self.assertTrue(all(1 <= x <= 10 for x in result))

    def test_urandom(self):
        random = Random()
        result = random.urandom(10)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        random = Random()
        result = random.generate_string(str_seq='abc', length=5)
        self.assertEqual(len(result), 5)
        self.assertTrue(all(x in 'abc' for x in result))

    def test_custom_code(self):
        random = Random()
        result = random.custom_code(mask='@')
        self.assertEqual(len(result), 10)
        self.assertTrue(all(x in '@' for x in result))

    def test_uniform(self):
        random = Random()
        result = random.uniform(a=0, b=1)
        self.assertTrue(0 <= result <= 1)

    def test_randstr(self):
        random = Random()
        result = random.randstr(unique=True)
        self.assertEqual(len(result), 32)
        self.assertTrue(all(x in string.hexdigits for x in result))

if __name__ == '__main__':
    unittest.main()