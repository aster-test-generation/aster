import unittest
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

if __name__ == '__main__':
    unittest.main()