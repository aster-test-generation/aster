
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
        fn = lambda x: x + 1
        result = instance.fold(fn)
        self.assertEqual(result, 2)

    def test_neutral(self):
        result = Semigroup.neutral()
        self.assertEqual(result.value, 0)

class TestSum(unittest.TestCase):
    def test_init(self):
        instance = Sum(1)
        self.assertEqual(instance.value, 1)

    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, 'Sum[value=1]')

    def test_concat(self):
        instance = Sum(1)
        semigroup = Sum(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 3)

class TestAll(unittest.TestCase):
    def test_init(self):
        instance = All(True)
        self.assertEqual(instance.value, True)

    def test_str(self):
        instance = All(True)
        result = instance.__str__()
        self.assertEqual(result, 'All[value=True]')

    def test_concat(self):
        instance = All(True)
        semigroup = All(False)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, False)

class TestOne(unittest.TestCase):
    def test_init(self):
        instance = One(True)
        self.assertEqual(instance.value, True)

    def test_str(self):
        instance = One(True)
        result = instance.__str__()
        self.assertEqual(result, 'One[value=True]')

    def test_concat(self):
        instance = One(True)
        semigroup = One(False)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, True)

class TestFirst(unittest.TestCase):
    def test_init(self):
        instance = First(1)
        self.assertEqual(instance.value, 1)

    def test_str(self):
        instance = First(1)
        result = instance.__str__()
        self.assertEqual(result, 'Fist[value=1]')

    def test_concat(self):
        instance = First(1)
        semigroup = First(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 1)

class TestLast(unittest.TestCase):
    def test_init(self):
        instance = Last(1)
        self.assertEqual(instance.value, 1)

    def test_str(self):
        instance = Last(1)
        result = instance.__str__()
        self.assertEqual(result, 'Last[value=1]')

    def test_concat(self):
        instance = Last(1)
        semigroup = Last(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 2)

class TestMap(unittest.TestCase):
    def test_init(self):
        instance = Map({1: 1})
        self.assertEqual(instance.value, {1: 1})

    def test_str(self):
        instance = Map({1: 1})
        result = instance.__str__()
        self.assertEqual(result, 'Map[value={1: 1}]')

if __name__ == '__main__':
    unittest.main()