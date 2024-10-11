import unittest
from thonny.roughparse import StringTranslatePseudoMapping

class TestStringTranslatePseudoMapping(unittest.TestCase):
    def setUp(self):
        self.non_defaults = {'a': 1, 'b': 2}
        self.default_value = 0
        self.instance = StringTranslatePseudoMapping(self.non_defaults, self.default_value)

    def test_getitem(self):
        result = self.instance['a']
        self.assertEqual(result, 1)

    def test_getitem_default(self):
        result = self.instance['c']
        self.assertEqual(result, 0)

    def test_len(self):
        result = len(self.instance)
        self.assertEqual(result, 2)

    def test_iter(self):
        result = list(iter(self.instance))
        self.assertEqual(result, ['a', 'b'])

    def test_get(self):
        result = self.instance.get('a')
        self.assertEqual(result, 1)

    def test_get_default(self):
        result = self.instance.get('c')
        self.assertEqual(result, 0)

    def test_get_with_default(self):
        result = self.instance.get('c', 3)
        self.assertEqual(result, 0)

    def test_protected_get(self):
        result = self.instance._get('a')
        self.assertEqual(result, 1)

    def test_protected_get_default(self):
        result = self.instance._get('c')
        self.assertEqual(result, 0)

if __name__ == '__main__':
    unittest.main()