import unittest
from mimesis.providers.choice import Choice

class TestChoice(unittest.TestCase):
    def setUp(self):
        self.choice = Choice()
    def test_call_without_params(self):
        result = self.choice()
        self.assertIsInstance(result, str)
    def test_call_with_items(self):
        items = ['a', 'b', 'c']
        result = self.choice(items)
        self.assertIn(result, items)
    def test_call_with_length(self):
        items = ['a', 'b', 'c']
        length = 2
        result = self.choice(items, length=length)
        self.assertEqual(len(result), length)
    def test_call_with_unique(self):
        items = ['a', 'b', 'c']
        length = 3
        result = self.choice(items, length=length, unique=True)
        self.assertEqual(len(set(result)), length)
    def test_call_with_invalid_length(self):
        items = ['a', 'b', 'c']
        length = -1
        with self.assertRaises(ValueError):
            self.choice(items, length=length)
    def test_call_with_invalid_items(self):
        items = []
        with self.assertRaises(ValueError):
            self.choice(items)
    def test_call_with_invalid_unique(self):
        items = ['a', 'b', 'c']
        length = 3
        with self.assertRaises(ValueError):
            self.choice(items, length=length, unique=True)
if __name__ == '__main__':
    unittest.main()