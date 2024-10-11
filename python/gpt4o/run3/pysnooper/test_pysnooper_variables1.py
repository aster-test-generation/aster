import unittest
from pysnooper.variables import *
from pysnooper import utils, pycompat

class TestNeedsParentheses(unittest.TestCase):
    def test_needs_parentheses_true(self):
        self.assertTrue(needs_parentheses('a + b'))

    def test_needs_parentheses_false(self):
        self.assertFalse(needs_parentheses('a'))

class TestBaseVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.instance = BaseVariable(self.source, self.exclude)

    def test_init(self):
        self.assertEqual(self.instance.source, self.source)
        self.assertEqual(self.instance.exclude, self.exclude)
        self.assertEqual(self.instance.unambiguous_source, self.source)

    def test_items(self):
        frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': 1}})
        self.assertEqual(self.instance.items(frame), ())

    def test_fingerprint(self):
        self.assertEqual(self.instance._fingerprint, (BaseVariable, self.source, self.exclude))

    def test_hash(self):
        self.assertEqual(hash(self.instance), hash((BaseVariable, self.source, self.exclude)))

    def test_eq(self):
        other = BaseVariable(self.source, self.exclude)
        self.assertTrue(self.instance == other)

    def test_abstract_items(self):
        with self.assertRaises(NotImplementedError):
            self.instance._items('key')

class TestCommonVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = CommonVariable(self.source)

    def test_items(self):
        frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'key': 'value'}}})
        self.assertEqual(self.instance.items(frame), [('a', 'dict')])

    def test_safe_keys(self):
        self.assertEqual(list(self.instance._safe_keys({'key': 'value'})), [])

    def test_keys(self):
        self.assertEqual(list(self.instance._keys({'key': 'value'})), [])

    def test_format_key(self):
        with self.assertRaises(NotImplementedError):
            self.instance._format_key('key')

    def test_get_value(self):
        with self.assertRaises(NotImplementedError):
            self.instance._get_value({'key': 'value'}, 'key')

class TestAttrs(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Attrs(self.source)

    def test_keys(self):
        class TestClass:
            __slots__ = ('slot1',)
            def __init__(self):
                self.slot1 = 'value'
                self.attr1 = 'value'
        obj = TestClass()
        self.assertEqual(list(self.instance._keys(obj)), ['attr1', 'slot1'])

    def test_format_key(self):
        self.assertEqual(self.instance._format_key('key'), '.key')

    def test_get_value(self):
        class TestClass:
            def __init__(self):
                self.attr1 = 'value'
        obj = TestClass()
        self.assertEqual(self.instance._get_value(obj, 'attr1'), 'value')

class TestKeys(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Keys(self.source)

    def test_keys(self):
        self.assertEqual(list(self.instance._keys({'key': 'value'})), ['key'])

    def test_format_key(self):
        self.assertEqual(self.instance._format_key('key'), '[key]')

    def test_get_value(self):
        self.assertEqual(self.instance._get_value({'key': 'value'}, 'key'), 'value')

class TestIndices(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Indices(self.source)

    def test_keys(self):
        self.assertEqual(list(self.instance._keys([1, 2, 3])), [0, 1, 2])

    def test_getitem(self):
        result = self.instance[1:2]
        self.assertIsInstance(result, Indices)
        self.assertEqual(result._slice, slice(1, 2))

class TestExploding(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Exploding(self.source)

    def test_items_mapping(self):
        frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'key': 'value'}}})
        self.assertEqual(self.instance.items(frame), [('a', 'dict'), ('a[key]', 'value')])

    def test_items_sequence(self):
        frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': [1, 2, 3]}})
        self.assertEqual(self.instance.items(frame), [('a', 'list'), ('a[0]', '1'), ('a[1]', '2'), ('a[2]', '3')])

    def test_items_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = 'value'
        frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': TestClass()}})
        self.assertEqual(self.instance.items(frame), [('a', 'TestClass'), ('a.attr1', 'value')])

if __name__ == '__main__':
    unittest.main()