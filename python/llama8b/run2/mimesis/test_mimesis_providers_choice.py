import unittest
from mimesis.providers.choice import Choice
from mimesis import random
from collections.abc import Sequence
from typing import Any, Optional, Sequence, Union


class TestChoice(unittest.TestCase):
    def test_init(self):
        choice = Choice()
        self.assertIsInstance(choice, Choice)

    def test_call(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=2, unique=True)
        self.assertIsInstance(result, list)
        self.assertEqual(len(result), 2)
        self.assertEqual(set(result), set(items[:2]))

    def test_call_with_empty_items(self):
        choice = Choice()
        items = []
        with self.assertRaises(ValueError):
            choice(items, length=1)

    def test_call_with_non_integer_length(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        with self.assertRaises(TypeError):
            choice(items, length='a')

    def test_call_with_negative_length(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        with self.assertRaises(ValueError):
            choice(items, length=-1)

    def test_call_with_zero_length(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=0)
        self.assertEqual(result, [])

    def test_call_with_non_sequence_items(self):
        choice = Choice()
        items = 'abc'
        with self.assertRaises(TypeError):
            choice(items, length=1)

    def test_call_with_tuple_items(self):
        choice = Choice()
        items = ('a', 'b', 'c')
        result = choice(items, length=2, unique=True)
        self.assertIsInstance(result, tuple)
        self.assertEqual(len(result), 2)
        self.assertEqual(set(result), set(items[:2]))

    def test_call_with_string_items(self):
        choice = Choice()
        items = 'abc'
        result = choice(items, length=2, unique=True)
        self.assertIsInstance(result, str)
        self.assertEqual(len(result), 2)
        self.assertEqual(set(result), set(items[:2]))

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

    def test_private_method(self):
        choice = Choice()
        with self.assertRaises(AttributeError):
            choice.__private_method()

if __name__ == '__main__':
    unittest.main()