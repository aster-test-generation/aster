import unittest
from pysnooper.variables import *
from pysnooper import utils
from pysnooper import pycompat
from pysnooper import utils, pycompat


class TestBaseVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': 10}})()

    def test_init(self):
        instance = DerivedVariable(self.source, self.exclude)
        self.assertEqual(instance.source, self.source)
        self.assertEqual(instance.exclude, utils.ensure_tuple(self.exclude))
        self.assertEqual(instance.unambiguous_source, self.source)

    def test_items(self):
        instance = ConcreteVariable(self.source, self.exclude)
        with self.assertRaises(NotImplementedError):
            instance.items(self.frame)

    def test_fingerprint(self):
        instance = DerivedVariable(self.source, self.exclude)
        self.assertEqual(instance._fingerprint, (type(instance), self.source, utils.ensure_tuple(self.exclude)))

    def test_hash(self):
        instance = DerivedVariable(self.source, self.exclude)
        self.assertEqual(hash(instance), hash(instance._fingerprint))

    def test_eq(self):
        instance1 = DerivedVariable(self.source, self.exclude)
        instance2 = BaseVariable(self.source, self.exclude)
        self.assertTrue(instance1 == instance2)

class TestCommonVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': {'a': 1, 'b': 2}}})()

    def test_items(self):
        instance = CommonVariable(self.source, self.exclude)
        result = instance.items(self.frame)
        self.assertEqual(result, [('x', "{'a': 1, 'b': 2}")])

    def test_safe_keys(self):
        instance = CommonVariable(self.source, self.exclude)
        result = list(instance._safe_keys({'a': 1, 'b': 2}))
        self.assertEqual(result, [])

class TestAttrs(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': type('Test', (object,), {'a': 1, 'b': 2})()}})()

    def test_keys(self):
        instance = Attrs(self.source, self.exclude)
        result = list(instance._keys(self.frame.f_locals['x']))
        self.assertEqual(result, [])

    def test_format_key(self):
        instance = Attrs(self.source, self.exclude)
        result = instance._format_key('a')
        self.assertEqual(result, '.a')

    def test_get_value(self):
        instance = Attrs(self.source, self.exclude)
        result = instance._get_value(self.frame.f_locals['x'], 'a')
        self.assertEqual(result, 1)

class TestKeys(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': {'a': 1, 'b': 2}}})()

    def test_keys(self):
        instance = Keys(self.source, self.exclude)
        result = list(instance._keys(self.frame.f_locals['x']))
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = Keys(self.source, self.exclude)
        result = instance._format_key('a')
        self.assertEqual(result, '[\'a\']')

    def test_get_value(self):
        instance = Keys(self.source, self.exclude)
        result = instance._get_value(self.frame.f_locals['x'], 'a')
        self.assertEqual(result, 1)

class TestIndices(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': [1, 2, 3]}})()

    def test_keys(self):
        instance = Indices(self.source, self.exclude)
        result = list(instance._keys(self.frame.f_locals['x']))
        self.assertEqual(result, [0, 1, 2])

    def test_getitem(self):
        instance = Indices(self.source, self.exclude)
        result = instance[slice(1, 3)]
        self.assertEqual(result._slice, slice(1, 3))

class TestExploding(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': {'a': 1, 'b': 2}}})()

    def test_items(self):
        instance = Exploding(self.source, self.exclude)
        result = instance.items(self.frame)
        self.assertEqual(result, [('x', "{'a': 1, 'b': 2}"), ('x[\'a\']', '1'), ('x[\'b\']', '2')])

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
        other = BaseVariable(self.source, self.exclude)
        self.assertTrue(self.instance == other)

class TestCommonVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'c': 3, 'b': 2}}})()
        self.instance = CommonVariable(self.source, self.exclude)

    def test_items(self):
        self.assertEqual(self.instance.items(self.frame), [('a', 'dict'), ('a.c', '3')])

    def test_safe_keys(self):
        main_value = {'c': 3, 'b': 2}
        self.assertEqual(list(self.instance._safe_keys(main_value)), ['c', 'b'])

class TestAttrs(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': type('Test', (object,), {'c': 3, 'b': 2})()}})()
        self.instance = Attrs(self.source, self.exclude)

    def test_keys(self):
        main_value = self.frame.f_locals['a']
        self.assertEqual(list(self.instance._keys(main_value)), ['c', 'b'])

    def test_format_key(self):
        self.assertEqual(self.instance._format_key('c'), '.c')

    def test_get_value(self):
        main_value = self.frame.f_locals['a']
        self.assertEqual(self.instance._get_value(main_value, 'c'), 3)

class TestKeys(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'c': 3, 'b': 2}}})()
        self.instance = Keys(self.source, self.exclude)

    def test_keys(self):
        main_value = self.frame.f_locals['a']
        self.assertEqual(list(self.instance._keys(main_value)), ['c', 'b'])

    def test_format_key(self):
        self.assertEqual(self.instance._format_key('c'), '[\'c\']')

    def test_get_value(self):
        main_value = self.frame.f_locals['a']
        self.assertEqual(self.instance._get_value(main_value, 'c'), 3)

class TestIndices(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': [1, 2, 3]}})()
        self.instance = Indices(self.source, self.exclude)

    def test_keys(self):
        main_value = self.frame.f_locals['a']
        self.assertEqual(list(self.instance._keys(main_value)), [0, 1, 2])

    def test_getitem(self):
        result = self.instance[1:2]
        self.assertEqual(result._slice, slice(1, 2))

class TestExploding(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'a': {'c': 3, 'b': 2}}})()
        self.instance = Exploding(self.source, self.exclude)

    def test_items(self):
        self.assertEqual(self.instance.items(self.frame), [('a', 'dict'), ('a.c', '3')])

if __name__ == '__main__':
    unittest.main()