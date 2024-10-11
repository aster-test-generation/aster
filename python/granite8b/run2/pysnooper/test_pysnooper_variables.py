import unittest
from pysnooper.variables import *


class TestBaseVariable(unittest.TestCase):
    def test_items(self):
        class MockFrame:
            f_globals = {'x': 1}
            f_locals = {'y': 2}
        variable = BaseVariable('x', exclude=('y',))
        result = variable.items(MockFrame())
        self.assertEqual(result, [('x', '1')])

class TestCommonVariable(unittest.TestCase):
    def test_items(self):
        class MockMainValue:
            def __init__(self):
                self.x = 1
                self.y = 2
            def __repr__(self):
                return 'MockMainValue(x=1, y=2)'
        variable = CommonVariable('x', exclude=('y',))
        result = variable.items(MockMainValue())
        self.assertEqual(result, [('x', '1')])

class TestAttrs(unittest.TestCase):
    def test_items(self):
        class MockMainValue:
            def __init__(self):
                self.x = 1
                self.y = 2
            def __repr__(self):
                return 'MockMainValue(x=1, y=2)'
        variable = Attrs('x', exclude=('y',))
        result = variable.items(MockMainValue())
        self.assertEqual(result, [('x.x', '1'), ('x.y', '2')])

class TestKeys(unittest.TestCase):
    def test_items(self):
        class MockMainValue:
            def __init__(self):
                self.x = 1
                self.y = 2
            def __repr__(self):
                return 'MockMainValue(x=1, y=2)'
        variable = Keys('x', exclude=('y',))
        result = variable.items(MockMainValue())
        self.assertEqual(result, [('x[\'x\']', '1'), ('x[\'y\']', '2')])

class TestIndices(unittest.TestCase):
    def test_items(self):
        class MockMainValue:
            def __init__(self):
                self.x = 1
                self.y = 2
            def __repr__(self):
                return 'MockMainValue(x=1, y=2)'
        variable = Indices('x', exclude=('y',))
        result = variable.items(MockMainValue())
        self.assertEqual(result, [('x[0]', '1'), ('x[1]', '2')])

class TestExploding(unittest.TestCase):
    def test_items(self):
        class MockMainValue:
            def __init__(self):
                self.x = 1
                self.y = 2
            def __repr__(self):
                return 'MockMainValue(x=1, y=2)'
        variable = Exploding('x', exclude=('y',))
        result = variable.items(MockMainValue())
        self.assertEqual(result, [('x.x', '1'), ('x[0]', '1'), ('x[1]', '2'), ('x.y', '2')])

if __name__ == '__main__':
    unittest.main()