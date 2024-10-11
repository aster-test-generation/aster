import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding


class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        instance = BaseVariable('source', exclude=())
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ())
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_items(self):
        instance = BaseVariable('source', exclude=())
        frame = {}
        result = instance.items(frame)
        self.assertEqual(result, ())

    def test_hash(self):
        instance = BaseVariable('source', exclude=())
        self.assertEqual(hash(instance), hash((type(instance), 'source', ())))
        self.assertEqual(instance.__hash__(), hash(instance))

    def test_eq(self):
        instance1 = BaseVariable('source', exclude=())
        instance2 = BaseVariable('source', exclude=())
        self.assertTrue(instance1 == instance2)
        instance3 = Attrs('source', exclude=())
        self.assertFalse(instance1 == instance3)

class TestCommonVariable(unittest.TestCase):
    def test_init(self):
        instance = CommonVariable('source', exclude=())
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ())
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_items(self):
        instance = CommonVariable('source', exclude=())
        main_value = {'a': 1, 'b': 2}
        result = instance.items(main_value)
        self.assertEqual(result, [('source.a', '1'), ('source.b', '2')])

    def test_safe_keys(self):
        instance = CommonVariable('source', exclude=())
        main_value = {'a': 1, 'b': 2}
        result = list(instance._safe_keys(main_value))
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = CommonVariable('source', exclude=())
        self.assertEqual(instance._format_key('a'), '.a')

    def test_get_value(self):
        instance = CommonVariable('source', exclude=())
        main_value = {'a': 1, 'b': 2}
        self.assertEqual(instance._get_value(main_value, 'a'), 1)

class TestAttrs(unittest.TestCase):
    def test_init(self):
        instance = Attrs('source', exclude=())
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ())
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_keys(self):
        instance = Attrs('source', exclude=())
        main_value = {'a': 1, 'b': 2}
        result = instance._keys(main_value)
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = Attrs('source', exclude=())
        self.assertEqual(instance._format_key('a'), '.a')

    def test_get_value(self):
        instance = Attrs('source', exclude=())
        main_value = {'a': 1, 'b': 2}
        self.assertEqual(instance._get_value(main_value, 'a'), 1)

class TestKeys(unittest.TestCase):
    def test_init(self):
        instance = Keys('source', exclude=())
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ())
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

    def test_keys(self):
        instance = Keys('source', exclude=())
        main_value = {'a': 1, 'b': 2}
        result = instance._keys(main_value)
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = Keys('source', exclude=())
        self.assertEqual(instance._format_key('a'), '[a]')

    def test_get_value(self):
        instance = Keys('source', exclude=())
        main_value = {'a': 1, 'b': 2}
        self.assertEqual(instance._get_value(main_value, 'a'), 1)

class TestIndices(unittest.TestCase):
    def test_init(self):
        instance = Indices('source', exclude=())
        self.assertEqual(instance.source, 'source')
        self.assertEqual(instance.exclude, ())
        self.assertEqual(instance.code, compile('source', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'source')

if __name__ == '__main__':
    unittest.main()