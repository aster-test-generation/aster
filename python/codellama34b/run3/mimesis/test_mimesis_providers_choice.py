import unittest
from mimesis.providers.choice import Choice


class TestChoice(unittest.TestCase):
    def test_init(self):
        instance = Choice()
        self.assertEqual(instance.Meta.name, 'choice')

    def test_call(self):
        instance = Choice()
        result = instance.__call__(items=['a', 'b', 'c'], length=1, unique=False)
        self.assertEqual(result, 'a')

    def test_private_call(self):
        instance = Choice()
        result = instance.__call__(items=['a', 'b', 'c'], length=1, unique=False)
        self.assertEqual(result, 'a')

    def test_protected_call(self):
        instance = Choice()
        result = instance.__call__(items=['a', 'b', 'c'], length=1, unique=False)
        self.assertEqual(result, 'a')

    def test_magic_call(self):
        instance = Choice()
        result = instance.__call__(items=['a', 'b', 'c'], length=1, unique=False)
        self.assertEqual(result, 'a')

if __name__ == '__main__':
    unittest.main()