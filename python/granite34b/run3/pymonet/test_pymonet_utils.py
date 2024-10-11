import unittest
from pymonet.utils import curry, identity, increase, eq, curried_map, curried_filter, find, compose, pipe, cond, memoize


class TestPymonetUtils(unittest.TestCase):
    def test_curry(self):
        def add(x, y, z):
            return x + y + z
        curried_add = curry(add)
        self.assertEqual(curried_add(1, 2, 3), 6)
        self.assertEqual(curried_add(1, 2)(3), 6)
        self.assertEqual(curried_add(1)(2, 3), 6)
        self.assertEqual(curried_add(1)(2)(3), 6)

    def test_identity(self):
        self.assertEqual(identity(1), 1)
        self.assertEqual(identity("test"), "test")
        self.assertEqual(identity([1, 2, 3]), [1, 2, 3])

    def test_increase(self):
        self.assertEqual(increase(1), 2)
        self.assertEqual(increase(2), 3)
        self.assertEqual(increase(3), 4)

    def test_eq(self):
        self.assertTrue(eq(1, 1))
        self.assertFalse(eq(1, 2))
        self.assertTrue(eq("test", "test"))
        self.assertFalse(eq("test", "test1"))

    def test_curried_map(self):
        self.assertEqual(curried_map(increase, [1, 2, 3]), [2, 3, 4])
        self.assertEqual(curried_map(str, [1, 2, 3]), ["1", "2", "3"])
        self.assertEqual(curried_map(lambda x: x * 2, [1, 2, 3]), [2, 4, 6])

    def test_curried_filter(self):
        self.assertEqual(curried_filter(lambda x: x % 2 == 0, [1, 2, 3]), [2])
        self.assertEqual(curried_filter(lambda x: len(str(x)) == 1, [1, 10, 100]), [1])
        self.assertEqual(curried_filter(lambda x: x > 0, [-1, 0, 1]), [1])

    def test_find(self):
        self.assertEqual(find([1, 2, 3], lambda x: x == 2), 2)
        self.assertEqual(find([1, 2, 3], lambda x: x == 4), None)
        self.assertEqual(find([{"a": 1}, {"a": 2}, {"a": 3}], lambda x: x["a"] == 2), {"a": 2})

    def test_compose(self):
        self.assertEqual(compose(1, increase, increase), 3)
        self.assertEqual(compose(1, str, int), '1')
        self.assertEqual(compose("test", len, identity), "test")

    def test_pipe(self):
        self.assertEqual(pipe(1, increase, increase), 3)
        self.assertEqual(pipe(1, str, int), 1)
        self.assertEqual(pipe("test", len, identity), 4)

    def test_cond(self):
        self.assertEqual(cond([(lambda x: x > 0, increase), (lambda x: x < 0, increase)])(1), 2)
        self.assertEqual(cond([(lambda x: x > 0, increase), (lambda x: x < 0, increase)])(-1), 0)
        self.assertEqual(cond([(lambda x: x > 0, increase), (lambda x: x < 0, increase)])(0), None)

    def test_memoize(self):
        @memoize
        def add(x, y):
            return x + y
        self.assertEqual(add(1, 2), 3)
        self.assertEqual(add(1, 2), 3)
        self.assertEqual(add(2, 3), 5)
        self.assertEqual(add(2, 3), 5)

if __name__ == '__main__':
    unittest.main()