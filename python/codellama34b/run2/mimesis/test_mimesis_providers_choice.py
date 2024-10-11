import unittest
from mimesis.providers.choice import *


class TestChoice(unittest.TestCase):
    def test_init(self):
        instance = Choice()
        self.assertIsInstance(instance, Choice)

    def test_call(self):
        instance = Choice()
        result = instance([1, 2, 3], 1, False)
        self.assertEqual(result, 1)

    def test_private_call(self):
        instance = Choice()
        result = instance._Choice__call__([1, 2, 3], 1, False)
        self.assertEqual(result, 1)

    def test_protected_call(self):
        instance = Choice()
        result = instance._Choice__call__([1, 2, 3], 1, False)
        self.assertEqual(result, 1)

    def test_str_method(self):
        instance = Choice()
        result = instance.__str__()
        self.assertEqual(result, "Choice")

    def test_repr_method(self):
        instance = Choice()
        result = instance.__repr__()
        self.assertEqual(result, "Choice(1)")

    def test_eq_method(self):
        instance = Choice()
        result = instance.__eq__([1, 2, 3], 1, False)
        self.assertEqual(result, 1)

    def test_init_method(self):
        instance = Choice()
        result = instance.__init__([1, 2, 3], 1, False)
        self.assertEqual(result, 1)

if __name__ == '__main__':
    unittest.main()