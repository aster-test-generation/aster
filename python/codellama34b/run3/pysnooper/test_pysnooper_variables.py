import unittest
from pysnooper.variables import *



class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ('exclude',))
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_needs_parentheses(self):
        self.assertEqual(needs_parentheses('source'), False)
        self.assertEqual(needs_parentheses('source'), False)

    def test_items(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(instance.items(frame, normalize=False), ())

    def test_property_fingerprint(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(instance._fingerprint, (BaseVariable, 'source', ('exclude',)))

    def test_hash(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(hash(instance), hash((BaseVariable, 'source', ('exclude',))))

    def test_eq(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(instance, BaseVariable('source', ('exclude',)))

class TestCommonVariable(unittest.TestCase):
    def test_init(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ('exclude',))
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test__items(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(instance._items(main_value, normalize=False), ())

    def test__safe_keys(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(list(instance._safe_keys(main_value)), ['a', 'b'])

    def test__format_key(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(instance._format_key(key), 'key')

    def test__get_value(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(instance._get_value(main_value, key), 'value')

class TestAttrs(unittest.TestCase):
    def test_init(self):
        instance = Attrs('source', ('exclude',))
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ('exclude',))
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test__items(self):
        instance = Attrs('source', ('exclude',))
        self.assertEqual(instance._items(main_value, normalize=False), ())

    def test__safe_keys(self):
        instance = Attrs('source', ('exclude',))
        self.assertEqual(list(instance._safe_keys(main_value)), [])

    def test__format_key(self):
        instance = Attrs('source', ('exclude',))
        self.assertEqual(instance._format_key(key), 'key')

    def test__get_value(self):
        instance = Attrs('source', ('exclude',))
        self.assertEqual(instance._get_value(main_value, key), 'value')


if __name__ == '__main__':
    unittest.main()