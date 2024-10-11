import unittest
from pymonet.utils import curry, identity, increase, eq, curried_map, curried_filter, find, compose, pipe, cond, memoize


class TestPymonetUtils(unittest.TestCase):
    def test_curry(self):
        def add(x, y):
            return x + y
        curried_add = curry(add)
        self.assertEqual(curried_add(1)(2), 3)

    def test_identity(self):
        self.assertEqual(identity(1), 1)

    def test_increase(self):
        self.assertEqual(increase(1), 2)

    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))

    def test_curried_map(self):
        def square(x):
            return x ** 2
        numbers = [1, 2, 3, 4, 5]
        self.assertEqual(curried_map(square, numbers), [1, 4, 9, 16, 25])

    def test_curried_filter(self):
        def is_even(x):
            return x % 2 == 0
        numbers = [1, 2, 3, 4, 5]
        self.assertEqual(curried_filter(is_even, numbers), [2, 4])

    def test_find(self):
        numbers = [1, 2, 3, 4, 5]
        self.assertEqual(find(numbers, lambda x: x == 3), 3)

    def test_compose(self):
        def double(x):
            return x * 2
        def add_one(x):
            return x + 1
        self.assertEqual(compose(5, double, add_one), 11)

    def test_pipe(self):
        def double(x):
            return x * 2
        def add_one(x):
            return x + 1
        self.assertEqual(pipe(5, add_one, double), 11)

    def test_cond(self):
        def is_even(x):
            return x % 2 == 0
        def is_odd(x):
            return x % 2 != 0
        self.assertEqual(cond([(is_even, lambda x: x ** 2), (is_odd, lambda x: x ** 3)])(4), 16)
        self.assertEqual(cond([(is_even, lambda x: x ** 2), (is_odd, lambda x: x ** 3)])(5), 125)

    def test_memoize(self):
        @memoize
        def fibonacci(n):
            if n <= 1:
                return n
            return fibonacci(n-1) + fibonacci(n-2)
        self.assertEqual(fibonacci(5), 5)
        self.assertEqual(fibonacci(5), 5)  # Should return cached result

if __name__ == '__main__':
    unittest.main()