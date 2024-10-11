import unittest
from pymonet.utils import curry, identity, increase, eq, curried_map, curried_filter, find, compose, pipe, cond, memoize

class TestPymonetUtils(unittest.TestCase):
    def test_curry(self):
        def add(x, y):
            return x + y
        curried_add = curry(add, 2)
        self.assertEqual(curried_add(3), 5)
        self.assertEqual(curried_add(4), 6)

    def test_identity(self):
        self.assertEqual(identity(1), 1)
        self.assertEqual(identity("hello"), "hello")

    def test_increase(self):
        self.assertEqual(increase(1), 2)
        self.assertEqual(increase(2), 3)

    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))

    def test_curried_map(self):
        numbers = [1, 2, 3, 4, 5]
        doubled_numbers = curried_map(lambda x: x * 2, numbers)
        self.assertEqual(doubled_numbers, [2, 4, 6, 8, 10])

    def test_curried_filter(self):
        numbers = [1, 2, 3, 4, 5]
        even_numbers = curried_filter(lambda x: x % 2 == 0, numbers)
        self.assertEqual(even_numbers, [2, 4])

    def test_find(self):
        numbers = [1, 2, 3, 4, 5]
        self.assertEqual(find(numbers, lambda x: x % 2 == 0), 2)

    def test_compose(self):
        def add(x, y):
            return x + y
        def multiply(x, y):
            return x * y
        self.assertEqual(compose(2, add, multiply, 3), 8)

    def test_pipe(self):
        def add(x, y):
            return x + y
        def multiply(x, y):
            return x * y
        self.assertEqual(pipe(2, add, multiply, 3), 8)

    def test_cond(self):
        def is_even(x):
            return x % 2 == 0
        def is_odd(x):
            return x % 2 != 0
        self.assertTrue(cond([(is_even, lambda x: "even"), (is_odd, lambda x: "odd")])(4) == "even")
        self.assertTrue(cond([(is_even, lambda x: "even"), (is_odd, lambda x: "odd")])(3) == "odd")

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