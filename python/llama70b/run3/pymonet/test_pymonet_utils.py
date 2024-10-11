import unittest
from pymonet.utils import *


class TestCurry(unittest.TestCase):
    def test_curry(self):
        @curry
        def add(x, y):
            return x + y
        result = add(2, 3)
        self.assertEqual(result, 5)

    def test_curry_partial_application(self):
        @curry
        def add(x, y):
            return x + y
        add_two = add(2)
        result = add_two(3)
        self.assertEqual(result, 5)

class TestIdentity(unittest.TestCase):
    def test_identity(self):
        result = identity(5)
        self.assertEqual(result, 5)

class TestIncrease(unittest.TestCase):
    def test_increase(self):
        result = increase(5)
        self.assertEqual(result, 6)

class TestEq(unittest.TestCase):
    def test_eq(self):
        result = eq(5, 5)
        self.assertTrue(result)

    def test_eq_partial_application(self):
        is_five = eq(5)
        result = is_five(5)
        self.assertTrue(result)

class TestCurriedMap(unittest.TestCase):
    def test_curried_map(self):
        result = curried_map(increase, [1, 2, 3])
        self.assertEqual(result, [2, 3, 4])

    def test_curried_map_partial_application(self):
        increment = curried_map(increase)
        result = increment([1, 2, 3])
        self.assertEqual(result, [2, 3, 4])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        result = curried_filter(lambda x: x % 2 == 0, [1, 2, 3, 4])
        self.assertEqual(result, [2, 4])

    def test_curried_filter_partial_application(self):
        is_even = curried_filter(lambda x: x % 2 == 0)
        result = is_even([1, 2, 3, 4])
        self.assertEqual(result, [2, 4])

class TestFind(unittest.TestCase):
    def test_find(self):
        result = find([1, 2, 3, 4], lambda x: x == 2)
        self.assertEqual(result, 2)

class TestCompose(unittest.TestCase):
    def test_compose(self):
        result = compose(5, increase, increase)
        self.assertEqual(result, 7)

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        result = pipe(5, increase, increase)
        self.assertEqual(result, 7)

class TestCond(unittest.TestCase):
    def test_cond(self):
        result = cond([(lambda x: x > 5, lambda x: x * 2), (lambda x: x <= 5, lambda x: x + 1)])(6)
        self.assertEqual(result, 12)

class TestMemoize(unittest.TestCase):
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