import unittest
from flutes.iterator import *

class TestChunk(unittest.TestCase):
    def test_chunk(self):
        result = chunk(1, [1, 2, 3])
        self.assertEqual(result, [[1], [2], [3]])

class TestTake(unittest.TestCase):
    def test_take(self):
        result = take(1, [1, 2, 3])
        self.assertEqual(result, [1])

class TestDrop(unittest.TestCase):
    def test_drop(self):
        result = drop(1, [1, 2, 3])
        self.assertEqual(result, [2, 3])

class TestDropUntil(unittest.TestCase):
    def test_drop_until(self):
        result = drop_until(lambda x: x == 2, [1, 2, 3])
        self.assertEqual(result, [2, 3])

class TestSplitBy(unittest.TestCase):
    def test_split_by(self):
        result = split_by(lambda x: x == 2, [1, 2, 3])
        self.assertEqual(result, [[1], [3]])

class TestScanl(unittest.TestCase):
    def test_scanl(self):
        result = scanl(lambda x, y: x + y, [1, 2, 3])
        self.assertEqual(result, [1, 3, 6])

class TestScanr(unittest.TestCase):
    def test_scanr(self):
        result = scanr(lambda x, y: x + y, [1, 2, 3])
        self.assertEqual(result, [6, 5, 3])

class TestLazyList(unittest.TestCase):
    def test_lazy_list(self):
        result = LazyList([1, 2, 3])
        self.assertEqual(result, [1, 2, 3])

class TestRange(unittest.TestCase):
    def test_range(self):
        result = Range(1, 3)
        self.assertEqual(result, [1, 2])

class TestMapList(unittest.TestCase):
    def test_map_list(self):
        result = MapList(lambda x: x + 1, [1, 2, 3])
        self.assertEqual(result, [2, 3, 4])

if __name__ == '__main__':
    unittest.main()