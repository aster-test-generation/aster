import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding, needs_parentheses
from pysnooper import utils
from pysnooper import pycompat
from unittest.mock import Mock
from unittest.mock import Mock, patch
from pysnooper.variables import *


class TestNeedsParentheses(unittest.TestCase):
    def test_needs_parentheses_true(self):
        self.assertTrue(needs_parentheses('a + b'))

    def test_needs_parentheses_false(self):
        self.assertFalse(needs_parentheses('a'))

class TestBaseVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.instance = ConcreteVariable(self.source, self.exclude)

    def test_init(self):
        self.assertEqual(self.instance.source, self.source)
        self.assertEqual(self.instance.exclude, self.exclude)
        self.assertEqual(self.instance.unambiguous_source, self.source)

    def test_items(self):
        frame = Mock()
        frame.f_globals = {}
        frame.f_locals = {'a': 1}
        self.instance._items = Mock(return_value=[('a', '1')])
        result = self.instance.items(frame)
        self.assertEqual(result, [('a', '1')])

    def test_fingerprint(self):
        self.assertEqual(self.instance._fingerprint, (BaseVariable, self.source, self.exclude))

    def test_hash(self):
        self.assertEqual(hash(self.instance), hash((BaseVariable, self.source, self.exclude)))

    def test_eq(self):
        other = BaseVariable(self.source, self.exclude)
        self.assertTrue(self.instance == other)

    def test_not_eq(self):
        other = BaseVariable('different', self.exclude)
        self.assertFalse(self.instance == other)

class TestCommonVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.instance = CommonVariable(self.source, self.exclude)

    def test_items(self):
        self.instance._items = Mock(return_value=[('a', '1')])
        result = self.instance._items(1)
        self.assertEqual(result, [('a', '1')])

    def test_safe_keys(self):
        self.instance._keys = Mock(return_value=['key1', 'key2'])
        result = list(self.instance._safe_keys({'key1': 1, 'key2': 2}))
        self.assertEqual(result, ['key1', 'key2'])

