import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding


class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        source = 'x'
        exclude = ('y', 'z')
        variable = BaseVariable(source, exclude)
        self.assertEqual(variable.source, source)
        self.assertEqual(variable.exclude, exclude)
        self.assertEqual(variable.code.co_code, compile(source, '<variable>', 'eval').co_code)
        self.assertEqual(variable.unambiguous_source, '({})'.format(source))

    def test_items(self):
        frame = {'x': 1}
        variable = BaseVariable('x')
        items = list(variable.items(frame))
        self.assertEqual(items, [('x', '1')])

    def test_fingerprint(self):
        variable1 = BaseVariable('x')
        variable2 = BaseVariable('x')
        self.assertEqual(variable1._fingerprint, variable2._fingerprint)

    def test_hash(self):
        variable1 = BaseVariable('x')
        variable2 = BaseVariable('x')
        self.assertEqual(hash(variable1), hash(variable2))

    def test_eq(self):
        variable1 = BaseVariable('x')
        variable2 = BaseVariable('x')
        self.assertEqual(variable1, variable2)

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        items = list(variable.items(frame))
        self.assertEqual(items, [('x', '1')])

    def test_safe_keys(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        items = list(variable._safe_keys(frame))
        self.assertEqual(items, [])

    def test_keys(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [])

    def test_format_key(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        with self.assertRaises(NotImplementedError):
            variable._format_key(frame)

    def test_get_value(self):
        frame = {'x': 1}
        variable = CommonVariable('x')
        with self.assertRaises(NotImplementedError):
            variable._get_value(frame)

class TestAttrs(unittest.TestCase):
    def test_keys(self):
        frame = {'x': 1}
        variable = Attrs('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [])

    def test_format_key(self):
        frame = {'x': 1}
        variable = Attrs('x')
        key = 'y'
        formatted_key = variable._format_key(key)
        self.assertEqual(formatted_key, '.y')

    def test_get_value(self):
        frame = {'x': 1}
        variable = Attrs('x')
        key = 'y'
        with self.assertRaises(AttributeError):
            variable._get_value(frame, key)

class TestKeys(unittest.TestCase):
    def test_keys(self):
        frame = {'x': 1}
        variable = Keys('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [])

    def test_format_key(self):
        frame = {'x': 1}
        variable = Keys('x')
        key = 'y'
        formatted_key = variable._format_key(key)
        self.assertEqual(formatted_key, '[\'y\']')

    def test_get_value(self):
        frame = {'x': 1}
        variable = Keys('x')
        key = 'y'
        with self.assertRaises(KeyError):
            variable._get_value(frame, key)

class TestIndices(unittest.TestCase):
    def test_keys(self):
        frame = {'x': [1, 2, 3]}
        variable = Indices('x')
        items = list(variable._keys(frame))
        self.assertEqual(items, [0, 1, 2])

if __name__ == '__main__':
    unittest.main()