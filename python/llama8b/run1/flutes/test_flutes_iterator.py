import unittest
from flutes.iterator import *


class TestChunk(unittest.TestCase):
    def test_chunk(self):
        iterable = [1, 2, 3, 4, 5, 6]
        result = list(chunk(2, iterable))
        self.assertEqual(result, [[1, 2], [3, 4], [5, 6]])

    def test_chunk_empty(self):
        iterable = []
        result = list(chunk(2, iterable))
        self.assertEqual(result, [])

    def test_chunk_single(self):
        iterable = [1]
        result = list(chunk(2, iterable))
        self.assertEqual(result, [[1]])

class TestTake(unittest.TestCase):
    def test_take(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(take(3, iterable))
        self.assertEqual(result, [1, 2, 3])

    def test_take_zero(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(take(0, iterable))
        self.assertEqual(result, [])

    def test_take_negative(self):
        iterable = [1, 2, 3, 4, 5]
        with self.assertRaises(ValueError):
            list(take(-1, iterable))

class TestDrop(unittest.TestCase):
    def test_drop(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(drop(2, iterable))
        self.assertEqual(result, [3, 4, 5])

    def test_drop_zero(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(drop(0, iterable))
        self.assertEqual(result, [1, 2, 3, 4, 5])

    def test_drop_negative(self):
        iterable = [1, 2, 3, 4, 5]
        with self.assertRaises(ValueError):
            list(drop(-1, iterable))

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(drop_until(lambda x: x > 2, iterable))
        self.assertEqual(result, [2, 3])

    def test_drop_until_empty(self):
        iterable = []
        result = list(drop_until(lambda x: x > 2, iterable))
        self.assertEqual(result, [])

class TestSplitBy(unittest.TestCase):
    def test_split_by_criterion(self):
        iterable = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
        result = list(split_by(iterable, criterion=lambda x: x % 2 == 0))
        self.assertEqual(result, [[2], [2], [4], [4, 4, 4, 4]])

    def test_split_by_separator(self):
        iterable = [1, 2, 2, 3, 3, 3, 4, 4, 4, 4]
        result = list(split_by(iterable, separator=2))
        self.assertEqual(result, [[1], [2], [2, 3, 3, 3], [4, 4, 4, 4]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(scanl(lambda x, y: x + y, iterable))
        self.assertEqual(result, [1, 3, 6, 10, 15])

    def test_scanl_initial(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(scanl(lambda x, y: x + y, iterable, initial=5))
        self.assertEqual(result, [5, 6, 9, 13, 18])

class TestScanr(unittest.TestCase):
    def test_scanr(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(scanr(lambda x, y: x + y, iterable))
        self.assertEqual(result, [15, 13, 9, 6, 3])

    def test_scanr_initial(self):
        iterable = [1, 2, 3, 4, 5]
        result = list(scanr(lambda x, y: x + y, iterable, initial=5))
        self.assertEqual(result, [20, 19, 16, 13, 10])


if __name__ == '__main__':
    unittest.main()