import unittest
from mimesis.random import Random, get_random_item, random


class TestRandomClass(unittest.TestCase):
    def test_init(self):
        instance = Random()
        self.assertIsInstance(instance, Random)

    def test_randints(self):
        instance = Random()
        result = instance.randints(3, 1, 100)
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 3)

    def test_urandom(self):
        result = Random.urandom(10)
        self.assertIsInstance(result, bytes)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        instance = Random()
        result = instance.generate_string('abc', 5)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 5)

    def test_custom_code(self):
        instance = Random()
        result = instance.custom_code('@', 'a', '1')
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 1)

    def test_uniform(self):
        instance = Random()
        result = instance.uniform(0.0, 1.0)
        self.assertIsInstance(result, float)
        self.assertGreaterEqual(result, 0.0)
        self.assertLessEqual(result, 1.0)

    def test_randstr(self):
        instance = Random()
        result = instance.randstr()
        self.assertIsInstance(result, str)
        self.assertGreaterEqual(len(result), 16)
        self.assertLessEqual(len(result), 128)

    def test_private_method__random(self):
        instance = Random()
        result = instance._Random__random()
        self.assertIsInstance(result, float)
        self.assertGreaterEqual(result, 0.0)
        self.assertLessEqual(result, 1.0)

    def test_str_method(self):
        instance = Random()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = Random()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

class TestGetRandomItemFunction(unittest.TestCase):
    def test_get_random_item(self):
        enum = [1, 2, 3]
        result = get_random_item(enum)
        self.assertIn(result, enum)

    def test_get_random_item_with_random_instance(self):
        enum = [1, 2, 3]
        rnd = Random()
        result = get_random_item(enum, rnd)
        self.assertIn(result, enum)

class TestRandomInstance(unittest.TestCase):
    def test_random_instance(self):
        self.assertIsInstance(random, Random)

if __name__ == '__main__':
    unittest.main()