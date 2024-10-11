
import unittest
from pysnooper.variables import *

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