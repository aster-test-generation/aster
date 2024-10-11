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
        result = instance.custom_code('@', 'a', 'd')
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 1)

    def test_uniform(self):
        instance = Random()
        result = instance.uniform(1.0, 2.0)
        self.assertIsInstance(result, float)

    def test_randstr(self):
        instance = Random()
        result = instance.randstr(unique=False, length=10)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 10)

    def test_str_method(self):
        instance = Random()
        result = instance.__str__()
        self.assertIsInstance(result, str)

    def test_repr_method(self):
        instance = Random()
        result = instance.__repr__()
        self.assertIsInstance(result, str)

    def test_eq_method(self):
        instance1 = Random()
        instance2 = Random()
        self.assertNotEqual(instance1, instance2)

    def test_private_method(self):
        instance = Random()
        result = instance._Random__random()
        self.assertIsInstance(result, float)

class TestGetRandomItemFunction(unittest.TestCase):
    def test_get_random_item(self):
        enum = [1, 2, 3]
        result = get_random_item(enum)
        self.assertIn(result, enum)

class TestRandomInstance(unittest.TestCase):
    def test_random_instance(self):
        result = random.randints(3, 1, 100)
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 3)

if __name__ == '__main__':
    unittest.main()