import unittest
from pymonet.utils import *
from pymonet.utils import curry, identity, increase, eq, curried_map, curried_filter, find, compose, pipe, cond, memoize


class TestCurry(unittest.TestCase):
    def test_curry(self):
        add_five = curry(lambda x: x + 5)
        self.assertEqual(add_five(1), 6)
        self.assertEqual(add_five(2), 7)
        self.assertEqual(add_five(3), 8)

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
        double = lambda x: x * 2
        self.assertEqual(curried_map(double, [1, 2, 3]), [2, 4, 6])
        self.assertEqual(curried_map(double, [4, 5, 6]), [8, 10, 12])
        self.assertEqual(curried_map(double, [7, 8, 9]), [14, 16, 18])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        even = lambda x: x % 2 == 0
        self.assertEqual(curried_filter(even, [1, 2, 3]), [2])
        self.assertEqual(curried_filter(even, [4, 5, 6]), [4, 6])
        self.assertEqual(curried_filter(even, [7, 8, 9]), [8])

class TestFind(unittest.TestCase):
    def test_find(self):
        self.assertEqual(find([1, 2, 3], lambda x: x == 2), 2)
        self.assertEqual(find([4, 5, 6], lambda x: x == 5), 5)
        self.assertEqual(find([7, 8, 9], lambda x: x == 8), 8)

class TestCompose(unittest.TestCase):
    def test_compose(self):
        double = lambda x: x * 2
        square = lambda x: x ** 2
        self.assertEqual(compose(1, double, square), 2)
        self.assertEqual(compose(2, double, square), 16)
        self.assertEqual(compose(3, double, square), 36)

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        double = lambda x: x * 2
        square = lambda x: x ** 2
        self.assertEqual(pipe(1, double, square), 4)
        self.assertEqual(pipe(2, double, square), 16)
        self.assertEqual(pipe(3, double, square), 36)

class TestCond(unittest.TestCase):
    def test_cond(self):
        self.assertEqual(cond([(lambda x: x == 1, lambda: 10), (lambda x: x == 2, lambda: 20), (lambda x: x == 3, lambda: 30)])(1), 10)
        self.assertEqual(cond([(lambda x: x == 1, lambda: 10), (lambda x: x == 2, lambda: 20), (lambda x: x == 3, lambda: 30)])(2), 20)
        self.assertEqual(cond([(lambda x: x == 1, lambda: 10), (lambda x: x == 2, lambda: 20), (lambda x: x == 3, lambda: 30)])(3), 30)


class TestCurry(unittest.TestCase):
    def test_curry(self):
        add_one = curry(lambda x: x + 1)
        self.assertEqual(add_one(1), 2)
        self.assertEqual(add_one(2), 3)
        self.assertEqual(add_one(3), 4)

class TestIdentity(unittest.TestCase):
    def test_identity(self):
        self.assertEqual(identity(1), 1)
        self.assertEqual(identity('hello'), 'hello')
        self.assertEqual(identity([1, 2, 3]), [1, 2, 3])

class TestEq(unittest.TestCase):
    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))
        self.assertTrue(eq('hello', 'hello'))
        self.assertFalse(eq('hello', 'world'))

class TestCurriedMap(unittest.TestCase):
    def test_curried_map(self):
        double = curried_map(lambda x: x * 2)
        self.assertEqual(double([1, 2, 3]), [2, 4, 6])
        self.assertEqual(double([4, 5, 6]), [8, 10, 12])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        even = curried_filter(lambda x: x % 2 == 0)
        self.assertEqual(even([1, 2, 3]), [2])
        self.assertEqual(even([4, 5, 6]), [4, 6])

class TestFind(unittest.TestCase):
    def test_find(self):
        self.assertEqual(find([1, 2, 3], lambda x: x == 2), 2)
        self.assertEqual(find([4, 5, 6], lambda x: x == 5), 5)
        self.assertEqual(find([7, 8, 9], lambda x: x == 10), None)

class TestCompose(unittest.TestCase):
    def test_compose(self):
        add_one = lambda x: x + 1
        double = lambda x: x * 2
        self.assertEqual(compose(1, add_one, double), 3)
        self.assertEqual(compose(2, add_one, double), 5)
        self.assertEqual(compose(3, add_one, double), 7)

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        add_one = lambda x: x + 1
        double = lambda x: x * 2
        self.assertEqual(pipe(1, add_one, double), 3)
        self.assertEqual(pipe(2, add_one, double), 5)
        self.assertEqual(pipe(3, add_one, double), 7)

class TestCond(unittest.TestCase):
    def test_cond(self):
        self.assertEqual(cond([(lambda x: x == 1, lambda: 1), (lambda x: x == 2, lambda: 2), (lambda x: x == 3, lambda: 3)])(1), 1)
        self.assertEqual(cond([(lambda x: x == 1, lambda: 1), (lambda x: x == 2, lambda: 2), (lambda x: x == 3, lambda: 3)])(2), 2)
        self.assertEqual(cond([(lambda x: x == 1, lambda: 1), (lambda x: x == 2, lambda: 2), (lambda x: x == 3, lambda: 3)])(3), 3)


if __name__ == '__main__':
    unittest.main()