import unittest
from pysnooper.variables import *

class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        instance = BaseVariable('x')
        self.assertEqual(instance.source, 'x')
        self.assertEqual(instance.exclude, ())

    def test_items(self):
        instance = BaseVariable('x')
        frame = {'x': 1}
        result = instance.items(frame)
        self.assertEqual(result, ())

    def test__items(self):
        instance = BaseVariable('x')
        with self.assertRaises(NotImplementedError):
            instance._items(1)

    def test__fingerprint(self):
        instance = BaseVariable('x')
        self.assertEqual(instance._fingerprint, (BaseVariable, 'x', ()))

    def test__hash__(self):
        instance = BaseVariable('x')
        self.assertEqual(hash(instance), hash(instance._fingerprint))

    def test__eq__(self):
        instance1 = BaseVariable('x')
        instance2 = BaseVariable('x')
        self.assertTrue(instance1 == instance2)

    def test_needs_parentheses(self):
        self.assertTrue(needs_parentheses('x.y'))
        self.assertFalse(needs_parentheses('x'))

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        instance = CommonVariable('x')
        frame = {'x': 1}
        result = instance.items(frame)
        self.assertEqual(result, [('x', '1')])

    def test__items(self):
        instance = CommonVariable('x')
        result = instance._items(1)
        self.assertEqual(result, [('x', '1')])

    def test__safe_keys(self):
        instance = CommonVariable('x')
        main_value = {'a': 1, 'b': 2}
        result = list(instance._safe_keys(main_value))
        self.assertEqual(result, ['a', 'b'])

    def test__format_key(self):
        instance = CommonVariable('x')
        with self.assertRaises(NotImplementedError):
            instance._format_key('a')

    def test__get_value(self):
        instance = CommonVariable('x')
        with self.assertRaises(NotImplementedError):
            instance._get_value({}, 'a')

class TestAttrs(unittest.TestCase):
    def test_keys(self):
        instance = Attrs('x')
        main_value = {'a': 1, 'b': 2}
        result = list(instance._keys(main_value))
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = Attrs('x')
        result = instance._format_key('a')
        self.assertEqual(result, '.a')

    def test_get_value(self):
        instance = Attrs('x')
        main_value = {'a': 1, 'b': 2}
        result = instance._get_value(main_value, 'a')
        self.assertEqual(result, 1)

class TestKeys(unittest.TestCase):
    def test_keys(self):
        instance = Keys('x')
        main_value = {'a': 1, 'b': 2}
        result = list(instance._keys(main_value))
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = Keys('x')
        result = instance._format_key('a')
        self.assertEqual(result, '[\'a\']')

    def test_get_value(self):
        instance = Keys('x')
        main_value = {'a': 1, 'b': 2}
        result = instance._get_value(main_value, 'a')
        self.assertEqual(result, 1)

class TestIndices(unittest.TestCase):
    def test_keys(self):
        instance = Indices('x')
        main_value = [1, 2, 3]
        result = list(instance._keys(main_value))
        self.assertEqual(result, [0, 1, 2])

    def test_getitem(self):
        instance = Indices('x')
        result = instance[1:2]
        self.assertIsInstance(result, Indices)
        self.assertEqual(result._slice, slice(1, 2, None))

class TestExploding(unittest.TestCase):
    def test_items(self):
        instance = Exploding('x')
        main_value = {'a': 1, 'b': 2}
        result = instance.items({}, main_value)
        self.assertEqual(result, [('x[\'a\']', '1'), ('x[\'b\']', '2')])

if __name__ == '__main__':
    unittest.main()