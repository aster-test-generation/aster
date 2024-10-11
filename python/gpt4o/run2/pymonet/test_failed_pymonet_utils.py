import unittest
from pymonet.utils import *

class TestUtils(unittest.TestCase):
    def test_curry(self):
        def add(a, b):
            return a + b
        curried_add = curry(add)
        self.assertEqual(curried_add(1)(2), 3)
        self.assertEqual(curried_add(1, 2), 3)

    def test_identity(self):
        self.assertEqual(identity(5), 5)
        self.assertEqual(identity("test"), "test")

    def test_increase(self):
        self.assertEqual(increase(5), 6)
        self.assertEqual(increase(-1), 0)

    def test_eq(self):
        self.assertTrue(eq(5)(5))
        self.assertFalse(eq(5)(6))

    def test_curried_map(self):
        self.assertEqual(curried_map(increase, [1, 2, 3]), [2, 3, 4])
        self.assertEqual(curried_map(lambda x: x * 2, [1, 2, 3]), [2, 4, 6])

    def test_curried_filter(self):
        self.assertEqual(curried_filter(lambda x: x % 2 == 0, [1, 2, 3, 4]), [2, 4])
        self.assertEqual(curried_filter(lambda x: x > 2, [1, 2, 3, 4]), [3, 4])

    def test_find(self):
        self.assertEqual(find([1, 2, 3, 4], lambda x: x == 3), 3)
        self.assertIsNone(find([1, 2, 3, 4], lambda x: x == 5))

    def test_compose(self):
        self.assertEqual(compose(5, increase, increase), 7)
        self.assertEqual(compose(5, lambda x: x * 2, increase), 12)

    def test_pipe(self):
        self.assertEqual(pipe(5, increase, increase), 7)
        self.assertEqual(pipe(5, lambda x: x * 2, increase), 11)

    def test_cond(self):
        conditions = [
            (lambda x: x < 0, lambda x: "negative"),
            (lambda x: x == 0, lambda x: "zero"),
            (lambda x: x > 0, lambda x: "positive")
        ]
        cond_fn = cond(conditions)
        self.assertEqual(cond_fn(-1), "negative")
        self.assertEqual(cond_fn(0), "zero")
        self.assertEqual(cond_fn(1), "positive")

    def test_memoize(self):
        def slow_fn(x):
            return x * 2
        memoized_fn = memoize(slow_fn)
        self.assertEqual(memoized_fn(2), 4)
        self.assertEqual(memoized_fn(2), 4)  # Should hit the cache

if __name__ == '__main__':
    unittest.main()