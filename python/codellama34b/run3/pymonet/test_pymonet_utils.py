import unittest
from pymonet.utils import *



class TestCurry(unittest.TestCase):
    def test_curry(self):
        result = curry(lambda x, y: x + y, 2)(1)(2)
        self.assertEqual(result, 3)

class TestIdentity(unittest.TestCase):
    def test_identity(self):
        result = identity(1)
        self.assertEqual(result, 1)

class TestIncrease(unittest.TestCase):
    def test_increase(self):
        result = increase(1)
        self.assertEqual(result, 2)

class TestEq(unittest.TestCase):
    def test_eq(self):
        result = eq(1, 1)
        self.assertEqual(result, True)

class TestCurriedMap(unittest.TestCase):
    def test_curried_map(self):
        result = curried_map(lambda x: x + 1, [1, 2, 3])
        self.assertEqual(result, [2, 3, 4])

class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        result = curried_filter(lambda x: x % 2 == 0, [1, 2, 3, 4])
        self.assertEqual(result, [2, 4])

class TestFind(unittest.TestCase):
    def test_find(self):
        result = find([1, 2, 3, 4], lambda x: x % 2 == 0)
        self.assertEqual(result, 2)

class TestCompose(unittest.TestCase):
    def test_compose(self):
        result = compose(1, lambda x: x + 1, lambda x: x * 2)
        self.assertEqual(result, 4)

class TestPipe(unittest.TestCase):
    def test_pipe(self):
        result = pipe(1, lambda x: x + 1, lambda x: x * 2)
        self.assertEqual(result, 4)

class TestCond(unittest.TestCase):
    def test_cond(self):
        result = cond([
            (lambda x: x == 1, lambda x: x + 1),
            (lambda x: x == 2, lambda x: x * 2),
        ])(1)
        self.assertEqual(result, 2)



class TestCurriedFilter(unittest.TestCase):
    def test_curried_filter(self):
        result = curried_filter(lambda x: x > 1, [1, 2, 3])
        self.assertEqual(result, [2, 3])

class TestFind(unittest.TestCase):
    def test_find(self):
        result = find([1, 2, 3], lambda x: x > 1)
        self.assertEqual(result, 2)

class TestCond(unittest.TestCase):
    def test_cond(self):
        result = cond([(lambda x: x > 1, lambda x: x * 2)])(2)
        self.assertEqual(result, 4)

class TestMemoize(unittest.TestCase):
    def test_memoize(self):
        result = memoize(lambda x: x * 2)(1)
        self.assertEqual(result, 2)

if __name__ == '__main__':
    unittest.main()