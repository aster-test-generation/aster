import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding


class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        instance = BaseVariable('x')
        self.assertEqual(instance.source, 'x')
        self.assertEqual(instance.exclude, ())
        self.assertEqual(instance.code, compile('x', '<variable>', 'eval'))
        self.assertEqual(instance.unambiguous_source, 'x')

    def test_items(self):
        instance = BaseVariable('x')
        frame = {'x': 1}
        result = instance.items(frame)
        self.assertEqual(result, [('x', '1')])

    def test_hash(self):
        instance = BaseVariable('x')
        self.assertEqual(hash(instance), hash((type(instance), 'x', ())))

    def test_eq(self):
        instance1 = BaseVariable('x')
        instance2 = BaseVariable('x')
        self.assertTrue(instance1 == instance2)

class TestCommonVariable(unittest.TestCase):
    def test_init(self):
        instance = CommonVariable('x', exclude=('y',))
        self.assertEqual(instance.source, 'x')
        self.assertEqual(instance.exclude, ('y',))

    def test_items(self):
        instance = CommonVariable('x')
        main_value = {'a': 1, 'b': 2}
        result = instance.items({'x': main_value})
        self.assertEqual(result, [('x.a', '1'), ('x.b', '2')])

    def test_safe_keys(self):
        instance = CommonVariable('x')
        main_value = {'a': 1, 'b': 2}
        result = list(instance._safe_keys(main_value))
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = CommonVariable('x')
        self.assertEqual(instance._format_key('a'), '.a')

    def test_get_value(self):
        instance = CommonVariable('x')
        main_value = {'a': 1}
        self.assertEqual(instance._get_value(main_value, 'a'), 1)

class TestAttrs(unittest.TestCase):
    def test_keys(self):
        instance = Attrs('x')
        main_value = {'a': 1, 'b': 2}
        result = instance._keys(main_value)
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = Attrs('x')
        self.assertEqual(instance._format_key('a'), '.a')

    def test_get_value(self):
        instance = Attrs('x')
        main_value = {'a': 1}
        self.assertEqual(instance._get_value(main_value, 'a'), 1)

class TestKeys(unittest.TestCase):
    def test_keys(self):
        instance = Keys('x')
        main_value = {'a': 1, 'b': 2}
        result = instance._keys(main_value)
        self.assertEqual(result, ['a', 'b'])

    def test_format_key(self):
        instance = Keys('x')
        self.assertEqual(instance._format_key('a'), '[a]')

    def test_get_value(self):
        instance = Keys('x')
        main_value = {'a': 1}
        self.assertEqual(instance._get_value(main_value, 'a'), 1)

class TestIndices(unittest.TestCase):
    def test_keys(self):
        instance = Indices('x')
        main_value = [1, 2, 3]
        result = instance._keys(main_value)
        self.assertEqual(result, [0, 1, 2])

    def test_format_key(self):
        instance = Indices('x')
        self.assertEqual(instance._format_key(0), '[0]')

    def test_get_value(self):
        instance = Indices('x')
        main_value = [1, 2, 3]
        self.assertEqual(instance._get_value(main_value, 0), 1)

    def test_getitem(self):
        instance = Indices('x')
        result = instance[1]
        self.assertIsInstance(result, Indices)
        self.assertEqual(result._slice, slice(1, None))

class TestExploding(unittest.TestCase):
    def test_items(self):
        instance = Exploding('x')
        main_value = {'a': 1, 'b': 2}
        result = instance._items(main_value)
        self.assertEqual(result, [('x.a', '1'), ('x.b', '2')])

    def test_type(self):
        instance = Exploding('x')
        self.assertIsInstance(instance, CommonVariable)

if __name__ == '__main__':
    unittest.main()