import unittest
from pymonet.semigroups import *



class TestSemigroup(unittest.TestCase):
    def test_init(self):
        instance = Semigroup(1)
        self.assertEqual(instance.value, 1)

    def test_eq(self):
        instance = Semigroup(1)
        other = Semigroup(1)
        result = instance.__eq__(other)
        self.assertTrue(result)

    def test_fold(self):
        instance = Semigroup(1)
        fn = lambda x: x
        result = instance.fold(fn)
        self.assertEqual(result, 1)

    def test_neutral(self):
        result = Semigroup.neutral()
        self.assertEqual(result.value, Semigroup.neutral_element)

    def test_concat(self):
        instance = Sum(1)
        semigroup = Sum(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 3)

    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, 'Sum[value=1]')

    def test_repr(self):
        instance = Sum(1)
        result = instance.__repr__()
        self.assertEqual(result, 'Sum[value=1]')

class TestSum(unittest.TestCase):
    def test_concat(self):
        instance = Sum(1)
        semigroup = Sum(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 3)

    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, 'Sum[value=1]')

class TestAll(unittest.TestCase):
    def test_concat(self):
        instance = All(True)
        semigroup = All(True)
        result = instance.concat(semigroup)
        self.assertTrue(result.value)

    def test_str(self):
        instance = All(True)
        result = instance.__str__()
        self.assertEqual(result, 'All[value=True]')

class TestOne(unittest.TestCase):
    def test_concat(self):
        instance = One(True)
        semigroup = One(True)
        result = instance.concat(semigroup)
        self.assertTrue(result.value)

    def test_str(self):
        instance = One(True)
        result = instance.__str__()
        self.assertEqual(result, 'One[value=True]')

class TestFirst(unittest.TestCase):
    def test_concat(self):
        instance = First(1)
        semigroup = First(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 1)

    def test_str(self):
        instance = First(1)
        result = instance.__str__()
        self.assertEqual(result, 'Fist[value=1]')

class TestLast(unittest.TestCase):
    def test_concat(self):
        instance = Last(1)
        semigroup = Last(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 2)

    def test_str(self):
        instance = Last(1)
        result = instance.__str__()
        self.assertEqual(result, 'Last[value=1]')

class TestMap(unittest.TestCase):
    def test_concat(self):
        instance = Map({1: Sum(1)})
        semigroup = Map({1: Sum(2)})
        result = instance.concat(semigroup)
        self.assertEqual(result.value, {1: Sum(3)})

    def test_str(self):
        instance = Map({1: Sum(1)})
        result = instance.__str__()
        self.assertEqual(result, 'Map[value={1: Sum[value=1]}]')

if __name__ == '__main__':
    unittest.main()