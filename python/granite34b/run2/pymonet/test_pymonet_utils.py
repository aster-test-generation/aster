import unittest
from pymonet.utils import *


class TestCurry(unittest.TestCase):
    def test_curry_function(self):
        def add(x, y, z):
            return x + y + z
        curried_add = curry(add)
        self.assertEqual(curried_add(1, 2, 3), 6)
        self.assertEqual(curried_add(1, 2)(3), 6)
        self.assertEqual(curried_add(1)(2, 3), 6)
        self.assertEqual(curried_add(1)(2)(3), 6)

class TestIdentity(unittest.TestCase):
    def test_identity_function(self):
        self.assertEqual(identity(1), 1)
        self.assertEqual(identity("test"), "test")
        self.assertEqual(identity([1, 2, 3]), [1, 2, 3])

class TestIncrease(unittest.TestCase):
    def test_increase_function(self):
        self.assertEqual(increase(1), 2)
        self.assertEqual(increase(2), 3)
        self.assertEqual(increase(3), 4)

class TestEq(unittest.TestCase):
    def test_eq_function(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))
        self.assertTrue(eq("test", "test"))
        self.assertFalse(eq("test", "test1"))

class TestCurriedMap(unittest.TestCase):
    def test_curried_map_function(self):
        self.assertEqual(curried_map(increase, [1, 2, 3]), [2, 3, 4])
        self.assertEqual(curried_map(str, [1, 2, 3]), ["1", "2", "3"])
        self.assertEqual(curried_map(lambda x: x * 2, [1, 2, 3]), [2, 4, 6])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter_function(self):
        self.assertEqual(curried_filter(lambda x: x % 2 == 0, [1, 2, 3]), [2])
        self.assertEqual(curried_filter(lambda x: len(str(x)) == 1, [1, 10, 100]), [1])
        self.assertEqual(curried_filter(lambda x: x > 5, [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]), [6, 7, 8, 9, 10])

class TestFind(unittest.TestCase):
    def test_find_function(self):
        self.assertEqual(find([1, 2, 3, 4, 5], lambda x: x % 2 == 0), 2)
        self.assertEqual(find([1, 2, 3, 4, 5], lambda x: x > 3), 4)
        self.assertEqual(find([1, 2, 3, 4, 5], lambda x: x > 5), None)

class TestCompose(unittest.TestCase):
    def test_compose_function(self):
        self.assertEqual(compose(1, increase, increase), 3)
        self.assertEqual(compose("test", str.upper, str.lower), "TEST")
        self.assertEqual(compose([1, 2, 3], curried_map(increase), curried_filter(lambda x: x % 2 == 0)), [3, 5, 7])

class TestPipe(unittest.TestCase):
    def test_pipe_function(self):
        self.assertEqual(pipe(1, increase, increase), 3)
        self.assertEqual(pipe("test", str.upper, str.lower), "test")
        self.assertEqual(pipe([1, 2, 3], curried_map(increase), curried_filter(lambda x: x % 2 == 0)), [3, 5])


if __name__ == '__main__':
    unittest.main()