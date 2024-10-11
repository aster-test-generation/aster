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
        self.assertEqual(result, [1, 2])

    def test___call___with_invalid_length(self):
        choice = Choice()
        items = [1, 2, 3]
        with self.assertRaises(ValueError):
            choice(items, length=-1)

    def test___call___with_invalid_items(self):
        choice = Choice()
        with self.assertRaises(ValueError):
            choice([])

    def test___call___with_invalid_unique(self):
        choice = Choice()
        items = [1, 2, 3]
        with self.assertRaises(ValueError):
            choice(items, unique='invalid')

    def test___call___with_invalid_type(self):
        choice = Choice()
        items = [1, 2, 3]
        with self.assertRaises(TypeError):
            choice(items, length='invalid')

    def test___call___with_invalid_type_for_items(self):
        choice = Choice()
        with self.assertRaises(TypeError):
            choice(123)

    def test___str__(self):
        choice = Choice()
        result = str(choice)
        self.assertEqual(result, 'Choice')

    def test___repr__(self):
        choice = Choice()
        result = repr(choice)
        self.assertEqual(result, 'Choice()')

    def test___eq__(self):
        choice1 = Choice()
        choice2 = Choice()
        self.assertEqual(choice1, choice2)

if __name__ == '__main__':
    unittest.main()