from mimesis.random import get_random_item
import string
import unittest
from mimesis.random import Random


class TestRandom(unittest.TestCase):
    def test_randints(self):
        random_instance = Random()
        result = random_instance.randints(amount=3, a=1, b=100)
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 3)
        for num in result:
            self.assertGreaterEqual(num, 1)
            self.assertLessEqual(num, 100)

    def test_urandom(self):
        random_instance = Random()
        result = random_instance.urandom(10)
        self.assertIsInstance(result, bytes)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        random_instance = Random()
        result = random_instance.generate_string('abc', length=5)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 5)
        for char in result:
            self.assertIn(char, 'abc')

    def test_custom_code(self):
        random_instance = Random()
        result = random_instance.custom_code(mask='@#', char='A', digit='0')
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), len('@#'))
        for char in result:
            if char == '@':
                self.assertIn(char, 'ABCDEFGHIJKLMNOPQRSTUVWXYZ')
            elif char == '#':
                self.assertIn(char, '0123456789')
            else:
                self.assertIn(char, 'A0')

    def test_uniform(self):
        random_instance = Random()
        result = random_instance.uniform(a=0, b=10, precision=2)
        self.assertIsInstance(result, float)
        self.assertGreaterEqual(result, 0)
        self.assertLessEqual(result, 10)
        self.assertEqual(len(str(result).split('.')[1]), 2)

    def test_randstr(self):
        random_instance = Random()
        result = random_instance.randstr(unique=False, length=10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 10)
        for char in result:
            self.assertIn(char, string.ascii_letters + string.digits)

    def test_get_random_item(self):
        enum = {'a', 'b', 'c'}
        random_instance = Random()
        result = get_random_item(enum, random_instance)
        self.assertIn(result, enum)

    def test_get_random_item_no_rnd(self):
        enum = {'a', 'b', 'c'}
        result = get_random_item(enum)
        self.assertIn(result, enum)

if __name__ == '__main__':
    unittest.main()