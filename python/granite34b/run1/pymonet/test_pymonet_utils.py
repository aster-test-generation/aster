import unittest
from pymonet.utils import *


class TestCurry(unittest.TestCase):
    def test_curry(self):
        def add(x, y, z):
            return x + y + z
        curried_add = curry(add)
        self.assertEqual(curried_add(1, 2, 3), 6)
        self.assertEqual(curried_add(1, 2)(3), 6)
        self.assertEqual(curried_add(1)(2, 3), 6)
        self.assertEqual(curried_add(1)(2)(3), 6)

class TestIdentity(unittest.TestCase):
    def test_identity(self):
        self.assertEqual(identity(1), 1)
        self.assertEqual(identity("a"), "a")
        self.assertEqual(identity([1, 2, 3]), [1, 2, 3])

class TestIncrease(unittest.TestCase):
    def test_increase(self):
        self.assertEqual(increase(1), 2)
        self.assertEqual(increase(2), 3)
        self.assertEqual(increase(3), 4)

class TestEq(unittest.TestCase):
    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))
        self.assertTrue(eq("a", "a"))
        self.assertFalse(eq("a", "b"))
        self.assertTrue(eq([1, 2, 3], [1, 2, 3]))
        self.assertFalse(eq([1, 2, 3], [1, 2, 4]))

class TestCurriedMap(unittest.TestCase):
    def test_curried_map(self):
        self.assertEqual(curried_map(increase, [1, 2, 3]), [2, 3, 4])
        self.assertEqual(curried_map(str, [1, 2, 3]), ["1", "2", "3"])
        self.assertEqual(curried_map(lambda x: x * 2, [1, 2, 3]), [2, 4, 6])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        self.assertEqual(curried_filter(lambda x: x % 2 == 0, [1, 2, 3]), [2])
        self.assertEqual(curried_filter(lambda x: len(str(x)) == 1, [1, 10, 100]), [1])
        self.assertEqual(curried_filter(lambda x: x > 0, [-1, 0, 1]), [1])

class TestFind(unittest.TestCase):
    def test_find(self):
        self.assertEqual(find([1, 2, 3], lambda x: x == 2), 2)
        self.assertEqual(find([1, 2, 3], lambda x: x == 4), None)
        self.assertEqual(find([{"a": 1}, {"a": 2}, {"a": 3}], lambda x: x["a"] == 2), {"a": 2})

class TestCompose(unittest.TestCase):
    def test_compose(self):
        self.assertEqual(compose(1, increase, increase), 3)
        self.assertEqual(compose("a", str.upper, str.lower), "A")
        self.assertEqual(compose([1, 2, 3], curried_map(increase), curried_filter(lambda x: x % 2 == 0)), [3, 5, 7])

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        self.assertEqual(pipe(1, increase, increase), 3)
        self.assertEqual(pipe("a", str.upper, str.lower), "a")
        self.assertEqual(pipe([1, 2, 3], curried_map(increase), curried_filter(lambda x: x % 2 == 0)), [3, 5])


if __name__ == '__main__':
    unittest.main()