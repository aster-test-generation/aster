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
        self.assertEqual(map_semigroup.fold(lambda x: x.values), 3)
        self.assertEqual(max_semigroup.fold(lambda x: x + 1), 2)
        self.assertEqual(min_semigroup.fold(lambda x: x - 1), 0)

class TestSum(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(Sum.neutral_element, 0)

    def test_concat(self):
        sum_semigroup = Sum(1)
        other_sum_semigroup = Sum(2)
        concatenated_semigroup = sum_semigroup.concat(other_sum_semigroup)
        self.assertEqual(concatenated_semigroup.value, 3)

    def test_str(self):
        sum_semigroup = Sum(1)
        self.assertEqual(str(sum_semigroup), 'Sum[value=1]')

class TestAll(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(All.neutral_element, True)

    def test_concat(self):
        all_semigroup = All(True)
        other_all_semigroup = All(True)
        concatenated_semigroup = all_semigroup.concat(other_all_semigroup)
        self.assertEqual(concatenated_semigroup.value, True)

    def test_str(self):
        all_semigroup = All(True)
        self.assertEqual(str(all_semigroup), 'All[value=True]')

class TestOne(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(One.neutral_element, False)

    def test_concat(self):
        one_semigroup = One(True)
        other_one_semigroup = One(True)
        concatenated_semigroup = one_semigroup.concat(other_one_semigroup)
        self.assertEqual(concatenated_semigroup.value, True)

    def test_str(self):
        one_semigroup = One(True)
        self.assertEqual(str(one_semigroup), 'One[value=True]')

class TestFirst(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(First.neutral_element(), None)

    def test_concat(self):
        first_semigroup = First(1)
        other_first_semigroup = First(2)
        concatenated_semigroup = first_semigroup.concat(other_first_semigroup)
        self.assertEqual(concatenated_semigroup.value, 1)

    def test_str(self):
        first_semigroup = First(1)
        self.assertEqual(str(first_semigroup), 'Fist[value=1]')

class TestLast(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(Last.neutral_element(), None)

    def test_concat(self):
        last_semigroup = Last(1)
        other_last_semigroup = Last(2)
        concatenated_semigroup = last_semigroup.concat(other_last_semigroup)
        self.assertEqual(concatenated_semigroup.value, 2)

class TestSemigroup(unittest.TestCase):
    def test_fold(self):
        sum_semigroup = Sum(1)
        all_semigroup = All(True)
        one_semigroup = One(False)
        first_semigroup = First(1)
        last_semigroup = Last(2)
        map_semigroup = Map({1: Sum(1), 2: Sum(2)})
        max_semigroup = Max(1)
        min_semigroup = Min(1)
        self.assertEqual(sum_semigroup.fold(lambda x: x + 1), 2)
        self.assertEqual(all_semigroup.fold(lambda x: x and True), True)
        self.assertEqual(one_semigroup.fold(lambda x: x or False), False)
        self.assertEqual(first_semigroup.fold(lambda x: x), 1)
        self.assertEqual(last_semigroup.fold(lambda x: x), 2)
        self.assertEqual(map_semigroup.fold(lambda x: x + 1), {1: 2, 2: 3})
        self.assertEqual(max_semigroup.fold(lambda x: x + 1), 2)
        self.assertEqual(min_semigroup.fold(lambda x: x + 1), 2)

class TestSum(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(Sum.neutral_element, 0)

    def test_concat(self):
        sum_semigroup = Sum(1)
        other_sum_semigroup = Sum(2)
        self.assertEqual(sum_semigroup.concat(other_sum_semigroup), Sum(3))

    def test_str(self):
        sum_semigroup = Sum(1)
        self.assertEqual(str(sum_semigroup), 'Sum[value=1]')

class TestAll(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(All.neutral_element, True)

    def test_concat(self):
        all_semigroup = All(True)
        other_all_semigroup = All(True)
        self.assertEqual(all_semigroup.concat(other_all_semigroup), All(True))

    def test_str(self):
        all_semigroup = All(True)
        self.assertEqual(str(all_semigroup), 'All[value=True]')

class TestOne(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(One.neutral_element, False)

    def test_concat(self):
        one_semigroup = One(False)
        other_one_semigroup = One(False)
        self.assertEqual(one_semigroup.concat(other_one_semigroup), One(False))

    def test_str(self):
        one_semigroup = One(False)
        self.assertEqual(str(one_semigroup), 'One[value=False]')

class TestFirst(unittest.TestCase):
    def test_concat(self):
        first_semigroup = First(1)
        other_first_semigroup = First(2)
        self.assertEqual(first_semigroup.concat(other_first_semigroup), First(1))

    def test_str(self):
        first_semigroup = First(1)
        self.assertEqual(str(first_semigroup), 'Fist[value=1]')

class TestLast(unittest.TestCase):
    def test_concat(self):
        last_semigroup = Last(1)
        other_last_semigroup = Last(2)
        self.assertEqual(last_semigroup.concat(other_last_semigroup), Last(2))

    def test_str(self):
        last_semigroup = Last(1)
        self.assertEqual(str(last_semigroup), 'Last[value=1]')


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

class TestSemigroup(unittest.TestCase):
    def test_neutral_element(self):
        self.assertEqual(Sum.neutral_element, 0)
        self.assertEqual(All.neutral_element, True)
        self.assertEqual(One.neutral_element, False)
        self.assertEqual(First.neutral_element, None)
        self.assertEqual(Last.neutral_element, None)
        self.assertEqual(Max.neutral_element, -float("inf"))
        self.assertEqual(Min.neutral_element, float("inf"))

    def test_fold(self):
        self.assertEqual(Sum(1).fold(lambda x: x), 1)
        self.assertEqual(All(True).fold(lambda x: x), True)
        self.assertEqual(One(True).fold(lambda x: x), True)
        self.assertEqual(First(1).fold(lambda x: x), 1)
        self.assertEqual(Last(1).fold(lambda x: x), 1)
        self.assertEqual(Max(1).fold(lambda x: x), 1)
        self.assertEqual(Min(1).fold(lambda x: x), 1)

    def test_concat(self):
        self.assertEqual(Sum(1).concat(Sum(2)).value, 3)
        self.assertEqual(All(True).concat(All(True)).value, True)
        self.assertEqual(One(True).concat(One(True)).value, True)
        self.assertEqual(First(1).concat(First(2)).value, 1)
        self.assertEqual(Last(1).concat(Last(2)).value, 2)
        self.assertEqual(Max(1).concat(Max(2)).value, 2)
        self.assertEqual(Min(1).concat(Min(2)).value, 1)

    def test_eq(self):
        self.assertEqual(Sum(1), Sum(1))
        self.assertEqual(All(True), All(True))
        self.assertEqual(One(True), One(True))
        self.assertEqual(First(1), First(1))
        self.assertEqual(Last(1), Last(1))
        self.assertEqual(Max(1), Max(1))
        self.assertEqual(Min(1), Min(1))

    def test_str(self):
        self.assertEqual(str(Sum(1)), 'Sum[value=1]')
        self.assertEqual(str(All(True)), 'All[value=True]')
        self.assertEqual(str(One(True)), 'One[value=True]')
        self.assertEqual(str(First(1)), 'Fist[value=1]')
        self.assertEqual(str(Last(1)), 'Last[value=1]')
        self.assertEqual(str(Max(1)), 'Max[value=1]')
        self.assertEqual(str(Min(1)), 'Min[value=1]')

    def test_repr(self):
        self.assertEqual(repr(Sum(1)), 'Sum(1)')
        self.assertEqual(repr(All(True)), 'All(True)')
        self.assertEqual(repr(One(True)), 'One(True)')
        self.assertEqual(repr(First(1)), 'First(1)')
        self.assertEqual(repr(Last(1)), 'Last(1)')
        self.assertEqual(repr(Max(1)), 'Max(1)')
        self.assertEqual(repr(Min(1)), 'Min(1)')

class TestMap(unittest.TestCase):
    def test_concat(self):
        self.assertEqual(Map({1: Sum(1)}).concat(Map({2: Sum(2)})).value, {1: Sum(1), 2: Sum(2)})

if __name__ == '__main__':
    unittest.main()