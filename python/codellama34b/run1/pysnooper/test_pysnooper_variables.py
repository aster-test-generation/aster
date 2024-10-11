import unittest
from pysnooper.variables import *



class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        instance = BaseVariable('source', 'exclude')
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, 'exclude')
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_needs_parentheses(self):
        result = needs_parentheses('source')
        self.assertEqual(result, compile('{}.x'.format('source'), '<variable>', 'eval').co_code != compile('({}).x'.format('source'), '<variable>', 'eval').co_code)

    def test_items(self):
        instance = BaseVariable('source', 'exclude')
        result = instance.items('frame', 'normalize')
        self.assertEqual(result, instance._items('frame', 'normalize'))

    def test_fingerprint(self):
        instance = BaseVariable('source', 'exclude')
        self.assertEqual(instance._fingerprint, (BaseVariable, 'source', ('exclude',)))

    def test_hash(self):
        instance = BaseVariable('source', 'exclude')
        self.assertEqual(hash(instance), hash((BaseVariable, 'source', ('exclude',))))

    def test_eq(self):
        instance = BaseVariable('source', 'exclude')
        self.assertEqual(instance, BaseVariable('source', 'exclude'))

class TestCommonVariable(unittest.TestCase):
    def test_init(self):
        instance = CommonVariable('source', 'exclude')
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, 'exclude')
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_items(self):
        instance = CommonVariable('source', 'exclude')
        result = instance.items('frame', 'normalize')
        self.assertEqual(result, instance._items('frame', 'normalize'))

    def test_fingerprint(self):
        instance = CommonVariable('source', 'exclude')
        self.assertEqual(instance._fingerprint, (CommonVariable, 'source', ('exclude',)))

    def test_hash(self):
        instance = CommonVariable('source', 'exclude')
        self.assertEqual(hash(instance), hash((CommonVariable, 'source', ('exclude',))))

    def test_eq(self):
        instance = CommonVariable('source', 'exclude')
        self.assertEqual(instance, CommonVariable('source', 'exclude'))

    def test_safe_keys(self):
        instance = CommonVariable('source', 'exclude')
        result = instance._safe_keys('main_value')
        self.assertEqual(result, itertools.chain(getattr('main_value', '__dict__', ()), getattr('main_value', '__slots__', ())))

    def test_keys(self):
        instance = CommonVariable('source', 'exclude')
        result = instance._keys('main_value')
        self.assertEqual(result, ())

    def test_format_key(self):
        instance = CommonVariable('source', 'exclude')
        result = instance._format_key('key')
        self.assertEqual(result, 'key')

    def test_get_value(self):
        instance = CommonVariable('source', 'exclude')
        result = instance._get_value('main_value', 'key')
        self.assertEqual(result, 'main_value[key]')


if __name__ == '__main__':
    unittest.main()