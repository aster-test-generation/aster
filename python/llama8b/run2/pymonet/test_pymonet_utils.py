import unittest
from pymonet.utils import curry, identity, increase, eq, curried_map, curried_filter, find, compose, pipe, cond, memoize


class TestCurry(unittest.TestCase):
    def test_curry(self):
        def add(x, y):
            return x + y
        curried_add = curry(add)
        self.assertEqual(curried_add(1, 2), 3)
        self.assertEqual(curried_add(1)(2), 3)

    def test_curry_args_count(self):
        def add(x, y, z):
            return x + y + z
        curried_add = curry(add, 2)
        self.assertEqual(curried_add(1, 2), 3)
        self.assertEqual(curried_add(1)(2), 3)
        self.assertEqual(curried_add(1, 2)(3), 6)

class TestIdentity(unittest.TestCase):
    def test_identity(self):
        self.assertEqual(identity(1), 1)

class TestIncrease(unittest.TestCase):
    def test_increase(self):
        self.assertEqual(increase(1), 2)

class TestEq(unittest.TestCase):
    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))

class TestCurriedMap(unittest.TestCase):
    def test_curried_map(self):
        def square(x):
            return x ** 2
        numbers = [1, 2, 3, 4, 5]
        self.assertEqual(curried_map(square, numbers), [1, 4, 9, 16, 25])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        def is_even(x):
            return x % 2 == 0
        numbers = [1, 2, 3, 4, 5]
        self.assertEqual(curried_filter(is_even, numbers), [2, 4])

class TestFind(unittest.TestCase):
    def test_find(self):
        numbers = [1, 2, 3, 4, 5]
        self.assertEqual(find(numbers, lambda x: x % 2 == 0), 2)

class TestCompose(unittest.TestCase):
    def test_compose(self):
        def square(x):
            return x ** 2
        def add_one(x):
            return x + 1
        self.assertEqual(compose(2, square, add_one), 5)

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        def square(x):
            return x ** 2
        def add_one(x):
            return x + 1
        self.assertEqual(pipe(2, square, add_one), 5)

class TestCond(unittest.TestCase):
    def test_cond(self):
        def is_even(x):
            return x % 2 == 0
        def is_odd(x):
            return x % 2 != 0
        def execute_even(x):
            return x * 2
        def execute_odd(x):
            return x * 3
        self.assertEqual(cond([(is_even, execute_even), (is_odd, execute_odd)])(4), 8)
        self.assertEqual(cond([(is_even, execute_even), (is_odd, execute_odd)])(5), 15)

class TestMemoize(unittest.TestCase):
    def test_memoize(self):
        @memoize
        def fibonacci(n):
            if n <= 1:
                return n
            return fibonacci(n-1) + fibonacci(n-2)
        self.assertEqual(fibonacci(10), 55)

if __name__ == '__main__':
    unittest.main()