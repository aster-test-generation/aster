import unittest
from pymonet.semigroups import *

class TestSemigroup(unittest.TestCase):
    def test_fold(self):
        self.assertEqual(Sum(1).fold(lambda x: x + 1), 2)
        self.assertEqual(All(True).fold(lambda x: x and True), True)
        self.assertEqual(One(False).fold(lambda x: x or False), False)
        self.assertEqual(First(1).fold(lambda x: x), 1)
        self.assertEqual(Last(1).fold(lambda x: x), 1)
        self.assertEqual(Map({1: Sum(1)}).fold(lambda x: x), {1: Sum(1)})
        self.assertEqual(Max(1).fold(lambda x: x), 1)
        self.assertEqual(Min(1).fold(lambda x: x), 1)

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
        self.assertEqual(Sum(1), Sum(1))
        self.assertEqual(All(True), All(True))
        self.assertEqual(One(False), One(False))
        self.assertEqual(First(1), First(1))
        self.assertEqual(Last(1), Last(1))
        self.assertEqual(Map({1: Sum(1)}), Map({1: Sum(1)}))
        self.assertEqual(Max(1), Max(1))
        self.assertEqual(Min(1), Min(1))

        self.assertNotEqual(Sum(1), Sum(2))
        self.assertNotEqual(All(True), All(False))
        self.assertNotEqual(One(False), One(True))
        self.assertNotEqual(First(1), First(2))
        self.assertNotEqual(Last(1), Last(2))
        self.assertNotEqual(Map({1: Sum(1)}), Map({2: Sum(1)}))
        self.assertNotEqual(Max(1), Max(2))
        self.assertNotEqual(Min(1), Min(2))

    def test_str(self):
        self.assertEqual(str(Sum(1)), "Sum[value=1]")
        self.assertEqual(str(All(True)), "All[value=True]")
        self.assertEqual(str(One(False)), "One[value=False]")
        self.assertEqual(str(First(1)), "Fist[value=1]")
        self.assertEqual(str(Last(1)), "Last[value=1]")
        self.assertEqual(str(Map({1: Sum(1)})), "Map[value={1: Sum[value=1]}]")
        self.assertEqual(str(Max(1)), "Max[value=1]")
        self.assertEqual(str(Min(1)), "Min[value=1]")

    def test_repr(self):
        self.assertEqual(repr(Sum(1)), "Sum(1)")
        self.assertEqual(repr(All(True)), "All(True)")
        self.assertEqual(repr(One(False)), "One(False)")
        self.assertEqual(repr(First(1)), "First(1)")
        self.assertEqual(repr(Last(1)), "Last(1)")
        self.assertEqual(repr(Map({1: Sum(1)})), "Map({1: Sum(1)})")
        self.assertEqual(repr(Max(1)), "Max(1)")
        self.assertEqual(repr(Min(1)), "Min(1)")

class TestSum(unittest.TestCase):
    def test_concat(self):
        self.assertEqual(Sum(1).concat(Sum(2)), Sum(3))

class TestAll(unittest.TestCase):
    def test_concat(self):
        self.assertEqual(All(True).concat(All(True)), All(True))
        self.assertEqual(All(True).concat(All(False)), All(False))
        self.assertEqual(All(False).concat(All(True)), All(False))
        self.assertEqual(All(False).concat(All(False)), All(False))

if __name__ == '__main__':
    unittest.main()