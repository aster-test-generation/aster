import unittest
from pymonet.utils import *


class TestCurry(unittest.TestCase):
    def test_curry(self):
        add_one = curry(lambda x: x + 1)
        self.assertEqual(add_one(1), 2)
        self.assertEqual(add_one(2), 3)
        self.assertEqual(add_one(3), 4)

class TestIdentity(unittest.TestCase):
    def test_identity(self):
        self.assertEqual(identity(1), 1)
        self.assertEqual(identity(2), 2)
        self.assertEqual(identity(3), 3)

class TestIncrease(unittest.TestCase):
    def test_increase(self):
        self.assertEqual(increase(1), 2)
        self.assertEqual(increase(2), 3)
        self.assertEqual(increase(3), 4)

class TestEq(unittest.TestCase):
    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))
        self.assertTrue(eq(2, 2))
        self.assertFalse(eq(2, 3))

class TestCurriedMap(unittest.TestCase):
    def test_curried_map(self):
        self.assertEqual(curried_map(lambda x: x + 1, [1, 2, 3]), [2, 3, 4])
        self.assertEqual(curried_map(lambda x: x * 2, [1, 2, 3]), [2, 4, 6])
        self.assertEqual(curried_map(lambda x: x ** 2, [1, 2, 3]), [1, 4, 9])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        self.assertEqual(curried_filter(lambda x: x % 2 == 0, [1, 2, 3, 4, 5]), [2, 4])
        self.assertEqual(curried_filter(lambda x: x > 3, [1, 2, 3, 4, 5]), [4, 5])
        self.assertEqual(curried_filter(lambda x: x < 3, [1, 2, 3, 4, 5]), [1, 2])

class TestFind(unittest.TestCase):
    def test_find(self):
        self.assertEqual(find([1, 2, 3, 4, 5], lambda x: x % 2 == 0), 2)
        self.assertEqual(find([1, 2, 3, 4, 5], lambda x: x > 3), 4)
        self.assertEqual(find([1, 2, 3, 4, 5], lambda x: x < 3), 1)

class TestCompose(unittest.TestCase):
    def test_compose(self):
        self.assertEqual(compose(1, lambda x: x + 1, lambda x: x * 2), 3)
        self.assertEqual(compose(2, lambda x: x + 1, lambda x: x * 2), 5)
        self.assertEqual(compose(3, lambda x: x + 1, lambda x: x * 2), 7)

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        self.assertEqual(pipe(1, lambda x: x + 1, lambda x: x * 2), 4)
        self.assertEqual(pipe(2, lambda x: x + 1, lambda x: x * 2), 5)
        self.assertEqual(pipe(3, lambda x: x + 1, lambda x: x * 2), 7)


if __name__ == '__main__':
    unittest.main()