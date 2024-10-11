import unittest
from pymonet.semigroups import Semigroup, Sum, All, One, First, Last, Map, Max, Min


class TestSemigroup(unittest.TestCase):
    def test_init(self):
        semigroup = Semigroup(5)
        self.assertEqual(semigroup.value, 5)

    def test_eq(self):
        semigroup1 = Semigroup(5)
        semigroup2 = Semigroup(5)
        self.assertTrue(semigroup1 == semigroup2)

    def test_fold(self):
        semigroup = Semigroup(5)
        def fn(x):
            return x * 2
        result = semigroup.fold(fn)
        self.assertEqual(result, 10)

    def test_neutral(self):
        semigroup = Semigroup.neutral
        self.assertEqual(semigroup.value, 0)

class TestSum(unittest.TestCase):
    def test_str(self):
        semigroup = Sum(5)
        self.assertEqual(str(semigroup), 'Sum[value=5]')

    def test_concat(self):
        semigroup1 = Sum(5)
        semigroup2 = Sum(3)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 8)

class TestAll(unittest.TestCase):
    def test_str(self):
        semigroup = All(True)
        self.assertEqual(str(semigroup), 'All[value=True]')

    def test_concat(self):
        semigroup1 = All(True)
        semigroup2 = All(True)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, True)

class TestOne(unittest.TestCase):
    def test_str(self):
        semigroup = One(False)
        self.assertEqual(str(semigroup), 'One[value=False]')

    def test_concat(self):
        semigroup1 = One(False)
        semigroup2 = One(True)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, True)

class TestFirst(unittest.TestCase):
    def test_str(self):
        semigroup = First(5)
        self.assertEqual(str(semigroup), 'Fist[value=5]')

    def test_concat(self):
        semigroup1 = First(5)
        semigroup2 = First(3)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 5)

class TestLast(unittest.TestCase):
    def test_str(self):
        semigroup = Last(5)
        self.assertEqual(str(semigroup), 'Last[value=5]')

    def test_concat(self):
        semigroup1 = Last(5)
        semigroup2 = Last(3)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 3)

class TestMap(unittest.TestCase):
    def test_str(self):
        semigroup = Map({'a': 1, 'b': 2})
        self.assertEqual(str(semigroup), 'Map[value={\'a\' : 1, \'b\' : 2}]')

    def test_concat(self):
        semigroup1 = Map({'a': 1, 'b': 2})
        semigroup2 = Map({'c': 3, 'd': 4})
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, {'a': 1, 'b': 2, 'c': 3, 'd': 4})

class TestMax(unittest.TestCase):
    def test_str(self):
        semigroup = Max(5)
        self.assertEqual(str(semigroup), 'Max[value=5]')

    def test_concat(self):
        semigroup1 = Max(5)
        semigroup2 = Max(3)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 5)

class TestMin(unittest.TestCase):
    def test_str(self):
        semigroup = Min(5)
        self.assertEqual(str(semigroup), 'Min[value=5]')

    def test_concat(self):
        semigroup1 = Min(5)
        semigroup2 = Min(3)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 3)

if __name__ == '__main__':
    unittest.main()