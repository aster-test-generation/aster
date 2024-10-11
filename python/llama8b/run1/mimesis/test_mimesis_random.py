import unittest
from mimesis.random import Random, get_random_item


class TestRandom(unittest.TestCase):
    def test_randints(self):
        random_instance = Random()
        result = random_instance.randints(3, 1, 100)
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
        result = random_instance.generate_string('abc', 5)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 5)

    def test_custom_code(self):
        random_instance = Random()
        result = random_instance.custom_code('@', '@', '#')
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 1)

    def test_uniform(self):
        random_instance = Random()
        result = random_instance.uniform(1.0, 10.0, 2)
        self.assertIsInstance(result, float)
        self.assertGreaterEqual(result, 1.0)
        self.assertLessEqual(result, 10.0)

    def test_randstr(self):
        random_instance = Random()
        result = random_instance.randstr()
        self.assertIsInstance(result, str)
        self.assertGreaterEqual(len(result), 16)
        self.assertLessEqual(len(result), 128)

    def test_randstr_unique(self):
        random_instance = Random()
        result = random_instance.randstr(unique=True)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 32)

    def test_get_random_item(self):
        enum = {'a', 'b', 'c'}
        result = get_random_item(enum)
        self.assertIn(result, enum)

    def test_get_random_item_with_random(self):
        enum = {'a', 'b', 'c'}
        random_instance = Random()
        result = get_random_item(enum, random_instance)
        self.assertIn(result, enum)

if __name__ == '__main__':
    unittest.main()