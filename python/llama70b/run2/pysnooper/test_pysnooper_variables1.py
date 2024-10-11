import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding, needs_parentheses

class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        instance = BaseVariable('source')
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ())

    def test_items(self):
        instance = BaseVariable('source')
        frame = {}  # mock frame
        result = instance.items(frame)
        self.assertEqual(result, ())

    def test_private_fingerprint(self):
        instance = BaseVariable('source')
        result = instance._BaseVariable__fingerprint
        self.assertEqual(result, (BaseVariable, 'source', ()))

    def test_hash(self):
        instance = BaseVariable('source')
        result = hash(instance)
        self.assertIsInstance(result, int)

    def test_eq(self):
        instance1 = BaseVariable('source')
        instance2 = BaseVariable('source')
        self.assertTrue(instance1 == instance2)

    def test_neq(self):
        instance1 = BaseVariable('source')
        instance2 = BaseVariable('other_source')
        self.assertFalse(instance1 == instance2)

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        instance = CommonVariable('source')
        main_value = {}  # mock main value
        result = instance._items(main_value)
        self.assertEqual(result, [('source', '{}')])

    def test_safe_keys(self):
        instance = CommonVariable('source')
        main_value = {}  # mock main value
        result = list(instance._safe_keys(main_value))
        self.assertEqual(result, [])

    def test_format_key(self):
        instance = CommonVariable('source')
        with self.assertRaises(NotImplementedError):
            instance._format_key('key')

    def test_get_value(self):
        instance = CommonVariable('source')
        with self.assertRaises(NotImplementedError):
            instance._get_value({}, 'key')

class TestAttrs(unittest.TestCase):
    def test_keys(self):
        instance = Attrs('source')
        main_value = object()  # mock main value
        result = instance._keys(main_value)
        self.assertEqual(result, [])

    def test_format_key(self):
        instance = Attrs('source')
        result = instance._format_key('key')
        self.assertEqual(result, '.key')

    def test_get_value(self):
        instance = Attrs('source')
        main_value = object()  # mock main value
        with self.assertRaises(AttributeError):
            instance._get_value(main_value, 'key')

class TestKeys(unittest.TestCase):
    def test_keys(self):
        instance = Keys('source')
        main_value = {}  # mock main value
        result = instance._keys(main_value)
        self.assertEqual(result, [])

    def test_format_key(self):
        instance = Keys('source')
        result = instance._format_key('key')
        self.assertEqual(result, '[\'key\']')

    def test_get_value(self):
        instance = Keys('source')
        main_value = {'key': 'value'}  # mock main value
        result = instance._get_value(main_value, 'key')
        self.assertEqual(result, 'value')

class TestIndices(unittest.TestCase):
    def test_keys(self):
        instance = Indices('source')
        main_value = [1, 2, 3]  # mock main value
        result = instance._keys(main_value)
        self.assertEqual(result, [0, 1, 2])

    def test_getitem(self):
        instance = Indices('source')
        result = instance[1:2]
        self.assertIsInstance(result, Indices)
        self.assertEqual(result._slice, slice(1, 2, None))

class TestExploding(unittest.TestCase):
    def test_items(self):
        instance = Exploding('source')
        main_value = {}  # mock main value
        result = instance._items(main_value)
        self.assertEqual(result, [('source', '{}')])

    def test_items_mapping(self):
        instance = Exploding('source')
        main_value = {'key': 'value'}  # mock main value
        result = instance._items(main_value)
        self.assertEqual(result, [('source', "{'key': 'value'}"), ('source[\'key\']', '\'value\'')])

    def test_items_sequence(self):
        instance = Exploding('source')
        main_value = [1, 2, 3]  # mock main value
        result = instance._items(main_value)
        self.assertEqual(result, [('source', '[1, 2, 3]'), ('source[0]', '1'), ('source[1]', '2'), ('source[2]', '3')])


if __name__ == '__main__':
    unittest.main()