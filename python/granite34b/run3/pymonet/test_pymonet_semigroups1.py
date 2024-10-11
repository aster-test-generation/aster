import unittest
from pymonet.semigroups import Sum, All, One, First, Last, Map, Max, Min

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