import unittest
from mimesis.random import *


class TestRandom(unittest.TestCase):
    def test_randints(self):
        instance = Random()
        result = instance.randints(3, 1, 100)
        self.assertEqual(len(result), 3)
        self.assertTrue(all(1 <= x <= 100 for x in result))

    def test_urandom(self):
        result = Random.urandom(10)
        self.assertEqual(len(result), 10)

    def test_generate_string(self):
        instance = Random()
        result = instance.generate_string('abcd', 5)
        self.assertEqual(len(result), 5)
        self.assertTrue(all(x in 'abcd' for x in result))

    def test_custom_code(self):
        instance = Random()
        result = instance.custom_code('@#')
        self.assertEqual(len(result), 2)
        self.assertTrue(all(x in '@#' for x in result))

    def test_uniform(self):
        instance = Random()
        result = instance.uniform(1.0, 2.0)
        self.assertTrue(1.0 <= result <= 2.0)

    def test_randstr(self):
        instance = Random()
        result = instance.randstr()
        self.assertEqual(len(result), 16)
        self.assertTrue(all(x in string.ascii_letters + string.digits
                            for x in result))

class TestGetRandomItem(unittest.TestCase):
    def test_get_random_item(self):
        class TestEnum:
            A = 1
            B = 2
            C = 3
        result = get_random_item(TestEnum)
        self.assertIn(result, [TestEnum.A, TestEnum.B, TestEnum.C])

if __name__ == '__main__':
    unittest.main()