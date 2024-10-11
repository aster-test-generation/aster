import unittest
from mimesis.providers.choice import Choice


class TestChoice(unittest.TestCase):
    def setUp(self):
        self.choice = Choice()

    def test_call_with_list(self):
        items = [1, 2, 3, 4, 5]
        result = self.choice(items)
        self.assertIn(result, items)

    def test_call_with_tuple(self):
        items = (1, 2, 3, 4, 5)
        result = self.choice(items)
        self.assertIn(result, items)

    def test_call_with_string(self):
        items = 'abcde'
        result = self.choice(items)
        self.assertIn(result, items)

    def test_call_with_length(self):
        items = [1, 2, 3, 4, 5]
        length = 3
        result = self.choice(items, length=length)
        self.assertEqual(len(result), length)

    def test_call_with_unique(self):
        items = [1, 2, 2, 3, 4, 5]
        length = 3
        result = self.choice(items, length=length, unique=True)
        self.assertEqual(len(result), len(set(result)))

    def test_call_with_invalid_length(self):
        items = [1, 2, 3, 4, 5]
        length = -1
        with self.assertRaises(ValueError):
            self.choice(items, length=length)

    def test_call_with_invalid_items(self):
        items = None
        with self.assertRaises(TypeError):
            self.choice(items)

    def test_call_with_empty_items(self):
        items = []
        with self.assertRaises(ValueError):
            self.choice(items)

    def test_call_with_not_enough_unique_items(self):
        items = [1, 2, 2, 3, 4, 5]
        length = 7
        with self.assertRaises(ValueError):
            self.choice(items, length=length, unique=True)

if __name__ == '__main__':
    unittest.main()