class TestAttrs(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.instance = Attrs(self.source, self.exclude)

    def test_keys(self):
        class TestClass:
            __slots__ = ['slot1']
            def __init__(self):
                self.slot1 = 1
                TestClass.attr1 = 2
        obj = TestClass()
        result = list(self.instance._keys(obj))
        self.assertEqual(result, ['attr1', 'slot1'])

    def test_format_key(self):
        result = self.instance._format_key('key')
        self.assertEqual(result, '.key')

    def test_get_value(self):
        class TestClass:
            def __init__(self):
                self.attr1 = 2
        obj = TestClass()
        result = self.instance._get_value(obj, 'attr1')
        self.assertEqual(result, 2)

class TestKeys(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.instance = Keys(self.source, self.exclude)

    def test_keys(self):
        obj = {'key1': 1, 'key2': 2}
        result = list(self.instance._keys(obj))
        self.assertEqual(result, ['key1', 'key2'])

    def test_format_key(self):
        result = self.instance._format_key('key')
        self.assertEqual(result, "['key']")

    def test_get_value(self):
        obj = {'key1': 1}
        result = self.instance._get_value(obj, 'key1')
        self.assertEqual(result, 1)

class TestIndices(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.instance = Indices(self.source, self.exclude)

    def test_keys(self):
        obj = [1, 2, 3]
        result = list(self.instance._keys(obj))
        self.assertEqual(result, [0, 1, 2])

    def test_getitem(self):
        result = self.instance[1:3]
        self.assertEqual(result._slice, slice(1, 3))

class TestExploding(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.exclude = ('b',)
        self.instance = Exploding(self.source, self.exclude)

    def test_items_mapping(self):
        obj = {'key1': 1}
        result = self.instance._items(obj)
        self.assertIsInstance(result, list)

    def test_items_sequence(self):
        obj = [1, 2, 3]
        result = self.instance._items(obj)
        self.assertIsInstance(result, list)

    def test_items_attrs(self):
        class TestClass:
            def __init__(self):
                self.attr1 = 2
        obj = TestClass()
        result = self.instance._items(obj)
        self.assertIsInstance(result, list)

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
        frame = Mock()
        frame.f_globals = {}
        frame.f_locals = {'a': 1}
        with patch.object(BaseVariable, '_items', return_value=[('a', 1)]):
            result = self.instance.items(frame)
            self.assertEqual(result, [('a', 1)])

    def test_items_exception(self):
        frame = Mock()
        frame.f_globals = {}
        frame.f_locals = {}
        result = self.instance.items(frame)
        self.assertEqual(result, ())

    def test_fingerprint(self):
        self.assertEqual(self.instance._fingerprint, (BaseVariable, self.source, self.exclude))

    def test_hash(self):
        self.assertEqual(hash(self.instance), hash((BaseVariable, self.source, self.exclude)))

    def test_eq(self):
        other = BaseVariable(self.source, self.exclude)
        self.assertTrue(self.instance == other)

    def test_eq_false(self):
        other = BaseVariable('different', self.exclude)
        self.assertFalse(self.instance == other)

class TestCommonVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = CommonVariable(self.source)

    def test_items(self):
        with patch.object(CommonVariable, '_safe_keys', return_value=['key']), \
             patch.object(CommonVariable, '_get_value', return_value='value'), \
             patch('pysnooper.variables.utils.get_shortish_repr', return_value='repr'):
            result = self.instance._items('main_value')
            self.assertEqual(result, [('a', 'repr'), ('a.key', 'repr')])

    def test_safe_keys(self):
        with patch.object(CommonVariable, '_keys', return_value=['key']):
            result = list(self.instance._safe_keys('main_value'))
            self.assertEqual(result, ['key'])

    def test_safe_keys_exception(self):
        with patch.object(CommonVariable, '_keys', side_effect=Exception):
            result = list(self.instance._safe_keys('main_value'))
            self.assertEqual(result, [])

class TestAttrs(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Attrs(self.source)

    def test_keys(self):
        main_value = Mock()
        main_value.__dict__ = {'key': 'value'}
        main_value.__slots__ = ()
        result = list(self.instance._keys(main_value))
        self.assertEqual(result, ['key'])

    def test_format_key(self):
        result = self.instance._format_key('key')
        self.assertEqual(result, '.key')

    def test_get_value(self):
        main_value = Mock()
        main_value.key = 'value'
        result = self.instance._get_value(main_value, 'key')
        self.assertEqual(result, 'value')

class TestKeys(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Keys(self.source)

    def test_keys(self):
        main_value = {'key': 'value'}
        result = list(self.instance._keys(main_value))
        self.assertEqual(result, ['key'])

    def test_format_key(self):
        with patch('pysnooper.variables.utils.get_shortish_repr', return_value='repr'):
            result = self.instance._format_key('key')
            self.assertEqual(result, '[repr]')

    def test_get_value(self):
        main_value = {'key': 'value'}
        result = self.instance._get_value(main_value, 'key')
        self.assertEqual(result, 'value')

class TestIndices(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Indices(self.source)

    def test_keys(self):
        main_value = [1, 2, 3]
        result = list(self.instance._keys(main_value))
        self.assertEqual(result, [0, 1, 2])

    def test_getitem(self):
        result = self.instance[1:2]
        self.assertEqual(result._slice, slice(1, 2))

class TestExploding(unittest.TestCase):
    def setUp(self):
        self.source = 'a'
        self.instance = Exploding(self.source)

    def test_items_mapping(self):
        main_value = {}
        with patch.object(Keys, '_items', return_value=[('a', 'value')]):
            result = self.instance._items(main_value)
            self.assertEqual(result, [('a', 'value')])

    def test_items_sequence(self):
        main_value = []
        with patch.object(Indices, '_items', return_value=[('a', 'value')]):
            result = self.instance._items(main_value)
            self.assertEqual(result, [('a', 'value')])

    def test_items_attrs(self):
        main_value = object()
        with patch.object(Attrs, '_items', return_value=[('a', 'value')]):
            result = self.instance._items(main_value)
            self.assertEqual(result, [('a', 'value')])

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