import unittest
from flutes.iterator import *


class TestChunk(unittest.TestCase):
    def test_chunk(self):
        result = chunk(3, [1, 2, 3, 4, 5, 6])
        self.assertEqual(list(result), [[1, 2, 3], [4, 5, 6]])

class TestTake(unittest.TestCase):
    def test_take(self):
        result = take(3, [1, 2, 3, 4, 5, 6])
        self.assertEqual(list(result), [1, 2, 3])

class TestDrop(unittest.TestCase):
    def test_drop(self):
        result = drop(3, [1, 2, 3, 4, 5, 6])
        self.assertEqual(list(result), [4, 5, 6])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        result = drop_until(lambda x: x == 3, [1, 2, 3, 4, 5, 6])
        self.assertEqual(result, list(result))

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        result = split_by(lambda x: x == 3, [1, 2, 3, 4, 5, 6])
        self.assertEqual(list(result), [[1, 2], [4, 5, 6]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        result = scanl(lambda x, y: x + y, [1, 2, 3, 4, 5, 6])
        self.assertEqual(list(result), [1, 3, 6, 10, 15, 21])

class TestScanr(unittest.TestCase):
    def test_scanr(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3, 4, 5, 6])
        self.assertEqual(result, [21, 20, 18, 15, 11, 6])

class TestLazyList(unittest.TestCase):
    def test_lazy_list(self):
        result = LazyList([1, 2, 3, 4, 5, 6])
        self.assertEqual(result, LazyList(1, 2, 3, 4, 5, 6))

class TestRange(unittest.TestCase):
    def test_range(self):
        result = Range(1, 6)
        self.assertEqual(result, [1, 2, 3, 4, 5])

class TestMapList(unittest.TestCase):
    def test_map_list(self):
        result = MapList(lambda x: x ** 2, [1, 2, 3, 4, 5, 6])
        self.assertEqual(result, MapList([1, 4, 9, 16, 25, 36]))

if __name__ == '__main__':
    unittest.main()