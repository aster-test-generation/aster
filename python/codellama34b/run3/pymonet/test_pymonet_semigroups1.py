import unittest
from pymonet.semigroups import *

class TestSemigroup(unittest.TestCase):
    def test_init(self):
        instance = Semigroup(1)
        self.assertEqual(instance.value, 1)

    def test_eq(self):
        instance = Semigroup(1)
        result = instance.__eq__(Semigroup(1))
        self.assertEqual(result, True)

    def test_fold(self):
        instance = Semigroup(1)
        result = instance.fold(lambda x: x + 1)
        self.assertEqual(result, 2)

    def test_neutral(self):
        result = Semigroup.neutral()
        self.assertEqual(result.value, 0)

    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, 'Sum[value=1]')

    def test_concat(self):
        instance = Sum(1)
        result = instance.concat(Sum(2))
        self.assertEqual(result.value, 3)

    def test_all_str(self):
        instance = All(True)
        result = instance.__str__()
        self.assertEqual(result, 'All[value=True]')

    def test_all_concat(self):
        instance = All(True)
        result = instance.concat(All(True))
        self.assertEqual(result.value, True)

    def test_one_str(self):
        instance = One(True)
        result = instance.__str__()
        self.assertEqual(result, 'One[value=True]')

    def test_one_concat(self):
        instance = One(True)
        result = instance.concat(One(True))
        self.assertEqual(result.value, True)

    def test_first_str(self):
        instance = First(1)
        result = instance.__str__()
        self.assertEqual(result, 'Fist[value=1]')

    def test_first_concat(self):
        instance = First(1)
        result = instance.concat(First(2))
        self.assertEqual(result.value, 1)

    def test_last_str(self):
        instance = Last(1)
        result = instance.__str__()
        self.assertEqual(result, 'Last[value=1]')

    def test_last_concat(self):
        instance = Last(1)
        result = instance.concat(Last(2))
        self.assertEqual(result.value, 2)

    def test_map_str(self):
        instance = Map({1: 1})
        result = instance.__str__()
        self.assertEqual(result, 'Map[value={1: 1}]')

    def test_map_concat(self):
        instance = Map({1: 1})
        result = instance.concat(Map({1: 2}))
        self.assertEqual(result.value, {1: 2})

    def test_max_str(self):
        instance = Max(1)
        result = instance.__str__()
        self.assertEqual(result, 'Max[value=1]')

    def test_max_concat(self):
        instance = Max(1)
        result = instance.concat(Max(2))
        self.assertEqual(result.value, 2)

    def test_min_str(self):
        instance = Min(1)
        result = instance.__str__()
        self.assertEqual(result, 'Min[value=1]')

    def test_min_concat(self):
        instance = Min(1)
        result = instance.concat(Min(2))
        self.assertEqual(result.value, 1)

if __name__ == '__main__':
    unittest.main()