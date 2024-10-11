import unittest
from mimesis.providers.choice import Choice

class TestChoice(unittest.TestCase):
    def setUp(self):
        self.choice = Choice()
    def test_call_with_list(self):
        items = [1, 2, 3]
        result = self.choice(items)
        self.assertIn(result, items)
    def test_call_with_tuple(self):
        items = (1, 2, 3)
        result = self.choice(items)
        self.assertIn(result, items)
    def test_call_with_string(self):
        items = 'abc'
        result = self.choice(items)
        self.assertIn(result, items)
    def test_call_with_length(self):
        items = [1, 2, 3]
        length = 2
        result = self.choice(items, length=length)
        self.assertEqual(len(result), length)
    def test_call_with_unique(self):
        items = [1, 2, 3]
        length = 3
        result = self.choice(items, length=length, unique=True)
        self.assertEqual(len(result), len(set(result)))
    def test_call_with_invalid_length(self):
        items = [1, 2, 3]
        length = -1
        with self.assertRaises(ValueError):
            self.choice(items, length=length)
    def test_call_with_invalid_items(self):
        items = []
        with self.assertRaises(ValueError):
            self.choice(items)
    def test_call_with_invalid_unique(self):
        items = [1, 2, 3]
        length = 4
        with self.assertRaises(ValueError):
            self.choice(items, length=length, unique=True)
if __name__ == '__main__':
    unittest.main()