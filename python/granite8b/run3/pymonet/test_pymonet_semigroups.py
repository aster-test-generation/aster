import unittest
from pymonet.semigroups import Semigroup, Sum, All, One, First, Last, Map, Max, Min
from pymonet.semigroups import *


class TestSemigroup(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(Semigroup.neutral_element(), None)

    def test_fold(self):
        self.assertEqual(Semigroup(1).fold(lambda x: x), 1)
        self.assertEqual(Semigroup("a").fold(lambda x: x), "a")

    def test_concat(self):
        self.assertEqual(Semigroup(1).concat(Semigroup(2)).value, 3)
        self.assertEqual(Semigroup("a").concat(Semigroup("b")).value, "ab")

class TestSum(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(Sum.neutral_element, 0)

    def test_fold(self):
        self.assertEqual(Sum(1).fold(lambda x: x), 1)
        self.assertEqual(Sum("a").fold(lambda x: x), "a")

    def test_concat(self):
        self.assertEqual(Sum(1).concat(Sum(2)).value, 3)
        self.assertEqual(Sum("a").concat(Sum("b")).value, "ab")

class TestAll(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(All.neutral_element, True)

    def test_fold(self):
        self.assertEqual(All(True).fold(lambda x: x), True)
        self.assertEqual(All(False).fold(lambda x: x), False)

    def test_concat(self):
        self.assertEqual(All(True).concat(All(True)).value, True)
        self.assertEqual(All(False).concat(All(True)).value, False)

class TestOne(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(One.neutral_element, False)

    def test_fold(self):
        self.assertEqual(One(True).fold(lambda x: x), True)
        self.assertEqual(One(False).fold(lambda x: x), False)

    def test_concat(self):
        self.assertEqual(One(True).concat(One(True)).value, True)
        self.assertEqual(One(False).concat(One(True)).value, True)

class TestFirst(unittest.TestCase):
    def test_fold(self):
        self.assertEqual(First(1).fold(lambda x: x), 1)
        self.assertEqual(First("a").fold(lambda x: x), "a")

    def test_concat(self):
        self.assertEqual(First(1).concat(First(2)).value, 1)
        self.assertEqual(First("a").concat(First("b")).value, "a")

class TestLast(unittest.TestCase):
    def test_fold(self):
        self.assertEqual(Last(1).fold(lambda x: x), 1)
        self.assertEqual(Last("a").fold(lambda x: x), "a")

    def test_concat(self):
        self.assertEqual(Last(1).concat(Last(2)).value, 2)
        self.assertEqual(Last("a").concat(Last("b")).value, "b")

class TestMap(unittest.TestCase):
    def test_fold(self):
        self.assertEqual(Map({1: 1}).fold(lambda x: x), {1: 1})
        self.assertEqual(Map({1: "a"}).fold(lambda x: x), {1: "a"})

    def test_concat(self):
        self.assertEqual(Map({1: 1}).concat(Map({2: 2})).value, {1: 1, 2: 2})
        self.assertEqual(Map({1: "a"}).concat(Map({2: "b"})).value, {1: "a", 2: "b"})

class TestMax(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(Max.neutral_element, -float("inf"))

    def test_fold(self):
        self.assertEqual(Max(1).fold(lambda x: x), 1)
        self.assertEqual(Max("a").fold(lambda x: x), "a")

class TestSemigroup(unittest.TestCase):
    def test_fold(self):
        sum_semigroup = Sum(1)
        all_semigroup = All(True)
        one_semigroup = One(True)
        first_semigroup = First(1)
        last_semigroup = Last(1)
        map_semigroup = Map({1: Sum(1), 2: Sum(2)})
        max_semigroup = Max(1)
        min_semigroup = Min(1)

        self.assertEqual(sum_semigroup.fold(lambda x: x + 1), 2)
        self.assertEqual(all_semigroup.fold(lambda x: x and True), True)
        self.assertEqual(one_semigroup.fold(lambda x: x or True), True)
        self.assertEqual(first_semigroup.fold(lambda x: x), 1)
        self.assertEqual(last_semigroup.fold(lambda x: x), 1)
        self.assertEqual(map_semigroup.fold(lambda x: x.value + 1), 3)
        self.assertEqual(max_semigroup.fold(lambda x: x + 1), 2)
        self.assertEqual(min_semigroup.fold(lambda x: x - 1), 0)

    def test_neutral(self):
        self.assertEqual(Sum.neutral(), Sum(0))
        self.assertEqual(All.neutral(), All(True))
        self.assertEqual(One.neutral(), One(False))
        self.assertEqual(First.neutral(), First(None))
        self.assertEqual(Last.neutral(), Last(None))
        self.assertEqual(Map.neutral(), Map({}))
        self.assertEqual(Max.neutral(), Max(-float("inf")))
        self.assertEqual(Min.neutral(), Min(float("inf")))

    def test_eq(self):
        sum_semigroup1 = Sum(1)
        sum_semigroup2 = Sum(2)
        all_semigroup1 = All(True)
        all_semigroup2 = All(False)
        one_semigroup1 = One(True)
        one_semigroup2 = One(False)
        first_semigroup1 = First(1)
        first_semigroup2 = First(2)
        last_semigroup1 = Last(1)
        last_semigroup2 = Last(2)
        map_semigroup1 = Map({1: Sum(1)})
        map_semigroup2 = Map({2: Sum(2)})
        max_semigroup1 = Max(1)
        max_semigroup2 = Max(2)
        min_semigroup1 = Min(1)
        min_semigroup2 = Min(2)

        self.assertEqual(sum_semigroup1 == sum_semigroup2, False)
        self.assertEqual(all_semigroup1 == all_semigroup2, False)
        self.assertEqual(one_semigroup1 == one_semigroup2, False)
        self.assertEqual(first_semigroup1 == first_semigroup2, False)
        self.assertEqual(last_semigroup1 == last_semigroup2, False)
        self.assertEqual(map_semigroup1 == map_semigroup2, False)
        self.assertEqual(max_semigroup1 == max_semigroup2, False)
        self.assertEqual(min_semigroup1 == min_semigroup2, False)

class TestSum(unittest.TestCase):
    def test_str(self):
        self.assertEqual(str(Sum(1)), "Sum[value=1]")

    def test_concat(self):
        sum_semigroup1 = Sum(1)
        sum_semigroup2 = Sum(2)
        self.assertEqual(sum_semigroup1.concat(sum_semigroup2), Sum(3))

class TestAll(unittest.TestCase):
    def test_str(self):
        self.assertEqual(str(All(True)), "All[value=True]")

    def test_concat(self):
        all_semigroup1 = All(True)
        all_semigroup2 = All(False)
        self.assertEqual(all_semigroup1.concat(all_semigroup2), All(False))


if __name__ == '__main__':
    unittest.main()