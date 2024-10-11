import unittest
from pysnooper.variables import *
from pysnooper import utils
from pysnooper import pycompat


class TestBaseVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': 10, 'y': 20}})()

    def test_init(self):
        instance = ConcreteVariable(self.source, self.exclude)
        self.assertEqual(instance.source, self.source)
        self.assertEqual(instance.exclude, utils.ensure_tuple(self.exclude))
        self.assertEqual(instance.unambiguous_source, self.source)

    def test_items(self):
        instance = DerivedVariable(self.source, self.exclude)
        with self.assertRaises(NotImplementedError):
            instance.items(self.frame)

    def test_fingerprint(self):
        instance = DerivedVariable(self.source, self.exclude)
        self.assertEqual(instance._fingerprint, (type(instance), self.source, self.exclude))

    def test_hash(self):
        instance = ConcreteVariable(self.source, self.exclude)
        self.assertEqual(hash(instance), hash(instance._fingerprint))

    def test_eq(self):
        instance1 = DerivedVariable(self.source, self.exclude)
        instance2 = BaseVariable(self.source, self.exclude)
        self.assertTrue(instance1 == instance2)

class TestCommonVariable(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': {'a': 1, 'b': 2}, 'y': 20}})()

    def test_items(self):
        instance = CommonVariable(self.source, self.exclude)
        result = instance.items(self.frame)
        self.assertEqual(result, [('x', utils.get_shortish_repr({'a': 1, 'b': 2}))])

    def test_safe_keys(self):
        instance = CommonVariable(self.source, self.exclude)
        result = list(instance._safe_keys({'a': 1, 'b': 2}))
        self.assertEqual(result, [])

class TestAttrs(unittest.TestCase):
    def setUp(self):
        self.source = 'x'
        self.exclude = ('y',)
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': type('Test', (object,), {'a': 1, 'b': 2})(), 'y': 20}})()

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
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': {'a': 1, 'b': 2}, 'y': 20}})()

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
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': [1, 2, 3], 'y': 20}})()

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
        self.frame = type('Frame', (object,), {'f_globals': {}, 'f_locals': {'x': {'a': 1, 'b': 2}, 'y': 20}})()

    def test_items(self):
        instance = Exploding(self.source, self.exclude)
        result = instance.items(self.frame)
        self.assertEqual(result, [('x', utils.get_shortish_repr({'a': 1, 'b': 2}))])

if __name__ == '__main__':
    unittest.main()