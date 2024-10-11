import unittest
from mimesis.providers.choice import Choice
import collections.abc
import random


class TestChoice(unittest.TestCase):
    def test_init(self):
        choice = Choice()
        self.assertEqual(choice.Meta.name, 'choice')

    def test_call_with_sequence(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=2)
        self.assertEqual(len(result), 2)
        self.assertIn(result[0], items)
        self.assertIn(result[1], items)

    def test_call_with_tuple(self):
        choice = Choice()
        items = ('a', 'b', 'c')
        result = choice(items, length=2)
        self.assertEqual(len(result), 2)
        self.assertIn(result[0], items)
        self.assertIn(result[1], items)

    def test_call_with_string(self):
        choice = Choice()
        items = 'abc'
        result = choice(items, length=2)
        self.assertEqual(len(result), 2)
        self.assertIn(result[0], items)
        self.assertIn(result[1], items)

    def test_call_with_invalid_length(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        with self.assertRaises(ValueError):
            choice(items, length=-1)

    def test_call_with_invalid_items(self):
        choice = Choice()
        with self.assertRaises(TypeError):
            choice(None, length=1)

    def test_call_with_unique(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=3, unique=True)
        self.assertEqual(len(set(result)), 3)

    def test_call_with_non_unique(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=3, unique=False)
        self.assertEqual(len(result), 3)

    def test_call_with_insufficient_unique_items(self):
        choice = Choice()
        items = ['a', 'b']
        with self.assertRaises(ValueError):
            choice(items, length=3, unique=True)

    def test_str_method(self):
        choice = Choice()
        result = str(choice)
        self.assertEqual(result, 'mimesis.providers.choice.Choice')

    def test_repr_method(self):
        choice = Choice()
        result = repr(choice)
        self.assertEqual(result, 'mimesis.providers.choice.Choice()')

    def test_eq_method(self):
        choice1 = Choice()
        choice2 = Choice()
        self.assertEqual(choice1, choice2)

    def test_ne_method(self):
        choice1 = Choice()
        choice2 = object()
        self.assertNotEqual(choice1, choice2)

if __name__ == '__main__':
    unittest.main()