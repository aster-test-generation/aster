import unittest
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding

class TestBaseVariable(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': 1}
            f_locals = {'y': 2}
        instance = BaseVariable('x', exclude=('y',))
        result = instance.items(MockFrame())
        self.assertEqual(result, [('x', '1')])

    def test_fingerprint(self):
        instance = BaseVariable('x', exclude=('y',))
        self.assertEqual(hash(instance), hash(BaseVariable('x', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(BaseVariable('y', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(BaseVariable('x', exclude=('z',))))

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': {'a': 1, 'b': 2}}
            f_locals = {'y': {'c': 3, 'd': 4}}
        instance = CommonVariable('x', exclude=('b',))
        result = instance.items(MockFrame())
        self.assertEqual(result, [
            ('x.a', '1'),
            ('x.c', '3'),
        ])

    def test_fingerprint(self):
        instance = CommonVariable('x', exclude=('y',))
        self.assertEqual(hash(instance), hash(CommonVariable('x', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(CommonVariable('y', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(CommonVariable('x', exclude=('z',))))

class TestAttrs(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': {'a': 1, 'b': 2}}
            f_locals = {'y': {'c': 3, 'd': 4}}
        instance = Attrs('x', exclude=('b',))
        result = instance.items(MockFrame())
        self.assertEqual(result, [
            ('x.a', '1'),
            ('x.c', '3'),
        ])

    def test_fingerprint(self):
        instance = Attrs('x', exclude=('y',))
        self.assertEqual(hash(instance), hash(Attrs('x', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(Attrs('y', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(Attrs('x', exclude=('z',))))

class TestKeys(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': {'a': 1, 'b': 2}}
            f_locals = {'y': {'c': 3, 'd': 4}}
        instance = Keys('x', exclude=('b',))
        result = instance.items(MockFrame())
        self.assertEqual(result, [
            ('x[\'a\']', '1'),
            ('x[\'c\']', '3'),
        ])

    def test_fingerprint(self):
        instance = Keys('x', exclude=('y',))
        self.assertEqual(hash(instance), hash(Keys('x', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(Keys('y', exclude=('y',))))
        self.assertNotEqual(hash(instance), hash(Keys('x', exclude=('z',))))

class TestIndices(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': [1, 2]}
            f_locals = {'y': [3, 4]}
        instance = Indices('x', exclude=(slice(1, 2),))
        result = instance.items(MockFrame())
        self.assertEqual(result, [
            ('x[0]', '1'),
            ('x[2]', '3'),
        ])

    def test_fingerprint(self):
        instance = Indices('x', exclude=(slice(1, 2),))
        self.assertEqual(hash(instance), hash(Indices('x', exclude=(slice(1, 2),))))
        self.assertNotEqual(hash(instance), hash(Indices('y', exclude=(slice(1, 2),))))
        self.assertNotEqual(hash(instance), hash(Indices('x', exclude=(slice(2, 3),))))

if __name__ == '__main__':
    unittest.main()