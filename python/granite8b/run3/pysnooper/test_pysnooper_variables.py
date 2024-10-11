import unittest
from pysnooper.variables import *
from pysnooper.variables import BaseVariable, CommonVariable, Attrs, Keys, Indices, Exploding


class TestAttrs(unittest.TestCase):
    def test_attrs(self):
        class Example:
            def __init__(self):
                self.x = 1
                self.y = 2
        instance = Example()
        attrs = Attrs('instance', exclude=('x',))
        result = attrs.items(instance.__dict__)
        self.assertEqual(result, [('instance.y', 2)])

class TestKeys(unittest.TestCase):
    def test_keys(self):
        instance = {'x': 1, 'y': 2}
        keys = Keys('instance')
        result = keys.items(instance.__dict__)
        self.assertEqual(result, [('instance[\'x\']', 1), ('instance[\'y\']', 2)])

class TestIndices(unittest.TestCase):
    def test_indices(self):
        instance = [1, 2, 3]
        indices = Indices('instance')
        result = indices.items(instance.__dict__)
        self.assertEqual(result, [('instance[0]', 1), ('instance[1]', 2), ('instance[2]', 3)])

class TestExploding(unittest.TestCase):
    def test_exploding(self):
        instance = {'x': 1, 'y': 2}
        exploding = Exploding('instance')
        result = exploding.items(instance.__dict__)
        self.assertEqual(result, [('instance[\'x\']', 1), ('instance[0]', 1), ('instance[\'y\']', 2), ('instance[1]', 2)])

class TestBaseVariable(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': 1}
            f_locals = {'y': 2}
        variable = BaseVariable('x + y', exclude=('y',))
        result = variable.items(MockFrame())
        self.assertEqual(result, [('x + y', '3')])

    def test_fingerprint(self):
        variable1 = BaseVariable('x')
        variable2 = BaseVariable('x')
        self.assertEqual(hash(variable1), hash(variable2))
        self.assertEqual(variable1, variable2)

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': 1}
            f_locals = {'y': 2}
        variable = CommonVariable('x + y', exclude=('y',))
        result = variable.items(MockFrame())
        self.assertEqual(result, [('x + y', '3')])

    def test_fingerprint(self):
        variable1 = CommonVariable('x')
        variable2 = CommonVariable('x')
        self.assertEqual(hash(variable1), hash(variable2))
        self.assertEqual(variable1, variable2)

class TestAttrs(unittest.TestCase):
    def test_items(self):
        class MockObject:
            x = 1
            y = 2
        variable = Attrs('x + y', exclude=('y',))
        result = variable.items(MockObject())
        self.assertEqual(result, [('x + y', '3')])

    def test_fingerprint(self):
        variable1 = Attrs('x')
        variable2 = Attrs('x')
        self.assertEqual(hash(variable1), hash(variable2))
        self.assertEqual(variable1, variable2)

class TestKeys(unittest.TestCase):
    def test_items(self):
        class MockObject:
            x = 1
            y = 2
        variable = Keys('x + y', exclude=('y',))
        result = variable.items(MockObject())
        self.assertEqual(result, [('x + y.x', '1'), ('x + y.y', '2')])

    def test_fingerprint(self):
        variable1 = Keys('x')
        variable2 = Keys('x')
        self.assertEqual(hash(variable1), hash(variable2))
        self.assertEqual(variable1, variable2)

class TestIndices(unittest.TestCase):
    def test_items(self):
        class MockObject:
            x = 1
            y = 2
        variable = Indices('x + y', exclude=('y',))
        result = variable.items(MockObject())
        self.assertEqual(result, [('x + y[0]', '1'), ('x + y[1]', '2')])

    def test_fingerprint(self):
        variable1 = Indices('x')
        variable2 = Indices('x')
        self.assertEqual(hash(variable1), hash(variable2))
        self.assertEqual(variable1, variable2)

class TestExploding(unittest.TestCase):
    def test_items(self):
        class MockObject:
            x = 1
            y = 2
        variable = Exploding('x + y', exclude=('y',))
        result = variable.items(MockObject())
        self.assertEqual(result, [('x + y.x', '1'), ('x + y[0]', '1'), ('x + y.y', '2'), ('x + y[1]', '2')])

    def test_fingerprint(self):
        variable1 = Exploding('x')
        variable2 = Exploding('x')
        self.assertEqual(hash(variable1), hash(variable2))
        self.assertEqual(variable1, variable2)

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