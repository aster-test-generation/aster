import unittest
from pymonet.semigroups import Semigroup, Sum, All, One, First, Last, Map, Max, Min


class TestSemigroup(unittest.TestCase):
    def test_init(self):
        instance = Semigroup(5)
        self.assertEqual(instance.value, 5)

    def test_eq(self):
        instance1 = Semigroup(5)
        instance2 = Semigroup(5)
        self.assertTrue(instance1 == instance2)

    def test_fold(self):
        instance = Semigroup(5)
        result = instance.fold(lambda x: x * 2)
        self.assertEqual(result, 10)

    def test_neutral(self):
        class TestSemigroup(Semigroup):
            neutral_element = 0
        result = TestSemigroup.neutral()
        self.assertEqual(result.value, 0)

class TestSum(unittest.TestCase):
    def test_init(self):
        instance = Sum(5)
        self.assertEqual(instance.value, 5)

    def test_str(self):
        instance = Sum(5)
        self.assertEqual(str(instance), 'Sum[value=5]')

    def test_concat(self):
        instance1 = Sum(5)
        instance2 = Sum(3)
        result = instance1.concat(instance2)
        self.assertEqual(result.value, 8)

class TestAll(unittest.TestCase):
    def test_init(self):
        instance = All(True)
        self.assertEqual(instance.value, True)

    def test_str(self):
        instance = All(True)
        self.assertEqual(str(instance), 'All[value=True]')

    def test_concat(self):
        instance1 = All(True)
        instance2 = All(False)
        result = instance1.concat(instance2)
        self.assertEqual(result.value, False)

class TestOne(unittest.TestCase):
    def test_init(self):
        instance = One(True)
        self.assertEqual(instance.value, True)

    def test_str(self):
        instance = One(True)
        self.assertEqual(str(instance), 'One[value=True]')

    def test_concat(self):
        instance1 = One(True)
        instance2 = One(False)
        result = instance1.concat(instance2)
        self.assertEqual(result.value, True)

class TestFirst(unittest.TestCase):
    def test_init(self):
        instance = First(5)
        self.assertEqual(instance.value, 5)

    def test_str(self):
        instance = First(5)
        self.assertEqual(str(instance), 'Fist[value=5]')

    def test_concat(self):
        instance1 = First(5)
        instance2 = First(3)
        result = instance1.concat(instance2)
        self.assertEqual(result.value, 5)

class TestLast(unittest.TestCase):
    def test_init(self):
        instance = Last(5)
        self.assertEqual(instance.value, 5)

    def test_str(self):
        instance = Last(5)
        self.assertEqual(str(instance), 'Last[value=5]')

    def test_concat(self):
        instance1 = Last(5)
        instance2 = Last(3)
        result = instance1.concat(instance2)
        self.assertEqual(result.value, 3)

class TestMap(unittest.TestCase):
    def test_init(self):
        instance = Map({'a': Sum(1), 'b': Sum(2)})
        self.assertEqual(instance.value, {'a': Sum(1), 'b': Sum(2)})

    def test_str(self):
        instance = Map({'a': Sum(1), 'b': Sum(2)})
        self.assertEqual(str(instance), "Map[value={'a': Sum[value=1], 'b': Sum[value=2]}]")

    def test_concat(self):
        instance1 = Map({'a': Sum(1), 'b': Sum(2)})
        instance2 = Map({'a': Sum(3), 'b': Sum(4)})
        result = instance1.concat(instance2)
        self.assertEqual(result.value['a'].value, 4)
        self.assertEqual(result.value['b'].value, 6)

class TestMax(unittest.TestCase):
    def test_init(self):
        instance = Max(5)
        self.assertEqual(instance.value, 5)

    def test_str(self):
        instance = Max(5)
        self.assertEqual(str(instance), 'Max[value=5]')

    def test_concat(self):
        instance1 = Max(5)
        instance2 = Max(3)
        result = instance1.concat(instance2)
        self.assertEqual(result.value, 5)

class TestMin(unittest.TestCase):
    def test_init(self):
        instance = Min(5)
        self.assertEqual(instance.value, 5)

    def test_str(self):
        instance = Min(5)
        self.assertEqual(str(instance), 'Min[value=5]')

    def test_concat(self):
        instance1 = Min(5)
        instance2 = Min(3)
        result = instance1.concat(instance2)
        self.assertEqual(result.value, 3)

if __name__ == '__main__':
    unittest.main()