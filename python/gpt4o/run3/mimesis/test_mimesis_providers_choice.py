import unittest
from mimesis.providers.choice import Choice
from mimesis.exceptions import NonEnumerableError


class TestChoice(unittest.TestCase):
    def setUp(self):
        self.choice = Choice()

    def test_meta_name(self):
        self.assertEqual(self.choice.Meta.name, 'choice')

    def test_init(self):
        self.assertIsInstance(self.choice, Choice)

    def test_call_with_valid_items_and_length(self):
        items = [1, 2, 3, 4, 5]
        result = self.choice(items, length=3)
        self.assertEqual(len(result), 3)

    def test_call_with_valid_items_and_zero_length(self):
        items = [1, 2, 3, 4, 5]
        result = self.choice(items, length=0)
        self.assertIn(result, items)

    def test_call_with_unique_items(self):
        items = [1, 2, 3, 4, 5]
        result = self.choice(items, length=3, unique=True)
        self.assertEqual(len(result), 3)
        self.assertEqual(len(set(result)), 3)

    def test_call_with_non_unique_items(self):
        items = [1, 1, 1, 1, 1]
        with self.assertRaises(ValueError):
            self.choice(items, length=3, unique=True)

    def test_call_with_invalid_length_type(self):
        items = [1, 2, 3, 4, 5]
        with self.assertRaises(TypeError):
            self.choice(items, length='3')

    def test_call_with_invalid_items_type(self):
        items = 12345
        with self.assertRaises(TypeError):
            self.choice(items, length=3)

    def test_call_with_empty_items(self):
        items = []
        with self.assertRaises(ValueError):
            self.choice(items, length=3)

    def test_call_with_negative_length(self):
        items = [1, 2, 3, 4, 5]
        with self.assertRaises(ValueError):
            self.choice(items, length=-1)

    def test_call_with_list_items(self):
        items = [1, 2, 3, 4, 5]
        result = self.choice(items, length=3)
        self.assertIsInstance(result, list)

    def test_call_with_tuple_items(self):
        items = (1, 2, 3, 4, 5)
        result = self.choice(items, length=3)
        self.assertIsInstance(result, tuple)

    def test_call_with_string_items(self):
        items = 'abcde'
        result = self.choice(items, length=3)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()