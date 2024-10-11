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