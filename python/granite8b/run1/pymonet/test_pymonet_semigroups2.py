import unittest
from pymonet.semigroups import *

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
        sum_semigroup = Sum.neutral()
        all_semigroup = All.neutral()
        one_semigroup = One.neutral()
        first_semigroup = First.neutral()
        last_semigroup = Last.neutral()
        map_semigroup = Map.neutral()
        max_semigroup = Max.neutral()
        min_semigroup = Min.neutral()

        self.assertEqual(sum_semigroup.value, 0)
        self.assertEqual(all_semigroup.value, True)
        self.assertEqual(one_semigroup.value, False)
        self.assertEqual(first_semigroup.value, None)
        self.assertEqual(last_semigroup.value, None)
        self.assertEqual(map_semigroup.value, {})
        self.assertEqual(max_semigroup.value, -float("inf"))
        self.assertEqual(min_semigroup.value, float("inf"))

    def test_concat(self):
        sum_semigroup = Sum(1)
        all_semigroup = All(True)
        one_semigroup = One(True)
        first_semigroup = First(1)
        last_semigroup = Last(1)
        map_semigroup = Map({1: Sum(1), 2: Sum(2)})
        max_semigroup = Max(1)
        min_semigroup = Min(1)

        sum_concat = sum_semigroup.concat(Sum(2))
        all_concat = all_semigroup.concat(All(False))
        one_concat = one_semigroup.concat(One(False))
        first_concat = first_semigroup.concat(First(2))
        last_concat = last_semigroup.concat(Last(2))
        map_concat = map_semigroup.concat(Map({3: Sum(3), 4: Sum(4)}))
        max_concat = max_semigroup.concat(Max(2))
        min_concat = min_semigroup.concat(Min(2))

        self.assertEqual(sum_concat.value, 3)
        self.assertEqual(all_concat.value, False)
        self.assertEqual(one_concat.value, True)
        self.assertEqual(first_concat.value, 1)
        self.assertEqual(last_concat.value, 2)
        self.assertEqual(map_concat.value, {1: Sum(1), 2: Sum(2), 3: Sum(3), 4: Sum(4)})
        self.assertEqual(max_concat.value, 2)
        self.assertEqual(min_concat.value, 1)

if __name__ == '__main__':
    unittest.main()