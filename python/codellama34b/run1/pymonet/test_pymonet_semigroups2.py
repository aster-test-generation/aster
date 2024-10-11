import unittest
from pymonet.semigroups import *

class TestSemigroup(unittest.TestCase):
    def test_init(self):
        instance = Semigroup(1)
        self.assertEqual(instance.value, 1)

    def test_eq(self):
        instance = Semigroup(1)
        self.assertEqual(instance, Semigroup(1))

    def test_fold(self):
        instance = Semigroup(1)
        result = instance.fold(lambda x: x + 1)
        self.assertEqual(result, 2)

    def test_neutral(self):
        result = Semigroup.neutral(Sum)
        self.assertEqual(result, Sum(0))

    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, 'Sum[value=1]')

    def test_concat(self):
        instance = Sum(1)
        result = instance.concat(Sum(2))
        self.assertEqual(result, Sum(3))

    def test_str(self):
        instance = All(True)
        result = instance.__str__()
        self.assertEqual(result, 'All[value=True]')

    def test_concat(self):
        instance = All(True)
        result = instance.concat(All(True))
        self.assertEqual(result, All(True))

    def test_str(self):
        instance = One(False)
        result = instance.__str__()
        self.assertEqual(result, 'One[value=False]')

    def test_concat(self):
        instance = One(False)
        result = instance.concat(One(True))
        self.assertEqual(result, One(True))

    def test_str(self):
        instance = First(1)
        result = instance.__str__()
        self.assertEqual(result, 'Fist[value=1]')

    def test_concat(self):
        instance = First(1)
        result = instance.concat(First(2))
        self.assertEqual(result, First(1))

    def test_str(self):
        instance = Last(1)
        result = instance.__str__()
        self.assertEqual(result, 'Last[value=1]')

    def test_concat(self):
        instance = Last(1)
        result = instance.concat(Last(2))
        self.assertEqual(result, Last(2))

    def test_str(self):
        instance = Map({'a': Sum(1)})
        result = instance.__str__()
        self.assertEqual(result, 'Map[value={a: Sum[value=1]}]')

    def test_concat(self):
        instance = Map({'a': Sum(1)})
        result = instance.concat(Map({'a': Sum(2)}))
        self.assertEqual(result, Map({'a': Sum(3)}))

    def test_str(self):
        instance = Max(1)
        result = instance.__str__()
        self.assertEqual(result, 'Max[value=1]')

    def test_concat(self):
        instance = Max(1)
        result = instance.concat(Max(2))
        self.assertEqual(result, Max(2))

    def test_str(self):
        instance = Min(1)
        result = instance.__str__()
        self.assertEqual(result, 'Min[value=1]')

    def test_concat(self):
        instance = Min(1)
        result = instance.concat(Min(2))
        self.assertEqual(result, Min(1))

if __name__ == '__main__':
    unittest.main()