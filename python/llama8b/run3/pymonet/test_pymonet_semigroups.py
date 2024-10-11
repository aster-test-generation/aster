import unittest
from pymonet.semigroups import Semigroup, Sum, All, One, First, Last, Map, Max, Min


class TestSemigroup(unittest.TestCase):
    def test_init(self):
        semigroup = Semigroup(1)
        self.assertEqual(semigroup.value, 1)

    def test_eq(self):
        semigroup1 = Semigroup(1)
        semigroup2 = Semigroup(1)
        self.assertTrue(semigroup1 == semigroup2)

    def test_fold(self):
        semigroup = Semigroup(1)
        result = semigroup.fold(lambda x: x + 1)
        self.assertEqual(result, 2)

    def test_neutral(self):
        semigroup = Semigroup.neutral
        self.assertEqual(semigroup.value, 0)

class TestSum(unittest.TestCase):
    def test_str(self):
        semigroup = Sum(1)
        self.assertEqual(str(semigroup), 'Sum[value=1]')

    def test_concat(self):
        semigroup1 = Sum(1)
        semigroup2 = Sum(2)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 3)

class TestAll(unittest.TestCase):
    def test_str(self):
        semigroup = All(True)
        self.assertEqual(str(semigroup), 'All[value=True]')

    def test_concat(self):
        semigroup1 = All(True)
        semigroup2 = All(False)
        result = semigroup1.concat(semigroup2)
        self.assertFalse(result.value)

class TestOne(unittest.TestCase):
    def test_str(self):
        semigroup = One(False)
        self.assertEqual(str(semigroup), 'One[value=False]')

    def test_concat(self):
        semigroup1 = One(False)
        semigroup2 = One(True)
        result = semigroup1.concat(semigroup2)
        self.assertTrue(result.value)

class TestFirst(unittest.TestCase):
    def test_str(self):
        semigroup = First(1)
        self.assertEqual(str(semigroup), 'Fist[value=1]')

    def test_concat(self):
        semigroup1 = First(1)
        semigroup2 = First(2)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 1)

class TestLast(unittest.TestCase):
    def test_str(self):
        semigroup = Last(1)
        self.assertEqual(str(semigroup), 'Last[value=1]')

    def test_concat(self):
        semigroup1 = Last(1)
        semigroup2 = Last(2)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 2)

class TestMap(unittest.TestCase):
    def test_str(self):
        semigroup = Map({'a': 1, 'b': 2})
        self.assertEqual(str(semigroup), 'Map[value={\'a\' : 1, \'b\' : 2}]')

    def test_concat(self):
        semigroup1 = Map({'a': 1})
        semigroup2 = Map({'b': 2})
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, {'a': 1, 'b': 2})

class TestMax(unittest.TestCase):
    def test_str(self):
        semigroup = Max(1)
        self.assertEqual(str(semigroup), 'Max[value=1]')

    def test_concat(self):
        semigroup1 = Max(1)
        semigroup2 = Max(2)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 2)

class TestMin(unittest.TestCase):
    def test_str(self):
        semigroup = Min(1)
        self.assertEqual(str(semigroup), 'Min[value=1]')

    def test_concat(self):
        semigroup1 = Min(1)
        semigroup2 = Min(2)
        result = semigroup1.concat(semigroup2)
        self.assertEqual(result.value, 1)

if __name__ == '__main__':
    unittest.main()