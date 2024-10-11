import unittest
from pymonet.semigroups import *



class TestSemigroup(unittest.TestCase):
    def test_init(self):
        instance = Semigroup(1)
        self.assertEqual(instance.value, 1)
    def test_eq(self):
        instance = Semigroup(1)
        self.assertEqual(instance, Semigroup(1))
    def test_fold(self):
        instance = Semigroup(1)
        result = instance.fold(lambda x: x)
        self.assertEqual(result, 1)
    def test_neutral(self):
        result = Semigroup.neutral_element()
        self.assertEqual(result, Semigroup(Semigroup.neutral_element))
    def test_str(self):
        instance = Semigroup(1)
        result = instance.__str__()
        self.assertEqual(result, Semigroup(1))
    def test_repr(self):
        instance = Semigroup(1)
        result = instance.__repr__()
        self.assertEqual(result, Semigroup(1))

class TestSum(unittest.TestCase):
    def test_init(self):
        instance = Sum(1)
        self.assertEqual(instance.value, 1)
    def test_eq(self):
        instance = Sum(1)
        self.assertEqual(instance, Sum(1))
    def test_fold(self):
        instance = Sum(1)
        result = instance.fold(lambda x: x)
        self.assertEqual(result, 1)
    def test_neutral(self):
        result = Sum.neutral()
        self.assertEqual(result, Sum(Sum.neutral_element))
    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, "Sum[value=1]")
    def test_repr(self):
        instance = Sum(1)
        result = instance.__repr__()
        self.assertEqual(result, Sum(1))
    def test_concat(self):
        instance = Sum(1)
        result = instance.concat(Sum(2))
        self.assertEqual(result, Sum(3))

class TestAll(unittest.TestCase):
    def test_init(self):
        instance = All(True)
        self.assertEqual(instance.value, True)
    def test_eq(self):
        instance = All(True)
        self.assertEqual(instance, All(True))
    def test_fold(self):
        instance = All(True)
        result = instance.fold(lambda x: x)
        self.assertEqual(result, True)
    def test_neutral(self):
        result = All.neutral()
        self.assertEqual(result, All(All.neutral_element))
    def test_str(self):
        instance = All(True)
        result = instance.__str__()
        self.assertEqual(result, "All[value=True]")
    def test_repr(self):
        instance = All(True)
        result = instance.__repr__()
        self.assertEqual(result, All(True))
    def test_concat(self):
        instance = All(True)
        result = instance.concat(All(False))
        self.assertEqual(result, All(False))

class TestOne(unittest.TestCase):
    def test_init(self):
        instance = One(False)
        self.assertEqual(instance.value, False)
    def test_eq(self):
        instance = One(False)
        self.assertEqual(instance, One(False))
    def test_fold(self):
        instance = One(False)
        result = instance.fold(lambda x: x)
        self.assertEqual(result, False)
    def test_neutral(self):
        result = One.neutral()
        self.assertEqual(result, One(One.neutral_element))

class TestSemigroup(unittest.TestCase):
    def test_init(self):
        instance = Semigroup(1)
        self.assertEqual(instance.value, 1)

    def test_eq(self):
        instance = Semigroup(1)
        other = Semigroup(1)
        result = instance.__eq__(other)
        self.assertTrue(result)

    def test_fold(self):
        instance = Semigroup(1)
        fn = lambda x: x + 1
        result = instance.fold(fn)
        self.assertEqual(result, 2)

    def test_neutral(self):
        result = Semigroup.neutral()
        self.assertEqual(result.value, 0)

class TestSum(unittest.TestCase):
    def test_init(self):
        instance = Sum(1)
        self.assertEqual(instance.value, 1)

    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, 'Sum[value=1]')

    def test_concat(self):
        instance = Sum(1)
        semigroup = Sum(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 3)

class TestAll(unittest.TestCase):
    def test_init(self):
        instance = All(True)
        self.assertEqual(instance.value, True)

    def test_str(self):
        instance = All(True)
        result = instance.__str__()
        self.assertEqual(result, 'All[value=True]')

    def test_concat(self):
        instance = All(True)
        semigroup = All(False)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, False)

