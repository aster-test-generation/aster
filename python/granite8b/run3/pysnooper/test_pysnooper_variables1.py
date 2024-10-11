import unittest
from pysnooper.variables import *

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

if __name__ == '__main__':
    unittest.main()