import unittest
from mimesis.providers.choice import Choice


class TestChoice(unittest.TestCase):
    def test___init__(self):
        choice = Choice()
        self.assertIsInstance(choice, Choice)

    def test___call__(self):
        choice = Choice()
        items = [1, 2, 3]
        result = choice(items, length=2, unique=True)
        self.assertEqual(result, [2, 3])

    def test___call___with_non_sequence(self):
        choice = Choice()
        items = 1
        with self.assertRaises(TypeError):
            choice(items)

    def test___call___with_empty_sequence(self):
        choice = Choice()
        items = []
        with self.assertRaises(ValueError):
            choice(items)

    def test___call___with_negative_length(self):
        choice = Choice()
        items = [1, 2, 3]
        with self.assertRaises(ValueError):
            choice(items, length=-1)

    def test___call___with_unique_and_not_enough_unique_elements(self):
        choice = Choice()
        items = [1, 2, 3]
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_tuple(self):
        choice = Choice()
        items = (1, 2, 3)
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_string(self):
        choice = Choice()
        items = '123'
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_set(self):
        choice = Choice()
        items = {1, 2, 3}
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_frozenset(self):
        choice = Choice()
        items = frozenset([1, 2, 3])
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_dict(self):
        choice = Choice()
        items = {'a': 1, 'b': 2, 'c': 3}
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_list(self):
        choice = Choice()
        items = [1, 2, 3]
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_dict_keys(self):
        choice = Choice()
        items = {1: 'a', 2: 'b', 3: 'c'}
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_dict_values(self):
        choice = Choice()
        items = {'a': 1, 'b': 2, 'c': 3}
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_dict_items(self):
        choice = Choice()
        items = {1: 'a', 2: 'b', 3: 'c'}
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

    def test___call___with_unique_and_not_enough_unique_elements_in_bytearray(self):
        choice = Choice()
        items = bytearray([1, 2, 3])
        with self.assertRaises(ValueError):
            choice(items, length=4, unique=True)

if __name__ == '__main__':
    unittest.main()