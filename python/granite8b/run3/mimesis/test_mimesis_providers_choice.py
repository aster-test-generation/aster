import unittest
from mimesis.providers.choice import Choice


class TestChoice(unittest.TestCase):
    def test___init__(self):
        choice = Choice()
        self.assertIsInstance(choice, Choice)

    def test___call__(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=2, unique=True)
        self.assertEqual(len(result), 2)
        self.assertTrue(all(item in items for item in result))

    def test___call___with_non_sequence(self):
        choice = Choice()
        with self.assertRaises(TypeError):
            choice('a', length=2, unique=True)

    def test___call___with_empty_sequence(self):
        choice = Choice()
        with self.assertRaises(ValueError):
            choice([], length=2, unique=True)

    def test___call___with_negative_length(self):
        choice = Choice()
        with self.assertRaises(ValueError):
            choice(['a', 'b', 'c'], length=-1, unique=True)

    def test___call___with_unique_elements(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=len(items), unique=True)
        self.assertEqual(len(result), len(items))
        self.assertTrue(all(item in items for item in result))

    def test___call___with_non_unique_elements(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=len(items), unique=False)
        self.assertEqual(len(result), len(items))
        self.assertFalse(all(item in items for item in result))

    def test___call___with_list(self):
        choice = Choice()
        items = ['a', 'b', 'c']
        result = choice(items, length=2, unique=True)
        self.assertIsInstance(result, list)

    def test___call___with_tuple(self):
        choice = Choice()
        items = ('a', 'b', 'c')
        result = choice(items, length=2, unique=True)
        self.assertIsInstance(result, tuple)

    def test___call___with_string(self):
        choice = Choice()
        items = 'abc'
        result = choice(items, length=2, unique=True)
        self.assertIsInstance(result, str)

if __name__ == '__main__':
    unittest.main()