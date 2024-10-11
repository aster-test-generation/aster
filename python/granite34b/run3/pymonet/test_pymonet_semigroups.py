import unittest
from pymonet.semigroups import *
from pymonet.semigroups import Sum, All, One, First, Last, Map, Max, Min


class TestSemigroup(unittest.TestCase):
    def test_init(self):
        semigroup = Semigroup(1)
        self.assertEqual(semigroup.value, 1)

    def test_eq(self):
        semigroup1 = Semigroup(1)
        semigroup2 = Semigroup(1)
        semigroup3 = Semigroup(2)
        self.assertEqual(semigroup1, semigroup2)
        self.assertNotEqual(semigroup1, semigroup3)

    def test_fold(self):
        semigroup = Semigroup(1)
        result = semigroup.fold(lambda x: x + 1)
        self.assertEqual(result, 2)

class TestSum(unittest.TestCase):
    def test_init(self):
        sum_semigroup = Sum(1)
        self.assertEqual(sum_semigroup.value, 1)

    def test_eq(self):
        sum_semigroup1 = Sum(1)
        sum_semigroup2 = Sum(1)
        sum_semigroup3 = Sum(2)
        self.assertEqual(sum_semigroup1, sum_semigroup2)
        self.assertNotEqual(sum_semigroup1, sum_semigroup3)

    def test_fold(self):
        sum_semigroup = Sum(1)
        result = sum_semigroup.fold(lambda x: x + 1)
        self.assertEqual(result, 2)

    def test_concat(self):
        sum_semigroup1 = Sum(1)
        sum_semigroup2 = Sum(2)
        result = sum_semigroup1.concat(sum_semigroup2)
        self.assertEqual(result.value, 3)

class TestAll(unittest.TestCase):
    def test_init(self):
        all_semigroup = All(True)
        self.assertEqual(all_semigroup.value, True)

    def test_eq(self):
        all_semigroup1 = All(True)
        all_semigroup2 = All(True)
        all_semigroup3 = All(False)
        self.assertEqual(all_semigroup1, all_semigroup2)
        self.assertNotEqual(all_semigroup1, all_semigroup3)

    def test_fold(self):
        all_semigroup = All(True)
        result = all_semigroup.fold(lambda x: x and True)
        self.assertEqual(result, True)

    def test_concat(self):
        all_semigroup1 = All(True)
        all_semigroup2 = All(True)
        result = all_semigroup1.concat(all_semigroup2)
        self.assertEqual(result.value, True)

class TestOne(unittest.TestCase):
    def test_init(self):
        one_semigroup = One(False)
        self.assertEqual(one_semigroup.value, False)

    def test_eq(self):
        one_semigroup1 = One(False)
        one_semigroup2 = One(False)
        one_semigroup3 = One(True)
        self.assertEqual(one_semigroup1, one_semigroup2)
        self.assertNotEqual(one_semigroup1, one_semigroup3)

    def test_fold(self):
        one_semigroup = One(False)
        result = one_semigroup.fold(lambda x: x or False)
        self.assertEqual(result, False)

    def test_concat(self):
        one_semigroup1 = One(False)
        one_semigroup2 = One(True)
        result = one_semigroup1.concat(one_semigroup2)
        self.assertEqual(result.value, True)

class TestFirst(unittest.TestCase):
    def test_init(self):
        first_semigroup = First(1)
        self.assertEqual(first_semigroup.value, 1)

class TestSemigroup(unittest.TestCase):
    def test_neutral(self):
        self.assertEqual(Sum.neutral().value, 0)
        self.assertEqual(All.neutral().value, True)
        self.assertEqual(One.neutral().value, False)
        self.assertEqual(First.neutral().value, None)
        self.assertEqual(Last.neutral().value, None)
        self.assertEqual(Map.neutral().value, {})
        self.assertEqual(Max.neutral().value, -float("inf"))
        self.assertEqual(Min.neutral().value, float("inf"))

    def test_fold(self):
        self.assertEqual(Sum(1).fold(lambda x: x + 1), 2)
        self.assertEqual(All(True).fold(lambda x: x and True), True)
        self.assertEqual(One(False).fold(lambda x: x or False), False)
        self.assertEqual(First(1).fold(lambda x: x + 1), 2)
        self.assertEqual(Last(1).fold(lambda x: x + 1), 2)
        self.assertEqual(Map({1: Sum(1)}).fold(lambda x: x + 1), 2)
        self.assertEqual(Max(1).fold(lambda x: x + 1), 2)
        self.assertEqual(Min(1).fold(lambda x: x + 1), 2)

    def test_concat(self):
        self.assertEqual(Sum(1).concat(Sum(2)).value, 3)
        self.assertEqual(All(True).concat(All(False)).value, False)
        self.assertEqual(One(False).concat(One(True)).value, True)
        self.assertEqual(First(1).concat(First(2)).value, 1)
        self.assertEqual(Last(1).concat(Last(2)).value, 2)
        self.assertEqual(Map({1: Sum(1)}).concat(Map({1: Sum(2)})).value, {1: Sum(3)})
        self.assertEqual(Max(1).concat(Max(2)).value, 2)
        self.assertEqual(Min(1).concat(Min(2)).value, 1)

    def test_eq(self):
        self.assertEqual(Sum(1), Sum(1))
        self.assertEqual(All(True), All(True))
        self.assertEqual(One(False), One(False))
        self.assertEqual(First(1), First(1))
        self.assertEqual(Last(1), Last(1))
        self.assertEqual(Map({1: Sum(1)}), Map({1: Sum(1)}))
        self.assertEqual(Max(1), Max(1))
        self.assertEqual(Min(1), Min(1))

if __name__ == '__main__':
    unittest.main()