import unittest
from mimesis.random import Random, get_random_item, random


class TestRandom(unittest.TestCase):
    def test_randints(self):
        result = random.randints(amount=3, a=1, b=100)
        self.assertEqual(len(result), 3)
        for item in result:
            self.assertTrue(1 <= item <= 100)

    def test_urandom(self):
        result = random.urandom(10)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        result = random.generate_string(str_seq='abc', length=5)
        self.assertEqual(len(result), 5)
        for item in result:
            self.assertTrue(item in 'abc')

    def test_custom_code(self):
        result = random.custom_code(mask='@char: str = @', digit='0')
        self.assertEqual(len(result), 2)
        self.assertTrue(result[0].isalpha())
        self.assertTrue(result[1].isdigit())

    def test_uniform(self):
        result = random.uniform(a=1.0, b=2.0, precision=1)
        self.assertTrue(1.0 <= result <= 2.0)
        self.assertTrue(result % 1 == 0.0)

    def test_randstr(self):
        result1 = random.randstr(unique=True)
        result2 = random.randstr(unique=True)
        self.assertNotEqual(result1, result2)
        result3 = random.randstr(unique=False)
        result4 = random.randstr(unique=False)
        self.assertEqual(result3, result4)

class TestGetRandomItem(unittest.TestCase):
    def test_get_random_item(self):
        result = get_random_item(enum=range(10))
        self.assertTrue(0 <= result <= 9)

if __name__ == '__main__':
    unittest.main()