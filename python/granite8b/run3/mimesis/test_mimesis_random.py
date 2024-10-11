import unittest
from mimesis.random import Random, get_random_item, random


class TestRandom(unittest.TestCase):
    def test_randints(self):
        rnd = Random()
        result = rnd.randints(amount=5, a=1, b=10)
        self.assertEqual(len(result), 5)
        self.assertTrue(all(isinstance(x, int) for x in result))
        self.assertTrue(all(1 <= x <= 10 for x in result))

    def test_urandom(self):
        result = random.urandom(10)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        rnd = Random()
        result = rnd.generate_string(str_seq='@', length=10)
        self.assertEqual(len(result), 10)
        self.assertTrue(all(x in '@' for x in result))

    def test_custom_code(self):
        rnd = Random()
        result = rnd.custom_code(mask='@')
        self.assertEqual(len(result), 1)
        self.assertTrue(result.isalpha())

    def test_uniform(self):
        rnd = Random()
        result = rnd.uniform(a=0.0, b=1.0, precision=3)
        self.assertTrue(0.0 <= result <= 1.0)

    def test_randstr(self):
        rnd = Random()
        result = rnd.randstr(unique=True)
        self.assertEqual(len(result), 32)
        self.assertTrue(all(x in string.hexdigits for x in result))

class TestGetRandomItem(unittest.TestCase):
    def test_get_random_item(self):
        class ExampleEnum:
            A = 1
            B = 2
            C = 3
        result = get_random_item(ExampleEnum)
        self.assertTrue(result in ExampleEnum)

class TestRandom(unittest.TestCase):
    def test_urandom(self):
        result = random.urandom(10)
        self.assertEqual(len(result), 10)

if __name__ == '__main__':
    unittest.main()