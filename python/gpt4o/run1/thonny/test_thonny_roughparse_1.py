import unittest
from thonny.roughparse import StringTranslatePseudoMapping


class TestStringTranslatePseudoMapping(unittest.TestCase):
    def setUp(self):
        self.non_defaults = {'a': 1, 'b': 2}
        self.default_value = 0
        self.instance = StringTranslatePseudoMapping(self.non_defaults, self.default_value)

    def test_init(self):
        self.assertEqual(self.instance._non_defaults, self.non_defaults)
        self.assertEqual(self.instance._default_value, self.default_value)

    def test_getitem_existing_key(self):
        self.assertEqual(self.instance['a'], 1)

    def test_getitem_non_existing_key(self):
        self.assertEqual(self.instance['c'], 0)

    def test_len(self):
        self.assertEqual(len(self.instance), 2)

    def test_iter(self):
        self.assertEqual(list(iter(self.instance)), ['a', 'b'])

    def test_get_existing_key(self):
        self.assertEqual(self.instance.get('a'), 1)

    def test_get_non_existing_key_with_default(self):
        self.assertEqual(self.instance.get('c', 3), 3)

    def test_get_non_existing_key_without_default(self):
        self.assertEqual(self.instance.get('c'), 0)

    def test_private_get_method_existing_key(self):
        self.assertEqual(self.instance._get('a'), 1)

    def test_private_get_method_non_existing_key(self):
        self.assertEqual(self.instance._get('c'), 0)

if __name__ == '__main__':
    unittest.main()