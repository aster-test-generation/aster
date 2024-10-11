import unittest
from pysnooper.variables import *
from pysnooper import utils
from pysnooper import pycompat

class TestNeedsParentheses(unittest.TestCase):
    def test_needs_parentheses_true(self):
        self.assertTrue(needs_parentheses('a + b'))

    def test_needs_parentheses_false(self):
        self.assertFalse(needs_parentheses('a'))

class TestBaseVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': 1, 'b': 2}})()
        self.instance = BaseVariable(self.source, self.exclude)

    def test_init(self):
        self.assertEqual(self.instance.source, self.source)
        self.assertEqual(self.instance.exclude, utils.ensure_tuple(self.exclude))
        self.assertEqual(self.instance.unambiguous_source, self.source)

    def test_items(self):
        self.assertEqual(self.instance.items(self.frame), ())

    def test_fingerprint(self):
        self.assertEqual(self.instance._fingerprint, (type(self.instance), self.source, self.exclude))

    def test_hash(self):
        self.assertEqual(hash(self.instance), hash(self.instance._fingerprint))

    def test_eq(self):
        other_instance = BaseVariable(self.source, self.exclude)
        self.assertTrue(self.instance == other_instance)

class TestCommonVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'c': 3, 'd': 4}, 'b': 2}})()
        self.instance = CommonVariable(self.source, self.exclude)

    def test_items(self):
        self.assertEqual(self.instance.items(self.frame), [('a', 'dict')])

    def test_safe_keys(self):
        main_value = {'c': 3, 'd': 4}
        self.assertEqual(list(self.instance._safe_keys(main_value)), [])

class TestAttrs(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': type('Test', (object,), {'c': 3, 'd': 4})(), 'b': 2}})()
        self.instance = Attrs(self.source, self.exclude)

    def test_keys(self):
        main_value = type('Test', (object,), {'c': 3, 'd': 4})()
        self.assertEqual(list(self.instance._keys(main_value)), ['c', 'd'])

    def test_format_key(self):
        self.assertEqual(self.instance._format_key('c'), '.c')

    def test_get_value(self):
        main_value = type('Test', (object,), {'c': 3, 'd': 4})()
        self.assertEqual(self.instance._get_value(main_value, 'c'), 3)

class TestKeys(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'c': 3, 'd': 4}, 'b': 2}})()
        self.instance = Keys(self.source, self.exclude)

    def test_keys(self):
        main_value = {'c': 3, 'd': 4}
        self.assertEqual(list(self.instance._keys(main_value)), ['c', 'd'])

    def test_format_key(self):
        self.assertEqual(self.instance._format_key('c'), '[\'c\']')

    def test_get_value(self):
        main_value = {'c': 3, 'd': 4}
        self.assertEqual(self.instance._get_value(main_value, 'c'), 3)

class TestIndices(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': [1, 2, 3], 'b': 2}})()
        self.instance = Indices(self.source, self.exclude)

    def test_keys(self):
        main_value = [1, 2, 3]
        self.assertEqual(list(self.instance._keys(main_value)), [0, 1, 2])

    def test_getitem(self):
        result = self.instance[1:2]
        self.assertIsInstance(result, Indices)
        self.assertEqual(result._slice, slice(1, 2))

class TestExploding(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'c': 3, 'd': 4}, 'b': 2}})()
        self.instance = Exploding(self.source, self.exclude)

    def test_items(self):
        main_value = {'c': 3, 'd': 4}
        self.assertEqual(self.instance._items(main_value), [('a', 'dict'), ('a[\'c\']', '3'), ('a[\'d\']', '4')])

if __name__ == '__main__':
    unittest.main()