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

    def test_items(self):
        instance = BaseVariable('source', ('exclude',))
        result = instance.items('frame', True)
        self.assertEqual(result, ())

    def test_fingerprint(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(instance._fingerprint, (BaseVariable, 'source', ('exclude',)))

    def test_hash(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(hash(instance), hash((BaseVariable, 'source', ('exclude',))))

    def test_eq(self):
        instance = BaseVariable('source', ('exclude',))
        self.assertEqual(instance, BaseVariable('source', ('exclude',)))
        self.assertNotEqual(instance, BaseVariable('source', ('exclude', 'exclude')))

class TestCommonVariable(unittest.TestCase):
    def test_init(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ('exclude',))
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_items(self):
        instance = CommonVariable('source', ('exclude',))
        result = instance.items('frame', True)
        self.assertEqual(result, ())

    def test_fingerprint(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(instance._fingerprint, (CommonVariable, 'source', ('exclude',)))

    def test_hash(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(hash(instance), hash((CommonVariable, 'source', ('exclude',))))

    def test_eq(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertEqual(instance, CommonVariable('source', ('exclude',)))
        self.assertNotEqual(instance, CommonVariable('source', ('exclude', 'exclude')))

    def test_safe_keys(self):
        instance = CommonVariable('source', ('exclude',))
        result = instance._safe_keys('main_value')
        self.assertEqual(result, CommonVariable._safe_keys())

    def test_keys(self):
        instance = CommonVariable('source', ('exclude',))
        result = instance._keys('main_value')
        self.assertEqual(result, ())

    def test_format_key(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertRaises(NotImplementedError, instance._format_key, 'key')

    def test_get_value(self):
        instance = CommonVariable('source', ('exclude',))
        self.assertRaises(NotImplementedError, instance._get_value, 'main_value', 'key')

class TestAttrs(unittest.TestCase):
    def test_init(self):
        instance = Attrs('source', ('exclude',))
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ('exclude',))
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        BaseVariable('source', 'exclude')

    def test_needs_parentheses(self):
        self.assertEqual(needs_parentheses('source'), True)

    def test_code(self):
        self.assertEqual(BaseVariable('source', 'exclude').code, 'source')

    def test_unambiguous_source(self):
        self.assertEqual(BaseVariable('source', 'exclude').unambiguous_source, 'source')

    def test_items(self):
        self.assertEqual(BaseVariable('source', 'exclude').items('frame', 'normalize'), ())

    def test__fingerprint(self):
        self.assertEqual(BaseVariable('source', 'exclude')._fingerprint, ('source', 'exclude'))

    def test__hash__(self):
        self.assertEqual(hash(BaseVariable('source', 'exclude')), hash(('source', 'exclude')))

    def test__eq__(self):
        self.assertEqual(BaseVariable('source', 'exclude') == BaseVariable('source', 'exclude'), True)

class TestCommonVariable(unittest.TestCase):
    def test_init(self):
        CommonVariable('source', 'exclude')

    def test__items(self):
        self.assertEqual(CommonVariable('source', 'exclude')._items('main_value', 'normalize'), ())

    def test__safe_keys(self):
        self.assertEqual(CommonVariable('source', 'exclude')._safe_keys('main_value'), ())

    def test__format_key(self):
        self.assertEqual(CommonVariable('source', 'exclude')._format_key('key'), 'key')

    def test__get_value(self):
        self.assertEqual(CommonVariable('source', 'exclude')._get_value('main_value', 'key'), 'main_value[key]')

class TestAttrs(unittest.TestCase):
    def test_init(self):
        Attrs('source', 'exclude')

    def test__items(self):
        self.assertEqual(Attrs('source', 'exclude')._items('main_value', 'normalize'), ())

    def test__safe_keys(self):
        self.assertEqual(Attrs('source', 'exclude')._safe_keys('main_value'), ())

    def test__format_key(self):
        self.assertEqual(Attrs('source', 'exclude')._format_key('key'), '.key')

    def test__get_value(self):
        self.assertEqual(Attrs('source', 'exclude')._get_value('main_value', 'key'), 'main_value.key')

class TestKeys(unittest.TestCase):
    def test_init(self):
        Keys('source', 'exclude')

    def test__items(self):
        self.assertEqual(Keys('source', 'exclude')._items('main_value', 'normalize'), ())

    def test__safe_keys(self):
        self.assertEqual(Keys('source', 'exclude')._safe_keys('main_value'), ())

    def test__format_key(self):
        self.assertEqual(Keys('source', 'exclude')._format_key('key'), '[key]')

    def test__get_value(self):
        self.assertEqual(Keys('source', 'exclude')._get_value('main_value', 'key'), 'main_value[key]')

class TestIndices(unittest.TestCase):
    def test_init(self):
        Indices('source', 'exclude')

    def test__items(self):
        self.assertEqual(Indices('source', 'exclude')._items('main_value', 'normalize'), ())

    def test__safe_keys(self):
        self.assertEqual(Indices('source', 'exclude')._safe_keys('main_value'), ())

if __name__ == '__main__':
    unittest.main()