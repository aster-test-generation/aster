import unittest
from pymonet.utils import *


class TestUtils(unittest.TestCase):
    def test_curry(self):
        @curry
        def add(x, y):
            return x + y
        result = add(2, 3)
        self.assertEqual(result, 5)

    def test_identity(self):
        result = identity(5)
        self.assertEqual(result, 5)

    def test_increase(self):
        result = increase(5)
        self.assertEqual(result, 6)

    def test_eq(self):
        result = eq(5, 5)
        self.assertEqual(result, True)

    def test_curried_map(self):
        result = curried_map(increase, [1, 2, 3])
        self.assertEqual(result, [2, 3, 4])

    def test_curried_filter(self):
        result = curried_filter(lambda x: x > 2, [1, 2, 3])
        self.assertEqual(result, [3])

    def test_find(self):
        result = find([1, 2, 3], lambda x: x > 2)
        self.assertEqual(result, 3)

    def test_compose(self):
        result = compose(5, increase, increase)
        self.assertEqual(result, 7)

    def test_pipe(self):
        result = pipe(5, increase, increase)
        self.assertEqual(result, 7)

    def test_cond(self):
        result = cond([(lambda x: x > 2, lambda x: x * 2), (lambda x: x <= 2, lambda x: x + 1)])(3)
        self.assertEqual(result, 6)

    def test_memoize(self):
        @memoize
        def fib(n):
            if n <= 1:
                return n
            return fib(n-1) + fib(n-2)
        result = fib(5)
        self.assertEqual(result, 5)

class TestUtils(unittest.TestCase):
    def test_curry(self):
        @curry
        def add(a, b):
            return a + b
        result = add(2)(3)
        self.assertEqual(result, 5)

    def test_identity(self):
        result = identity(5)
        self.assertEqual(result, 5)

    def test_increase(self):
        result = increase(5)
        self.assertEqual(result, 6)

    def test_eq(self):
        result = eq(5)(5)
        self.assertEqual(result, True)

    def test_curried_map(self):
        result = curried_map(lambda x: x**2, [1, 2, 3])
        self.assertEqual(result, [1, 4, 9])

    def test_curried_filter(self):
        result = curried_filter(lambda x: x > 2, [1, 2, 3, 4, 5])
        self.assertEqual(result, [3, 4, 5])

    def test_find(self):
        result = find([1, 2, 3, 4, 5], lambda x: x > 3)
        self.assertEqual(result, 4)

    def test_compose(self):
        result = compose(5, lambda x: x + 1, lambda x: x * 2)
        self.assertEqual(result, 12)

    def test_pipe(self):
        result = pipe(5, lambda x: x + 1, lambda x: x * 2)
        self.assertEqual(result, 12)

    def test_cond(self):
        result = cond([(lambda x: x > 5, lambda x: x + 1), (lambda x: x <= 5, lambda x: x - 1)])(6)
        self.assertEqual(result, 7)

    def test_memoize(self):
        @memoize
        def fib(n):
            if n <= 1:
                return n
            return fib(n-1) + fib(n-2)
        result = fib(5)
        self.assertEqual(result, 5)

if __name__ == '__main__':
    unittest.main()