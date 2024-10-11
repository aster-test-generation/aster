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
        instance = Semigroup.neutral()
        self.assertEqual(instance.value, instance.neutral_element)

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
        instance = One(False)
        self.assertEqual(instance.value, False)

    def test_str(self):
        instance = One(False)
        self.assertEqual(str(instance), 'One[value=False]')

    def test_concat(self):
        instance1 = One(False)
        instance2 = One(True)
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
        instance = Map({'a': 5, 'b': 3})
        self.assertEqual(instance.value, {'a': 5, 'b': 3})

    def test_str(self):
        instance = Map({'a': 5, 'b': 3})
        self.assertEqual(str(instance), 'Map[value={\'a\': 5, \'b\': 3}]')

    def test_concat(self):
        instance1 = Map({'a': 5, 'b': 3})
        instance2 = Map({'a': 2, 'b': 4})
        result = instance1.concat(instance2)
        self.assertEqual(result.value, {'a': 7, 'b': 7})

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