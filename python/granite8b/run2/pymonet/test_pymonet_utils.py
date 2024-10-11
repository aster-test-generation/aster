import unittest
from pymonet.utils import *


class TestCurry(unittest.TestCase):
    def test_curry(self):
        add_two = curry(lambda x, y: x + y, 2)
        self.assertEqual(add_two(3), 5)
        self.assertEqual(add_two(4), 6)

class TestIdentity(unittest.TestCase):
    def test_identity(self):
        self.assertEqual(identity(1), 1)
        self.assertEqual(identity("hello"), "hello")

class TestIncrease(unittest.TestCase):
    def test_increase(self):
        self.assertEqual(increase(1), 2)
        self.assertEqual(increase(2), 3)

class TestEq(unittest.TestCase):
    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))

class TestCurriedMap(unittest.TestCase):
    def test_curried_map(self):
        double = lambda x: x * 2
        self.assertEqual(curried_map(double, [1, 2, 3]), [2, 4, 6])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        is_even = lambda x: x % 2 == 0
        self.assertEqual(curried_filter(is_even, [1, 2, 3, 4, 5]), [2, 4])

class TestFind(unittest.TestCase):
    def test_find(self):
        self.assertEqual(find([1, 2, 3], lambda x: x == 2), 2)
        self.assertEqual(find([1, 2, 3], lambda x: x == 4), None)

class TestCompose(unittest.TestCase):
    def test_compose(self):
        double = lambda x: x * 2
        square = lambda x: x ** 2
        self.assertEqual(compose(3, double, square), 36)

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        double = lambda x: x * 2
        square = lambda x: x ** 2
        self.assertEqual(pipe(3, double, square), 36)

class TestCond(unittest.TestCase):
    def test_cond(self):
        self.assertEqual(cond([(lambda x: x == 1, lambda: "one"), (lambda x: x == 2, lambda: "two")])(1), "one")
        self.assertEqual(cond([(lambda x: x == 1, lambda: "one"), (lambda x: x == 2, lambda: "two")])(2), "two")

class TestMemoize(unittest.TestCase):
    def test_memoize(self):
        @memoize
        def fibonacci(n):
            if n <= 1:
                return n
            return fibonacci(n - 1) + fibonacci(n - 2)

        self.assertEqual(fibonacci(1), 1)
        self.assertEqual(fibonacci(2), 1)
        self.assertEqual(fibonacci(3), 2)
        self.assertEqual(fibonacci(4), 3)
        self.assertEqual(fibonacci(5), 5)
        self.assertEqual(fibonacci(6), 8)

if __name__ == '__main__':
    unittest.main()