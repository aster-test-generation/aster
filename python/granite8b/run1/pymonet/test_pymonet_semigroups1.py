import unittest
from pymonet.semigroups import *

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


if __name__ == '__main__':
    unittest.main()