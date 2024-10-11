import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding


class TestBaseVariable(unittest.TestCase):
    def test_init(self):
        source = '1 + 1'
        exclude = ('exclude1', 'exclude2')
        variable = BaseVariable(source, exclude)
        self.assertEqual(variable.source, source)
        self.assertEqual(variable.exclude, exclude)
        self.assertEqual(variable.code.co_code, compile(source, '<variable>', 'eval').co_code)
        self.assertEqual(variable.unambiguous_source, '(1 + 1)')

    def test_items(self):
        frame = {'x': 1, 'y': 2}
        variable = BaseVariable('x + y')
        result = variable.items(frame)
        self.assertEqual(result, [('x + y', '3')])

    def test_fingerprint(self):
        variable1 = BaseVariable('1 + 1')
        variable2 = BaseVariable('1 + 1')
        self.assertEqual(variable1._fingerprint, variable2._fingerprint)

    def test_hash(self):
        variable1 = BaseVariable('1 + 1')
        variable2 = BaseVariable('1 + 1')
        self.assertEqual(hash(variable1), hash(variable2))

    def test_eq(self):
        variable1 = BaseVariable('1 + 1')
        variable2 = BaseVariable('1 + 1')
        self.assertEqual(variable1, variable2)

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        frame = {'x': 1, 'y': 2}
        variable = CommonVariable('x + y')
        result = variable.items(frame)
        self.assertEqual(result, [('x + y', '3'), ('(x + y).x', '1'), ('(x + y).y', '2')])

    def test_safe_keys(self):
        class TestClass:
            def __iter__(self):
                raise Exception('Error')
        variable = CommonVariable('1 + 1')
        result = list(variable._safe_keys(TestClass()))
        self.assertEqual(result, [])

    def test_keys(self):
        variable = CommonVariable('1 + 1')
        result = list(variable._keys(1))
        self.assertEqual(result, [])

    def test_format_key(self):
        variable = CommonVariable('1 + 1')
        with self.assertRaises(NotImplementedError):
            variable._format_key(1)

    def test_get_value(self):
        variable = CommonVariable('1 + 1')
        with self.assertRaises(NotImplementedError):
            variable._get_value(1, 1)

class TestAttrs(unittest.TestCase):
    def test_keys(self):
        class TestClass:
            def __init__(self):
                self.x = 1
                self.y = 2
        variable = Attrs('1 + 1')
        result = list(variable._keys(TestClass()))
        self.assertEqual(result, ['x', 'y'])

    def test_format_key(self):
        variable = Attrs('1 + 1')
        result = variable._format_key('x')
        self.assertEqual(result, '.x')

    def test_get_value(self):
        class TestClass:
            def __init__(self):
                self.x = 1
                self.y = 2
        variable = Attrs('1 + 1')
        result = variable._get_value(TestClass(), 'x')
        self.assertEqual(result, 1)

class TestKeys(unittest.TestCase):
    def test_keys(self):
        variable = Keys('1 + 1')
        result = list(variable._keys({1: 1, 2: 2}))
        self.assertEqual(result, [1, 2])

    def test_format_key(self):
        variable = Keys('1 + 1')
        result = variable._format_key(1)
        self.assertEqual(result, '[1]')

    def test_get_value(self):
        variable = Keys('1 + 1')
        result = variable._get_value({1: 1, 2: 2}, 1)
        self.assertEqual(result, 1)


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
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = BaseVariable('x')
        items = variable.items(frame)
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
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = CommonVariable('x')
        items = variable.items(frame)
        self.assertEqual(items, [('x', '1'), ('x.y', '2'), ('x.z', '3')])

    def test_safe_keys(self):
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = CommonVariable('x')
        items = variable.items(frame)
        self.assertEqual(items, [('x', '1'), ('x.y', '2'), ('x.z', '3')])

    def test_keys(self):
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = CommonVariable('x')
        items = variable.items(frame)
        self.assertEqual(items, [('x', '1'), ('x.y', '2'), ('x.z', '3')])

    def test_format_key(self):
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = CommonVariable('x')
        items = variable.items(frame)
        self.assertEqual(items, [('x', '1'), ('x.y', '2'), ('x.z', '3')])

    def test_get_value(self):
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = CommonVariable('x')
        items = variable.items(frame)
        self.assertEqual(items, [('x', '1'), ('x.y', '2'), ('x.z', '3')])

class TestAttrs(unittest.TestCase):
    def test_keys(self):
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = Attrs('x')
        items = variable.items(frame)
        self.assertEqual(items, [('x', '1'), ('x.y', '2'), ('x.z', '3')])

    def test_format_key(self):
        frame = {
            'x': 1,
            'y': 2,
            'z': 3
        }
        variable = Attrs('x')
        items = variable.items(frame)
        self.assertEqual(items, [('x', '1'), ('x.y', '2'), ('x.z', '3')])

if __name__ == '__main__':
    unittest.main()