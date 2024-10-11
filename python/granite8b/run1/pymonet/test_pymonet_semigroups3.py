import unittest
from pymonet.semigroups import *

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