import unittest
from pymonet.utils import curry, identity, increase, eq, curried_map, curried_filter, find, compose, pipe, cond, memoize

class TestUtils(unittest.TestCase):
    def test_curry(self):
        @curry
        def add(x, y):
            return x + y
        self.assertEqual(add(2, 3), 5)
        self.assertEqual(add(2)(3), 5)

    def test_identity(self):
        self.assertEqual(identity(5), 5)

    def test_increase(self):
        self.assertEqual(increase(5), 6)

    def test_eq(self):
        self.assertTrue(eq(5, 5))
        self.assertFalse(eq(5, 6))

    def test_curried_map(self):
        self.assertEqual(curried_map(increase, [1, 2, 3]), [2, 3, 4])

    def test_curried_filter(self):
        self.assertEqual(curried_filter(lambda x: x % 2 == 0, [1, 2, 3, 4]), [2, 4])

    def test_find(self):
        self.assertEqual(find([1, 2, 3, 4], lambda x: x == 2), 2)

    def test_compose(self):
        self.assertEqual(compose(5, increase, increase), 7)

    def test_pipe(self):
        self.assertEqual(pipe(5, increase, increase), 7)

    def test_cond(self):
        condition_list = [(lambda x: x > 5, lambda x: x + 1), (lambda x: x <= 5, lambda x: x - 1)]
        self.assertEqual(cond(condition_list)(6), 7)
        self.assertEqual(cond(condition_list)(4), 3)

    def test_memoize(self):
        def fib(n):
            if n <= 1:
                return n
            return fib(n-1) + fib(n-2)
        memoized_fib = memoize(fib)
        self.assertEqual(memoized_fib(10), 55)

if __name__ == '__main__':
    unittest.main()