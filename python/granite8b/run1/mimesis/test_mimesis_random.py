import unittest
from mimesis.random import Random, get_random_item, random


class TestRandom(unittest.TestCase):
    def test_randints(self):
        random_instance = Random()
        result = random_instance.randints(amount=5, a=1, b=10)
        self.assertEqual(len(result), 5)
        self.assertTrue(all(isinstance(x, int) for x in result))
        self.assertTrue(all(1 <= x <= 10 for x in result))

    def test_urandom(self):
        result = Random.urandom(10)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        random_instance = Random()
        result = random_instance.generate_string(str_seq='@', length=10)
        self.assertEqual(len(result), 10)
        self.assertTrue(all(x in '@' for x in result))

    def test_custom_code(self):
        random_instance = Random()
        result = random_instance.custom_code(mask='@')
        self.assertEqual(len(result), 1)
        self.assertTrue(result.isalpha())

    def test_uniform(self):
        random_instance = Random()
        result = random_instance.uniform(a=0, b=1)
        self.assertTrue(0 <= result <= 1)

    def test_randstr(self):
        result = random.randstr(unique=True)
        self.assertEqual(len(result), 32)
        self.assertTrue(result.isalnum())

class TestGetRandomItem(unittest.TestCase):
    def test_get_random_item(self):
        result = get_random_item(enum=[1, 2, 3])
        self.assertTrue(result in [1, 2, 3])

if __name__ == '__main__':
    unittest.main()