class TestOne(unittest.TestCase):
    def test_init(self):
        instance = One(True)
        self.assertEqual(instance.value, True)

    def test_str(self):
        instance = One(True)
        result = instance.__str__()
        self.assertEqual(result, 'One[value=True]')

    def test_concat(self):
        instance = One(True)
        semigroup = One(False)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, True)

class TestFirst(unittest.TestCase):
    def test_init(self):
        instance = First(1)
        self.assertEqual(instance.value, 1)

    def test_str(self):
        instance = First(1)
        result = instance.__str__()
        self.assertEqual(result, 'Fist[value=1]')

    def test_concat(self):
        instance = First(1)
        semigroup = First(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 1)

class TestLast(unittest.TestCase):
    def test_init(self):
        instance = Last(1)
        self.assertEqual(instance.value, 1)

    def test_str(self):
        instance = Last(1)
        result = instance.__str__()
        self.assertEqual(result, 'Last[value=1]')

    def test_concat(self):
        instance = Last(1)
        semigroup = Last(2)
        result = instance.concat(semigroup)
        self.assertEqual(result.value, 2)

class TestMap(unittest.TestCase):
    def test_init(self):
        instance = Map({1: 1})
        self.assertEqual(instance.value, {1: 1})

    def test_str(self):
        instance = Map({1: 1})
        result = instance.__str__()
        self.assertEqual(result, 'Map[value={1: 1}]')


class TestSemigroup(unittest.TestCase):
    def test_init(self):
        instance = Semigroup(1)
        self.assertEqual(instance.value, 1)

    def test_eq(self):
        instance = Semigroup(1)
        self.assertEqual(instance, Semigroup(1))

    def test_fold(self):
        instance = Semigroup(1)
        result = instance.fold(lambda x: x + 1)
        self.assertEqual(result, 2)

    def test_neutral(self):
        result = Semigroup.neutral(Sum)
        self.assertEqual(result, Sum(0))

    def test_str(self):
        instance = Sum(1)
        result = instance.__str__()
        self.assertEqual(result, 'Sum[value=1]')

    def test_concat(self):
        instance = Sum(1)
        result = instance.concat(Sum(2))
        self.assertEqual(result, Sum(3))

    def test_str(self):
        instance = All(True)
        result = instance.__str__()
        self.assertEqual(result, 'All[value=True]')

    def test_concat(self):
        instance = All(True)
        result = instance.concat(All(True))
        self.assertEqual(result, All(True))

    def test_str(self):
        instance = One(False)
        result = instance.__str__()
        self.assertEqual(result, 'One[value=False]')

    def test_concat(self):
        instance = One(False)
        result = instance.concat(One(True))
        self.assertEqual(result, One(True))

    def test_str(self):
        instance = First(1)
        result = instance.__str__()
        self.assertEqual(result, 'Fist[value=1]')

    def test_concat(self):
        instance = First(1)
        result = instance.concat(First(2))
        self.assertEqual(result, First(1))

    def test_str(self):
        instance = Last(1)
        result = instance.__str__()
        self.assertEqual(result, 'Last[value=1]')

    def test_concat(self):
        instance = Last(1)
        result = instance.concat(Last(2))
        self.assertEqual(result, Last(2))

    def test_str(self):
        instance = Map({'a': Sum(1)})
        result = instance.__str__()
        self.assertEqual(result, 'Map[value={a: Sum[value=1]}]')

    def test_concat(self):
        instance = Map({'a': Sum(1)})
        result = instance.concat(Map({'a': Sum(2)}))
        self.assertEqual(result, Map({'a': Sum(3)}))

    def test_str(self):
        instance = Max(1)
        result = instance.__str__()
        self.assertEqual(result, 'Max[value=1]')

    def test_concat(self):
        instance = Max(1)
        result = instance.concat(Max(2))
        self.assertEqual(result, Max(2))

    def test_str(self):
        instance = Min(1)
        result = instance.__str__()
        self.assertEqual(result, 'Min[value=1]')

    def test_concat(self):
        instance = Min(1)
        result = instance.concat(Min(2))
        self.assertEqual(result, Min(1))

if __name__ == '__main__':
    unittest.main()