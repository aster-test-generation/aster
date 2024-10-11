import unittest
from mimesis.providers.choice import Choice


class TestChoice(unittest.TestCase):
    def test_init(self):
        instance = Choice()
        self.assertIsInstance(instance, Choice)

    def test_call(self):
        instance = Choice()
        items = [1, 2, 3]
        result = instance(items, length=2)
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 2)

    def test_call_unique(self):
        instance = Choice()
        items = [1, 2, 3]
        result = instance(items, length=2, unique=True)
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 2)
        self.assertEqual(len(set(result)), 2)

    def test_call_length_zero(self):
        instance = Choice()
        items = [1, 2, 3]
        result = instance(items, length=0)
        self.assertIsNone(result)

    def test_call_invalid_length(self):
        instance = Choice()
        items = [1, 2, 3]
        with self.assertRaises(ValueError):
            instance(items, length=-1)

    def test_call_invalid_items(self):
        instance = Choice()
        with self.assertRaises(TypeError):
            instance(None, length=2)

    def test_call_empty_items(self):
        instance = Choice()
        with self.assertRaises(ValueError):
            instance([], length=2)

    def test_str_method(self):
        instance = Choice()
        result = instance.__str__()
        self.assertEqual(result, "Choice")

    def test_repr_method(self):
        instance = Choice()
        result = instance.__repr__()
        self.assertEqual(result, "Choice()")

    def test_eq_method(self):
        instance1 = Choice()
        instance2 = Choice()
        self.assertEqual(instance1, instance2)

if __name__ == '__main__':
    unittest.main()