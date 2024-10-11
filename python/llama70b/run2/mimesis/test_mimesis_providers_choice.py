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

    def test_call_tuple(self):
        instance = Choice()
        items = (1, 2, 3)
        result = instance(items, length=2)
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)

    def test_call_string(self):
        instance = Choice()
        items = 'abc'
        result = instance(items, length=2)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 2)

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
        self.assertEqual(result, 'choice')

    def test_repr_method(self):
        instance = Choice()
        result = instance.__repr__()
        self.assertEqual(result, 'Choice()')

if __name__ == '__main__':
    unittest.main()